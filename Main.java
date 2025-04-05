import java.util.Scanner;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] cand = {"ahmad", "ali", "akbar", "arian", "reza"};
        int[] score = {0, 0, 0, 0, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your vote count: ");
        int people = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= people; i++) {
            System.out.println("\nVoter " +i+ ":");
            for (int j = 0; j < 3; j++) {
                String place = switch (j){
                    case 0 -> "First";
                    case 1 -> "Second";
                    case 2 -> "Third";
                    default -> "";
                };
                System.out.print("Enter your " +place+ " vote: ");
                String B = scanner.nextLine().trim();
                int indices = Arrays.asList(cand).indexOf(B);


                switch (indices) {
                    case 0:
                        score[0]++;
                        break;
                    case 1:
                        score[1]++;
                        break;
                    case 2:
                        score[2]++;
                        break;
                    case 3:
                        score[3]++;
                        break;
                    case 4:
                        score[4]++;
                        break;
                    default:
                        System.out.println("Invalid name: "+B);
                }
            }
        }
        for (int i=0 ; i< cand.length ; i++ ){
            System.out.println(cand[i] + ": " +score[i]);
        }
        int maxVotes = score[0];
        int winnerIndex = 0;

        for (int i=1 ; i< score.length ; i++){
            if (score[i] > maxVotes){
                maxVotes=score[i];
                winnerIndex = i;
            }
        }
        System.out.println("\nThe winner is " +cand[winnerIndex] + " with " + maxVotes + " votes!");
    }
}