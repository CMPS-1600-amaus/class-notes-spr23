public class GriffinSlayer {
    public static void main(String[] args){
        Hero hero = new Hero("Henry IV", 100, 2);
        System.out.println(hero.toString());

        Monster monster = new Monster("Arzaan the Greedy", 1000, 50);
        System.out.println(monster.toString());

        hero.attack(monster);
        System.out.println(monster.toString());

        monster.attack(hero);

        System.out.println(hero.toString());

    }

    public void enterCombat(Hero hero, Monster monster){
        while(true){
            hero.attack(monster);
            if(!monster.isAlive()){
                break;
            }
        }
    }

}
