public class BlueLightBlockers implements Consumable{
    public void consume(Character owner, Character other){
        System.out.printf("You have put on your pit viper blue light blockers. ");
        System.out.printf("You look awesome and will take less damage.");
        other.setTempDamageBuff(0.8);
    }
}
