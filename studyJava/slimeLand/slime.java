package slimeLand;

public class slime {
    public String name = "슬라임";
    public int hp = 10;

    // public void slime() {
    //     this.name = name;
    //     this.hp = hp;
    // }

    // public void slime2() {
    //     this.name = "슬라임 Lv.2";
    //     this.hp = 20;
    // }

    public int att (int att) {
        System.out.println(this.name + "은/는 " + att + "의 공격을 했습니다.");
        return att;
    }
    
    public void dmg (int dmg){
        this.hp -= dmg;
        System.out.println(this.name + "은/는 " + dmg + "의 공격을 받았습니다.");
    }

    public void info() {
        System.out.println("[" + this.name + "] 이 나타났습니다.");
        System.out.println("  HP: " + this.hp);
        System.out.println("--------------------------------");
    }
}
