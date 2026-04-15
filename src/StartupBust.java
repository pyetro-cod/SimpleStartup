import java.util.ArrayList;

public class StartupBust {
    private GameHelper gameHelper = new GameHelper();

    private ArrayList<Startup> startups = new ArrayList<>();

    int numOfGuesses = 0;

    private void setUpGame() {
        Startup one = new Startup();
        one.setName("poniez");
        Startup  two = new Startup();
        two.setName("hacqi");
        Startup theree = new Startup();
        theree.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(theree);

        System.out.println("Your goal is to sink three Startups.");
        System.out.println("ponex,hacqi,cabista");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(Startup startup : startups) {
            ArrayList<String> newLocation = gameHelper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {
        while (!startups.isEmpty()){
            String useGuess = gameHelper.getUserInput("Enter a guess");
            checkUserGuess(useGuess);
        }
        finishGame();
    }
        

    void checkUserGuess() {
    }

    void finishGame() {
    }

}