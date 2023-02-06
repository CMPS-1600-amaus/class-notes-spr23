import java.util.Scanner;
public class HackerGame {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args){

        Player player = new Player("Aaron", 1000, 100, "A 5th grade hacker");
        System.out.println(player.toString());
        player.obtain(new RedMonster());
        player.obtain(new BlueLightBlockers());

        Computer computer = new Computer("Jonathan", 1000, 100, "Our doom!");
        System.out.println(computer.toString());

        //Character player2 = new Player("Aaron the 15th", 1337, 137, "Better than Aaron the 14th!");
        enterCombat(player, computer);

        in.close();
    }

    public static void enterCombat(Player player, Computer computer){
        System.out.println(String.format("In a land far, far away the hacker %S and roque AI %S face off to this binary oblivion", player.getName(), computer.getName()));
        int parity = 0;
        while(player.isAlive() && computer.isAlive()){
            if(parity % 2 == 0){
                player.takeTurn(computer);
                if(!computer.isAlive()){
                    System.out.printf("Enemy %S felled!!",computer.getName());
                }
            } else{
                computer.takeTurn(player);
                if(!player.isAlive()){
                    System.out.printf("%S has fallen and can't get up. They couldn't hack it.",player.getName());
                }
            }
            parity++;
        }
    }
}
