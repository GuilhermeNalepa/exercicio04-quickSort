package view;

import controller.QuickSort;

public class Principal {

	public static void main(String[] args) {

		int[] vt = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		QuickSort qs = new QuickSort();
		vt = qs.ordena(vt, 0, vt.length - 1);
		
		for (int i : vt) {
			
			System.out.print(i + " ");
		
		}
		
	}

}
