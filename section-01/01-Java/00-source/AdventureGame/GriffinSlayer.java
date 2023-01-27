public class GriffinSlayer {
    public static void main(String[] args){
        Hero hero = new Hero("Henry IV", 100, 2, 100);
        System.out.println(hero.toString());

        Monster monster = new Monster("Arzaan the Greedy", 1000, 50, 10);
        System.out.println(monster.toString());

        enterCombat(hero, monster);

    }

    public static void enterCombat(Hero hero, Monster monster){
        while(true){
            hero.attack(monster);
            if(!monster.isAlive()){
                System.out.printf("%S is SLAIN!!",monster.getName());
                break;
            }

            monster.attack(hero);
            if(!hero.isAlive()){
                System.out.printf("%S is SLAIN!!",hero.getName());
                break;
            }
        }
    }

}
