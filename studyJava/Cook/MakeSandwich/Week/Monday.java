package Cook.MakeSandwich.Week;

import Cook.MakeSandwich.Material.*;

public class Monday extends Blueberry {
    public String day;
    public String name;

    public Monday(String day, String name, String bread, String butter, String bacon, String blueberry){
        this.day = day;
        this.name = name;
        this.bread = bread;
        this.butter = butter;
        this.bacon = bacon;
        this.blueberry = blueberry;
    }

    public String printMonday(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + bacon + ", " + blueberry + ")";
    }

    public String printCook(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + bacon + ", " + blueberry + ")";
    }
}
