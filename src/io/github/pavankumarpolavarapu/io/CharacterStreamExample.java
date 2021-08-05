package io.github.pavankumarpolavarapu.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) throws IOException {
		FileReader readerStream = null;
		FileWriter writerStream = null;
		String sourceFile = "/home/pavankumarp/eclipse-workspace/JavaSamples/src/io/github/pavankumarpolavarapu/io/sourceFile.txt";
		String destFile = "/home/pavankumarp/eclipse-workspace/JavaSamples/src/io/github/pavankumarpolavarapu/io/destFile.txt";
		try {
			readerStream = new FileReader(sourceFile);
			writerStream = new FileWriter(destFile);

			int content;
			while ((content = readerStream.read()) != -1) {
				writerStream.append((char) content);
			}

		} finally {
			if (readerStream != null) {
				readerStream.close();
			}
			if (writerStream != null) {
				writerStream.close();
			}
		}
	}

}
