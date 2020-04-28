
public class Iftest {
    public static void main(String[] args) {
        int num = 176;
        if(num>=190) {
            if (num>=195) {
                System.out.println("농구선수입니다.");
            } else {
                System.out.println("키가 190cm 이상입니다.");
            } 
    } else if (num>=180) {
            if (num>=185) {
                System.out.println("축구선수입니다.");
            }  else {
        System.out.println("키가 180cm 이상입니다.");
        }  
    } else if (num>=170) {
            if (num>=175) {
                System.out.println("핸드볼선수입니다.");
            } else { 
                System.out.println("키가 170cm 이상입니다.");
        }  
    } else if (num>=160) {  
            if (num>=165) {
                System.out.println("레슬링선수입니다.");
            } else {
                System.out.println("키가 160cm 이상입니다.");
            } 
        } else {
            System.out.println("키가 160cm보다 작습니다");
        }
        System.out.println("end");
    }
}    


