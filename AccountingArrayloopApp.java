
public class AccountingArrayloopApp {

	public static void main(String[] args) {

		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double vat = valueOfSupply*vatRate;
		double expenseRate = 0.3;
		double total = valueOfSupply+vat;
		double expense = valueOfSupply*expenseRate;
		double income = valueOfSupply-expense;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+vat);
		System.out.println("Total : "+total);
		System.out.println("Expense : "+expense);
		System.out.println("Income : "+income);
		
		double[] dividend1Rates = new double[3];
		dividend1Rates[0] = 0.5;
		dividend1Rates[1] = 0.3;
		dividend1Rates[2] = 0.2;
		
		
		int i = 0;
		while(i < dividend1Rates.length) {
		System.out.println("Dividend : "+(income*dividend1Rates[i]));
		i = i + 1;
	}
	}

}
