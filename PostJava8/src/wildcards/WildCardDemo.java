package wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCardDemo {
    public static void main(String[] args)
    {
 
        // Upper Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));
 
        // Double list
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
 
        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));
    }
 
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
 
        return sum;
    }
}

/*
 * Explanation:
 * 
 * In the above program, list1 and list2 are objects of the List class. list1 is
 * a collection of Integer and list2 is a collection of Double. Both of them are
 * being passed to method sum which has a wildcard that extends Number. This
 * means that list being passed can be of any field or subclass of that field.
 * Here, Integer and Double are subclasses of class Number.
 * 
 * 2. Lower Bounded Wildcards: It is expressed using the wildcard character
 * (‘?’), followed by the super keyword, followed by its lower bound: <? super
 * A>.
 * 
 * Syntax: Collectiontype <? super A>
 */


// Java program to demonstrate Lower Bounded Wildcards

class LowerBoundedWildcardDemo2 {
    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
 
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);
 
        // Number list
        List<Number> list2 = Arrays.asList(4, 5, 6, 7);
 
        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }
 
    public static void printOnlyIntegerClassorSuperClass(
        List<? super Integer> list)
    {
        System.out.println(list);
    }
}
//Output
//[4, 5, 6, 7]
//[4, 5, 6, 7]
/*
 * Explanation:
 * 
 * Here arguments can be Integer or superclass of Integer(which is Number). The
 * method printOnlyIntegerClassorSuperClass will only take Integer or its
 * superclass objects. However, if we pass a list of types Double then we will
 * get a compilation error. It is because only the Integer field or its
 * superclass can be passed. Double is not the superclass of Integer.
 * 
 * Note: Use extend wildcard when you want to get values out of a structure and
 * super wildcard when you put values in a structure. Don’t use wildcard when
 * you get and put values in a structure. You can specify an upper bound for a
 * wildcard, or you can specify a lower bound, but you cannot specify both.
 * 
 * 3. Unbounded Wildcard: This wildcard type is specified using the wildcard
 * character (?), for example, List. This is called a list of unknown types.
 * These are useful in the following cases –
 * 
 * When writing a method that can be employed using functionality provided in
 * Object class. When the code is using methods in the generic class that
 * doesn’t depend on the type parameter Implementation:
 */


// Java program to demonstrate Unbounded wildcard
 

 
class Unboundedwildcardemo {
    public static void main(String[] args)
    {
 
        // Integer List
        List<Integer> list1 = Arrays.asList(1, 2, 3);
 
        // Double list
        List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
 
        printlist(list1);
 
        printlist(list2);
        
        //added later
        List<String> list3 = Arrays.asList("a","b","3","4");
        printlist(list3);
    }
 
    private static void printlist(List<?> list)
    {
 
        System.out.println(list);
    }
}
//Output
//[1, 2, 3]
//[1.1, 2.2, 3.3]

/*
 * This article is contributed by Nishant Sharma. If you like GeeksforGeeks and
 * would like to contribute, you can also write an article using
 * write.geeksforgeeks.org or mail your article to
 * review-team@geeksforgeeks.org. See your article appearing on the
 * GeeksforGeeks main page and help other Geeks. Please write comments if you
 * find anything incorrect, or you want to share more information about the
 * topic discussed above.
 */
