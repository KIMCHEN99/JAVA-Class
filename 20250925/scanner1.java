import java.util.Scanner;
import java.lang.Math;

public class scanner1 {
    public static void main(String[] args) {
        // 프로그램 전체에서 사용할 Scanner 객체를 main 메소드에서 한 번만 생성합니다.
        Scanner scanner = new Scanner(System.in);
        
        // 사칙연산 프로그램 실행 (Scanner 객체를 인자로 전달)
        calculateArithmetic(scanner);
        System.out.println();
        
        // 원의 넓이와 둘레 계산 프로그램 실행 (Scanner 객체를 인자로 전달)
        calculateCircle(scanner);
        
        // 모든 입력 처리가 끝난 후, main 메소드의 마지막에서 Scanner 객체를 한 번만 닫아줍니다.
        scanner.close();
    }
    
    // Scanner 객체를 인자로 받는 메소드로 수정
    public static void calculateArithmetic(Scanner scanner) {
        System.out.println("--- 사칙연산 프로그램 ---");
        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();
        
        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();
        
        System.out.println("--- 결과 ---");
        System.out.println("덧셈: " + num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println("뺄셈: " + num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println("곱셈: " + num1 + " * " + num2 + " = " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("나눗셈: " + num1 + " / " + num2 + " = " + ((double)num1 / num2));
        } else {
            System.out.println("나눗셈: 0으로 나눌 수 없습니다.");
        }
    }
    
    // Scanner 객체를 인자로 받는 메소드로 수정
    public static void calculateCircle(Scanner scanner) {
        System.out.println("--- 원의 넓이와 둘레 계산 프로그램 ---");
        System.out.print("원의 반지름을 입력하세요: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("--- 결과 ---");
        System.out.println("원의 넓이: " + area); //ㅠ(r^2)
        System.out.println("원의 둘레: " + circumference); //2ㅠr
    }
}