
public class IfExample {
    public static void main(String[] args) {
        int score = 95;
        score = 84;
        //score = 77;
        if (score>=90) {
            System.out.println("점수가 90점 이상입니다.");
            if (score>=95){
                System.out.println("A+ 입니다.");
            } else {
                System.out.println("A 입니다.");
            }
        } else if (score >= 80) {
            System.out.println("점수가 80점 이상입니다.");
            if (score>=85) {
                System.out.println("B+ 입니다.");
            } else {
                System.out.println("B 입니다.");
            }    
        } else if (score >= 70) {
            System.out.println("점수가 70점 이상입니다.");
            if (score >= 75) {
                System.out.println("C+ 입니다.");
            } else {
                System.out.println("C 입니다.");
            }    
        } else {
            System.out.println("점수가 70점 미만입니다."); //여러 else if구문중 가장 맞는 하나의 구문만 실행한다. 그러나 else if가 아닌 그냥 if구문을 하면 결과가 두개가 나올 수 있다.
            //System.out.println("A 입니다.");
        }
        System.out.println("end of program"); //if구문과 상관없이 무조건 실행되는 구문
    }
}