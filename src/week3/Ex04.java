package week3;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String input = scanner.next();
        char c = input.charAt(0);

        for(char i=c; i>='a'; i--) {
            if(i != c) System.out.println();
            for(char j='a'; j<=i; j++) {
                System.out.print(j);
            }
        }
    }
}
