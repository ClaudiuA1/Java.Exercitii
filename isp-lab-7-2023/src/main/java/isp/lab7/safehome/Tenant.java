package isp.lab7.safehome;

import java.util.Objects;

public class Tenant {

    private String name;

    public Tenant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tenant)) return false;
        Tenant tenant = (Tenant) o;
        return name.equals(tenant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
