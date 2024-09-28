package java期末報告;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class 餐廳點餐範例 {
	
	static public void AddHashTable(Hashtable<String, Integer> EX1){
        EX1.put("心痛的滋味",100);
        EX1.put("鍋燒意麵", 80);
        EX1.put("生命之水",200);
        EX1.put("紅龜粿", 50);
    }
	static public void AddHashMap(HashMap<String, Integer> order){
        order.put("心痛的滋味",null);
        order.put("鍋燒意麵",null);
        order.put("生命之水",null);
        order.put("紅龜粿", null);
    }
	
	public static void main(String[] args) {
		int sum = 0;
		String trash;
		
		Scanner sc = new Scanner(System.in);
		
		Hashtable<String, Integer> EX1 = new Hashtable<String, Integer>();
		HashMap<String,Integer> order = new HashMap<String,Integer>();
		AddHashTable(EX1);
		AddHashMap(order);
		
		HashSet<String> menu = new HashSet<String>();
		menu.add("心痛的滋味 100元");
		menu.add("鍋燒意麵 80元");
		menu.add("生命之水 200元");
		menu.add("紅龜粿 50元");
		
		System.out.println("歡迎來到 ㄤ菇桂專賣店");
		System.out.println("菜單:" + menu);
		
		while(true) {
			System.out.println("想要點什麼? 注:若已點完餐點請打END");
		    String orderDishes = sc.nextLine();
		    
		    if(EX1.get(orderDishes) == null && orderDishes.equals("END") == false){
		        System.out.println("沒有這個餐點,請重新選擇");
		        continue;
		    }
		    else if(orderDishes.equals("END")){
		        System.out.print("總計點了: ");
		        for(String i : order.keySet()){
		            if(order.get(i) != null)
		                System.out.print(i+" "+order.get(i)+"份, ");
		        }
		        System.out.println("總額:"+sum);
		        break;
		    }
		    
		    System.out.println("想要點幾份?");
		    Integer number = sc.nextInt();
		    trash = sc.nextLine();
		    order.replace(orderDishes,number);
		    sum += EX1.get(orderDishes) * number;
		    
		    
		}
		
		System.out.println();
		sum = 0;
		sc.close();
	}
}