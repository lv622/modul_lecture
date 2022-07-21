package Cook.MakeSandwich.Week;

import Cook.MakeSandwich.Material.*;

public class Friday extends Avocado {
    public String day;
    public String name;

    public Friday(String day, String name, String bread, String butter, String egg, String avocado){
        this.day = day;
        this.name = name;
        this.bread = bread;
        this.butter = butter;
        this.egg = egg;
        this.avocado = avocado;
    }

    public String printFriday(){
        return day + "에는 " + name + "\n(재료 : " + bread + ", " + butter + ", " + egg + ", " + avocado + ")";
    }
}
