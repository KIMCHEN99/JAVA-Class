public class variables {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;

        System.out.println("상수 1 : " + MAX_SIZE);
        System.out.println("11 + 22 + 33 = " + (11 + 22 + 33));
        System.out.println("011 + 022 + 033 = " + (011 + 022 + 033));
        System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
        System.out.println(3147483647L + 3147483648L);
        System.out.println(3.0004999D + 2.0004999D);
        System.out.println(3.0004999f + 2.0004999f);
        System.out.println("AB" + '\b' + 'C'); // 백스페이스
        System.out.println("AB" + '\t' + 'C'); // 탭
        System.out.println("AB" + '\n' + 'C'); // 줄바꿈
        System.out.println("AB" + '\r' + 'C'); //캐리지 리턴

        int num1 = 50;
        long num2 = 3147483647L;
        System.out.println(num1 + num2);

        double pi = 3.1415;
        int wholeNumber = (int)pi;
        System.out.println(wholeNumber);

        
    }
}
