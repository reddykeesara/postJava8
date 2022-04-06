package seriliaze;

//Java Program Illustrate Serializing an Object

//Importing input output classes
import java.io.*;

//Main class
//Implementing the Serializable interface
class SerializableDemo implements Serializable {

	// Member variables
	private String name;

	SerializableDemo(String name) {
		// This keyword refers to current object itself
		this.name = name;
	}

	// Main driver method
	public static void main(String[] args) {
		// Try block to check for exceptions
		try {
			// Creating object of class in main() method
			SerializableDemo d = new SerializableDemo("GeeksForGeeks");

			FileOutputStream fo = new FileOutputStream("file.txt");
			byte[] bytes = { (byte) 0xe0, 0x4f, (byte) 0xd0, 0x20, (byte) 0xea, 0x3a, 0x69, 0x10, (byte) 0xa2,
					(byte) 0xd8, 0x08, 0x00, 0x2b, 0x30, 0x30, (byte) 0x9d };
			fo.write(bytes);
			//ObjectOutputStream oos = new ObjectOutputStream(fo);
			//oos.writeObject(d);
			//oos.close();

			// Freeing up memory resources
			fo.close();
			
			
			SerializableDemo dd ;
			FileInputStream fi = new FileInputStream("file.txt");

			// Creating ObjectInputStream class object
			ObjectInputStream ooss = new ObjectInputStream(fi);
			dd = (SerializableDemo) ooss.readObject();
			ooss.close();
			System.out.println(dd);
		}

		// Catch block to handle the exceptiona
		catch (Exception e) {
			// Display the exception along with line number
			// using printStacktrace() method
			e.printStackTrace();
		}
	}
}

class GFG {

	// Main driver method
	public static void main(String[] args) {

		// Try block to check for exceptions
		try {

			GFG d;

			// Creating FileInputStream class object
			FileInputStream f = new FileInputStream("file.txt");

			// Creating ObjectInputStream class object
			ObjectInputStream oos = new ObjectInputStream(f);
			d = (GFG) oos.readObject();
			System.out.println(d);

		}

		// Catch block to handle the exceptions
		catch (Exception e) {

			// Display the exception on console
			// using printStacjtrace() method
			e.printStackTrace();
		}

	}
}