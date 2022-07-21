package package0005.sword;

public class wBasic {
    public static final String defaultName = "주먹";
    public static final int defaultAtt = 1;
    public static final int defaultAttRange = 1;
    public static final int defaultChangeTime = 1;

    public String name = "주먹";
    public int att = 1;
    public int attRange = 1;
    public int changeTime = 1;

    public void attAction() {
        System.out.println("무기 " + this.name + "을 장착하였습니다.");
    }

    public void destruction() {
        System.out.println("무기가 파괴되었습니다.");
    }

    public void destrutionBefore(String name, int att, int attRange, int chageTime) {
        this.name = name;
        this.att = att;
        this.attRange = attRange;
        this.changeTime = chageTime;
    }
}
