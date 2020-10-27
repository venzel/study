package numbers;

public class Payment implements IPayment {

    @Override
    public int PayPal(int value) {
        if (value <= 10) {
            return value + 3;
        }

        if (value >= 30) {
            return value + 5;
        }

        return value;
    }

    @Override
    public int PicPay(int value) {
        if (value <= 10) {
            return value + 2;
        }

        if (value >= 30) {
            return value + 3;
        }

        return value;
    }
}