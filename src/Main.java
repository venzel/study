import numbers.Payment;

public class Main {
    public static void main(String[] args) {
        Payment pay = new Payment();

        int valueFinal = pay.PicPay(10);

        System.out.println(valueFinal);
    }
}