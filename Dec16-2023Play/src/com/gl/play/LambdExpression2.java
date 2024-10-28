package com.gl.play;

import java.util.ArrayList;
import java.util.Collections;

public class LambdExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Supplier> suppliers = new ArrayList<Supplier>();
		
		suppliers.add(new Supplier("S001","RKSuppliers","Faridabad",100000));
		suppliers.add(new Supplier("S007","AKSuppliers","Ahmedabad",120000));
		suppliers.add(new Supplier("S005","GKSuppliers","Delhi",240000));
		suppliers.add(new Supplier("S006","CKSuppliers","Bangalore",400000));
		suppliers.add(new Supplier("S002","FKSuppliers","Ernakulam",160000));
		suppliers.add(new Supplier("S004","JKSuppliers","Chandigarh",300000));
		suppliers.add(new Supplier("S003","IKSuppliers","Bombay",130000));
		System.out.println("-------------ID SORTED---------------");
		Collections.sort(suppliers, (s1,s2) -> {return s1.supplierId.compareTo(s2.supplierId);});
		for(Supplier s : suppliers)
		{
			System.out.println(s);
		}
		System.out.println("-------------SUPPLIER SORTED---------------");
		Collections.sort(suppliers, (s1,s2) -> {return s1.supplierName.compareTo(s2.supplierName);});
		for(Supplier s : suppliers)
		{
			System.out.println(s);
		}
		System.out.println("-------------SUPPLIER CITY SORTED---------------");
		Collections.sort(suppliers, (s1,s2) -> {return s1.supplierAddress.compareTo(s2.supplierAddress);});
		for(Supplier s : suppliers)
		{
			System.out.println(s);
		}
		System.out.println("-------------SUPPLY VALUE SORTED---------------");
		
		Collections.sort(suppliers, (s1,s2) -> {return Integer.compare(s1.supplyValue, s2.supplyValue);});
		for(Supplier s : suppliers)
		{
			System.out.println(s);
		}

	}

}
