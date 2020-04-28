
public class ForSumExample {
    public static void main(String[] args) {
        //최종목적은 3의 배수의 합만을(if문이 필요) 구하는 프로그램
        //1~100까지 합을 구하는 프로그램
        
        int sum = 0;
        for(int i=1; i<=100; i++) {   
            if(i%3==0) { // i%3 (i를 3으로 나눈 나머지를 구함), i/3 (i를 3으로 나눈 몫을 구함) 그리고 '=' 아닌 비교연산자 '=='가 필요
            sum = sum + i;
            }
        }
        System.out.println("3의 배수 합: " + sum);

        int num =0;
        for (int i = 0; i <= 100; i=i+3) {
            num = num + i;
        }
        System.out.println("3씩증가 합: "+ num); //위의 방법과 결국 결과는 같음. 3의 배수임.
    }

}