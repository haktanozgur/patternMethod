package com.haktanozgur.patternMethod;

import java.util.Scanner;

public class patternMethod {
	public static boolean flag = false;
	public static boolean initialInputFlag = false;
	public static int checkNumber = 0;
	
	public static int pattern(int number) {
	
	  // Bu koşulda, program ilk çalıştığı anda tanımlanan checkNumber değeri, girilen ilk değere eşitleniyor	
  	  if(initialInputFlag == false) {
  		  initialInputFlag = true;
		  checkNumber = number;
	  } 
  	  //döngü çalıştığı anda ilk girilen sayıdan -5 azaltarak çalışan döngüde number değeri 0 dan küçük olduğu anda, -5 azaltma döngüsü sona eriyor.
      if (number <= 0 || flag == true) {
      	  if( number > checkNumber ) {
      		  return 0;
      	  }
      	  flag = true;   //tekrar -5 azaltma döngüsü çalışmaması için flag değeri true yapılıyor ve koşulun başına dönderek +5 döngüsü çalışmaya başlıyor
      	  System.out.print(number + ",");
    	  return pattern ((number + 5));
      }
      else {
  		System.out.print(number + ",");
  		return pattern ((number -5));
      }	
		
	}	
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("N Sayısı : ");
		int number = scanner.nextInt();
		
		System.out.println(pattern(number));
	}	

}	



