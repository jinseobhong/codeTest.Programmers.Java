package basicTraining.firstDays;

import java.util.Scanner;

public class PrintWithCaseChanged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            result += Character.isUpperCase(a.charAt(i)) ? Character.toLowerCase(a.charAt(i)) : Character.toUpperCase(a.charAt(i));
        }
        System.out.println(result);
    }
}
