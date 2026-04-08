public class SimpleStartupTestDrive {
    public static void main(String[] args) {

        Startup dot = new Startup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuss = 2;
        String result = dot.checkYourself(userGuss);
        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "Passed";
        }
        System.out.println(testResult);
    }
}
