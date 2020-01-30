
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;


public class main{
    public static void main(String[] args)throws IOException{
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName));
        String[] name_list = all_names.split( "\n");
        var numberOfStudents = name_list.length;
        var randGenerator = new Random();
        var num=randGenerator.nextInt(numberOfStudents);
        System.out.println("Congrats "+ name_list[num]+ " you get to answer the question ");


    }

}

