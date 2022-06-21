package slimeLand;

import java.util.Random;

public class soldier {
    Random rd = new Random();

    public String name;
    public int hp = 100;
    public int mp = 100;
    public int att = 5;
    // public int att = rd.nextInt(6); // 0~5까지 랜덤
    public int dmg;

    public int att() {
        System.out.println(this.name + "은/는 " + att + "의 공격을 했습니다.");
        return 5;
    }

    // public int att_A() {
    //     this.mp -= 10;
    //     return 10;
    // }

    // public int att_B() {
    //     this.mp -= 20;
    //     return 50;
    // }

    public void dmg(int dmg){
        this.hp -= dmg;
    }

    public void info(String name) {
        System.out.println("--------------------------------");
        System.out.println("\t용사 [" + name + "]");
        System.out.println("\t- HP: " + this.hp);
        System.out.println("\t- MP: " + this.mp);
        System.out.println("--------------------------------");
    }
}
