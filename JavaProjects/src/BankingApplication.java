import java.util.Scanner;

public class BankingApplication {
    static Scanner sc=new Scanner(System.in);
    static double balance=0.0;
    public static void main(String[] args){

        int choice;
        boolean isFunctional=true;



        while(isFunctional){
            System.out.println("*************************");
            System.out.println("Welcome to the Banking System");
            System.out.println("*************************");
            System.out.println("Select your choice:");
            System.out.println("1.CHECK BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            choice=sc.nextInt();
            switch(choice){
                case 1->checkBalance(balance);
                case 2->{
                    System.out.println("Enter the amount to be deposited");
                    double amount=sc.nextDouble();
                    balance+=deposit(amount);
                    System.out.printf("Your balance is Rs.%.3f\n",balance);
                }
                case 3->{
                    System.out.println("Enter the amount to be withdrawn");
                    double amount=sc.nextDouble();
                    balance-=withdraw(amount);
                    System.out.printf("Your balance is Rs.%.3f\n",balance);
                }
                case 4-> {
                    System.out.println("Thank you for banking");
                    isFunctional=false;
                }
                default -> System.out.println("Invalid Choice");

            }
        }
    }
    static void checkBalance(double balance){
        System.out.println(balance);
    }
    static double deposit(double amount){
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double amount){
        if(amount<0){
            System.out.println("Amount cannot be negative");
            return 0;
        }
        else if(amount>balance){
            System.out.println("INSUFFICIENT AMOUNT");
            return 0;
        }
        else{
            return amount;
        }

    }

}
