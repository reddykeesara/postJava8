package interviewQ;


//
abstract class Sample{
	public abstract void abc();
	public void abcd() {
		System.out.println("inside abcd ");
	}
	protected Sample(){
		System.out.println("in sample");
	}
}
public class AbsImpl extends Sample{

	public AbsImpl() {
		super();
		System.out.println("in absimpl");
	}

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Sample impl = new AbsImpl();
		impl.abcd();
	}

}
