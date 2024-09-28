import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class 餐廳點餐範例 {
	
	static public void AddHashTable(Hashtable<String, Integer> EX1){
        EX1.put("A meal",100);
        EX1.put("B meal", 80);
        EX1.put("C meal",200);
        EX1.put("D meal", 50);
    }
	static public void AddHashMap(HashMap<String, Integer> order){
        order.put("A meal",null);
        order.put("B meal",null);
        order.put("C meal",null);
        order.put("D meal", null);
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
		menu.add("A meal 100元");
		menu.add("B meal 80元");
		menu.add("C meal 200元");
		menu.add("D meal 50元");
		
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
