package week6_String;

import java.util.Scanner;

public class Question56_LaptopConfigurator {

	public static void main(String[] args) {
		// olcay // Jul 6, 2020
		
		/*First ask user for a screen size. If screen size is equals to 13.3, add  $200 to the laptop price.
		 *  If screen size is equals to  15.0 - add  $300 to the laptop price. If screen size is equals to  
		 *  17.3 - add  $400 to the laptop price.Then ask user for CPU type. If CPU type equals to i3, add 
		 *   $150 to the laptop price. If CPU type equals to i5, add  $250 to the laptop price. If CPU type 
		 *   equals to i7, add  $350 to the laptop price. Then ask user for RAM size. Add  $50 for every 4GB 
		 *   of ram to the laptop price. Then, ask user for storage type. There are 2 options: SSD and HDD.
		 *    If it's HDD - add $50 to the laptop price for every 500gb.  If it's SSD - add $100 to the laptop 
		 *    price for every 500GB. Then ask user for for screen resolution. There are 2 options: FULLHD and 4K.
		 *     Add $100 if it's FULLHD screen and $200 if it's 4K screen.
		 */
		
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		int memorySize=0;
		Scanner scan = new Scanner(System.in);
    
    System.out.print("Select screen size(13.3,15.0 or 17.3): ");
    screenType = scan.nextLine();
    
    if(screenType.equals("13.3")){
      price+=200;
    }else if(screenType.equals("15.0")){
      price+=300;
    }else if(screenType.equals("17.3")) {
    	price+=400;
    }
    
    System.out.print("Select CPU type(i3, i5 or i7): ");
    cpu=scan.nextLine();
    if(cpu.equals("i3")) {
    	price+=150;
    }else if(cpu.equals("i5")) {
    	price+=250;
    	
    }else if(cpu.equals("i7")) {
    	price+=350;
    }
    
    System.out.print("Select RAM size: ");
    ram=scan.nextInt();    
    price=price+(ram/4*50);
    
    
    System.out.print("Select storage type(SSD or HDD): ");
    storageType=scan.next();
    
    System.out.print("Enter memory size(500, 1000, ...) ");        
    memorySize=scan.nextInt();
    
    if(storageType.equals("HDD")) {
    	price=price+(memorySize/500*50);
    }else if(storageType.equals("SSD")) {
    	price=price+(memorySize/500*100);
    }
    
    System.out.print("Enter screen resolution: ");
    screenType=scan.next();
    
    if(screenType.equals("FULLHD")) {
    	price+=100;
    }else if(screenType.equals("4K")) {
    	price+=200;
    }
		
		
    System.out.println("Laptop price is: " + price);	
		
	}

}
