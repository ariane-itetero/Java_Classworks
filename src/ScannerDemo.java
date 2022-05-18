import java.io.IOException;
import java.util.Scanner;
//The Scanner class  accepts multiple inputs from file or keyboard and divides them into tokens
public class ScannerDemo {
    public static void main(String[]args)throws IOException{
        Scanner scan=new Scanner(System.in);
        int age=scan.nextInt();
        String names=scan.next();
        Double height=scan.nextDouble();
        System.out.println("age:"+age+"names "+names+"height "+height);
    }
}