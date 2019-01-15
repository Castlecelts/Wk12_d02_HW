public class Tobacco extends Stall implements ISecurity{
    private int numberShelves;
    private int minAge;

    public Tobacco(String brand, String ownerName, int parkLocation, int numberShelves, int rating) {
        super(brand, ownerName, parkLocation, rating);
        this.numberShelves = numberShelves;
        this.minAge = 16;
    }

    public int getNumberShelves() {
        return numberShelves;
    }

    public void setNumberShelves(int numberShelves) {
        this.numberShelves = numberShelves;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge()>=minAge){
            return true;
        }
        return false;
    }
}
