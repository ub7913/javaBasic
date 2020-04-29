
public class EvenSumTest {
    public static void main(String[] args) {
        int i =1;
        int sum =0;
        while (true) {
            if (i>100) {
                break;
            }
            if (i%2==0) {
                sum = sum+i;
            }
            i++;
        }
        System.out.println(sum);

    }
}