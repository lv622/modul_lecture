package slimeLand;

import java.util.Random;

public class mushroom {
    Random rd = new Random();
    
    public String name = "주황버섯";
    public int hp = 10;
    public int att = rd.nextInt(5);

    public void title() {
        System.out.println("야생의 " + this.name + "이 나타났습니다.");
    }

    public void info() {
        System.out.println("----------------------------");
        System.out.println("\t[" + this.name + "]");
        System.out.println("\t- HP: " + this.hp);
        System.out.println("----------------------------");
    }

    public int att() {
        System.out.println(this.name + "가 공격합니다!");
        return this.att;
    }

    public void dmg(int dmg){
        System.out.println(this.name + "는 " + dmg + "의 공격을 받았습니다.");
        this.hp -= dmg;
    }

    public void die() {
        System.out.println();
        System.out.println("!!" + this.name + "가 처치되었습니다. !!");
        System.out.println();
    }
}
