import java.util.Random;
import java.util.Scanner;

import slimeLand.*;

class game {
    Random rd = new Random();
    Scanner scan = new Scanner(System.in);

    // int gameTurn = rd.nextInt(11) + 1; // 1~10
    int gameTurn = 10;

    soldier soldier = new soldier();
    inventory inventory = new inventory();

    int gameStart = 0;
    int chooseMenu = 0;
    String name = "";

    // 시작 메뉴
    public void start() {
        title();

        System.out.println("1. 게임 시작\t2. 게임 종료");
        gameStart = scan.nextInt();

        while (true) {
            if (gameStart == 1) {
                soldier();
                gameTurn();
            }

            if (gameStart == 2) {
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }

    //몬스터 생성 횟수
    public void gameTurn() {
        for (int i = 0; i < gameTurn; i++) {
            if (soldier.hp <= 0) {
                soldier.die();
                break;
            }
            randomMOP();
        }

        System.out.println("게임이 끝났습니다.");
        gameStart = 2;
    }

    // 게임 타이틀
    public void title() {
        System.out.println("|￣￣￣￣￣￣￣￣￣￣|");
        System.out.println("|  용사와 검의 전설  |");
        System.out.println("| <( ' ~ ')p¤=[]──── |");
        System.out.println("|＿＿＿＿＿＿＿＿＿＿| ");
        System.out.println("");
    }

    // 용사 이름 입력
    public void soldier() {
        System.out.print("용사의 이름을 입력하세요. > ");
        name = scan.next();

        soldier.info(name);
    }

    // 몬스터 랜덤 생성
    public void randomMOP() {
        // int random = rd.nextInt(3); // 0~2
        int random = 0;

        if (random == 0) landSnail(random);
        if (random == 1) slime(random);
        if (random == 2) mushroom(random);

        // if (random == 1) {
        // dragon();
        // }
    }

    //세부 메뉴 (공격, 인벤토리 -준비중-)
    public void attMop(Object obj, int random) {
        System.out.println("1. 공격 | 2. 인벤토리 | 3. ");
        chooseMenu = scan.nextInt();

        //공격
        if (chooseMenu == 1) {
            Object mop = obj;
            
            if (random == 0){
                ((slimeLand.landSnail) mop).dmg(soldier.att());
                soldier.dmg(((slimeLand.landSnail) mop).att());
                soldier.info(name);
            }

            if (random == 1){
                ((slimeLand.slime) mop).dmg(soldier.att());
                soldier.dmg(((slimeLand.slime) mop).att());
                soldier.info(name);
            }

            if (random == 2){
                ((slimeLand.mushroom) mop).dmg(soldier.att());
                soldier.dmg(((slimeLand.mushroom) mop).att());
                soldier.info(name);
            }
        }

        if (chooseMenu == 2) {
            inventoryMenu();
        }
        // if (chooseMenu == 3) ;
    }

    //인벤토리 메뉴
    public void inventoryMenu() {
        while(true){
            inventory.printInven();

            System.out.println("1. 사용 | 2. 삭제 | 3. 닫기");
            System.out.print(">> ");

            int input = scan.nextInt();
    
            // if (input == 1) inventory.useItem();
            if (input == 2) inventory.deleteItem();
            if (input == 3) break;
        }
    }


    // 몹 생성
    // 달팽이
    public void landSnail(int random) {
        landSnail landSnail = new landSnail();
        landSnail.title();

        while (true) {
            landSnail.info();
            attMop(landSnail, random);

            if (landSnail.hp <= 0) {
                landSnail.die();
                inventory.saveItem(landSnail.itemDrop());
                break;
            }
        }
    }

    // 슬라임
    public void slime(int random) {
        slime slime = new slime();
        slime.title();

        while (true) {
            slime.info();
            attMop(slime, random);

            if (slime.hp <= 0) {
                slime.die();
                break;
            }
        }
    }

    // 주황버섯
    public void mushroom(int random) {
        mushroom mushroom = new mushroom();
        mushroom.title();

        while (true) {
            mushroom.info();
            attMop(mushroom, random);

            if (mushroom.hp <= 0) {
                mushroom.die();
                break;
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        game game = new game();
        game.start();
    }

}
