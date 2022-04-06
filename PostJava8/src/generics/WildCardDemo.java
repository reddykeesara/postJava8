package generics;

import java.util.ArrayList;

//The question mark (?) is known as the wildcard in generic programming. 
//It represents an unknown type.The wildcard can be used in a variety of situations
//such as the type of a parameter, field, or local variable; sometimes 
//as a return type. Unlike arrays, different instantiations of a generic type 
//are not compatible with each other,not even explicitly. This incompatibility 
//may be softened by the wildcard if?is used as an actual type parameter.

import java.util.Arrays;
import java.util.List;

class WildCardDemo {
	public static void main(String[] args) {

		// Upper Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// printing the sum of elements in list
		System.out.println("Total sum is:" + sum(list1));

		// Double list
		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

		// printing the sum of elements in list
		System.out.print("Total sum is:" + sum(list2));
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}

		return sum;
	}
}
//
//class WildcardDemo2 {
//	public static void main(String[] args) {
//		// Lower Bounded Integer List
//		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
//
//		// Integer list object is being passed
//		printOnlyIntegerClassorSuperClass(list1);
//
//		// Number list
//		List<Number> list2 = Arrays.asList(4, 5, 6, 7);
//
//		// Integer list object is being passed
//		printOnlyIntegerClassorSuperClass(list2);
//	}
//
//	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) {
//		System.out.println(list);
//	}
//}
//
//class unboundedwildcardemo {
//	public static void main(String[] args) {
//
//		// Integer List
//		List<Integer> list1 = Arrays.asList(1, 2, 3);
//
//		// Double list
//		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
//
//		printlist(list1);
//
//		printlist(list2);
//	}
//
//	private static void printlist(List<?> list) {
//
//		System.out.println(list);
//	}
//}


