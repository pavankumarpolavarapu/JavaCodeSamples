package io.github.pavankumarpolavarapu.annotation;

import java.lang.reflect.Method;

public class MyClass {
	
	@MyCustomAnnotation(value = 10)
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public void sayHi() {
		System.out.println("hi");
	}
	public static void main(String args[]) throws Exception{
		MyClass m1 = new MyClass();
		
		Method o1[];
		o1 = m1.getClass().getDeclaredMethods();
		Method methodVal = m1.getClass().getMethod("sayHello");
		MyCustomAnnotation myCustomAnnotation = methodVal.getAnnotation(MyCustomAnnotation.class);
		System.out.println("Value is: " + myCustomAnnotation.value());
		System.out.println(o1[1]);
	}
}
