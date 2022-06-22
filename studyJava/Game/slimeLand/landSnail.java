package slimeLand;

import java.util.Random;

public class landSnail {
    Random rd = new Random();

    public String name = "달팽이";
    public int hp = 10;
    public int att;

    public void title() {
        System.out.println("야생의 " + this.name + "가 나타났습니다.");
    }

    public void info() {
        System.out.println("----------------------------");
        System.out.println("\t[" + this.name + "]");
        System.out.println("\t- HP: " + this.hp);
        System.out.println("----------------------------");
    }

    public int att() {
        att = rd.nextInt(6); //0~5

        if (this.att != 0){
            System.out.print(this.name + "가 공격합니다! ");  
        }
        return this.att;
    }

    public void dmg(int dmg){
        this.hp -= dmg;
        System.out.println(this.name + "는 " + dmg + "의 공격을 받았습니다.");
    }

    public int itemDrop() {
        int random = rd.nextInt(11) + 1; // 1 ~ 10

        return random;
    }

    public void die() {
        System.out.println();
        System.out.println("!! " + this.name + "가 처치되었습니다. !!");
        System.out.println();
    }
}
