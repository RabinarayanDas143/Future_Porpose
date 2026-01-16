package com.example.coreJava1;


public class SingletonDesignPattern1 {
	private static SingletonDesignPattern1 obj = null;

	public static SingletonDesignPattern1 getInstance() {
		if (obj == null) {
			synchronized (SingletonDesignPattern1.class) {
				if (obj == null) {
					obj = new SingletonDesignPattern1();
				}
			}
		}
		return obj;
	}

	public static void main(String[] args) throws Exception {
		SingletonDesignPattern1 obj = SingletonDesignPattern1.getInstance();
		System.out.println(obj.hashCode());
		SingletonDesignPattern1 obj1 = SingletonDesignPattern1.getInstance();
		System.out.println(obj1.hashCode());
//		
//		Constructor<SingletonDesignPattern1> object = SingletonDesignPattern1.class.getDeclaredConstructor();
//		SingletonDesignPattern1 ref_obj = object.newInstance();
//		
//		System.out.println(obj.hashCode());
//		System.out.println(ref_obj.hashCode());
	}
}
