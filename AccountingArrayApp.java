
public class AccountingArrayApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		double expenseRate = 0.3;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		
		double[] dividend1Rates = new double[3];
		dividend1Rates[0] = 0.5;
		dividend1Rates[1] = 0.3;
		dividend1Rates[2] = 0.2;
		
		double dividend1 = income*dividend1Rates[0];
		double dividend2 = income*dividend1Rates[1];
		double dividend3 = income*dividend1Rates[2];
		
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
		
	}

}
