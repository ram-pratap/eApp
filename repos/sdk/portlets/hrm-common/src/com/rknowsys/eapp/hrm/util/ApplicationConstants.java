package com.rknowsys.eapp.hrm.util;

import java.util.ArrayList;
import java.util.List;

public class ApplicationConstants {

	public static final List<IdNamePair> months=new ArrayList<IdNamePair>();
	static {
		months.add(new IdNamePair("0","January"));
		months.add(new IdNamePair("1","February"));
		months.add(new IdNamePair("2","March"));
		months.add(new IdNamePair("3","April"));
		months.add(new IdNamePair("4","May"));
		months.add(new IdNamePair("5","June"));
		months.add(new IdNamePair("6","July"));
		months.add(new IdNamePair("7", "August"));
		months.add(new IdNamePair("8","September"));
		months.add(new IdNamePair("9","October"));
		months.add(new IdNamePair("10","November"));
		months.add(new IdNamePair("11","December"));
	}
	
}
