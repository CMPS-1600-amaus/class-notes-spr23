public class HealingPotion implements Consumable {
    public void consume(Character owner, Character other){
        owner.modifyHealth(58);
    }
}
