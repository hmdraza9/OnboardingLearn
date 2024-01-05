package test.epam.bouquet;

public class Bouquet {

	private int rosePrice;
	private int jasminePrice;
	private int lilyPrice;

	public int getRosePrice() {
		return rosePrice;
	}

	public void setRosePrice(int rosePrice) {
		this.rosePrice = rosePrice;
	}

	public int getJasminePrice() {
		return jasminePrice;
	}

	public void setJasminePrice(int jasminePrice) {
		this.jasminePrice = jasminePrice;
	}

	public int getLilyPrice() {
		return lilyPrice;
	}

	public void setLilyPrice(int lilyPrice) {
		this.lilyPrice = lilyPrice;
	}

	public Bouquet(int rosePrice, int jasminePrice, int lilyPrice) {

		this.rosePrice = rosePrice;
		this.jasminePrice = jasminePrice;
		this.lilyPrice = lilyPrice;

	}

}
