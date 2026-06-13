package com.example.InterviewCoding27;

public class Singleton27 {

	private static volatile Singleton27 obj;

	private Singleton27() {
		if (obj != null)
			throw new RuntimeException("Exception Occured");
	}

	public static Singleton27 getObj() {
		if (obj == null) {
			synchronized (Singleton27.class) {
				if (obj == null) {
					obj = new Singleton27();
				}
			}
		}
		return obj;
	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Unable to doing Clone");
	}

	private Object readResolve() {
		return getObj();
	}
}
