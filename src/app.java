import java.util.Scanner;


public class app {
    
    static int randomNumber(int startRange, int endRange) {
        return (int) ((Math.random() * (endRange - startRange)) + startRange);
    }

    static void checkNumber(int guessAnswer, int rightAnswer, int startRange, int endRange){
        int guesses=1;
        Scanner scanner = new Scanner(System.in);

        while (guessAnswer != rightAnswer) {
            if (guessAnswer > rightAnswer && guessAnswer <= endRange) {
                System.out.println("Its a Lower number try again");
                guessAnswer = scanner.nextInt();
                guesses++;
            } else if (guessAnswer < rightAnswer && guessAnswer >= startRange) {
                System.out.println("Its a Higher number try again");
                guessAnswer = scanner.nextInt();
                guesses++;
            } else {
                System.out.println("Please keep it in the range of " + startRange + " and " + endRange);
                System.out.println("And this counted as one of your guesses!");
                System.out.println("Now Guess Again");
                guessAnswer = scanner.nextInt();
                guesses++;
            }
        }

        System.out.println("YOU GOT IT! The correct Number was: "+rightAnswer);
        System.out.println("It took you "+guesses+" guesses!");
    }

    public static void main(String[] args) {

        System.out.println("Please enter a range of numbers");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Start");
        int startRange = scanner.nextInt();

        System.out.println("End");
        int endRange = scanner.nextInt();

        System.out.println("Now choose a number between " + startRange + " and " + endRange);
        int guessAnswer = scanner.nextInt();

        checkNumber( guessAnswer, randomNumber( startRange, endRange),startRange,endRange);

    }
}