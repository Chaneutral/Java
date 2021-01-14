package io4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.keroro.store.Menu;
import org.keroro.store.OrderItem;

import com.google.gson.Gson;

public class DataServer {

	//bad code
	public static void main(String[] args)throws Exception {
		
		ServerSocket server = new ServerSocket(5555);
		
		System.out.println("ready........");
		
		while(true) {
			
			Socket socket = server.accept();
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			String str = din.readUTF();
			System.out.println("°í°´ÀÇ ¹®ÀÚ¿­");
			System.out.println(str);
			
			Gson gsonMsg = new Gson();
			
			Map<String, Object> map = gsonMsg.fromJson(str, HashMap.class);
			
			System.out.println("----------------------------------");
			System.out.println(map);
			
			System.out.println("2-------------------------------------");
			ArrayList<OrderItem> orderList = (ArrayList<OrderItem>)map.get("order");
			System.out.println(orderList);
			
			System.out.println("3-----------------------------------");
			
			
			
			
			List<Menu> menuList = new ArrayList<>();
			menuList.add(new Menu("ºò¸Æ",5000));
			menuList.add(new Menu("1ºò¸Æ",1000));
			menuList.add(new Menu("2ºò¸Æ",4000));
			menuList.add(new Menu("3ºò¸Æ",5000));
			
			Gson gson = new Gson();
			String jsonStr = gson.toJson(menuList);
			
			//System.out.println(jsonStr);
			
			dos.writeUTF(jsonStr);
			
			din.close();
			socket.close();
		}//end while
	}
}