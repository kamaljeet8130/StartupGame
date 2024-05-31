package HeadFirstJava.chapter5writingaprogram.startupgame;

public class SimpleStartup {
    private int[] locationCell;
    private int numOfHits;


    public void setLocationCell(int[] loc){
       locationCell = loc;
    }
    public String checkYourself(int guess){
        String result = "miss";
        for(int cell : locationCell){
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCell.length)
            result = "kill";
        return result;
    }
}
