
public class RedMonster implements Consumable{
    public void consume(Character owner, Character other){
        System.out.println("Do you want to:");
        System.out.println("1: Pour your RedMonster™ into the cyber neural pathway?");
        System.out.println("2: Chug your RedMonster™ in your human neural pathway?");
        System.out.printf("Enter your choice: ");
        int choice = HackerGame.in.nextInt();
        if(choice == 1){
            System.out.println("You pour your RedMonster™ into the cyber neural pathway.");
            System.out.printf("Sweet and sticky smoke rises and %S flickers and sputters.", other.getName());
            other.setAsStunned(1);
        } else if (choice == 2){
            System.out.println("You chug your RedMonster™. You heal for 360 points.");
            owner.modifyHealth(360);
        }
    }
    
}
