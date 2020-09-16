package be.intecbrussel.francktest.robots;

public abstract class Robot {

    protected String unitName;

    public Robot(){
        this.unitName = "nameless Robot";
        boot();
    }

    public Robot(String unitName){
        this.unitName = unitName;
        boot();
    }

    public void boot(){
        System.out.println("The " + unitName + " is starting.");
    }

    public String getUnitName(){
        return unitName;
    }
}
