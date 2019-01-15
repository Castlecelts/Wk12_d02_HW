public class RollerCoaster extends Attraction implements ISecurity {

    private int heightOfRide;
    private int minHeight;

    public RollerCoaster(String name, int rating, int heightOfRide, int minHeight) {
        super(name, rating);
        this.heightOfRide = heightOfRide;
        this.minHeight = minHeight;
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
