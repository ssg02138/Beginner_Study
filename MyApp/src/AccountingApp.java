public class AccountingApp {
    public static void main(String[] args) {

        double valueOfSuppy = Double.parseDouble(args[0]);
        double VAT = 0.1;
        double expenseRate = 0.3;
        double vat = valueOfSuppy * VAT;
        double total = valueOfSuppy + vat;
        double expense = valueOfSuppy * expenseRate;
        double income = valueOfSuppy - expense;
        double devidend1 = income * 0.5;
        double devidend2 = income * 0.3;
        double devidend3 = income * 0.2;

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
