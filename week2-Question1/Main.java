public class Main {
    public static void main(String[] args) {
        TaxUtil taxUtil = new TaxUtil();

        double amount = 100;
        double rate = 0.15;
        double tax = taxUtil.calculateTax(amount, rate);

        System.out.println("The tax for amount " + amount + " is: " + tax);
    }
}