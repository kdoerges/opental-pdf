package org.vebqa.vebtal.pdf;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import org.junit.jupiter.api.Test;

public class PDFDriverTest {

	@Test
	public void loadNonExistingFile() {
		try {
			new PDFDriver().setFilePath("./src/test/java/resource/FileNotExisting.pdf").load();
		} catch (NoSuchFileException nsfe) {
			assertTrue(true);
		} catch (Exception e) {
			assertFalse(true, "Expected NoSuchFileException!");
		}
	}

	@Test
	public void loadInvalidFile() {
		try {
			new PDFDriver().setFilePath("./src/test/java/resource/InvalidFile.pdf").load();
		} catch (IOException ioe) {
			assertTrue(ioe.getMessage().equals("Cannot load PDF!"));
		} catch (Exception e) {
			assertFalse("Expected IOException!", true);
		}
	}

	@Test
	public void loadFileWithPassword() {
		try {
			new PDFDriver().setFilePath("./src/test/java/resource/ProtectedWithPassword.pdf").load();
		} catch (IOException ioe) {
			assertTrue(ioe.getMessage().equals("Cannot load PDF!"));
		} catch (Exception e) {
			assertFalse("Expected IOException!", true);
		}
	}

}