import java.util.Random;

public class Weapon {
    private String name;
    private int damage;
    private String descriptor;
    private Random rand;
    private Character wielder;

    public Weapon(String name, String descriptor, int damage, Character wielder){
        this.name = name;
        this.damage = damage;
        this.descriptor = descriptor;
        this.wielder = wielder;
        this.rand = new Random();
    }

    public void attack(Character other) {
        int attackRoll = rand.nextInt(100);
        int chanceToHitModifier = 0;
        if(other.isVulnerable()){
            chanceToHitModifier = 20;
            other.decrementTurnsVulnerable();
        }
        if(attackRoll < (this.wielder.getChanceToHit() + chanceToHitModifier)){
            int finalDamage = wielder.getAttackPower() + this.damage;
            System.out.printf("%S %S %S for %d damage!\n", wielder.getName(),
                                                                        this.descriptor,
                                                                        other.getName(), 
                                                                        finalDamage);
            other.takeDamage(finalDamage);
        } else {
            System.out.printf("%S MISSED!\n",wielder.getName());
        }
    }
}
