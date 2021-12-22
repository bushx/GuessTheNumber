import java.util.Scanner;


public class main {
    public static void main(String[] args) {

        System.out.println("Please enter a range of numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start");
        int startRange = scanner.nextInt();

        System.out.println("End");
        int endRange = scanner.nextInt();


        int rightAnswer = (int) ((Math.random() * (endRange - startRange)) + startRange);


        System.out.println("Now choose a number between " + startRange + " and " + endRange);
        int guessAnswer = scanner.nextInt();
        int guesses=1;
        while (guessAnswer != rightAnswer) {
            if (guessAnswer > rightAnswer&&guessAnswer <= endRange) {
                System.out.println("Its a Lower number try again");
                guessAnswer = scanner.nextInt();
                guesses++;
            } else if (guessAnswer < rightAnswer&&guessAnswer >= startRange) {
                System.out.println("Its a Higher number try again");
                guessAnswer = scanner.nextInt();
                guesses++;
            } else if (guessAnswer >endRange||guessAnswer<startRange){
                System.out.println("Please keep it in the range of " + startRange + " and " + endRange);
                System.out.println("ANDDDDDD this counted as one of your guesses!");
                System.out.println("Now Guess Again");
                guessAnswer = scanner.nextInt();
                guesses++;
            }
        }
        System.out.println("YOU GOT IT! The correct Number was: "+rightAnswer);
        System.out.println("It took you "+guesses+" guesses!");
    }
}