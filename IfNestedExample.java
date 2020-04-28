
public class IfNestedExample {
    public static void main(String[] args) {
        int score = 95;
        score = 80;
        int num = (int) (Math.random() * 6) + 1; //Math.random() => 0과 1의 임의의 수를 만들어 준다.(0<=임의의 수<1) 현재 메소드((0*6<=임의의수<=1*6)+1)는 0<임의의 수<7
        if (num == 1) {
            System.out.println("번호 1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("번호 2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("번호 3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("번호 4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("번호 5번이 나왔습니다.");           
        } else {
            System.out.println("번호 6번이 나왔습니다."); 
        }
        System.out.println("end of program"); //if구문과 상관없이 무조건 실행되는 구문
    }
}// 아무숫자나 막 출력되고 있음