package com.simple.sjge.util;

public class Debug {
	
	static java.io.PrintStream o = System.out;

	public static void p(String s) {
		o.println(s);
	}
	
	public static void p(int i) {
		o.println(i);
	}
	
	public static void p(Boolean b) {
		o.println(b);
	}
	
	public static void p(double d) {
		o.println(d);
	}
	
	public static void p(float f) {
		o.println(f);
	}
	
	public static void p(long l) {
		o.println(l);
	}
	
}
