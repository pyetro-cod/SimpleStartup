public class SimpleStartupGame {
    public static void main(String[] args) {
        var numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        Startup bot = new Startup();

        var randoNum = (int) (Math.random() * 5);
        int[] locations = {randoNum, randoNum + 1, randoNum + 2};

        bot.setLocationCells(locations);

        boolean isAlive = true;
        while (isAlive){
            int guess = helper.getUserInput("Enter a Number:");
            String result = bot.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " Guesses");
            }
        }


    }
}
