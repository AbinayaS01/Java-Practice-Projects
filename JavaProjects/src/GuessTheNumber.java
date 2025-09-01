import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(1,100);
        int attempts=0;

        boolean isNumber=false;
        while(!isNumber) {
            System.out.println("Enter the number you guessed");
            int guess=sc.nextInt();
            if (guess > number) {
                System.out.println("The number is too HIGH");
                attempts++;
            } else if (guess < number) {
                System.out.println("The number is too LOW");
                attempts++;
            } else {
                System.out.println("The number is right, YOU WON");
                isNumber=true;
                System.out.printf("You tried in %d attempts",attempts);
            }
        }
    }
}
