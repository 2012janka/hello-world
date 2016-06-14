public class TestTea {

	public static void main(String[] args) {
		/*
		 * Tea caj1 = new Tea(); Tea caj2 = new Tea(Flavour.APPLE); Tea caj3 =
		 * new Tea(Flavour.GREY); Tea caj4 = new Tea(); Tea caj5 = new
		 * Tea(Flavour.GREEN); Tea caj6 = new Tea(); Tea caj7 = new
		 * Tea(Flavour.VANILLA);
		 * 
		 * caj1.drink(); caj2.drink(); caj3.drink(); caj4.drink(); caj5.drink();
		 * caj6.drink(); caj7.drink();
		 * 
		 * Drinkable whiteWine = new Tea(); if (whiteWine instanceof Wine) {
		 * System.out.println("mmm, vino"); } else if (whiteWine instanceof
		 * Tea){ System.out.println("mmm, tea"); }
		 */
		Drinkable[] drinks = { new Tea(), new Wine(2000, "Tokaj"), new Wine(),
				new Tea(Flavour.MINT) };
		for (Drinkable drink : drinks) {
			drink.drink();
		}
	}
}
