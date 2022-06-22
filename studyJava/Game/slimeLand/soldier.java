package slimeLand;

import java.util.Random;

public class soldier {
    Random rd = new Random();

    public String name;
    public int hp = 100;
    public int mp = 100;
    public int att;
    public int dmg;

    public int att() {
        att = rd.nextInt(11) + 1;
        
        return this.att;
    }

    public void dmg(int dmg){
        if (dmg != 0){
            System.out.println("용사가 " + dmg + "만큼 아파합니다.");
            this.hp -= dmg;
        } else {
            System.out.println("용사가 데미지를 받지 않았습니다.");
        }
    }

    public void info(String name) {
        System.out.println("----------------------------");
        System.out.println("\t용사 [" + name + "]");
        System.out.println("\t- HP: " + this.hp);
        System.out.println("\t- MP: " + this.mp);
        System.out.println("----------------------------");
    }

    public void die() {
        System.out.println("용사가 쓰러졌습니다.");
    }
}
