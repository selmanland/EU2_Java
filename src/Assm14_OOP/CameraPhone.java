package Assm14_OOP;

public class CameraPhone extends PhoneClass{
	
	int imageSize, memorySize;

	public CameraPhone(int imageSize, int memorySize) {
		super();
		this.imageSize = imageSize;
		this.memorySize = memorySize;
	}

	public int numPictures() {
		return memorySize * 1000 / imageSize;
	}

}
