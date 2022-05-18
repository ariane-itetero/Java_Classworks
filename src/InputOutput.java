import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputOutput{
        public static void main(String[]args)throws IOException{
            //inputstreamreader reads characters from keyboard and sends them to buffered reader
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your firstName,lastname and age");
            String input=bufferedReader.readLine();
            StringTokenizer tokenizer=new StringTokenizer(input,",");
            String firstName=tokenizer.nextToken();
            String lastName=tokenizer.nextToken();
            String age=tokenizer.nextToken();
            Person p1=new Person(firstName,lastName,Integer.parseInt(age),Gender.FEMALE);
            System.out.println("Names :" + p1.getFirstName() + " " + p1.getLastName() + " and aged " + p1.getAge());
        }
    }
