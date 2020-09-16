package be.intecbrussel.francktest.robots;

public class CrazyRobot extends Robot {

    public CrazyRobot() {
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }

    @Override
    public void boot(){
        StringBuilder reversed = new StringBuilder();
        reversed.append(unitName);
        System.out.println("The " + reversed.reverse() + " is starting.");
    }
}
