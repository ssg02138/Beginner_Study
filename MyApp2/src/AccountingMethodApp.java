public class AccountingMethodApp {
    public static double expenseRate;
    public static double valueOfSupply;
    public static double vatRate;
    public static double expense;
    public static double income;

    public static void main(String[] args) {

        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;

        print();
    }


    private static void print() {
        System.out.println("Value of supply : " + valueOfSupply);
        System.out.println("VAT : " + getVat());
        System.out.println("Total : " + getTotal());
        System.out.println("Expense : " + getExpense());
        System.out.println("Income : " + getIncome());
        System.out.println("Dividend 1 : " + getDividend1());
        System.out.println("Dividend 2 : " + getDividend2());
        System.out.println("Dividend 3 : " + getDividend3());
    }

    private static double getDividend1() {
        return getIncome() * 0.5;
    }
    private static double getDividend2() {
        return getIncome() * 0.3;
    }
    private static double getDividend3() {
        return getIncome() * 0.2;
    }

    private static double getIncome() {
        return valueOfSupply - expense;
    }

    private static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    private static double getTotal() {
        return valueOfSupply + getVat();
    }

    private static double getVat() {
        return valueOfSupply * vatRate;
    }
}