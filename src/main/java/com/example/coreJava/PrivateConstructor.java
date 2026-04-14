package com.example.coreJava;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Parentclasss {
	private Parentclasss() {
	}
}

public class PrivateConstructor // extends Parentclass
{
	// It is not possible bcz parent class has private constructor
//		public PrivateConstructor() {}

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<Parentclasss> c = Parentclasss.class.getDeclaredConstructor();
		c.setAccessible(true);
		Parentclasss obj = c.newInstance();
		System.out.println(obj.hashCode());
	}
}
