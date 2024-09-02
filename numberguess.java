import java.util.Scanner;

public class numberguess {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        int no;
        int count=0;
        do {
            Scanner sc= new Scanner(System.in);
            System.out.println("Guess a number between 0 and 100");
            no = sc.nextInt();
             count++;
            if (no==number) {
                System.out.println("Correct Number");
                break;
            } 
            else if (no>=number) {
                System.out.println("Entered Number is Large");
            }
            else if (no<=number) {
                System.out.println("Number is Small ");
            }
        } while (no>=0);
        System.out.println("My number was: "+number);
        System.out.println("Total no of attempt:"+count);
    }
}
