public class Main {
    public static void main(String[] args) {
        int number = -2;
        int bolen = 0;

        if (number==1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        if (number<1){
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                bolen += 1;
            }
        }
        if (bolen != 0) {
            System.out.println(number + " sayısı asal değildir.");
        }
        if (bolen == 0) {
            System.out.println(number + " sayısı asaldır.");
        }
    }
}