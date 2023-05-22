public class Main {
    public static void main(String[] args) {
        int rubles = 50;
        int deposite = 100;
        if (deposite >= 1000) {
            System.out.println(((deposite + rubles) + (deposite / 100)) + "рублей на счете");
        } else {
            System.out.println((deposite + rubles) + "рублей на счете");

        }
    }
}