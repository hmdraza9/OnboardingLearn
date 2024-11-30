package design.pattern.BicycleBuild;

public class BicycleShop {

	public static void main(String[] args) {

		System.out.println("Fittings: " + new BicycleShop().getBicycleFitter(args).getFittings());
		System.out.println("Accessories: " + new BicycleShop().getBicycleFitter(args).getAccessories());
		System.out.println("Base Frame: " + new BicycleShop().getBicycleFitter(args).getBaseFrame());

	}

	public BicycleGarage getBicycleFitter(String[] args) {
		BicycleGarage.Builder builder = new BicycleGarage.Builder("Basic Cycle").accessories(BicycleGarage.Accessory.Helmet)
				.accessories(BicycleGarage.Accessory.Toolkit).accessories(BicycleGarage.Accessory.Lights).accessories(BicycleGarage.Accessory.Lights).accessories(BicycleGarage.Accessory.Lights).accessories(BicycleGarage.Accessory.Lights)
				.accessories(BicycleGarage.Accessory.Carrier)

				.fittings(BicycleGarage.Fitting.Gears).fittings(BicycleGarage.Fitting.Gears).fittings(BicycleGarage.Fitting.Gears)
				.fittings(BicycleGarage.Fitting.Disc_Brakes).fittings(BicycleGarage.Fitting.Handle).fittings(BicycleGarage.Fitting.Pedals);

		return builder.build();

	}

}
