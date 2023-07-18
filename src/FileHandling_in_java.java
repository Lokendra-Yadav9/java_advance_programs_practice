import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//class IoExecption extends Exception{
//
//    public String toString() {
//        return "this will produce IoExecption";
//    }
//}
public class FileHandling_in_java {
    public static void main(String[] args) throws IOException{
//        File newFile=new File("thisIsFile.txt");
//        try {
//            newFile.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

// try {
//     FileWriter fileWriter = new FileWriter("thisIsFile.txt");
//     fileWriter.write("i am learning and for get a good job new life as well i love to see my exes they are really good ");
//     fileWriter.close();
// }
// catch ( IOException e){
//     System.out.println(e);
// }
        File newFile=new File("texxt.txt");

        try {
        Scanner sc=new Scanner(newFile);
        while (sc.hasNext()) {
           String line= sc.nextLine();
            System.out.println(line);
        }
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }


    }
}
