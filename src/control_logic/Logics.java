package control_logic;

import java.util.Scanner;

public class Logics {
    public static void main(String[] args) {
        // Grading system
        int mark;
        String remark;
        Scanner scanner = new Scanner(System.in);

        System.out.println("[ENTER YOUR MARK]-->\n");
        mark = scanner.nextInt();

        if(mark >= 80){
            remark = "EXCELLENT";
            System.out.println("[REMARK IS]--> " + remark);
        } else if (mark >= 70) {
            remark = "VERY GOOD";
            System.out.println("[REMARK IS]--> " + remark);
        } else if (mark >= 60) {
            remark = "CREDIT";
            System.out.println("[REMARK IS]--> " + remark);
        } else if (mark >= 50) {
            remark = "PASS";
            System.out.println("[REMARK IS]--> " + remark);
        }else {
            remark = "FAILED";
            System.out.println("[REMARK IS]--> " + remark);
        }
    }
}
