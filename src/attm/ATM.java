
package attm;
import java.util.Scanner;
public class ATM 
{

   
	
 int balance=0;
 private final int cardNum = 5469;
 String[] history = new String[5];
 public int i =0;
 Scanner r= new Scanner(System.in);
	
   
   public boolean check (int cardNumber)
{
    
	if (cardNumber == cardNum)
	{
		return true ;
	}
	else 
		return false;
}






/*public void menu()
{ 
	
	Scanner S;
     S = new Scanner(System.in);
	boolean session=true;
	      
	        int n;
		     while(session) 
		     {
	            System.out.println("***welcome to ATM***");
	            
	            System.out.println("please Choose 1 for Withdraw");
	            
	            System.out.println("please Choose 2 for Deposit");
	            
	            System.out.println("please Choose 3 for Check Balance");
	            
	            System.out.println("please Choose 4 for EXIT");
	            
	            System.out.println();
	            
	            System.out.print("Choose the operation you want to perform:"); 
	            
	            n = S.nextInt();
	            
	            if(n<1||n>4)
	            	
	            {	System.out.println("pleast insery from 1 to 5");}
	            
	            
	            switch(n)
	            {
	                case 1: 
	               int amount;
	               amount=S.nextInt();
	               if(balance >= amount)
	               {
	            	    withdraw(amount);
	            	    System.out.println("here is your money");
	               }
	               else 
	               {
	            	   System.out.println("Insufficient Balance!");
	               }
	              
	            
	               menu();    	
	                break;
	 
	                case 2:
	                int amount1;

	               System.out.print("Enter money to be deposited:");
	    	       amount1=S.nextInt();
	               deposit(amount1);
	               System.out.println("Your Money has been successfully deposited");
	                	
	                menu();
	                break;
	 
	                case 3:
	               checkBalance();
	              
	              menu();
	                break;
	                
	                case 4:
	                	session=false;
	                	break;
	               
	                	
	              
	                }
	            
	            
		     }
}*/

public  void withdraw (int withdraw)
{		

        balance = balance - withdraw;
        history[i]="withdraw = "+withdraw;
      i++;
     

  
}


public void deposit(int deposit)
{
	
    balance = balance + deposit;
    history[i]="deposit = "+deposit;
    i++;
    
	
}  


public void checkBalance()
{
	//System.out.println("Balance is "+balance);
history[i]="balance = "+balance;
      i++;
	
}

public String[] returnHistory ()
{
	return history;
}

public int returnI ()
{
	return i;
}

public int increaseI ()
{
	i++;
      return i;
}

public int decreaseI ()
{
	i--;
	return i ;
}
	
}

    

