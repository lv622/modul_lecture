package slimeLand;

import java.util.Scanner;

public class inventory {
    Scanner scan = new Scanner(System.in);

    String[] inven = new String[5];

    public void potionHP() {
        String name = "HP포션";
    }

    public void potionMP() {
        
    }


    public void saveItem(int random) {
        String item = "";

        if (random == 1 || random == 9) {
            System.out.println("몬스터가 HP포션을 떨어트렸습니다!");
            item = "HP포션";
        }
        
        if (random == 2 || random == 8) {
            System.out.println("몬스터가 MP포션을 떨어트렸습니다!");
            item = "MP포션";
        }

        for (int i = 0; i < inven.length; i++){
            if (inven[i] == null) {
                inven[i] = item;
                break;
            }
        }
    }

    public void deleteItem(){
        System.out.println("삭제 할 아이템을 선택하세요.");
        printInven();

        int i = scan.nextInt();
        inven[i-1] = "";
    }

    public void printInven() {
        int count = 0;

        for (int i = 0; i < inven.length; i++){
            if (inven[i] == null) {
                count++;
            }
        }

        if (count != inven.length){
            System.out.println("----------------------------");
            System.out.println("\tINVENTORY");
            
            for (int i = 0; i < inven.length - count; i++){
                System.out.print(" ("+ (i + 1) +") " + inven[i]);
            }

            System.out.println("");
            System.out.println("----------------------------");

        } else {
            System.out.println("----------------------------");            
            System.out.println("\tINVENTORY");
            System.out.println("\tE M P T Y");
            System.out.println("----------------------------");
        }
    }
}
