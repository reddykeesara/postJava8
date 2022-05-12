package interviewQ;

class Person {
	public void get() {
//Print Person details
	}
}

class Doctor extends Person {
	public void get() {
// Print Doctor
	}

	public void treatment() {
//Print Doctor treatment details
	}
}

class TestDownCast {
public static void main(String args[])
{
Person ob=new Doctor();
//Person p = (Person)ob.treatment();

 }
}