package com.Aseem.JavaStarter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[1];
		array[0] = 10;

		Person person = new Person("Aseem","Sharma",31);
		person.setLastName("Sharmaji");
		person.setAge(32);
		person.writeName();
		System.out.println(person.toString());
		//for(int i : array)
		for(int i=0; i<array.length;i++)
		{
			System.out.println("At position "+i+" value is: "+array[i]);
		}
	}

}
