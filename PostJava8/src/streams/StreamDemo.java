package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//incomplete from javapoint
class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}

/*
 * A stream in Java is a sequence of objects which operates on a data source
 * such as an array or a collection and supports various methods. It was
 * introduced in Java 8’s java.util.stream package. Stream supports many
 * aggregate operations like filter, map, limit, reduce, find, and match to
 * customize the original data into a different form according to the need of
 * the programmer. The operations performed on a stream do not modify its source
 * hence a new stream is created according to the operation applied to it. The
 * new data is a transformed copy of the original form.
 *
 *
 */

//One of the simple ways to obtain a parallel stream is by invoking the parallelStream() method 
//CopyOnWriteArrayListof Collection interface.
//Another way is to invoke the parallel() method of BaseStream interface on a sequential stream.

public class StreamDemo {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> productPriceList = new ArrayList<Float>();
		
		//before Stream
		for (Product product : productsList) {

			// filtering data of list
			if (product.price < 30000) {
				productPriceList.add(product.price); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data

		//using Stream
		List<Float> productPriceList2 = productsList.stream().filter(p -> p.price > 30000)// filtering data
				.map(p -> p.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList2);
	}
}

 class JavaStreamExample {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
 }
 
 
  class JavaStreamExample2 {  
	    public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	        productsList.add(new Product(5,"xyz Laptop",30000f)); 
	        // This is more compact approach for filtering data  
//	        productsList.stream()  
//	                             .filter(product -> product.price == 30000)  
//	                             .forEach(product -> System.out.println(product.name)); 
	        productsList.stream().sorted(Comparator.comparing(Product::getName)).forEach(pro -> System.out.println(pro.name));;
	        
	        productsList.forEach(pro -> System.out.println(pro.name));
	    }  
	}  
  
//  Streams
//
//  the Stream API is used to process collections of objects. A stream is a sequence of objects that supports
//various methods which can be pipelined to produce the desired result
//  The features of Java stream are –
//
//  A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
//  Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
//  Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate 
  //operations can be pipelined. Terminal operations mark the end of the stream and return the result.
//  Different Operations On Streams-
//  Intermediate Operations:
//
//  map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
//  List number = Arrays.asList(2,3,4,5);
//  List square = number.stream().map(x->x*x).collect(Collectors.toList());
//  filter: The filter method is used to select elements as per the Predicate passed as argument.
//  List names = Arrays.asList("Reflection","Collection","Stream");
//  List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//  sorted: The sorted method is used to sort the stream.
//  List names = Arrays.asList("Reflection","Collection","Stream");
//  List result = names.stream().sorted().collect(Collectors.toList());
//  Terminal Operations:
//
//  collect: The collect method is used to return the result of the intermediate operations performed on the stream.
//  List number = Arrays.asList(2,3,4,5,3);
//  Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
//  forEach: The forEach method is used to iterate through every element of the stream.
//  List number = Arrays.asList(2,3,4,5);
//  number.stream().map(x->x*x).forEach(y->System.out.println(y));
//  reduce: The reduce method is used to reduce the elements of a stream to a single value.
//  The reduce method takes a BinaryOperator as a parameter.
//  List number = Arrays.asList(2,3,4,5);
//  int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//
//  Here ans variable is assigned 0 as the initial value and i is added to it .
//
