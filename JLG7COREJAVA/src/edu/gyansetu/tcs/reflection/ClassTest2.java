package edu.gyansetu.tcs.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassTest2 {

	public static void main(String... args) {
		// refelection
		Bag b1 = new Bag(23, "bag1", 345);

		Class bagObjClass = b1.getClass();
		// Bag.class
		System.out.println(bagObjClass);

		// testClassAttr1(bagObjClass);

		// testConsattr(bagObjClass);

		// testFieldattr(b1, bagObjClass);

		// testMethodattr(bagObjClass);

		Annotation[] annotations = bagObjClass.getDeclaredAnnotations();
		for (int i = 0; i < annotations.length; i++) {
			MyTable myTable = (MyTable) annotations[i];

			String table = myTable.name();

			System.out.println(table);
		}
		"insert into " +table + values ""

		// @edu.gyansetu.tcs.reflection.MyTable(name=ecap_bag)

	}

	private static void testMethodattr(Class bagObjClass) {
		Method[] methods = bagObjClass.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {
			if (methods[i].getName().startsWith("get")) {
				System.out.println(methods[i]);
			}
		}

		try {
			Method method1 = bagObjClass.getMethod("checkPrice", Integer.class);

			System.out.println(method1);

			Integer finalPrice = (Integer) method1.invoke(null, 1000);
			System.out.println(finalPrice);

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testFieldattr(Bag b1, Class bagObjClass) {
		Field[] fields = bagObjClass.getFields();

		for (Field field : fields) {
			System.out.println(field);
		}

		// public int edu.gyansetu.tcs.reflection.Bag.price
		// public static java.lang.String edu.gyansetu.tcs.reflection.Bag.type
		// public static final int edu.gyansetu.tcs.oops.p2.Windows.var

		try {
			Field field1 = bagObjClass.getField("price");

			field1.set(b1, 90909);
			System.out.println(b1);

		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testConsattr(Class bagObjClass) {
		Constructor[] constructors = bagObjClass.getConstructors();

		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}

		// public edu.gyansetu.tcs.reflection.Bag(int,java.lang.String,int)
		// public edu.gyansetu.tcs.reflection.Bag(int,java.lang.String)
		// public edu.gyansetu.tcs.reflection.Bag()
		Constructor constructor1 = null;
		try {
			constructor1 = bagObjClass.getConstructor(String.class);
			System.out.println(constructor1);
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Bag b2 = (Bag) constructor1.newInstance("Mohit");
			System.out.println(b2.hashCode());
			// Bag [id=0, name=Mohit, price=0]

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// public edu.gyansetu.tcs.reflection.Bag(java.lang.String)
	}

	private static void testClassAttr1(Class bagObjClass) {
		// class edu.gyansetu.tcs.reflection.Bag

		System.out.println(bagObjClass.getSimpleName());

		System.out.println(bagObjClass.getModifiers());

		if (Modifier.isPublic(bagObjClass.getModifiers())) {
			System.out.println("public");
		}

		Package package1 = bagObjClass.getPackage();

		System.out.println(package1);

		Class[] interfaces = bagObjClass.getInterfaces();

		// for (int i = 0; i < interfaces.length; i++) {
		// System.out.println(interfaces[i]);
		// }

		for (Class cls : interfaces) {
			System.out.println(cls);
		}
	}

}
