
public class EvenSumExample {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(true){  // 방법 1 : while 방법으로 짝수 합 구함 
            if(i>100) {
                break;
            }
            if(i%2==0) {
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum: " + sum);

        int num = 0;
        for(int e =1; e<=100; e++) { // 방법 2 : for방법으로 짝수 합 구함
            if (e%2==1) {
                continue;//홀수면(현재if문에서 참이면) 그냥 넘어가서(skip) 그다음 연산 순번으로 가게 한다. if만 빠져 나오는게 아니라 for문까지 빠져 나오는데 그 이유는 반복문을 빠져나오게 하는 것이기 때문이다.
            }
            num=num+e;
        }
        System.out.println("num: " + num);


        for(int e =1; e<=100; e++) {
            //2또는 3의 배수를 출력하시오. 조건합: 조건1 || 조건2 (두조건중 하나만 맞아도 참이란 뜻)
            if((e%2==0)||(e%3==0)) {
                System.out.println("2또는 3의 배수: " + e);
            }
        }
        for(int e =1; e<=100; e++) {        
            //2와 3의 배수를 출력하시오. 조건합: 조건1 && 조건2 (두조건 모두 만족해야 참이란 뜻)
            if((e%2==0)&&(e%3==0)) {
                System.out.println("2와 3의 배수: " + e);
            }    
        }
        for(int e =1; e<=100; e++) {
            //NOT으로 홀수값구하기
            if(!(e%2==0)) { // '!'는 NOT의 의미를 가지고 있다.
                System.out.println("홀수값: " + e);
            }
        }    
    }
}