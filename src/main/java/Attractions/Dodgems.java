package Attractions;

import Attractions.Attraction;

public class Dodgems extends Attraction {
    private int minPeople;

    public Dodgems(String name, int minPeople) {
        super(name);
        this.minPeople = minPeople;
    }

    public int getMinPeople() {
        return minPeople;
    }

}
