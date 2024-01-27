package design.pattern.CameraAppStrategic;

public class CameraPlusApp extends CameraApp {

	public CameraPlusApp() {
		editPhoto = new EditPhotoAdvancedTools();
	}

	@Override
	public void editPhoto() {
		System.out.println("Editing photo with advanced tools");
	}

}
