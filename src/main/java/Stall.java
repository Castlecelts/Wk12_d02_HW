public abstract class Stall {
    private String brand;
    private String ownerName;
    private int parkLocation;

    public Stall(String brand, String ownerName, int parkLocation) {
        this.brand = brand;
        this.ownerName = ownerName;
        this.parkLocation = parkLocation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getParkLocation() {
        return parkLocation;
    }
}
