
public class ForRemind2 {
    public static void main(String[] args) {
        for(int i=1; i<=20; i++) {
             if ((i%2==0)||(i%3==0)) {
                if ((i%2==0)&&(i%3==0)) {
                System.out.println(i +" 는(은) 2와 3의 배수입니다.");
                //continue;
            } 
                System.out.println(i+ "는(은) 2또는 3의 배수입니다.");
            }
        }


        for (int e=1; e<=20; e++) {
            if((e%2==0)&&(e%3==0)) {
                System.out.println(e + "는(은) 2와 3의 배수입니다.");
            } else if ((e%2==0)||(e%3==0)) {
                System.out.println(e + "는(은) 2또는 3의 배수입니다.");
            }
        }
    }
}