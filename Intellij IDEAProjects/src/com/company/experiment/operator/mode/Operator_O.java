package com.company.experiment.operator.mode;

import java.util.Scanner;


public class Operator_O {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("input left:");
		int left = scanner.nextInt();
		System.out.print("input right:");
		int right = scanner.nextInt();
		System.out.print("Please choose +-*/ :");
		String op = scanner.next().trim();
		int result=0;
		if (op.equals("+")) {
			result = left+right;
			System.out.println(left+op+right+"="+result);
		}else if(op.equals("-")){
			result = left-right;
			System.out.println(left+op+right+"="+result);
		}else if (op.equals("*")) {
			result = left*right;
			System.out.println(left+op+right+"="+result);
		}else if(op.equals("/")){
			if (right != 0 ) {
				result = left/right;
				System.out.println(left+op+right+"="+result);
			}else {
				System.out.println("被除数不能为0!");
			}
		}
	}
}
