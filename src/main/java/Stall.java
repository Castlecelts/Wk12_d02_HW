public abstract class Stall implements IReviewed{
    private String brand;
    private String ownerName;
    private int parkLocation;
    private int rating;

    public Stall(String brand, String ownerName, int parkLocation, int rating) {
        this.brand = brand;
        this.ownerName = ownerName;
        this.parkLocation = parkLocation;
        this.rating = rating;
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

    public int getRating() {
        return rating;
    }

    public String getName() {
        return ownerName;
    }
}
