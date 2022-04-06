package basics;

interface Writer{
	 void write();
}
 
 class Pen implements Writer{
	 public void write() {
		 System.out.println("In a Pen");
	 }
 }

 class Pencil implements Writer{
	 public void write() {
		 System.out.println("In a Pencil");
	 }
 }

 class Kit{
	 public void doSomething(Writer p) {
		 p.write();
	 }
 }
public class Abstract3 {

	public Abstract3() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Kit k = new Kit();
		Writer p = new Pen();
		Writer pc=  new Pencil();
		k.doSomething(pc);
		k.doSomething(p);
	}

}
