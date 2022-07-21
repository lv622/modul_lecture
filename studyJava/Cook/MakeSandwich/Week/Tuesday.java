package Cook.MakeSandwich.Week;

import Cook.MakeSandwich.Material.*;

public class Tuesday extends Lettuce {
    public String day;
    public String name;

    //생성자
    public Tuesday(String day, String name, String bread, String butter, String bacon, String lettuce){
        this.day = day;
        this.name = name;
        this.bread = bread;
        this.butter = butter;
        this.bacon = bacon;
        this.lettuce = lettuce;
    }

    public String printTuesday(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + bacon + ", " + lettuce + ")";
    }

    public String printCook(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + bacon + ", " + lettuce + ")";
    }
}
