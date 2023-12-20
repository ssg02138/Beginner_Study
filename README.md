public class AccountingArrayApp {
    public static void main(String[] args) {

        double valueOfSuppy = Double.parseDouble(args[0]);
        double VAT = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSuppy * VAT;
        double total = valueOfSuppy + vat;
        double expense = valueOfSuppy * expenseRate;
        double income = valueOfSuppy - expense;

        double[] devidend1Rates = new double[2];
        devidend1Rates[0] = 0.5;
        devidend1Rates[1] = 0.3;
        devidend1Rates[2] = 0.2;

        double devidend1 = income * devidend1Rates[0];
        double devidend2 = income * devidend1Rates[1];
        double devidend3 = income * devidend1Rates[2];

        System.out.println("Value of supply : "+ valueOfSuppy);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);
        System.out.println("Dividend : "+ devidend1);
        System.out.println("Dividend : "+ devidend2);
        System.out.println("Dividend : "+ devidend3);


    }
}
