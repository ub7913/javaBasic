
public class SwitchTest {
    public static void main(String[] args) {
        int num = (int) (Math.random()*4)+2 ;
        switch (num) {
            case 2 : System.out.println("2입니다"); break;
            case 3 : System.out.println("3입니다"); break;
            case 4 : System.out.println("4입니다"); break;
            case 5 : System.out.println("5입니다"); break;
            case 6 : System.out.println("6입니다"); break; //break 없을때, 만약 3이 나오면 case 3 밑으로 다 출력됨
        }
    }
}