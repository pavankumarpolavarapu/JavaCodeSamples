package io.github.pavankumarpolavarapu.imagehandling;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageHandlingExample {

	public static void main(String[] args) {
		int width = 990;
		int height = 660;

		BufferedImage image = null;
		File sampleFile = new File("");

		image = readFromFile(width, height, image, sampleFile.getAbsolutePath().concat("/src/io/github/pavankumarpolavarapu/imagehandling/India.jpeg"));

		writeToFile(image, sampleFile.getAbsolutePath().concat("/src/io/github/pavankumarpolavarapu/imagehandling/myCountry.jpeg"));

	}

	private static BufferedImage readFromFile(int width, int height, BufferedImage image, String path) {
		try {

			File actualFile = new File(path);
			image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			image = ImageIO.read(actualFile);
			
			System.out.println("Reading Complete." + image);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return image;
	}

	private static void writeToFile(BufferedImage image, String path) {
		
		try {
			File output = new File(path);
			
			ImageIO.write(image,  "jpeg", output);
			
			System.out.println("Write Complete");
		} catch ( Exception e ) {
			System.out.println("Error: " + e);
		}

	}

}
