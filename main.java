// Alexander Sullivan
//scanner stuff
/*
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        var reader= new Scanner(System.in);
        System.out.println("what is your name");
        String name=reader.nextLine();
        System.out.println("Hello "+name);
        System.out.println("hi");
    }

}
*/
//File IO stuff
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExample{
    public static void main(String[] args){
        var fileName = "students.txt";
        String all_names = Files.readString(Paths.get(fileName);
        String[] name_list


    }

}
//.equals is used to compare strings
//import java.util.Random;
//import java.util.Scanner;
//var randGenerator = new Random();

