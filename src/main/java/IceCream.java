public class IceCream extends Stall {
    private int noFridges;

    public IceCream(String brand, String ownerName, int parkLocation, int noFridges, int rating) {
        super(brand, ownerName, parkLocation, rating);
        this.noFridges = noFridges;
    }

    public int getNoFridges() {
        return noFridges;
    }
}
