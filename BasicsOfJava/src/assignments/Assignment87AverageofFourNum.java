package assignments;

public class Assignment87AverageofFourNum {
static double average=0;
static int sum=0;
static int reminder=0;

	public static void main(String[] args) {
       int num[]=new int[4];
       num[0]=14;
       num[1]=15;
       num[2]=57;
       num[3]=90;
       
       for(int i=0;i<num.length;i++)
       {
    	   sum=sum+num[i];
    	   average=sum/num.length;
    	   reminder=sum%(num.length);
       }
       System.out.println(sum);
       System.out.println(average);
       System.out.println(reminder);
	}

}
