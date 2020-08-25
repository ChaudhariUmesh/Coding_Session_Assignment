package Que5;

import java.util.Arrays;

public class Customer   implements Comparable<Customer> {
	/*
	 * Assume that there is already aarraylist of Customer objects. Customer {
	 * intcid , String name , int[] items }. 
	 * 
	 * Write a program which creates hashset of customer objects. 
	 * If there are multiple customer object for same customer
	 * in arraylist ,then items should be added to previous customer’s items.
	                                                                                            
	Once set is created sort that set based on no. of items purchased by that customer.
	Customer with maximum items should be first. */   
	int cid;
	String name;
	 String Items [];
	Customer( int cid,String name, String []a)
	{ 
		this.cid=cid;
		this.name=name;
		Items=a;
	}
void display()
{
	System.out.println("Customer name : "+name);
	System.out.println(" id : "+ cid);
	for( int i=0;i<Items.length;i++)
	{
		System.out.println(Items[i]);
	}
}
public String toString() {
	return " \nCustomer id :"+cid+
			"\n name :"+name+
			"\n Items :"+(Arrays.toString(Items))+
	("\n__________________________");
}
@Override
public int compareTo(Customer o) {
	if(this.Items.equals(o.Items))
	   return 1;
	else if(!this.Items.equals(o.Items))
		return -1;
	else
	return 0;
}
}
