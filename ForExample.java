
public class ForExample {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum + 1; //sum -> 1
        sum = sum + 2; //sum -> 3
        sum = sum + 3; //sum -> 6
        sum = sum + 4; //sum -> 10
        sum = sum + 5; //sum -> 15
        for(int i=1; i<=5; i++/*i=i+1,i=i+2..*/) {
            sum = sum + i;
            System.out.println(sum + "," + i); //for문이 변하는 것을 볼 수있다.
        }
        System.out.println("sum= " + sum);
        System.out.println(2 + " * " + 1 + " = " + (2*1));
        System.out.println(2 + " * " + 2 + " = " + (2*2));
        System.out.println(2 + " * " + 3 + " = " + (2*3));//그냥 sysout으로 만들어 볼 수 있음 이걸 for문으로 9번 반복 만들려면?

        int ast = 1; // 방법 1
        for(int i=1; i<=9; i++) {
            ast = 2 * i;
            System.out.println(2 + " * " + i + " = " + (ast));
        }
        int num =2;  // 방법 2
        for(int i=1; i<10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i)); // 방법 1과 방법 2 둘다 같은 결과를 가지고 옴
        }    


    }
}