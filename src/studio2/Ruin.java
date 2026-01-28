import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startAmount = 2;
        double winChance = 0.7;
        int winLimit = 10; 
        int totalSimulations = in.nextInt();
        int simulationNumber = 0;
        int winCount = 0; 
        int loseCount = 0;
        
        for (int i = 0; i <= totalSimulations; i++) {
            while (startAmount < winLimit || startAmount == 0) {
                double x = Math.random();
                simulationNumber++;
                if (x <= winChance) {
                    System.out.print("Simulation " + simulationNumber + ": ");
                    System.out.println("Win");
                    startAmount = startAmount + 1; 
                    System.out.println("You now have $" + startAmount);
                    winCount++;
                } else {
                    System.out.print("Simulation " + simulationNumber + ": ");
                    System.out.println("Lose");
                    startAmount = startAmount - 1; 
                    System.out.println("You now have $" + startAmount);
                    loseCount++;
                }
            }
        }
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + loseCount);
        System.out.println("Simulations: " + simulationNumber);
    }
}
