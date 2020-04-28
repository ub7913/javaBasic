
public class SwitchExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // 0<num<6 -> 1<=num<7 (int 1<=num<=6)
        switch(num) {
            case 1: System.out.println("1번이 나왔습니다."); break;
            case 2: System.out.println("2번이 나왔습니다."); break;
            case 3: System.out.println("3번이 나왔습니다."); break;
            case 4: System.out.println("4번이 나왔습니다."); break; //->조건에 충족되는 반복문이 있으면 빠져 나오라는 의미
            case 5: System.out.println("5번이 나왔습니다."); break; //->이게 없으면 해당되는 조건 밑으로 다 출력되기 때문
            default: System.out.println("6번이 나왔습니다.");
        }   
        System.out.println("end of program");
    }
}