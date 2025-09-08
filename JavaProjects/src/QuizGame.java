import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args){
        String[] questions={"1. What is OOPS in Java",
                            "2. What is abstraction",
                            "3. What is Polymorphism",
                            "4. What is Inheritance",
                            "5. What is Encapsulation"};
        String[][] options={
                {" 1) Object Oriented Programming"," 2) Orbital oriented programming"," 3) OO Programing"," 4) Online Programming"},
                {" 1) showing complexity"," 2) removing complexity"," 3) hiding complexity"," 4) adding complexity"},
                {" 1) multiple forms"," 2) single form"," 3) no form"," 4) adding new form"},
                {" 1) property of child to parent"," 2) property of parent to child"," 3) property of child to child"," 4) property of parent to parent"},
                {" 1) disclosing data"," 2) clearing data"," 3) matching data"," 4) wrapping data"}};
        int[] answers={1,3,1,2,4};
        int user_answer;
        int score=0;
        String result="Pass";

        Scanner sc=new Scanner(System.in);
        System.out.println("***************************");
        System.out.println("Welcome to Quiz Game");
        System.out.println("***************************");
        for(int i=0;i<5;i++){
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.println();
            System.out.print("Enter your answer: ");
            user_answer=sc.nextInt();
            for(int k=0;k<5;k++){
                if(answers[i]==user_answer){
                    score++;
                    break;


                }
                if(score>3){
                    result="Pass";
                }
                else{
                    result="Fail";
                }
            }
            System.out.println();


        }
        System.out.println("Congrats! you completed the test");
        System.out.println("***************************");
        System.out.println("Your score is "+score+" out of 5"+" and you are "+result);
        System.out.println("***************************");




        sc.close();
    }
}
