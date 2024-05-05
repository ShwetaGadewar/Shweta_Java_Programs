package BasicConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;

public class Test1 {
	public static void main(String[] args) {
		// List<JFrame> frameList;
		
	//	 Random random = new Random();
	   //     JFrame selectedFrame = frameList.get(random.nextInt(frameList.size())); 
	        
		List<String> givenList = Arrays.asList("blue", "orange", "black");
	    Random rand = new Random();
	    String randomElement = givenList.get(rand.nextInt(givenList.size()));
	    
	    System.out.println(randomElement);
	    
	    
        }
	    
	    
	    
	   // List<Integer> givenlist2= Arrays.asList(1,2,3,4);
	    //Integer randomElement2 = givenlist2.get(rand.nextInt(givenlist2.size()));
	    //System.out.println(randomElement2);
	    
	
}
