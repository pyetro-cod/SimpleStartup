import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String prompt){
        System.out.println(prompt + " ");
        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
