
    import javax.swing.*;
            import java.awt.*;
            import java.awt.event.ActionEvent;
            import java.awt.event.ActionListener;
    import java.io.*;
    import java.util.ArrayList;
            import java.util.List;

public class DroneManagementGUI extends JFrame {
    private JTextField modelTextField;
    private JTextField rangeTextField;
    private JTextField typeTextField;
    private JTextArea recordsTextArea;

    private List<Drone1> drone;

    public DroneManagementGUI() {
        drone = new ArrayList<Drone1>();

        setTitle("Drone Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        JLabel modelLabel = new JLabel("Drone Model:");
        modelTextField = new JTextField();
        JLabel rangeLabel = new JLabel("Max Flight Range:");
        rangeTextField = new JTextField();
        JLabel typeLabel = new JLabel("Drone Type:");
        typeTextField = new JTextField();
        JButton addButton = new JButton("Add Drone");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addDroneRecord();
            }
        });

        inputPanel.add(modelLabel);
        inputPanel.add(modelTextField);
        inputPanel.add(rangeLabel);
        inputPanel.add(rangeTextField);
        inputPanel.add(typeLabel);
        inputPanel.add(typeTextField);
        inputPanel.add(addButton);

        recordsTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(recordsTextArea);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton displayButton = new JButton("Display All Drones");
        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayAllDrones();
            }
        });
        JButton saveButton = new JButton("Save Records");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveRecordsToFile();
            }
        });
        JButton loadButton = new JButton("Load Records");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadRecordsFromFile();
            }
        });
        JButton saveRecords = new JButton("Add Records");
        saveRecords.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addRecord();
            }
        });


        buttonPanel.add(addButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addDroneRecord() {
        String model = modelTextField.getText();
        Double range = Double.valueOf(rangeTextField.getText());
        String type = typeTextField.getText();

        Drone1 drone1 = new Drone1(model, range, type);
        drone.add(drone1);

        modelTextField.setText("");
        rangeTextField.setText("");
        typeTextField.setText("");

        updateRecordsTextArea();
    }

    private void displayAllDrones() {
        updateRecordsTextArea();
    }

    private void addRecord() {
        String model = modelTextField.getText();
        double maximumFlightRange = Double.parseDouble(rangeTextField.getText());
        String droneType = typeTextField.getText();

       Drone1  drone;
        if (droneType.equals("Type1")) {
            String additionalAttribute1 = modelTextField.getText();
            drone = new Drone1(model, maximumFlightRange, additionalAttribute1);
        } else if (droneType.equals("Type2")) {
            String additionalAttribute2 = modelTextField.getText();
            drone = new Drone1(model, maximumFlightRange, additionalAttribute2);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid drone type.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        JOptionPane.showMessageDialog(this, "Drone record added successfully.");
    }

    private void saveRecordsToFile() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showSaveDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter fileWriter = new FileWriter(fileChooser.getSelectedFile());
                BufferedWriter writer = new BufferedWriter(fileWriter);

                for (Drone1 drone : drone) {
                    writer.write(drone.toString());
                    writer.newLine();
                }

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadRecordsFromFile() {
        
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(selectedFile))) {
                        List<Drone1> loadedDrones = (List<Drone1>) ois.readObject();
                        // Display loaded drones or perform any further processing

                        // Example: Display loaded drones in text area
                        StringBuilder sb = new StringBuilder();
                        for (Drone1 drone : loadedDrones) {
                            sb.append("Drone Model: ").append(drone.getModel()).append("\n");
                            sb.append("Maximum Flight Range: ").append(drone.getMaximumFlightRange()).append(" km").append("\n");
                            sb.append("\n");
                        }
                        
                        recordsTextArea.setText(sb.toString());

                        JOptionPane.showMessageDialog(this, "Drone records loaded successfully.");
                    } catch (IOException | ClassNotFoundException e) {
                        JOptionPane.showMessageDialog(this, "Failed to load drone records from file.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                
            

            
        }


        updateRecordsTextArea();
    }

    private void updateRecordsTextArea() {
        recordsTextArea.setText("");
        for (Drone1 drone : drone) {
            recordsTextArea.append(drone.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DroneManagementGUI gui = new DroneManagementGUI();
                gui.setVisible(true);
            }
        });
    }
}

