package edu.gyansetu.tcs.jdbc;

import java.lang.annotation.Annotation;

public class TestReflection {

	public static void main(String[] args) {

		Annotation[] annotations = Bottle.class.getDeclaredAnnotations();

		for (int i = 0; i < annotations.length; i++) {
			if (annotations[i] instanceof MyTable) {
				MyTable myTable = (MyTable) annotations[i];
				System.out.println("table name is " + myTable.name());
				System.out.println(myTable.values());
			}
			System.out.println(annotations[i]);
		}

	//	table name is bottle_table

		// @edu.gyansetu.tcs.jdbc.MyTable(name=bottle_table, values=[abc, lklm])

	}

}
