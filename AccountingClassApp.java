 // 클래스
//	클래스란 메소드와 변수의 집합.
//	메소드란 서로 연관된 코드들의 집합
//
//	즉 복잡한 코드들을 메소드로 정리하고
//	늘어난 메소드들을 클래스로 정리하여
//
//	필요할때 꺼내어 쓸 수 있도록 정리정돈 하는 것
	// 클래스는 엑셀에서 필요한 함수가 정리된 시트와 같다. 보고서로 사용되는 엑셀파일에 수치 계산용 시트,
	// 그래프 출력용 시트가 따로 있듯이 코드를 간소화할 때 사용할 수 있다.
class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static void print() {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+getDividend1());
		System.out.println("Dividend 2 : "+getDividend2());
		System.out.println("Dividend 3 : "+getDividend3());
	}

	public static double getDividend3(double income) {
		double dividend3 = income*0.2;
		return dividend3;
	}

	public static double getDividend2(double income) {
		double dividend2 = income*0.3;
		return dividend2;
	}

	public static double getDividend1() {
		return getIncome() * 0.5;
	}

	public static double getDividend2() {
		return getIncome() * 0.3;
	}

	public static double getDividend3() {
		return getIncome() * 0.2;
	}

	public static double getIncome() {
		return valueOfSupply-getExpense();
	}

	public static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	private static double getVAT() {
		return valueOfSupply*vatRate;
	}
	
}
public class AccountingClassApp {

	public static void main(String[] args) {
		Accounting.valueOfSupply = 10000.0;
		Accounting.vatRate = 0.1;
		Accounting.expenseRate = 0.3;
		Accounting.print();
		
		// instance (인스턴스 = 클래스[추가적인 품목]을 복제(new)하며 다른값을 넣고 싶을때 쓰는것.)
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 50000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.1;
		a2.expenseRate = 0.3;
		a2.print();
	}

// 자바프로젝트 <= 자바 <= 클래스 <= 메소드,변수
	// 인스턴스는 클래스의 복제본
	// 


}
