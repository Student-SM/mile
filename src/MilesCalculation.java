public class MilesCalculation {

    public static void main(String[] args) {

        int price = 340; // Цена билета
        int ruble = 20; // одна миля за каждые 20 рублей
        int x = (price/ruble);

        System.out.println("За купленный билет вам начислели");
        System.out.println(x + " бонусных миль");


    }
}
