package io4;

import java.util.ArrayList;

import org.keroro.store.Menu;
import org.keroro.store.Order;
import org.keroro.store.OrderItem;

import com.google.gson.Gson;

public class OrderTest {

	//bad code
	public static void main(String[] args)throws Exception {
		
		Order order = new Order();
		
		OrderItem item1 = new OrderItem(new Menu("AAA",1000),3);
		ArrayList<OrderItem> itemList =new ArrayList<>();
		itemList.add(item1);
		
		order.setItem(itemList);
		
		System.out.println(order);

		Gson gson = new Gson();
		
		String str = gson.toJson(order);
		
		System.out.println(str);
		
		System.out.println(gson.fromJson(str, Order.class));
		
	}
	
}
