package interviewQ;


interface Interface1 {
	void intf1Method1();

	void meth();

	boolean equals(Object O);

	default void defMethodIntf() {
		System.out.println(" default method in interface1");
	}
}

interface Interface2 {
	void intf2Method1();

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

public class IntfMethodCallingSuper extends SClass1 implements Interface1, Interface2 {

	public IntfMethodCallingSuper() {
		defMethodIntf();
		Interface1.super.defMethodIntf();
		Interface2.super.defMethodIntf();

	}

	/*
	 * public void defMethodIntf() { System.out.println(" class method.."); }
	 */

	@Override
	public void intf1Method1() {
		System.out.println("inside testpost8");

	}

	@Override
	public void intf2Method1() { // TODO Auto-generated method stub

	}

	void absMethAbstClass1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		// TestPre8 testPre8 = new TestPre8();
		Interface1 intf = new IntfMethodCallingSuper();
		intf.intf1Method1();
	}

	public static void main(String[] args) {
		//Interface1 intf1 = new TestPost8();
		//Interface2 intf2 = new TestPost8();
		IntfMethodCallingSuper tp = new IntfMethodCallingSuper();
		//intf1.defMethodIntf();
		//intf2.defMethodIntf();
		// tp.int2fMethod1();
		// tp.intf1Method1();

		// intf.defMethodIntf();
	}

}
