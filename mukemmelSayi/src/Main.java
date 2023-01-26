public class Main {
    public static void main(String[] args) {
        //6 --> 1,2,3
        //28 --> 1,2,4,7,14
        int number = 28;
        int bolen = 0;

        if (number<1){
            System.out.println("Geçersiz sayı girdiniz.");
            return;
        }

        if (number==1){
            System.out.println("1 sayısı mükemmel sayıdır.");
            return;
        }

        for (int i=1;i<number;i++){
            if (number % i == 0){
                bolen = bolen + i;
            }
        }
        if (number == bolen){
            System.out.println(number+" sayısı mükemmel sayıdır.");
        }
        else {
            System.out.println(number+" sayısı mükemmel sayı değildir.");
        }
    }
}