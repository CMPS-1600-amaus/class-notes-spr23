public class GriffinSlayer {
    public static void main(String[] args){
        Character hero = new Hero("Henry IV", 100, 2, 100);
        System.out.println(hero.toString());
        hero.giveItem(new Grass());
        hero.giveItem(new HealingPotion());
        hero.giveItem(new InvulnerabilityPotion());

        Character monster = new Monster("Arzaan the Greedy", 1000, 50, 10);
        System.out.println(monster.toString());

        enterCombat(hero, monster);

    }

    public static void enterCombat(Character hero, Character monster){
        while(true){
            hero.takeTurn(monster);
            if(hero.hasFled()){
                System.out.println("L");
                break;
            }
            if(!monster.isAlive()){
                System.out.printf("%S is SLAIN!!",monster.getName());
                break;
            }

            monster.takeTurn(hero);
            if(!hero.isAlive()){
                System.out.printf("%S is SLAIN!!",hero.getName());
                break;
            }
        }
    }

}
