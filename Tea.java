public class Tea implements Beverage, Drinkable {
	private Flavour flavour;

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public Tea() {
		this(Flavour.GREEN);
	}

	public Tea(Flavour flavour) {
		this.flavour = flavour;
	}

	/* (non-Javadoc)
	 * @see Drinkable#drink()
	 */
	@Override
	public void drink() {
			System.out.println("Mmmm, this " + getFlavourString(flavour) + " tea is delicious!"); // refactor -> extract interface
	}
	
	private String getFlavourString(Flavour flavour) {
		String flavourString;
		String fresh= "fresh ";
		switch(flavour) {
		case APPLE:
			flavourString = fresh.concat(flavour.toString().toLowerCase());
			break;
		case GINGER:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case MINT:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case LEMON:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case STRAWBERRY:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case GREY:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case GREEN:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		case VANILLA:
			flavourString = fresh + flavour.toString().toLowerCase();
			break;
		default:
			flavourString = "tasteless";
			break;
		}
		return flavourString;
	}
}
