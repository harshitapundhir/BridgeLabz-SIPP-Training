import java.util.Scanner;

public class rockandScissors {

    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    public static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if (user.equals("rock") && computer.equals("scissors")) return "user";
        if (user.equals("paper") && computer.equals("rock")) return "user";
        if (user.equals("scissors") && computer.equals("paper")) return "user";
        return "computer";
    }

    public static String[][] getStats(int userWins, int computerWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f", (userWins * 100.0 / games)) + "%";
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f", (computerWins * 100.0 / games)) + "%";
        return stats;
    }

    public static void displayResults(int userWins, int computerWins, int games) {
        String[][] stats = getStats(userWins, computerWins, games);
        System.out.println("Player\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, computerWins = 0;
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock, paper, scissors): ");
            String userChoice = sc.next().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = getWinner(userChoice, computerChoice);
            if (winner.equals("user")) userWins++;
            else if (winner.equals("computer")) computerWins++;
        }

        displayResults(userWins, computerWins, games);
    }
}
