import java.util.Random;

// This class is Adaptee
//ROBOT dont have any weapon

public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHand(){
        int attackDamage = generator.nextInt(10)+1; // random num from 1 - 10
        System.out.println("Enemy robot causes " + attackDamage + " Damage ");
    }

    public void walkForward(){
        int movement = generator.nextInt(5) +1;
        System.out.println("Robot walks forwaord " + movement +" space");
    }

    public void reactToHuman(String driverName){
        System.out.println("Robot tramps on " + driverName);
    }
}
