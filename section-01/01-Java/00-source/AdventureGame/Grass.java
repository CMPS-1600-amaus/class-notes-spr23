public class Grass implements Consumable {
    public void consume(Character owner, Character other){
        owner.kill();
        other.kill();
        System.out.println("touch grass");
    }
}
