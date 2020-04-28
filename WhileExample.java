
public class WhileExample {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        // while사용1
        int i = 1;
        while (i <= 5) {
            sum = sum + i;
            i++; // 증가식 없으면 무한정 계산된다.
        }
        System.out.println(sum);

        // while사용2. while문은 주로 이런 용도로 씀
        i = 1;
        sum = 0;
        while (true) { // 무조건 반복한다는 뜻
            if (i > 5) {
                break; // i가 5보다 크면 멈추겠다는 뜻
            }
            sum = sum + i;
            i++; // if문에서 false니까 다시 while로 돌아가서 계산 시작
        } // 1. , 2. 같은 결과
        System.out.println(sum);

        i = 1;
        sum = 0;

        while (true) { // 방법1 // 현재 while의 조건식으로 ture가 왔으니 break가 없으면 무한정 계산한다.
            if (i > 100) { // i가 100보다 큰 경우가 참, 100보다 작으면 거짓이다.
                break; // 첫번째 if문이 참이면 실행
            }
            if (i % 2 == 1) { // 첫번째 if문이 거짓이면 실행, i가 홀수인 경우 참, 홀수면 거짓
                sum = sum + i; // 두번째 if문이 참일 경우 실행
            }
            i++; // 두번째 if문이 거짓이면 실행, i+1을 계산함, 다시 while로 돌아가서 참거짓(무한)을 따진다.

        }
        System.out.println("홀수의 합: " + sum);

        while (i < 100) { //방법2
            if (i % 2 == 1) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("홀수의 합2: " + sum);
    }
}