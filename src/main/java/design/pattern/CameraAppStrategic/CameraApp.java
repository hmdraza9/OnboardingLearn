package design.pattern.CameraAppStrategic;

public abstract class CameraApp {

	EditPhotoBehaviour editPhoto;

	public void clickPhoto() {
		System.out.println("Photo clicked.");
	}

	public void savePhoto() {
		System.out.println("Photo saved.");
	}

	public void sharePhoto() {
		System.out.println("Photo shared");
	}

	public abstract void editPhoto();

}
