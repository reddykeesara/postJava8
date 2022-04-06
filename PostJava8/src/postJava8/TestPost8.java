package postJava8;

import postJava8.Interface1;
import postJava8.Interface2;
import postJava8.SClass1;

interface Interface1 {
	void intf1Method1();

	void meth();

	boolean equals(Object O);

	default void defMethodIntf() {
		System.out.println(" default method in interface1");
	}
}

interface Interface2 {
	void int2fMethod1();

	default void defMethodIntf() {
		System.out.println(" default method in interface2");
	}

}

abstract class AbstClass1 {
	abstract void absMethAbstClass1();

	public boolean equals(Object O) {
		return true;
	}

}

abstract class AbstClass2 {

}

class SClass1 {

	public boolean equals(Object O) {
		return true;
	}

	public void defMethodIntf() {
		System.out.println("super class method");
	}

}

class SClass2 {

}

public class TestPost8 extends SClass1 implements Interface1, Interface2 {

	public TestPost8() {
		// Interface1.super.defMethodIntf();
		// Interface2.super.defMethodIntf();

	}

	/*
	 * public void defMethodIntf() { System.out.println(" class method.."); }
	 */

	@Override
	public void intf1Method1() {
		System.out.println("inside testpost8");

	}

	@Override
	public void int2fMethod1() { // TODO Auto-generated method stub

	}

	void absMethAbstClass1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		// TestPre8 testPre8 = new TestPre8();
		Interface1 intf = new TestPost8();
		intf.intf1Method1();
	}

	public static void main(String[] args) {
		Interface1 intf1 = new TestPost8();
		Interface2 intf2 = new TestPost8();
		TestPost8 tp = new TestPost8();
		intf1.defMethodIntf();
		intf2.defMethodIntf();
		// tp.int2fMethod1();
		// tp.intf1Method1();

		// intf.defMethodIntf();
	}

}
