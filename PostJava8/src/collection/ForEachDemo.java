package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ForEachDemo {  
    public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>(); 
        gamesList.add("Chess");  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Hocky");  
        
        System.out.println("------------Iterating by passing lambda expression--------------");  
        gamesList.forEach(games -> System.out.println(games));  
        
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.forEach(System.out::println);  
          
        System.out.println("------------Iterating by passing lambda expression---------------");  
        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
        
        System.out.println("------------Iterating by passing method reference---------------");  
        gamesList.stream().forEachOrdered(System.out::println);
        
        Stream<String> st = gamesList.stream();
        st.forEachOrdered(null);
        
    }  
}  
