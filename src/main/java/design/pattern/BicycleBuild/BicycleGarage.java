package design.pattern.BicycleBuild;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BicycleGarage {

	private Set<Accessory> accessories;
	private String baseFrame;
	private Set<Fitting> fittings;

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

	public Set<Accessory> getAccessories() {
		return accessories;
	}

	public String getBaseFrame() {
		return baseFrame;
	}

	public Set<Fitting> getFittings() {
		return fittings;
	}

	public static class Builder {

		public Builder(String baseFrame) {
			this.baseFrame = baseFrame;
		}

		private Set<Accessory> accessories = new HashSet<>();
		private String baseFrame;
		private Set<Fitting> fittings = new HashSet<>();

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
