public abstract class Phone{
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;

    public Phone(String versionNumber, int batteryPercentage, String ringTone, String carrier) {
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getVersion() {
        return this.versionNumber;
    }

    public abstract void displayInfo();
}