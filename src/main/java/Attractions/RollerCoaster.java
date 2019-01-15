package Attractions;

import Attractions.Attraction;

public class RollerCoaster extends Attraction {

    private int heightOfRide;

    public RollerCoaster(String name, int heightOfRide) {
        super(name);
        this.heightOfRide = heightOfRide;
    }

    public int getHeightOfRide() {
        return heightOfRide;
    }
}
