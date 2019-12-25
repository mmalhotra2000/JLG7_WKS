package edu.gyansetu.tcs.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import edu.gyansetu.tcs.jdbc.Customer;

public class TestRef {

	public static void main(String[] args) {

		Method[] methods =Customer.class.getDeclaredMethods();
		
	//	Annotation[] annotations= Customer.class.get
		
//		for (int i = 0; i < annotations.length; i++) {
//			System.out.println(annotations[i]);
//		}

		//Field[] fields = Customer.class.getDeclaredMethods();

//		for (int i = 0; i < fields.length; i++) {
//			System.out.println(fields[i]);
//		}

		for (int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}

		// ORM
		// table : java class
	}

}
