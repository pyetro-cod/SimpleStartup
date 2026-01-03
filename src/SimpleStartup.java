public class SimpleStartup {

    public int[] locationCells;
    public int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(int userGuess) {
        String result = "miss";

        for (int cell : locationCells) {
            if (userGuess == cell) {
                result = "Hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "KILL The Finally";
        }
        System.out.println(result);
        return result;
    }


}
