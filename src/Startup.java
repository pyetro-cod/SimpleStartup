import java.util.ArrayList;

public class Startup {

    private ArrayList<String> locationCells;
    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput) {
        String result = "miss";

        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Kill";
            } else {
                result = "Hit";
            }
        }
        return result;
    }
}
