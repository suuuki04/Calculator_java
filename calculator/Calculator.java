package calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
    private List<Double> results = new ArrayList<Double>();

    public double calculate(int a, int b, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번쨰정수)에 0이 입력될 수 없습니다.");
                }
                break;
            default:
                System.out.println("잘못된 연산자를 입력했습니다.");
                return 0;
        }
        results.add(result);
        return result;
    }
    public void removeFirstResult() {
        if (!results.isEmpty()) {
            results.remove(0);  // 리스트의 첫 번째 요소 삭제
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }

    public List<Double> getResults() {
        return results;
    }

}
