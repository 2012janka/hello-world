public class Wine implements Drinkable {
	private int year;
	private String vineyard;

	public Wine(int year, String vineyard) {
		super();
		this.year = year;
		this.vineyard = vineyard;
	}

	public Wine() {
		this(2016, "Tokaj");
	}

	public int getYear() {
		return year;
	}

	public boolean setYear(int year) {
		if (isValidYear(year)) {
			this.year = year;
		}
		return isValidYear(year);
	}

	public String getVineyard() {
		return vineyard;
	}

	public void setVineyard(String vineyard) {
		this.vineyard = vineyard;
	}

	private boolean isValidYear(int year) {
		return year >= 1950 && year <= 2016;
	}

	public void drink() {
		System.out.println("I drink wine from " + this.year
				+ " from " + this.vineyard);
	}
}
