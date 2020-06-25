/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class P2q1 {
    public static void displaySquareRoot (int max){
	
		for (int x=0; x<=max; x+=2){
			System.out.printf("%d \t %.4f\n",x,Math.sqrt(x)); 
		}
	}
     
    public static void main(String[]args){
    	displaySquareRoot(20);
    }
}
