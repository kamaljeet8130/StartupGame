package HeadFirstJava.chapter5writingaprogram.startupgame;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup simpleStartup = new SimpleStartup();

        int randomNum = (int)(Math.random()*5);
        int[] location = {randomNum,randomNum+1,randomNum+2};
        for (int locs : location){
            System.out.println(locs);
        }
        simpleStartup.setLocationCell(location);

        boolean isAlive = true;
        while(isAlive){
            int guess = helper.getUserInput("Enter the Number: " );
            String result = simpleStartup.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")){
                isAlive = false;
                System.out.println("you took : " + numOfGuess + " gussess");
            }
        }
    }
}
