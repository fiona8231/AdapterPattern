
public class Test {

    public static void main(String[] args){
        EnemyTank  tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        Adapter robotAdapter = new Adapter();

        System.out.println("The robot");

        robot.reactToHuman("Cat");
        robot.walkForward();
        robot.smashWithHand();

        System.out.println("The tank");
        tank.assignDiver("Lily");
        tank.driveForward();
        tank.fierWeapon();

        System.out.println("The robot with adapter");
        robotAdapter.assignDiver("Margo");
        robotAdapter.driveForward();
        robotAdapter.fierWeapon();
    }
}
