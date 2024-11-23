import javax.swing.*;

public class Yatzy {
    public static void main(String[] args) {
        // print Yatzy if dice is equals to 6:
        int dice = 1;
        while (dice <= 6){
            if (dice<6)
            {
                System.out.println("No Yatzy");
            }
            else {
                System.out.println("Yatzy");
            }
            dice = dice + 1;
        }
    }
}
