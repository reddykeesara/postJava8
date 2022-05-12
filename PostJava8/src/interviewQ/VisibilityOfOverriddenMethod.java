package interviewQ;

class BaseClass {
	public int i=10;
	public void abc() {
		System.out.println("inside abc ");
	}

	private void abcd() {
		System.out.println("inside abcd ");

	}

	protected void abcde() {
		System.out.println("inside abcd ");

	}
}

public class VisibilityOfOverriddenMethod extends BaseClass{
	
	//cant change parent public method to either private or protected.. it says we cant reduce visibility
	@Override
	public void abc() {
		System.out.println(i);
	}
	
	//any way we can't override a private method
	private void abcd() {
		System.out.println("inside abcd ");

	}

	//we can change the visibility of overridden method from protected to public
	@Override
	public void abcde() {
		System.out.println("inside abcd ");

	}

	public static void main(String[] args) {
		VisibilityOfOverriddenMethod v = new VisibilityOfOverriddenMethod();
		v.abc();
	}

}
