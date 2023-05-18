public class Main {
    public static void main(String[] args) {
        int rubles = 50;
        int x = 100;
        if (x >= 1000) {
            System.out.println(((x + rubles) + (x / 100)) + "рублей на счете");
        } else {
            System.out.println((x + rubles) + "рублей на счете");

        }
    }
}