
public class Adapter implements EnemyAttacker{

    EnemyRobot robot = new EnemyRobot();
    @Override
    public void fierWeapon() {
        robot.smashWithHand();

    }

    @Override
    public void driveForward() {
        robot.walkForward();

    }

    @Override
    public void assignDiver(String driver) {
        robot.reactToHuman(driver);

    }
}
