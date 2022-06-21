package package0004;

import java.util.*;

public class main {
    static Scanner scan = new Scanner(System.in);

    static ArrayList<Mac> MacArray = new ArrayList<>();
    static ArrayList<Window> WinArray = new ArrayList<>();

    static int osType = 0;
    static int choose = 0;
    static int saveData = 0;
    static int printData = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. 입력\t2. 출력\t3. 종료");
            System.out.println("---------------------------------------");

            choose = scan.nextInt();

            if (choose == 1) inputData();
            if (choose == 2) printData();
            if (choose == 3) { System.out.println("종료합니다."); break; }
        }
    }

    public static void inputData() {
        System.out.println("OS 타입을 입력하세요.");
        System.out.println("1. MAC\t2. Window");
        System.out.println("---------------------------------------");
        
        osType = scan.nextInt();

        System.out.println("\tname\tCPU\tRAM\tSSD 를 입력하세요.");
        System.out.println("ex) computer\ti7\t16g\t256g");
        System.out.println("---------------------------------------");

        String name = scan.next();
        String cpu = scan.next();
        String ram = scan.next();
        String ssd = scan.next();

        saveData(name, cpu, ram, ssd);
    }

    public static void printData() {
        System.out.println("1. Mac 출력\t2.Window 출력");
        printData = scan.nextInt();

        if (printData == 1) {
            for (Mac com : MacArray) {
                System.out.println("osType: " + com.osType + "\tname: " + com.name + "\tcpu: " + com.cpu + "\tram: " + com.ram + "\tssd : " + com.ssd);
            }
        }
        
        if (printData == 2) {
            for (Window com : WinArray) {
                System.out.println("osType: " + com.osType + "\tname: " + com.name + "\tcpu: " + com.cpu + "\tram: " + com.ram + "\tssd : " + com.ssd);
            }
        }
    }

    public static void saveData(String name, String cpu, String ram, String ssd){
        System.out.println("데이터를 저장하시겠습니까?");
        System.out.println("1. YES\t2. NO");
        saveData = scan.nextInt();

        if (saveData == 1) {
            System.out.println("입력값을 저장합니다.");
            if (osType == 1) MacArray.add(new Mac(name, cpu, ram, ssd));
            if (osType == 2) WinArray.add(new Window(name, cpu, ram, ssd));

        } else if (saveData == 2) {
            System.out.println("입력값을 삭제합니다.");
        }
    }
}
