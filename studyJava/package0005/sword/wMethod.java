package package0005.sword;

public class wMethod extends wBasic {

    @Override
    public void attAction() {
        System.out.println("무기 "+this.name+"을 장착하였습니다.");
        System.out.println("무기의 공격력은 "+this.att+" 입니다.");
        System.out.println("무기의 공격범위는 "+this.attRange+" 입니다.");
        System.out.println("무기의 교체시간은 "+this.changeTime+" 입니다.");
    }

    @Override
    public void destruction() {
        super.destrutionBefore(super.defaultName, super.defaultAtt, super.defaultAttRange, super.defaultChangeTime);
        attAction();
    }
}
