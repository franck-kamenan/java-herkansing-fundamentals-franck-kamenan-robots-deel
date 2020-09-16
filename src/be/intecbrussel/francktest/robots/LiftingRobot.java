package be.intecbrussel.francktest.robots;

public class LiftingRobot extends Robot {

    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftHeight){
        super(unitName);
        this.maxLiftHeight = maxLiftHeight;
    }

    public void lift(double liftParam){
        if (liftParam > maxLiftHeight){
            System.out.println("Can't lift.");
        } else {
            System.out.println("Was able to lift with an " + liftParam + "m height.\n");
        }
    }
}
