package io.github.pavankumarpolavarapu.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDeserStudent {
	
	static String filename = "/home/pavankumarp/eclipse-workspace/JavaCourse/src/io/JavaCourse/main/student.txt";
	static FileOutputStream fileOut = null;
	static ObjectOutputStream objOut = null;
	
	public static void main(String[] args) throws Exception {
		Student student = new Student("Pavan", 30, "3202 SW PebbleStreet, Arkansas");
		
		try {
			fileOut = new FileOutputStream(filename);
			objOut = new ObjectOutputStream(fileOut);
			objOut.writeObject(student);
			
			objOut.close();
			fileOut.close();
			
			System.out.println("Object has been serialized: \n" + student );
		} catch (IOException ex) {
			System.out.println("IOException is caught"); 
		}
		
		//Deserialization
		FileInputStream fileIn = null;
		ObjectInputStream objIn = null;
		
		try {
			fileIn = new FileInputStream(filename);
			objIn = new ObjectInputStream(fileIn);
			
			Student object = (Student) objIn.readObject();
			System.out.println("Object has been deserialized: \n " + object );
			
			objIn.close();
			fileIn.close();
			
		} catch (IOException ex) {
			System.out.println("IOException is caught"); 
		}

	} 

}
 