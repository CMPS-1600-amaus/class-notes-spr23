public class HackerGame {
    public static void main(String[] args){

        Player player = new Player("Aaron", 5, 2, "A 5th grade hacker");
        System.out.println(player.toString());

        Computer computer = new Computer("Jonathan", 100, 200, "Our doom!");
        System.out.println(computer.toString());

        enterCombat(player, computer);
    }

    public static void enterCombat(Player player, Computer computer){
        System.out.println(String.format("In a land far, far away the hacker %S and roque AI %S face off to this binary oblivion", player.getName(), computer.getName()));
        int parity = 0;
        while(player.isAlive() && computer.isAlive()){
            if(parity % 2 == 0){
                player.attack(computer);
            } else{
                computer.attack(player);
            }
            parity++;
        }
    }
}