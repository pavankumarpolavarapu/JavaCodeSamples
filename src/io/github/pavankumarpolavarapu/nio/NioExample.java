package io.github.pavankumarpolavarapu.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioExample {

	public static void main(String[] args) throws IOException {
		File sampleFile = new File("");
		
		// Reading is Buffer(into) <- Channel (via)
		// Writing is Buffer(from) -> Channel
		
		FileInputStream fin = new FileInputStream(sampleFile.getAbsolutePath().concat("/src/io/github/pavankumarpolavarapu/nio/src.txt"));
		FileChannel readChannel = fin.getChannel();
		ByteBuffer readBuffer = ByteBuffer.allocate( 1024 );
		int result = readChannel.read(readBuffer);
		System.out.println("file read successfully"+result);
		
		FileOutputStream fout = new FileOutputStream(sampleFile.getAbsolutePath().concat("/src/io/github/pavankumarpolavarapu/nio/dest.txt"));
		FileChannel writeChannel = fout.getChannel();
		ByteBuffer writeBuffer = ByteBuffer.allocate( 1024 );
		String message = "this is a test string";
		writeBuffer.put(message.getBytes());
		writeBuffer.flip();
		writeChannel.write(writeBuffer);
		System.out.println("file written successfully");
	}

}
