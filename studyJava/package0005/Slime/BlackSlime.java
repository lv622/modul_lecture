package package0005.Slime;

public class BlackSlime extends NormalSlime {
    public BlackSlime(String name, int hp, int mp, int exp) {
        super(name, hp, mp, exp);
    }

    @Override
    public void CreateSlime() {
        System.out.println("[" + this.name + "] 이 나타났습니다.");
        System.out.println("HP는 " + this.hp + "");
        System.out.println("MP는 " + this.mp + "");
    }

    @Override
    public int att() {
        return criticalAtt();
    }

    public int criticalAtt() {
        return hp / 2;
    }
}
