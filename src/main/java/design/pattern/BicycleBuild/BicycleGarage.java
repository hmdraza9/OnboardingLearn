package design.pattern.BicycleBuild;

import java.util.ArrayList;
import java.util.List;

public class BicycleGarage {

	private List<Accessory> accessories;
	private String baseFrame;
	private List<Fitting> fittings;

	private BicycleGarage(Builder builder) {
		this.accessories = builder.accessories;
		this.baseFrame = builder.baseFrame;
		this.fittings = builder.fittings;
	}

	public enum Fitting{
		Gears, Disc_Brakes, Handle, Pedals
	}

	public enum Accessory{
		Helmet, Toolkit, Lights, Carrier, Bell
	}

	public List<Accessory> getAccessories() {
		return accessories;
	}

	public String getBaseFrame() {
		return baseFrame;
	}

	public List<Fitting> getFittings() {
		return fittings;
	}

	public static class Builder {

		public Builder(String baseFrame) {
			this.baseFrame = baseFrame;
		}

		private List<Accessory> accessories = new ArrayList<>();
		private String baseFrame;
		private List<Fitting> fittings = new ArrayList<>();

		public Builder accessories(Accessory accessories) {
			this.accessories.add(accessories);
			return this;
		}

		public Builder baseFrame(String baseFrame) {
			this.baseFrame = baseFrame;
			return this;
		}

		public Builder fittings(Fitting fittings) {
			this.fittings.add(fittings);
			return this;
		}

		public BicycleGarage build() {
			return new BicycleGarage(this);
		}

	}

}
