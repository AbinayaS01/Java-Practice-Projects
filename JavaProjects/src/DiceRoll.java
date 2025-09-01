import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int diceCount;
        int total=0;
        System.out.print("Enter the number of times to roll the dice: ");
        diceCount=sc.nextInt();
        for(int i=0;i<diceCount;i++){
            int diceRoll=random.nextInt(1,7);
            System.out.println(diceRoll);
            printDice(diceRoll);
            total+=diceRoll;
        }
        System.out.println("TOTAL: "+total);
        sc.close();
    }
    static void printDice(int diceRoll){
        String dice1= """
                     -------
                    |       |
                    |   +   |
                    |       |
                     -------
                """;
        String dice2= """
                     -------
                    |+      |
                    |       |
                    |      +|
                     -------
                """;
        String dice3= """
                     -------
                    |+      |
                    |   +   |
                    |      +|
                     -------
                """;
        String dice4= """
                     -------
                    |+     +|
                    |       |
                    |+     +|
                     -------
                """;
        String dice5= """
                     -------
                    |+     +|
                    |   +   |
                    |+     +|
                     -------
                """;
        String dice6= """
                     -------
                    |+     +|
                    |+     +|
                    |+     +|
                     -------
                """;
        switch (diceRoll){
            case 1-> System.out.println(dice1);
            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
        }
    }
}
