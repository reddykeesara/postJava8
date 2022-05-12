package basics;
// commit from github 
abstract class Human{
	public abstract void eat() ;

	public void walk() {
		
	}
}

class Man extends Human{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstract {

	public Abstract() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Human obj = new Man();
	}

}
