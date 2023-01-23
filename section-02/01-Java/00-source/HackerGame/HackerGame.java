public class HackerGame {
    public static void main(String[] args){

        System.out.println("num players: " + Player.numPlayers);

        Player player = new Player("Aaron", 5, 2, "A 5th grade hacker");
        System.out.println(player.toString());

        Computer computer = new Computer("Jonathan", 100, 200, "Our doom!");
        System.out.println(computer.toString());

        System.out.println("num players: " + Player.numPlayers);

    }
}
