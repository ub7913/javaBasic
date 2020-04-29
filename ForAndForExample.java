
public class ForAndForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("i의 값: " + i);
            for (int j = 1; j <= 3; j++) {
                System.out.println("   j의 값: " + j);
            }
        }


        for (int a=1; a <=9; a++) {
            System.out.println(a + "단");
            for (int k=1; k <=9; k++) {
                System.out.println(a + "*" + k + "=" + (a*k));
            }
        }
    }
}