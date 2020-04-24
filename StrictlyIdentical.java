import java.util.Scanner;

public class StrictlyIdentical {
	public static void main (String [] args) {
		Scanner input=new Scanner(System.in); 
		
		int [] list1 = new int [5]; //Declare array for list 1
		System.out.println("Enter " + list1.length + " values for list1: ");
		 
		     for (int i=0; i<list1.length; i++) //Loops to check every element
		    	 list1[i] = input.nextInt();
					
		int [] list2 = new int [5]; //Declare array for list 2
		System.out.println("Enter " + list2.length + " values for list2: ");
		     for (int i=0; i<list2.length; i++)  //Loop to check every element
		         list2[i]= input.nextInt();
		     
		System.out.println(equals(list1,list2)? "Two lists are strictly identical":"Two lists are not identical");  //if list 1 and 2 are strictly identical print "identical". If not "not identical"
	      input.close();
	}
		            
		        public static boolean equals(int[] list1, int[] list2) //Head of method
		       {
		    	   if (list1.length != list2.length) {    //If the length of list 1 and 2 are not the same, return false
		                    	return false;
		
		    	   } else {
		       
		                    for (int i = 0; i < list1.length; i++) { //Loop to check every element
		                        if (list1[i] != list2[i]) 
		                        	return false;
		                        }
		                        
		                    }
		                    
		                    return true;
		                    
		       }       
		       }	    	   