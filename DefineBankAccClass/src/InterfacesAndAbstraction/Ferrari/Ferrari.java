package InterfacesAndAbstraction.Ferrari;

public class Ferrari implements Car{
    private static final String MODEL = "488-Spider";

    private String driver;

    public Ferrari(String driver) {

        this.driver = driver;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }


    @Override
    public String useBrakes() {
        return "Brakes!";
    }

    @Override
    public String pushTheGas() {
        return "Zadu6avam sA!";
    }

    @Override
    public String toString() {
                 return String.format("%s/%s/%s/%s",MODEL,useBrakes(),pushTheGas(),this.driver);

    }
}
