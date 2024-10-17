package calculator;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요 =");
            int a = scanner.nextInt();

            System.out.println("사칙연산 기호를 입력하세요 = ");
            char operator = scanner.next().charAt(0);

            System.out.println("두 번째 숫자를 입력하세요 =");
            int b = scanner.nextInt();

            double result = calculator.calculate(a, b, operator);
            System.out.println("결과 =" + result);


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제)");

            scanner.nextLine();
            String e = scanner.next();

            if (e.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (e.equals("remove")) {
                calculator.removeFirstResult();
            }
        }
    }
}
