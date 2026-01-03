public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup test = new SimpleStartup();

        int[] location = {2, 3, 4};
        test.setLocationCells(location);

        int userGuess = 2;
        String result = test.checkYourself(userGuess);

        String testResult = "failed";
        if (result.equals("hit")){
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}
