public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 1090;
        int bonus = 0;
        if (refill >= 1000) {
            bonus = refill / 100;
        }
        balance = balance + refill + bonus;
        System.out.println(bonus);
        System.out.println(balance);

    }
}
