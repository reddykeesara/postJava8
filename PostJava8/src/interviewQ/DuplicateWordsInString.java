package interviewQ;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		
		String str = "hello java hello java8";
		String[] st = str.split(" ");
		Set<String> set = new HashSet<String>();
		
		for(String s:st) {
			set.add(s);
			System.out.println(s);
		}
		
		System.out.println(set);
	}
}


 class DuplicateWord {    
    public static void main(String[] args) {    
        String string = "Big black bug bit a big black dog on his big black nose";    
        int count;    
            
        	//Converts the string into lowercase    
        string = string.toLowerCase();    
            
        //Split the string into words using built-in function    
        String words[] = string.split(" ");    
            
        System.out.println("Duplicate words in a given string : ");     
        for(int i = 0; i < words.length; i++) {    
            count = 1;    
            for(int j = i+1; j < words.length; j++) {    
                if(words[i].equals(words[j])) {    
                    count++;    
                    //Set words[j] to 0 to avoid printing visited word    
                    words[j] = "0";    
                }    
            }    
                
            //Displays the duplicate word if count is greater than 1    
            if(count > 1 && words[i] != "0")    
                System.out.println(words[i]);    
        }    
    }    
}    