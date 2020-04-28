
public class CharOperationExample {
    public static void main(String[] args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2; // 2
        double result1 = (double) v1 / v2; // 2.5
        System.out.println(result1);

        result = 2;
        System.out.println("result: " + result);

        result = minus(7, 2);
        System.out.println("result: " + result);

        result1 = divide(15, 4);
        System.out.println("result: " + result1);

    }

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static int minus(int num3, int num4) {
        int resultdkdk = num3 - num4;
        return resultdkdk;
    }

    public static double divide(int num1, int num2) {
        double result = (double)num1 / num2;
        return result;
    }
}