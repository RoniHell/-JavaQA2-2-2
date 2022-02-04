public class Main {
    public static void main(String[] args) {
        int client1 = 100;
        int client2 = 100;
        int added1 = 100;
        int added2 = 1100;
        int bonus1 = 0;
        int bonus2 = 0;
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        client1 = client1 + added1;
        if (added1 > 1000) {
            bonus1 = added1 / 100;
        }
        client2 = client2 + added2;
        if (added2 > 1000) {
            bonus2 = added2 / 100;
        }
        System.out.println(bonus1);
        System.out.println(client1 + bonus1);

        System.out.println(bonus2);
        System.out.println(client2 + bonus2);

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}