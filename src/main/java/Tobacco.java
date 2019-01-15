public class Tobacco extends Stall{
    private int numberShelves;

    public Tobacco(String brand, String ownerName, int parkLocation, int numberShelves) {
        super(brand, ownerName, parkLocation);
        this.numberShelves = numberShelves;
    }

    public int getNumberShelves() {
        return numberShelves;
    }

    public void setNumberShelves(int numberShelves) {
        this.numberShelves = numberShelves;
    }
}
