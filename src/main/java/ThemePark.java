import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> parkAttractions;
    private ArrayList<Stall> parkStalls;
    private ArrayList<IReviewed> reviewedAttractions;

    public ThemePark() {
        this.parkAttractions = new ArrayList<>();
        this.parkStalls = new ArrayList<>();
        this.reviewedAttractions = new ArrayList<>();
    }

    public ArrayList<Attraction> getParkAttractions() {
        return parkAttractions;
    }

    public ArrayList<Stall> getParkStalls() {
        return parkStalls;
    }

    public ArrayList<IReviewed> getReviewedAttractions() {
        return reviewedAttractions;
    }

    public void addParkAttraction(Attraction attraction){
        parkAttractions.add(attraction);
    }

    public void demolishParkAttractions(){
        parkAttractions.clear();
    }

    public void addParkStall(Stall stall){
        parkStalls.add(stall);
    }

    public void demolishParkStalls(){
        parkStalls.clear();
    }

    public void addReviewed(IReviewed reviewedItem){
        reviewedAttractions.add(reviewedItem);
    }

    public void demolishParkReviewedAttractions(){
        reviewedAttractions.clear();
    }
}
