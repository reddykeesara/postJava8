package basics;

interface Interface1 {
	void intf1Method1();
	void meth();
	boolean equals(Object O);
	
	//default void intf2Method2();
}

interface Interface2{
	void int2fMethod1();
}

abstract class AbstClass1{
	abstract void absMethAbstClass1();
	
	public boolean equals(Object O) {
		return true;
	}

	
}

abstract class AbstClass2{

}

class SClass1{
	
	public boolean equals(Object O) {
		return true;
	}	 

	
}
class SClass2{
	
}
public class TestPre8 extends SClass1 implements Interface1, Interface2   {


	public TestPre8() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void intf1Method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void int2fMethod1() {
		// TODO Auto-generated method stub
		
	}

	void absMethAbstClass1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void meth() {
		// TODO Auto-generated method stub
		//TestPre8 testPre8 = new TestPre8();
		Interface1 intf = new TestPre8();
		intf.intf1Method1();
	}

}
