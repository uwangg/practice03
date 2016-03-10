package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int price = sc.nextInt();
		int pr = price;
		
		int arrValue[] = {50000,10000,5000,1000,500,100,50,10,1};
		int arrCnt[] = new int[10];
		
		for(int i=0 ; i<9 ; i++)
		{
			for(int j=0 ; j<(pr/arrValue[i]) ; j++)
				arrCnt[i]++;
//			System.out.println("price = "+price);
			price %= arrValue[i];
			pr = price;
		}
		
		System.out.println("오만 원권 : "+arrCnt[0]+"매");
		System.out.println("만 원권: "+arrCnt[1]+"매");
		System.out.println("오천 원권: "+arrCnt[2]+"매");
		System.out.println("천 원권: "+arrCnt[3]+"매");
		System.out.println("500원 동전: "+arrCnt[4]+"개");
		System.out.println("100원 동전: "+arrCnt[5]+"개");
		System.out.println("50원 동전: "+arrCnt[6]+"개");
		System.out.println("10원 동전: "+arrCnt[7]+"개");
		System.out.println("1원 동전: "+arrCnt[8]+"개");
	}
}

