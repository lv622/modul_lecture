package package0005.Slime;

public class NormalSlime extends Slime {
    public NormalSlime(String name, int hp, int mp, int exp) {
        super(name, hp, mp, exp);
    }

    public void initSlime() {
        System.out.println(this.name + " 슬라임이 태어났습니다.");
    }

    public void CreateSlime() {

    }

    public int att() {
        return 10;
    }
}
