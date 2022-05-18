import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String []args) throws IOException{
        FileInputStream inputStream=null;
        FileOutputStream outputStream=null;
        int myChar;
        try {
            inputStream=new FileInputStream("myFile.txt");
            outputStream=new FileOutputStream("myFileCopy.txt");
            while((myChar=inputStream.read())!=-1){
                System.out.print((char) myChar);
//                FileInputStream newStream = new FileInputStream(new File("MyFile.txt"));
                outputStream.write(myChar);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            inputStream.close();
        }
    }
}

