package isp.lab7.safehome;

public class TenantNotFoundException extends Exception {
    public TenantNotFoundException(String theTenantDoesNotExist) {
        super(theTenantDoesNotExist);
    }
}
