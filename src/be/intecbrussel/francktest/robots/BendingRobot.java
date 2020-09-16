package be.intecbrussel.francktest.robots;

public class BendingRobot extends Robot {

    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle){
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendParam){

        if (bendParam > maxBendAngle){
            System.out.println("Can't bend.");
        } else {
            System.out.println("Was able to bend with an " + bendParam + "° angle.\n");
        }

    }
}
