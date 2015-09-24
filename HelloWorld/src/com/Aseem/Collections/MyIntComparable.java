package com.Aseem.Collections;

import java.util.Comparator;

public class MyIntComparable implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return (arg0>arg1 ? -1 : arg0==arg1 ? 0 : 1);
	}
	
}
