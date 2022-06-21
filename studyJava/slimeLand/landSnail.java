package slimeLand;

public class landSnail {
    public String name = "달팽이";
    public int hp = 10;

    // public void landSnail() {
    //     this.name = name;
    //     this.hp = hp;
    // }

    // public void landSnail2() {
    //     this.name = "달팽이 Lv.2";
    //     this.hp = 20;
    // }

    public int att (int att) {
        System.out.println(this.name + "은/는 " + att + "의 공격을 했습니다.");
        return this.hp - att;
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
