public class CreditPaymentService {
    public int calculate(int amount, double interestRate, int creditTerm) {
        int y;
        double percentInMonth = interestRate / 12 / 100;
        double x = 1 + percentInMonth;
        y = (int) (amount * ((percentInMonth * Math.pow(x, creditTerm)) / (Math.pow(x, creditTerm) - 1)));

        return y;
    }

}
