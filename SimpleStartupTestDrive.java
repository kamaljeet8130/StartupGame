package HeadFirstJava.chapter5writingaprogram.startupgame;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        GameHelper helper = new GameHelper();
        int numGuesses = 0;
        SimpleStartup simpleStartup = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5); // Cast for clarity
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        for (int loc : location){
            System.out.println(loc);
        }
        simpleStartup.setLocationCell(location);
        boolean isAlive = true;
        boolean[] guessHistory = new boolean[7];
        while (isAlive) {
            String result = "";
            int guess = helper.getUserInput("Enter a number (0-6) : "); // Clearer prompt4
            if (guessHistory[guess]) {
                result = "You already guessed " + guess + ". Try again.";
            } else {
                result = simpleStartup.checkYourself(guess);
                guessHistory[guess] = true;
            }

            System.out.println(result);
            numGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numGuesses + " guesses.");
            }

        }

    }
}
