public class AccountingArrayLoopApp {
    public static void main(String[] args) {

        double valueOfSuppy = Double.parseDouble(args[0]);
        double VAT = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSuppy * VAT;
        double total = valueOfSuppy + vat;
        double expense = valueOfSuppy * expenseRate;
        double income = valueOfSuppy - expense;


        System.out.println("Value of supply : "+ valueOfSuppy);
        System.out.println("VAT : "+ vat);
        System.out.println("Total : "+ total);
        System.out.println("Expense : "+ expense);
        System.out.println("Income : "+ income);

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int i = 0;
        while(i < dividendRates.length) {
            System.out.println("Dividend : " + (income * dividendRates[i]) );
            i = i + 1;
        }


    }
}
