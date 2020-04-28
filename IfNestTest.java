
public class IfNestTest {
    public static void main(String[] args) {
        int num = (int) (Math.random()*4)+8;
        if (num>=11) {
            System.out.println("11입니다.");
        } else if (num>=10) {
            System.out.println("10입니다.");
        } else if (num>=9) {
            System.out.println("9입니다.");
        } else if (num>=8) {
            System.out.println("8입니다.");
        } else if (num>=7) {
            System.out.println("7입니다.");
        } else {
            System.out.println("random");
        }
    }
} 