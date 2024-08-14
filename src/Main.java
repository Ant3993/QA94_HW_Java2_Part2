public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 1100;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int accountStatus = account + refill + bonus;
        System.out.println("Итоговый счет: " + accountStatus);
        System.out.println("Бонусные рубли: " + bonus);
    }
}