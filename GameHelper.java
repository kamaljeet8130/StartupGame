package HeadFirstJava.chapter5writingaprogram.startupgame;

import java.util.Scanner;

public class GameHelper {
    public int getUserInput(String parameter){
        Scanner scanner = new Scanner(System.in);
        System.out.println(parameter);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
