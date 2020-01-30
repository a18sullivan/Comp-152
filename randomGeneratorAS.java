import java.util.Scanner;
import java.util.Random;

public class randomGeneratorAS {
    public static void main(String[] args) {



        var reader = new Scanner(System.in);
        var randGenerator = new Random();

        var num=randGenerator.nextInt(10)+1;

        System.out.print("Guess a number from 1 to 10");
        var guess = reader.nextInt();

        if(guess==num)
            System.out.print("You guessed "+num+" which is correct");

        while (guess != num) {
            if (guess<num){
                System.out.print("The number is higher than that");
            }
            else if(guess>num){
                System.out.print("The Number is lower than that");

            }
            else if(guess==num){
                System.out.print("You guessed "+num+" which is correct");
                break;
            }

            System.out.print("Guess again 1 to 10");
            guess = reader.nextInt();

        }


    }
}