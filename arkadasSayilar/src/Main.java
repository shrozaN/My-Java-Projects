public class Main {
    public static void main(String[] args) {
        //220-284
        int number1 = 220;
        int number2 = 284;
        int ilkBolen = 0;
        int ikinciBolen = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                ilkBolen += i;
            }
        }
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                ikinciBolen += j;
            }
        }
        if (ilkBolen == number2 && ikinciBolen == number1) {
            System.out.println(number1 + " ve " + number2 + " sayıları arkadaş sayılardır.");
        } else {
            System.out.println(number1+ " ve " + number2 + " sayıları arkadaş sayılar değildir.");
        }
    }
}