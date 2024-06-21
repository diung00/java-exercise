public class d21 {
    public static void main(String[] args) {

        int plus = 10 + 20;
        int minus = 20 - 10;
        int multiply = 20 * 10;
        int divide = 20 / 10;
        int modulo = 15 % 10;
        int result = 3 + 2 * 3;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiply);
        System.out.println(divide);
        System.out.println(modulo);

        result = (10 + 5 % 3) / 3 + 2 * 3;
        System.out.println(result);
        System.out.println(21 / 10);

        int notDividedInt = 21 / 10;
        System.out.println(notDividedInt);

        double notDividedDouble = (double) 21 / 10;
        System.out.println(notDividedDouble);

        int integer = (int) 2.1;
        System.out.println(integer);

        // 묵시적 형변환 implicit

        byte aByte = 1;
        short aShort = aByte;
        int aInt = aShort;
        long aLong = aInt;
        float aFloat = aLong;
        double aDouble = aFloat;

      //  명시적 형변환  explicit

        double doubleVar = 10.24;
        int castDouble = (int) doubleVar;

        // 데이터 손실 가능성 존재
        int  dataLost = (int) 4294967296L;
        System.out.println(dataLost);

        double doubleDivide = (double) 21 / 10;
        System.out.println(doubleDivide);

        char aChar = 'A';
        System.out.println(aChar + 10);
        System.out.println((char) (aChar + 10));

    }
}
