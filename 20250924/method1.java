public class method1 {
    public static void main(String[] args) {
        // 간단한 계산
        int num3 = 10;
        int num4 = 5;
        int sum = num3 + num4;

        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(num3 + " + " + num4 + " = " + sum);
        
        // 함수(메서드) 호출
        printCalculation(num3, num4, sum);
        printCalculation1(num3, num4, sum);
        sum_printresult(num3, num4);
    }

    // 계산 결과를 출력하는 메서드
    public static void printCalculation(int number1, int number2, int result) {
        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    // 계산 결과를 출력하는 private 메서드
    private static void printCalculation1(int number1, int number2, int result) {
        int result = number1 + number2;
        System.out.println("\n=== 간단한 계산 ===");
        System.out.println(number1 + " + " + number2 + " = " + result);
    }

    public static void sum_printresult(int number1, int number2){
        System.out.println("\n=== 더하기 계산 ===");
        System.out.println(number1 + "+" + number2 + "=" + number1+number2);
    }
    
}
