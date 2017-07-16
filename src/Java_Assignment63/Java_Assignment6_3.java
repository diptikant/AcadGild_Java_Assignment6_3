package Java_Assignment63;
/*
 * This class will help  to master the Array concepts.
 * Problem Statement:
 * Write a program to search an element in a one-dimensional array using Binary Search Algorithm.
 */

import java.util.Scanner;
public class Java_Assignment6_3 
{

	
	public static void main(String[] args) 
	{
		BinarySearch ob=new BinarySearch(); //BinarySearch class Instance
	    ob.bSearch(); //calling the bSearch method
	}

}
//BinarySearch class declaration
class BinarySearch 
{
    void bSearch() //The binary Search method
    {
       int c, first, last, middle, n, search, array[];
 
       Scanner in = new Scanner(System.in); ////Initializing the Scanner class
       System.out.println("Enter number of elements");
       n = in.nextInt(); 
       array = new int[n];
 
       System.out.println("Enter " + n + " integers in Sorted order");
 
 
       for (c = 0; c < n; c++)
    	   array[c] = in.nextInt(); //Accepting the integer values from the user for integer array
 
       System.out.println("Enter value to find");
       search = in.nextInt(); //Accepting the integer values from the user to search inside the array 
       in.close();
       first  = 0;
       last   = n - 1;
       middle = (first + last)/2;
 
       while( first <= last ) //logic for the searching the availablity
       {
    	   if ( array[middle] < search )
    		   first = middle + 1;    
    	   else if ( array[middle] == search ) 
    	   {
    		   System.out.println(search + " found at location " + (middle + 1) + "."); // message for  avialable the search info with location
    		   break;
    	   }
    	   else
    		   last = middle - 1;
 
    	   middle = (first + last)/2;
       }
       if ( first > last )
    	   System.out.println(search + " is not present in the list.\n"); // message for not avialable the search info
    } 
 }
 