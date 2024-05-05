package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomColorSelect {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Blue", "Green", "Yellow", "Orange", "Purple",
				"Pink", "Magenta", "White"));
		Random random = new Random();
for (int i=0; i<7; i++) {
		int index= random.nextInt(colors.size());
		System.out.println(colors.get(index));
		colors.remove(index);
}
		
	/*	Random random = new Random();
        ArrayList<String> randomColors = new ArrayList<>();
        while (randomColors.size() < 5) 
        {
            int randomIndex = random.nextInt(colors.size());
            String randomColor = colors.get(randomIndex);
            
            if (!randomColors.contains(randomColor)) 
            {
                randomColors.add(randomColor);
            }
        }

       
        System.out.println("Random colors:");
        for (String color : randomColors) {
            System.out.println(color);
        }
        
       
        
        for(int i = 0; i < 5 ; i++) {
        	System.out.println(colors.r);*/
        
    }
}


