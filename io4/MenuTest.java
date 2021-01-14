package io4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.keroro.store.FakeMenu;
import org.keroro.store.Menu;

import com.google.gson.Gson;

public class MenuTest {

	
	public static void main(String[] args)throws Exception {
		
		List<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu("∫Ú∏∆",5000));
		menuList.add(new Menu("ƒ›∂Û",1000));
		menuList.add(new Menu("ªÛ«œ¿Ã",4000));
		menuList.add(new Menu("∞®∆¢",3000));
		
		Gson gson = new Gson();
		String jsonStr = gson.toJson(menuList);
		
		System.out.println(jsonStr);
		
		FakeMenu[] arr = gson.fromJson(jsonStr, FakeMenu[].class);
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}

