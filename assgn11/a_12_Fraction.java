/*********************
 * A Class for implementing the data type fraction
 * 
 *
 *   Create the following methods:
 *  1. mehods minus, times, devisesBy - similar to plus method to performe ariphmetic
 *  2. a method clone, that creates a new Fraction object from existing one, which is passed to the method
 *  3. a method doubleVal which returns a magnitude of a fraction
 *  4. a mehod equals which can be used to compare two fractions
 *    Add a code to the main method the solve the following problems:
 *  5. prompts the user for two fractions a and b and then finds and prints their sum, difference, product, and quotient.
 *  6. Create a fraction c that is a clone the result of a and calculate the following ab-c^2   
 *
 *
 *
 ********************/
 import java.util.Scanner;
 public class a_12_Fraction{
    public static void main(String[] arg){
		 Fraction res = new Fraction();
		 System.out.println("number of fractions created:" +Fraction.cnt);
		 Fraction fra3 = new Fraction("Enter the values");
		 System.out.println(fra3);
		 System.out.println("number of fractions created:" +Fraction.cnt);
		  Fraction fra4 = new Fraction("Enter the values");
		 System.out.println(fra4);
		 System.out.println("number of fractions created:" +Fraction.cnt);
		 
		// Fraction fra2 = new Fraction(0,0);
		 res=fra4.plus(fra3);
		 System.out.println("result is: " + res);
		 
	} 
 }
class Fraction{
	                  // instance variables 
	private int num;               // top part
	private int den;                // bottom part
    private Scanner sc=new Scanner(System.in);
	public static int cnt=0;
	/*********************
	 * Constructor for objects of class Fraction
	*  Create an object representing 0/1
	 ********************/
	public Fraction()	{
	                // initialise instance variables
		num = 0;
		den = 1;
		cnt++;
	}
	/*********************
	 * Construct a fraction given two ints (numerator first)
	 * 
	 * @param n the numerator
	 * @param d the denominator
	 ********************/
	public Fraction(int num, int den)	{
		        // initialise instance variables
		this.num = num;
		this.den = den;
		cnt++;
                             // reduce
        this.reduce();
	}

	/*********************
	 * A method to add two fractions this + other
	 * 
	 ********************/
	public Fraction(String prompt){
	   System.out.println(prompt);
	   System.out.println("n?")	;
	   int n=sc.nextInt();
	   System.out.println("d?")	;
	   int d=sc.nextInt();
	   num=n;
	   den=d;
	   cnt++;
	   reduce();
		
	}
	public  Fraction plus(Fraction other){
        Fraction result = new Fraction(num*other.den + den*other.num, den*other.den);
		return result;		
	}
	
	
         /*********************
	 * 
	 * @return a String representation of the Fraction 
	 ********************/
	
	public String toString(){
                if (den != 0)
	              return("" + num + "/" + den);
                else if (num ==0)
                         return "NaN";
                else if (num > 0)
                         return "Infinity";
                 else 
                         return " - Infinity";

	}
         /*********************
 	 * 
	 * reduce Fraction object to lowest terms 
	 ********************/
         private void reduce(){
           for (int i = Math.min(Math.abs(num),Math.abs(den)); i>=2;i--)   // we don't need to open and close brackets here 
             if (num%i == 0 && den%i == 0){                 //because if(..){..} is one statement
                num/=i;
                den/=i;
             } // end if
        }// end reduce
}// end Fraction class