public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi:sayilar){
            if (sayi==aranacak){
                varMi = true;
                break;
            }
        }
        if (varMi){
            System.out.println(aranacak+" sayısı dizinin içinde bulunuyor.");
        }
        else {
            System.out.println(aranacak+" sayısı dizinin içinde bulunmuyor.");
        }
    }
}