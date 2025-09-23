
package com.tnsif.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int[][] num = {{1,2,3},{4,5},{6,7}};
		
	//======================================
		for(int[] x : num)  //Enhanced loop / for each
		{
			for(int y : x)
			{
				System.out.print(y+" " );
			}
			System.out.println();
		}

	}

}
