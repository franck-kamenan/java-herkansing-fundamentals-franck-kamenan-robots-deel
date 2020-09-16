package be.intecbrussel.francktest.robots;

public class RobotApp {

    public static void main(String[] args) {

        BendingRobot myBendingRobot = new BendingRobot("Bender", 30);
        myBendingRobot.bend(40);
        myBendingRobot.bend(20);

        LiftingRobot myLiftingRobot = new LiftingRobot("Terminator", 3);
        myLiftingRobot.lift(4);
        myLiftingRobot.lift(2);

        CrazyRobot myCrazyRobot = new CrazyRobot("Bernard");

        Robot myRobot = new Robot("AbsctractClassObjectNotPossible") {
            @Override
            public String getUnitName() {
                return super.getUnitName();
            }
        };
    }
}
