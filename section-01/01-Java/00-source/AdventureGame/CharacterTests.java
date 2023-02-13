public class CharacterTests {
    public static void main(String[] args){
        System.out.printf("Running testConstructor\n");
        testConstructor();
        System.out.printf("Test testConstructor PASSED\n");


        System.out.printf("Running testInvulnerability\n");
        testInvulnerability();
        System.out.printf("Test testInvulnerability PASSED\n");
    }

    public static void testConstructor(){
        Character hero = new Hero("Henry IV", 
                                  100, 
                                  2, 
                                  100);
        assert hero.getName().equals("Henry IV");
    }

    public static void testInvulnerability(){
        Character hero = new Hero("Henry IV", 
                                  100, 
                                  2, 
                                  100);
        assert hero.isInvulnerable() == false;

        hero.setNumTurnsInvulnerable(3);
        assert hero.getNumTurnsInvulnerable() == 3;
        assert hero.isInvulnerable() == true;

        hero.decrementTurnsInvulnerable();
        assert hero.getNumTurnsInvulnerable() == 2;

        hero.decrementTurnsInvulnerable();
        hero.decrementTurnsInvulnerable();
        assert hero.getNumTurnsInvulnerable() == 0;
        assert hero.isInvulnerable() == false;

        hero.decrementTurnsInvulnerable();
        assert hero.isInvulnerable() == false;
    }
}