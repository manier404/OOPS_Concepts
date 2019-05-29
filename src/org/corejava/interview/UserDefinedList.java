package org.corejava.interview;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList {
	public static void main(String[] args) {
		List<POJO> li = new ArrayList<POJO>();
		
		POJO po = new POJO();
		po.setId(8204);
		po.setName("Manivannan");
		po.setPhone(9894738299l);
		
		POJO po1 = new POJO();
		po1.setId(8211);
		po1.setName("Jaffer");
		po1.setPhone(9453453493l);
		
		li.add(po);
		li.add(po1);
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println("ID is "+li.get(i).getId());
			System.out.println("Name is "+li.get(i).getName());
			System.out.println("Phone is "+li.get(i).getPhone());
		}
		
	}
}
