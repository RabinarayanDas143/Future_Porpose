package com.example.InterviewCoding26;

public class Singleton26 {

	private static volatile Singleton26 obj;

	private Singleton26() {
		if (obj != null)
			throw new RuntimeException("Exception Occured..");
	}

	public static Singleton26 getObj() {
		if (obj == null) {
			synchronized (Singleton26.class) {
				if (obj == null) {
					obj = new Singleton26();
				}
			}
		}
		return obj;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Clone not supported of this class");
	}

	private Object readResolve() {
		return getObj();
	}
}
