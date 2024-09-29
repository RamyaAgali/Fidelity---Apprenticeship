import java.util.Scanner;

public class Inheritance
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a game name:");
        String gamename = scan.nextLine();
        System.out.println("Enter the ,maximum number of players:");
        int maxPlayers = scan.nextInt();
        scan.nextLine();
        Game game1 = new Game(gamename, maxPlayers);
        System.out.println(game1.toString());

        System.out.println("Enter a game that has time limit:");
        String timedGame = scan.nextLine();
        System.out.println("Enter the maximum number of players:");
        int timedGameMaxPlayers = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the time limit in minutes:");
        int timeLimit = scan.nextInt();
        GameWithTimeLimit G1 = new GameWithTimeLimit(timedGame, timedGameMaxPlayers, timeLimit);
        System.out.println(G1.toString());
        scan.close();


    }
}
