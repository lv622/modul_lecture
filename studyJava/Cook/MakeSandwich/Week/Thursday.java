package Cook.MakeSandwich.Week;

import Cook.MakeSandwich.Material.*;

public class Thursday extends Salad {
    public String day;
    public String name;

    public Thursday(String day, String name, String bread, String butter, String egg, String salad){
        this.day = day;
        this.name = name;
        this.bread = bread;
        this.butter = butter;
        this.egg = egg;
        this.salad = salad;
    }

    public String printThursday(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + egg + ", " + salad + ")";
    }
}
