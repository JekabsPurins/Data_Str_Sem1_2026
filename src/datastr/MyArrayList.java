package datastr;

public class MyArrayList {
	
	private char[] list;
	private int howManyElements = 0;
	private final int DEFAULT_SIZE = 8;
	private int size = DEFAULT_SIZE;
	
	
	public MyArrayList() {
		list = new char[size];
	}
	
	
	public MyArrayList(int inputSize) {
		if(inputSize > 0 && inputSize < 100000) {
			size = inputSize;
		}		
		list = new char[size];
	}
	
	
	
	public boolean isEmpty() {
		//longe pieraksts
		/*
		if(howManyElements == 0) {
			return true;
		}
		else {
			return false;
		}
		*/
		
		//if-else
		//return (howManyElements == 0 ? true : false);
		
		//ar atgrizto vert
		return (howManyElements == 0);
				
	}
	
	private boolean isFull() {
		if(size == howManyElements) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	
	
	
	
}
