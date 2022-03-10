public class Main {
    public static void main(String[] args) {
        int clientBill = 100;
        // int plus = 100;
        int plus = 1100;
        int bonus = 0;

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        clientBill = clientBill + plus;
        if (plus > 1000) {
            bonus = plus / 100;
        }

        System.out.println(clientBill + bonus);
        System.out.println(bonus);
        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }

    }
