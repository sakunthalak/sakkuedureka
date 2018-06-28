package day4;

import java.util.Random;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		 	int[][] twoDim =	new int[10][10];
		 	for (int i=0;i<10;i++) {
		 		for (int j=0;j<10;j++)
		 		{
		 			twoDim[i][j]=rand.nextInt(10);
		 		}
		 	}

	}
	

}
