import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuntionalInterfacePractice {
    public static void main(String[] args){
        //create the list of strings
        // create predicate and use lambda
        //iterate and use test function

        List<String> samples= Arrays.asList("Hello","Hi","Happy","GM","Hai");
        Predicate<String> p=(s)->s.startsWith("H");

        for(String sample:samples){
            if(p.test(sample)){
                System.out.println(sample);
            }
        }


    }
}
