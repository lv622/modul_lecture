import java.util.Random;
import java.util.Scanner;

import slimeLand.*;

public class main {
    static Random rd = new Random();
    static Scanner scan = new Scanner(System.in);

    static int random = rd.nextInt(10) + 1; // 1~10
    static int att = rd.nextInt(11); // 0~10

    static int gameStart = 0;
    static int chooseMenu = 0;
    static String name = "";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        while(true){

            System.out.println("1. 게임 시작\t2. 게임 종료");
            gameStart = scan.nextInt();

            if (gameStart == 1) soldier();
            if (gameStart == 2) { System.out.println("게임을 종료합니다."); break; }
        }
    }

    public static void menu() {
        System.out.println("1.공격");

        if (chooseMenu == 1) attackMOP();
        // if (chooseMenu == 2) ;
        // if (chooseMenu == 3) ;
        
    }

    private static void attackMOP() {
    
    
    }

    public static void soldier(){
        System.out.print("용사의 이름을 입력하세요. > ");
        name = scan.next();

        soldier soldier = new soldier();
        soldier.info(name);

        randomMOP();
    }

    public static void randomMOP() {
        if (random % 2 == 0) slime();
        if (random % 2 == 1) landSnail();

        menu();
    }

    public static void landSnail() {
        landSnail landSnail = new landSnail();
        landSnail.info();
    }

    public static void slime() {
        slime slime = new slime();
        slime.info();
    }


}
