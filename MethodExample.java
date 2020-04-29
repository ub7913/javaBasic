
public class MethodExample {
    public static void main(String[] args) {
        //int result = sum(10, 20);
        System.out.println("result1: "+sum(10,20));
        System.out.println("result2: "+sum(10,20,30));
        System.out.println("result3: "+sum(10.5,10.75));
        System.out.println("1~10의 합: "+tosum(1,10));
        printStar(1,5);
        System.out.println();
        printStar(1,3);
        System.out.println();
        printStar(2);
        System.out.println(pintDouble(20));
        System.out.println(printDouble(10,5));
        printString("Hello", "Park");
        akakak (3,"HOIL");
        printGugudan(8);
        pritTriangle(3);
    }

    public static void pritTriangle(int a) {
        for (int i=1; i<=a; i++) {
            for (int j=i; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printGugudan(int dan) {
        for (int i=1; i<=9; i++) {
            System.out.println(dan+"단 : "+  dan + "*" + i + "=" + dan*i );
        }
    }

    public static void akakak(int a, String name){
        for (int i=1; i<=a; i++) {
            System.out.println(name);
        }
    }

    public static void printString(String str, String name) {
        System.out.println(str + ", " + name);
    }

    public static int printDouble(int c, int d) {
        return c*d;
    }

    // public static void printDouble(int a, int b) {
    //     System.out.println(a*b);
    // }
    
    public static int pintDouble(int a){
        return a*2;//따로 sum의 값을 안주고도 식을 계산 할 수 있음
    }

    public static void printStar(int a) {
        for(int i=1; i <= a; i++) {
            System.out.println("*****");
        }
    }

    public static void printStar(int a, int b) {
        for (int i=a; i<=b; i++) {
            for (int j=1; j<=5; j++) {
                System.out.print("*");
            }
            //System.out.println();
        }
    }

    // public static void printStar(int x, int z) {
    //     for (int i=x; i<=z; i++) {
    //         System.out.println("*****");
    //     }
    // }

    public static int sum(int a, int b) {
        int sum= 0;
        sum =a + b;
        return sum; //return은 sum의 값을 반환하겠다라는 뜻
    }

    /*public static int sum(int c, int d) {
        int sum= 0;
        sum =a + b;
        return sum;
    }*/   //-> 위의 메소드와 겹쳐서 이 메소드는 사용 할 수 없음 

    public static double sum(double c, double d) { //같은 메소드지만 매개값의 타입이 다르면 인식한다.
        double sum= 0;
        sum =c + d;
        return sum; 
    }

    public static int sum(int a, int b, int c) { //sum 메소드를 중첩해서 쓸수 있는 이유는 매개값의 갯수가 다름을 인식하기 때문이다.
        int sum=0; 
        sum = a+b+c;
        return sum;
    }

    public static int tosum(int num1, int num2) { //num1에서 num2까지의 합을 구하는 메소드 , num1 'to' num2
        int sum = 0;
        for (int i=num1; i<=num2; i++) {
            sum += i; // sum=sum+i;
        }
        return sum; 
    }
}