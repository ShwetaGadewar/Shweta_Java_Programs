package assignments;

public class Assignment88AverageOfTwoDifferentDatatypeArrays {
static int sum1=0;
static double sum2=0;
static int average1=0;
static double average2=0;
static int reminder1=0;
static double reminder2=0;
static int finalsum=0;
	public static void main(String[] args) {
		 System.out.println("The array of int datatype"); 
		int num1[]=new int[4];
	       num1[0]=14;
	       num1[1]=15;
	       num1[2]=57;
	       num1[3]=90;
	       for(int i=0;i<num1.length;i++)
	       {
	    	   sum1=sum1+num1[i];
	    	   average1=sum1/num1.length;
	    	   reminder1=sum1%(num1.length);
	       }
	       System.out.println(sum1);
	       System.out.println(average1);
	       System.out.println(reminder1);
	       
	       double[] num2=new double[4];
	       num2[0]=22;
	       num2[1]=34;
	       num2[2]=21;
	       num2[3]=23;
	       System.out.println("======================================");
	 System.out.println("The array of double datatype");      
	       for(int j=0;j<num2.length;j++)
	       {
	    	   sum2=sum2+num2[j];
	    	   average2=sum2/num2.length;
	    	   reminder2=sum2%(num2.length);
	       }
	       System.out.println(sum2);
	       System.out.println(average2);
	       System.out.println(reminder2);
	 	  
		}




	}


