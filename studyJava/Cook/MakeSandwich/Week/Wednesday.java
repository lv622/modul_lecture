package Cook.MakeSandwich.Week;

import Cook.MakeSandwich.Material.*;

public class Wednesday extends Pumpkin{
    public String day;
    public String name;

    public Wednesday(String day, String name, String bread, String butter, String bacon){
        this.day = day;
        this.name = name;
        this.bread = bread;
        this.butter = butter;
        this.pumpkin = bacon;
    }

    public String printWednesday(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + pumpkin + ")";
    }
}
