package io.github.pavankumarpolavarapu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreaExample {
	public static void main(String[] args) throws IOException {

		FileInputStream inStream = null;
		FileOutputStream outStream = null;
		String sourceFile = "/home/pavankumarp/eclipse-workspace/JavaSamples/src/io/github/pavankumarpolavarapu/io/sourceFile.txt";
		String destFile = "/home/pavankumarp/eclipse-workspace/JavaSamples/src/io/github/pavankumarpolavarapu/io/destFile.txt";
		try {
			inStream = new FileInputStream(sourceFile);
			outStream = new FileOutputStream(destFile);
			
			int content;
			while (( content = inStream.read()) != -1) {
				outStream.write((byte) content);
			}
		} finally {
			if (inStream != null) {
				inStream.close();
			}
			if (outStream != null) {
				outStream.close();
			}
		} 
	}
}
