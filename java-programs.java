import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Please type any number form the list below to run that program"+ "\n"+ "Or Type 0 to exit!"+ "\n");
		
		Scanner input = new Scanner(System.in);
		System.out.println("0: Exit");
		System.out.println("1: Program of printing numbers from 1 to 10");
		System.out.println("2: Program of printing sum of 1st 10 natural numbers");
		System.out.println("3: Program of printing the table of entered number");
		System.out.println("4: Program of finding of a factorial of a given number");
		System.out.println("5: Program to print the exponent");
		System.out.println("6: Program to reverse a number");
		System.out.println("7: Program of sum of even and odd numbers");
		System.out.println("8: Program to check the number is prime or not");
		System.out.println("9: Program to find hcf of two numbers"); 
		System.out.println("10: Program of taking input of two numbers and add them until the user wants");
		System.out.println("11: Take the user's input until the user want and display the count of positive, negative and zeros entered.");
        System.out.println("12: Program to check Armstrong Number");
        
		int program = input.nextInt();
	
		
		switch(program){
		case 0:
		    System.out.println("You have exited");
		    return;
		
		case 1:
		
    		System.out.println("1: Program of printing numbers from 1 to 10");
    		int i = 1;
    		for(i=1;i<=10;i++){
    		    System.out.println(i);
    		}
    		break;
		
		case 2:
		    
    		System.out.println("2: Program of printing sum of 1st 10 natural numbers");
    		int j = 0;
    		int sum = 0;
    		
    		for(j=0;j<=10;j++){
    		    sum += j;
    		}
    		System.out.println(sum);
    		break;
		
		case 3:
		    
		System.out.println("3: Program of printing the table of entered number");
		
    		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter a positive number");
    		int n = sc.nextInt();
    		for(int k=1;k<=10;k++){
    		    System.out.println(n+" x "+k+" = "+n*k);
    		}
    		break;
		
		case 4:
		    System.out.println("4:Program of finding of a factorial of a given number");
		    Scanner s = new Scanner(System.in);
		    int num;
		    int fact = 1;
		    System.out.println("Enter a number");
		    num = s.nextInt();
		
		    for(int z=1;z<=num; z++){
		        fact *= z;
		    }
		    System.out.println("factorial of "+ num + " is "+ fact);
		    break;
		    
		
		case 5:
		    System.out.println("Program to print the exponent");
		    Scanner c = new Scanner(System.in);
		    int number;
		    int power;
		    int result = 1;
		    System.out.println("Enter the number");
		    number = c.nextInt();
		    
		    System.out.println("Enter the power");
		    power = c.nextInt();
		    
		    for(int y=1; y<=power;y++){
		        result *= number;
		    }
		    System.out.println("Result "+ result);
		    
		    break;
		    
		    
        case 6:
            System.out.println("Program to reverse a number");
            
            System.out.println("Enter the number to be reversed");
            
            int m;
            int remainder;
            int reverse = 0;
            
            Scanner r = new Scanner(System.in);
            m = r.nextInt();
            
            while(m!=0){
                remainder = m%10;
                reverse = (reverse*10)+remainder;
                m = m/10;
            }
            System.out.println("Reversed number is "+ reverse);
		    
		    break;
		    
		case 7:
		    System.out.println("Program of sum of even and odd numbers");
		    
		    int numb;
    		char option;
    		int esum = 0;
    		int osum = 0;
    		Scanner op = new Scanner(System.in);
    		do{
    		    System.out.println("Enter the number");
    		    numb = op.nextInt();
    		    
    		    if(numb%2 == 0){
    		        esum += numb;
    		    }else{
    		        osum += numb;
    		    }
    		    System.out.println("Do you want to continue: y/n");
    		    option = op.next().charAt(0);
    		    }while(option == 'y' || option == 'Y');
    		    
    		    System.out.println("Sum of even numbers is "+esum);
    		    System.out.println("Sum of odd numbers is "+osum);
    		    
    		    break;
    		    
    	case 8:
    	    System.out.println("Program to check the number is prime or not");
    		int p, l;
            boolean flag = false;
        		
        	System.out.println("Enter a number");
        	Scanner q = new Scanner(System.in);
        	p = q.nextInt();
        		
        		
        	if(p == 0 || p ==1){
        		System.out.println("not prime");
        	}else{
        	for(l=2;l<=p/2;l++){
        		        if(p%l == 0){
        		            flag = true;
        		            break;
        		        }else{
        		            flag = false;
        		        }
        		    }
        		}if(!flag){
        		    System.out.println("Prime");
        		}else{
        		    System.out.println("Not prime");
        		}
        		
        	break;
        case 9:
             System.out.println("Program to find hcf of two numbers");  
             int a, b;
    		 int hcf = 1;
    		 
    		 System.out.println("Enter two numbers");
    		 Scanner st = new Scanner(System.in);
    		 a = st.nextInt();
    		 b = st.nextInt();
    		 
    		 for(int u=1; u<=a || u<=b;u++){
    		     if(a%u == 0 && b%u == 0){
    		         hcf = u;
    		     }
    		     
    		 }System.out.println("HCF is "+ hcf);
    		 break;
    		 
    		 
    	case 10:
    	     
    	     System.out.println("Program of taking input of two numbers and add them until the user wants");
    	     
    	     int A,B,D;
    		 char C;
    		 
    		 do{
    		 System.out.println("Enter two numbers");
    		 Scanner SC = new Scanner(System.in);
    		 A = SC.nextInt();
    		 B = SC.nextInt();
    		 D = A+B;
    		 System.out.println("Sum is "+ D);
    		 System.out.println("Do you wish to continue y/n");
    		 C = SC.next().charAt(0);
    		 }while(C == 'y' || C == 'Y');
    		 
    		 break;
    	    
    	    
    	case 11:
    	 
    	 System.out.println("Take the user's input until the user want and display the count of positive, negative and zeros entered.");   
    	 int e;
		 char ch;
		 int count_p = 0;
		 int count_n = 0;
		 int count_z = 0;
		 
		 do{
		     System.out.println("Enter the numbers");
		     Scanner uv = new Scanner(System.in);
		     e = uv.nextInt();
		     
		     if(e>0){
		         count_p++;
		     }
		     if(e<0){
		         count_n++;
		     }
		     if(e==0){
		         count_z++;
		     }
		     System.out.println("Do you want to continue (y/n)");
		     ch = uv.next().charAt(0);
    		 }while(ch == 'y' || ch == 'Y');
    		 
    		 System.out.println("Number of positive numbers: "+count_p);
    		 System.out.println("Number of negative numbers: "+count_n);
    		 System.out.println("Number of zeros: "+count_z);
    		 
    		 break;
    		 
    	case 12:
    	    System.out.println("Program to check Armstrong Number");
    	    System.out.println("Enter a number");
    		Scanner rs = new Scanner(System.in);
    		int numberr = rs.nextInt();
    		int on, rem, rresult = 0, nm = 0;
    		
    		on = numberr;
    		
    		for(; on != 0; on /= 10, ++nm){
    		    
    		}
    		on = numberr;
    		
    		for( ;on != 0; on /= 10){
    		    rem = on%10;
    		    int pd = 1;
    		    for(int ij=0;ij<nm;ij++){
    		        pd *= rem;
    		    }
    		    rresult += pd;
    		}
    		if(rresult == numberr){
    		    System.out.println(numberr+" is an Armstrong Number");
    		}else{
    		    System.out.println(numberr+" is not an Armstrong Number");
    		}
    	    
    	    break;
    		    
		default:
		    System.out.println("Please enter number within the range");
		} 
		   
    }
}
