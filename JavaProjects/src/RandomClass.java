import java.util.Random;
import java.util.Scanner;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();
        int number1;
        number1 = random.nextInt(1,8);
        System.out.println(number1);


        //Math Library functions
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double power=Math.pow(2,3);
        double absoluteValue=Math.abs(-6);

        System.out.println(power);
        System.out.println(absoluteValue);
        System.out.println(Math.sqrt(9));
        System.out.println(Math.round(3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.99));
        System.out.println(Math.max(10,20));
        System.out.println(Math.min(10,20));


        //finding hypotenuse
        Scanner sc=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the length of side A: ");
        a=sc.nextDouble();
        System.out.println("Enter the length of side B: ");
        b=sc.nextDouble();

        //c=sqrt(a^2+b^2)
        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("The Hypotenuse (side c) is: "+c);
        sc.close();

    }
}
