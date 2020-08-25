package Q11;

public class Order {

	/*
	 * Hotel serves delicious Menus to its Customers.
	 *  It maintains list of Orders
	 * given on daily basis. 
	 * Order list is maintained as ArrayList<Order>. 
	 * Each Order contains orderid, MenuName, price, qtyOrdered. 
	 * (Price of same Menu may
	 * vary according hours). 
	 * 
	 * Eg. Order List for a day is :
	 * 
	 * [(80,”Pav Bhajee”,120.00,5), (90,”Grilled Sandwitch”,72.00,10), (92,”Hakka
	 * Noodles”,220.00,2), (96,”Pav Bhajee”,125.00,8), (101,”Grilled
	 * Sandwitch”,70.00,2)]
	 *
	 * Then Map would be like this : {{“Pav Bhajee”,(120*5)+(125*8) ie.1600},
	 * {“Hakka Noodles”, 440}, {“Grilled Sandwitch”,860}}
	 */
	int Oid;
	String MenuName;
	float price;
	int qtyOrdered;
	public Order(int oid, String menuName, float price, int qtyOrdered) {
		Oid = oid;
		MenuName = menuName;
		this.price = price;
		this.qtyOrdered = qtyOrdered;
	}
	
}
