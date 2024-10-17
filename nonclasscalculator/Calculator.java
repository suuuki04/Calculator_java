package nonclasscalculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("첫 번때 숫자를 입력하세요 = ");
            int a = scanner.nextInt();
            System.out.println("사칙연산 기호를 입력하세요 = ");
            String operator = scanner.next();
            System.out.println("두 번째 숫자를 입력하세요 = ");
            int b = scanner.nextInt();

            int result = 0;

            if (operator.equals("+")) {
                result = a + b;
            } else if (operator.equals("-")) {
                result = a - b;
            } else if (operator.equals("*")) {
                result = a * b;
            } else if (operator.equals("/")) {
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번쨰정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
            } else {
                System.out.println("잘못된 연산자를 입력했습니다.");
                continue;
            }
            System.out.println("결과 = " + result);

            System.out.println("더 계산하시겠습니까?(exit 입력시 종료)");
            String s = scanner.next();

            if (s.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
        scanner.close();
    }
}