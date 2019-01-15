public class Dodgems extends Attraction {
    private int minPeople;

    public Dodgems(String name, int rating, int minPeople) {
        super(name, rating);
        this.minPeople = minPeople;
    }

    public int getMinPeople() {
        return minPeople;
    }

}
