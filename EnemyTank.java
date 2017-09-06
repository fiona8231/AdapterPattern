import java.util.Random;

public class EnemyTank implements EnemyAttacker {
    Random generator = new Random();

    @Override
    public void fierWeapon() {
         int attakerDamage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank does " + attakerDamage + " Damage");

    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5)+1;
        System.out.println("Enemy Tank moves " + movement + " Damage");

    }

    @Override
    public void assignDiver(String driverName) {
        System.out.println(driverName + "is driving the tank.");

    }
}
