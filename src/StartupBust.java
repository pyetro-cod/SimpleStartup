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
        Startup theree = new Startup();  // Cria 3 Objetos Startup,lhed fornece nomes e inseri o ArrayList
        theree.setName("cabista");
        startups.add(one);
        startups.add(two);
        startups.add(theree);

        System.out.println("Your goal is to sink three Startups.");
        System.out.println("ponex,hacqi,cabista");                        // Printa breves intruções para o Usuário
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(Startup startup : startups) {
            ArrayList<String> newLocation = gameHelper.placeStartup(3);
            startup.setLocationCells(newLocation); // Chama o método setter nesta StarStup para fornecer
        }                                          // o local que vc acabou de obter do auxiliar;
    }

    private void startPlaying() {
        while (!startups.isEmpty()){
            String useGuess = gameHelper.getUserInput("Enter a guess");
            checkUserGuess(useGuess);
        }
        finishGame();
    }
        

    private void checkUserGuess(String userGuess) {
        numOfGuesses ++;
        String result = "miss";

        for (Startup startupToTest : startups){
            result = startupToTest.checkYourself(userGuess);

            if (result.equals("Kill")){
                startups.remove(startupToTest);
                break;
            }
            System.out.println(result);
        }
    }

    private void finishGame() {
        System.out.println("All Startupss are dead! Your stock is now worthless");
        if (numOfGuesses <=18){
            System.out.println("It only took you " + numOfGuesses + "guesses");
            System.out.println("You got out before your options sank");
        } else {
            System.out.println("Took you long enough. " + numOfGuesses + " guess");
            System.out.println("Fish are dancing with your options");
        }
    }

    public static void main(String[] args) {
        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }

}