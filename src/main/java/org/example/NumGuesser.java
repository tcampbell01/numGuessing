import java.util.Random;
import java.util.Scanner;

public class ClassNameHere {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();



        int randomNumber = random.nextInt(10) + 1;
        boolean correctChoice = false;

        while (input.hasNext()) {

            while (!correctChoice) {
                System.out.print("Enter num: ");
                int num = input.nextInt();
                if ( num == randomNumber ) {
                    correctChoice = true;
                    System.out.println("Congratulations!");
                } else {
                    System.out.println("Sorry, try again.");
                }
            }
        }

        input.close();
    }
}
