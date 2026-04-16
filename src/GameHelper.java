import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt){
        private static final String ALPHABET = "abcdefg";
        private static final int GRID_LENGTH = 7;
        private static final int GRID_SIZE = 49;
        private static final int MAX_ATTEMPS = 200;

        static final int HORINZONTAL_INCREMENT = 1;
        static final int VERTICAL_INCREMENT = GRID_SIZE;

        private final int[] grid = new int[GRID_SIZE];
        private final Random random = new Random();
        private int statupCount = 0;

        public String getUserInput(String promp){
            System.out.println(prompt + ":");
            Scanner scanner = new Scanner(System.in);
            return  scanner.nextLine().toLowerCase();
        }

        public ArrayList<String> placeStartup(int startupSize){
            int[] startupCoords = new int[startupSize];
            int attemps = 0;
            boolean sucess = false;

            statupCount++;
            int increment = getIncrement();

            while (!sucess & attemps++ < MAX_ATTEMPS){
                int location = random.nextInt(GRID_SIZE);

                for(int i = 0; i < startupCoords.length;i++){
                    startupCoords[i] = location;
                    location += increment;
                }
//                System.out.println("Trying: " + Arrays.toString(startupCoords));
                if (startupFits(startupCoords,increment)){
                    sucess = coordsAvailable(startupCoords);
                }
            }
            savepositionToGrid(startupCoords);
            ArrayList<String> alphaCells = convertCoordsToAlphaFormatet(startupCoords);
            System.out.println("Placed at: " + alphaCells);
            return alphaCells
        }


    }
}
