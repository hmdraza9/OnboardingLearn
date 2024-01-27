package design.pattern.CameraAppStrategic;

public class BasicCameraApp extends CameraApp {

	public BasicCameraApp() {
		editPhoto = new EditPhotoBaseTools();
	}

	@Override
	public void editPhoto() {
		System.out.println("Editing photo with basic tools");
	}

}
