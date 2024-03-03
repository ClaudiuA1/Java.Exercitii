package isp.lab3.exercise4;

public class MyPoint {

    int x;
    int y;
    int z;

    public MyPoint(){
        x=0;
        y=0;
        z=0;
    }

    public MyPoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "("+x+","+y+","+z+")";
    }

    public double distance(int x, int y, int z){
        int dx, dy, dz;
         dx = this.x - x;
         dy = this.y - y;
         dz = this.z - z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }

    public double distance (MyPoint punct){
        int dx, dy, dz;
        dx = this.x - punct.x;
        dy = this.y - punct.y;
        dz = this.z - punct.z;
        return Math.sqrt(dx*dx + dy*dy + dz*dz);
    }


    static public void main(String[] args) {
        MyPoint punct1=new MyPoint(13,-25,0);
        MyPoint punct2=new MyPoint(142,78,-423);

        System.out.println(punct1.toString());
        System.out.println(punct2.toString());

        System.out.println(punct1.distance(punct2));

    }



}
