import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        double radius;
//        double circumference;
//        double area;
//        double volume;
//        System.out.print("Enter the radius: ");
//        radius=sc.nextDouble();
//
//        circumference=2*Math.PI*radius;
//        area=Math.PI*Math.pow(radius,2);
//        volume=(4.0/3.0)*Math.PI*Math.pow(radius,3);
//
//        System.out.printf("The circumference is :%.1f\n",circumference);
//        System.out.printf("The area is %.2f\n",area);
//        System.out.printf("The volume is %.3f\n",volume);
//

        String name="SpongeBob";
        char firstLetter='S';
        int age=30;
        double height=60.5;
        boolean isEmployed=true;
        // %[flags][width][.precision][specifier-character]
        System.out.printf("Hello %s\n",name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n",age);
        System.out.printf("You are %f inches tall\n",height);
        System.out.printf("Employeed %b\n",isEmployed);

        System.out.printf("%s is %d years old", name,age);

        //precision----> %.2f
        //flags----->
            //%+d   == adding  plus sign to positive numbers
            //%,d   == seperating the digits with commas
            //%(d   == enclosing negative numbers with brackets
            //% d   == adding spacing before positive numbers

        //width---->
        //%04d  == show all numbers with same number of digits
        // for example if we have 1,23,456,7890
        //the output will be 0001,0023,0456,7890


    }
}
