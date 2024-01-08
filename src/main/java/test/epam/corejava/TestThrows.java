package test.epam.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThrows {

	public void ifFilePresent() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(new File("src/test/resources/log4j2.properties"));

	}

}
