public class RollerCoaster extends Attraction implements ISecurity {

    private int heightOfRide;
    private int minHeight;

    public RollerCoaster(String name, int heightOfRide) {
        super(name);
        this.heightOfRide = heightOfRide;
        this.minHeight = 150;
    }

    public int getHeightOfRide() {
        return heightOfRide;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getHeight()>= minHeight){
            return true;
        }
        return false;
    }
}
