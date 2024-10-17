package calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    private List<Double> results = new ArrayList<Double>();

    public double calculate(int a, int b, char operator) {
        double answer = 0;

        switch (operator) {
            case '+':
                answer = a + b;
                break;
            case '-':
                answer = a - b;
                break;
            case '*':
                answer = a * b;
                break;
            case '/':
                if (b != 0) {
                    answer = a / b;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번쨰정수)에 0이 입력될 수 없습니다.")
                }
                break;
            default:
                System.out.println("잘못된 연산자를 입력했습니다.");
                return 0;
        }
        results.add(result);
        return result;
    }

    public List<Double> getResults() {
        return results;
    }

}
