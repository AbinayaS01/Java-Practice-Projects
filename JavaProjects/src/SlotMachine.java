import java.util.Random;
import java.util.Scanner;

public class SlotMachine
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int bet;
        int balance = 100;
        int payout;
        String playAgain;
        String[] row;
        System.out.println("*************************************");
        System.out.println("Welcome to the slot machine game");
        System.out.println("The slot emojis are 🐒🐼🐕🐈🐖");
        System.out.println("*************************************");




        while(balance>0){
            System.out.println("*************************************");
            System.out.println("The current balance is $"+balance);
            System.out.println("*************************************");
            System.out.print("Enter the bet: ");
            bet=sc.nextInt();
            sc.nextLine();
            if(bet>balance){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            }
            else if(bet<=0){
                System.out.println("BET SHOULD BE GREATER THAN 0");
                continue;
            }
            else{
                balance-=bet;
            }
            System.out.println("Spinning!!!!!");
            row=spinRow();
            printRow(row);
            payout=getPayout(row,bet);
            if(payout>0){
                System.out.println("You won $"+payout);
                balance+=payout;
            }
            else {
                System.out.println("Sorry you lost this round");
            }
            System.out.print("Do you want to play again?: (Y/N): ");
            playAgain=sc.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }
        System.out.println("*************************************");
        System.out.println("GAME OVER! YOUR FINAL BALANCE IS $ "+balance);
        System.out.println("*************************************");
        sc.close();

    }
    static String[] spinRow(){

        String[] symbols={"🐒","🐼","🐕","🐈","🐖"};
        String[] row=new String[3];
        Random random=new Random();

        for(int i=0;i<3;i++){
            row[i]=symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" "+String.join(" | ",row));
    }
    static int getPayout(String[] row,int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🐒"->bet*3;
                case "🐼"->bet*4;
                case "🐕"->bet*5;
                case "🐈"->bet*10;
                case "🐖"->bet*20;
                default -> 0;
            };
        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🐒"->bet*2;
                case "🐼"->bet*3;
                case "🐕"->bet*4;
                case "🐈"->bet*5;
                case "🐖"->bet*10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🐒"->bet*2;
                case "🐼"->bet*3;
                case "🐕"->bet*4;
                case "🐈"->bet*5;
                case "🐖"->bet*10;
                default -> 0;
            };
        }
        return 0;
    }

}
