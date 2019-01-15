public class IceCream extends Stall {
    private int noFridges;

    public IceCream(String brand, String ownerName, int parkLocation, int noFridges) {
        super(brand, ownerName, parkLocation);
        this.noFridges = noFridges;
    }

    public int getNoFridges() {
        return noFridges;
    }
}
