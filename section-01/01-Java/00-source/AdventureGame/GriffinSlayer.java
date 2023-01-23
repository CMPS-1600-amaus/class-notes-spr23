public class GriffinSlayer {
    public static void main(String[] args){
        Hero hero = new Hero("Henry IV", 100, 2);
        System.out.println(hero.toString());

        Monster monster = new Monster("Arzaan the Greedy", 1000, 50);
        System.out.println(monster.toString());
    }
}
