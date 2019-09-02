package miscellaneous;
import java.util.Scanner;
public class console {
	public static void makeRectangle(Scanner scnr) {
		System.out.println("Enter Length: ");
		int length = scnr.nextInt();
		int width =0;
		while(true) {
			System.out.println("Enter Width: ");
			width = scnr.nextInt();
			if(width<=0 || width>80) {
				System.out.println("Invalid Width(max->80)");
				continue;
			}
			else {
				break;
			}
			
		}
		
		System.out.println("Enter fill character: ");
		char c = scnr.next().charAt(0);
		System.out.println("Fill or not fill(y/n): ");
		String f = scnr.next();
		if(f.equals("y")) {
			printRectangle(length,width,c,false);
		}
		else {
			printRectangle(length,width,c,true);
		}
		
	}
	
	public static void printRectangleLine(int size, char fillChar, Boolean hollow) {
		if(!hollow) {
			for(int i=0;i<size;i++) {
				System.out.print(fillChar);
			}
			System.out.println();
		}
		else {
			for(int i=0;i<size;i++) {
				if(i==0 || i==size-1) {
					System.out.print(fillChar);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static void printRectangle(int length, int width, char fillChar, Boolean hollow) {
		if(hollow) {
			for(int j=0;j<length;j++) {
				if(j==0 || j==length-1) {
					printRectangleLine(width,fillChar,!hollow);
				}
				else {
					printRectangleLine(width,fillChar,hollow);
				}
				
			}
			
		}
		else {
			for(int j=0;j<length;j++) {
				printRectangleLine(width,fillChar,hollow);
			}
		}
	}
	
	
	
	static void makeTriangle(Scanner scnr) {
		int width=0;
		while(true) {
			System.out.println("Enter Width: ");
			width = scnr.nextInt();
			if(width<=0 || width>80) {
				System.out.println("Invalid Width(max->80)");
				continue;
			}
			else {
				break;
			}
			
		}
		printTriangle(width);
	}
	
	public static void printTriangle(int width) {
		for(int i=1;i<width;i++)
	     {
	         for(int j=i;j<width;j++)
	         {
	             System.out.print(" ");
	         }
	         for(int j=1;j<=(2*i-1);j++)
	         {
	        	 if(j==1) {
	        		 System.out.print("/");
	        	 }
	        	 if(j==(2*i)-1) {
	        		 System.out.print("\\");
	        	 }
	        	 else {
	        		 System.out.print(" ");
	        	 }
	             
	         }
	         System.out.println("");
	     }
		for(int i=0;i<width*2;i++) {
			System.out.print("_");
		}
	}
	
	static void printDiamond(Scanner scnr) {
		int size =0;
		while(true) {
			System.out.println("Enter size: ");
			size = scnr.nextInt();
			if(size<=0 || size>80) {
				System.out.println("Invalid size(max->80)");
				continue;
			}
			else {
				break;
			}
		}
		System.out.println("Enter edge char: ");
		char echar = scnr.next().charAt(0);
		System.out.println("Enter fill char: ");
		char fillchar = scnr.next().charAt(0);
		printDiamond(size,echar,fillchar);
	}
	
	public static void printNChars(int n, char c){
		for(int i=0;i<n;i++) {
			System.out.print(c);
		}		
	}
	
	public static void printDiamond(int size, char edgeChar, char fillChar) {
		int i,j;
		int space=size-1;
		for (j = 1; j <= size; j++) 
        {
			printNChars(space,' ');
            space--;
            System.out.print(edgeChar);
            printNChars(2*j-3,fillChar);
            if(2*j-3!=-1) {
            	System.out.print(edgeChar);
            }
            
            System.out.println("");
        }
        space = 1;
        for (j = 1; j <= size - 1; j++) 
        {
        	printNChars(space,' ');
            space++;
            System.out.print(edgeChar);
            printNChars(2*(size-j)-3,fillChar);
            if(2*(size-j)-3!=-1) {
            	System.out.print(edgeChar);
            }
            
            System.out.println("");
        }
	}
	
	static void printPattern(Scanner scnr) {
		int num1=0,num2=0;
		String asc="";
		while(true) {
			System.out.println("Enter num1: ");
			num1 = scnr.nextInt();
			if(num1<0 || num1>9) {
				System.out.println("Invalid value! Must be between 0-9(inclusive).\nEnter again:");
				continue;
			}
			break;
		}
		while(true) {
			System.out.println("Enter num2: ");
			num2 = scnr.nextInt();
			if(num2<0 || num2>9) {
				System.out.println("Invalid value! Must be between 0-9(inclusive).\nEnter again:");
				continue;
			}
			break;
		}
		if(num1>num2) {
			int temp=num1;
			num1=num2;
			num2=temp;
		}
		while(true) {
			System.out.println("Ascending triangle?(y/n):");
			asc = scnr.next();
			if(asc.equals("y") || asc.equals("n")) {
				break;
			}
			else {
				System.out.println("Invalid Input.Enter either y or n: ");
				continue;
			}
		}
			
		if(asc.equals("y")) {
			printPattern(num1,num2,true);
		}
		else {
			printPattern(num1,num2,false);
		}
		
		
	}
	
	public static void printPattern(int num1, int num2, Boolean ascending) {
		if(ascending) {
			int c=0;
			for(int i=num1;i<=num2;i++) {
				for(int j=num2;j>=num2-c;j--) {
					System.out.print(j+" ");
				}
				c+=1;
				System.out.println();
			}
		}
		else {
			int c=0;
			for(int i=num2;i>=num1;i--) {
				for(int k=0;k<c;k++) {
					System.out.print(" ");
				}
				for(int j=num2-c;j>=num1;j--) {
					System.out.print(j+" ");
				}
				System.out.println();
				c+=1;
			}
			
		}
		
	}

	static void printMenu() {
		System.out.println("Please select one of the following options : ");
		System.out.println("0.Exit");
		System.out.println("1.Print a Rectangle");
		System.out.println("2.Print a Triangle");
		System.out.println("3.Print a Diamond");
		System.out.println("4.Print a Pattern");
	}
	static void getMenuSelection() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			printMenu();
			int choice = sc.nextInt();
			
			if(choice==0) {
				System.out.println("Thank you for using this program, Good bye!");
				break;
			}
			if(choice==1) {
				makeRectangle(sc);
				continue;
			}
			if(choice==2) {
				makeTriangle(sc);
				System.out.println();
				continue;
			}
			if(choice==3) {
				printDiamond(sc);
				continue;
			}
			if(choice==4) {
				printPattern(sc);
				continue;
			}
			else {
				System.out.println("Incorrect selection!Please try again.");
				continue;
			}
				
		}
	}

	public static void main(String[] args) {
		System.out.println("Project :Developed by PRANAV BANSAL");
		getMenuSelection();

	}

}
