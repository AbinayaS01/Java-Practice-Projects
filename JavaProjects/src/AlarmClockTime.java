import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockTime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime=null;

        while(alarmTime==null){
            try{
                System.out.print("Enter the alarm time (HH:mm:ss): ");
                String inputTime=sc.nextLine();

                alarmTime=LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for "+alarmTime);
            }
            catch (DateTimeParseException e){
                System.out.println("Invalid format, please use HH:mm:ss");
            }

        }

        AlarmCLock alarmCLock=new AlarmCLock(alarmTime);
        Thread alarmThread=new Thread(alarmCLock);
        alarmThread.start();

        sc.close();
    }
}
