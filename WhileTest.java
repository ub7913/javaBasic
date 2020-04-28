
public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 5) {
            sum = sum +i;
            i++;
            System.out.println(sum);
        }  System.out.println(sum);

        i = 1;
        sum = 0;
        while (true) {
            if(i>5)  {
                break;
            } 
            sum=sum+i;
            i++; System.out.println(sum);
        } System.out.println(sum);
    

        i=1;
        sum=0;
        while(true) {
            if(i>10) {
                break;
            }
            if(i%2==1) {
                sum=sum+i;
            } i++;
        }
        System.out.println(sum);
    }
}