public class Main {
    public static void main(String[] args) {
        int check = 100; // Входные данные
        int amount = 100; // Пополнение 1
        int replenishment = 1100; // Поподнение 2
        int threshold = 1000; // Пополнение больше 1000
        int bonus = 0;
        if (replenishment > threshold) {
            bonus = replenishment / 100;
        }
        {
            System.out.println(check + amount);
            System.out.println(replenishment + check + bonus);
            System.out.println(bonus);
        }
    }
}