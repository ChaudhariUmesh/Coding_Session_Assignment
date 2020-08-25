package Que1;
import java .util.*;
public class Operation {
	/*There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
	Book { int bookid , String author , float price } 
	
	There is also a hashmap which contains information about business done by each book.
	
	Map<int bookid , float amount> Map already has information about all books and business
	done till now.
	 You can take hardcoded values in map.
	 
	 Write a program to update map using
	new information in given arrayList. If book is present in map calculate its business amount (price
	* copiessold) and add to existing amount in map. If book is not present add its entry in map
*/
	public static void main(String[] args) {
		//Book class obj
		Book bookobj1= new Book(101, "Mr.Chavan", 900.10f);
		Book bookobj2= new Book(102, "Mr.Dornado",1000.10f);
		Book bookobj3= new Book(103, "Mr.vangalu", 500.10f);
		Book bookobj4= new Book(104, "Mr.Chowgule", 300.10f);
		Book bookobj5= new Book(105, "Ms.gayli", 550);
		Book bookobj6= new Book(106, "Mr.Sahaebrav", 900);
		Book bookobj7= new Book(107, "Mr.Patil", 650.10f);
	//booksale class obj	
		Booksale booksaleobj1=new Booksale(bookobj1,60);
		Booksale booksaleobj2=new Booksale(bookobj2,45);
		Booksale booksaleobj3=new Booksale(bookobj3,110);
		Booksale booksaleobj4=new Booksale(bookobj4,2);
		Booksale booksaleobj5=new Booksale(bookobj5,8);
		Booksale booksaleobj6=new Booksale(bookobj6,10);
		Booksale booksaleobj7=new Booksale(bookobj7,10);
	//creating booksale arraylist	
		ArrayList<Booksale> booksaleArrayList=new ArrayList();
		booksaleArrayList.add(booksaleobj1);
		booksaleArrayList.add(booksaleobj2);
		booksaleArrayList.add(booksaleobj3);
		booksaleArrayList.add(booksaleobj4);
		booksaleArrayList.add(booksaleobj5);
		booksaleArrayList.add(booksaleobj6);
		booksaleArrayList.add(booksaleobj7);
	//creating hasmap for bookbusiness
		HashMap<Integer ,Float> bookBusinessMap=new HashMap();
		bookBusinessMap.put(bookobj1.bookid, 50000.10f);
		bookBusinessMap.put(102, 45000.10f);
		bookBusinessMap.put(103, 55000.10f);
		bookBusinessMap.put(104, 500.10f);
		bookBusinessMap.put(105, 4000.10f);
		bookBusinessMap.put(106, 6000.10f);
		System.out.println("before iterating arraylist map is");
		System.out.println(bookBusinessMap);
	//actual logic to calculate book business
		Set s=bookBusinessMap.entrySet();
		Iterator itr=s.iterator();
		for(int i=0;i<booksaleArrayList.size();i++)
		{
		   int temp_bookid=booksaleArrayList.get(i).b.bookid;
		   if(bookBusinessMap.containsKey(temp_bookid))
		   {
			  Float value=booksaleArrayList.get(i).copiesSold*booksaleArrayList.get(i).b.price;
			  bookBusinessMap.put(temp_bookid,(bookBusinessMap.get(temp_bookid)+value));
		   }
		   else
		   {
			   float value=booksaleArrayList.get(i).copiesSold*booksaleArrayList.get(i).b.price;
			   bookBusinessMap.put(temp_bookid, value);
		   }
		}
		  System.out.println("after iterating...");
		  System.out.println(bookBusinessMap);
	}

}
