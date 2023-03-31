package ATM;
import java.util.Scanner;

public class ATM {
	public static void main(String args[] )  
    {  
        
        int balance = 100000, withdraw, deposit,transfer;
        int T_date=21/12/2002; 
        int acc_no= 8910;
        int T_id=213451;
          
        
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("ATM");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for Transfer");
            System.out.println("Choose 5 for Transaction History");
            System.out.println("Choose 6 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
             
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:
                	System.out.print("Enter money to be withdrawn:");  
                    withdraw = sc.nextInt();
                    if(balance >= withdraw)
                    {  
                    	balance = balance - withdraw;
                    	System.out.println("Please collect your money");  
                    }  
        
                     
                    else  
                    {  
                    	System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
   
                case 2:  
                      
                    System.out.print("Enter money to be deposited:");  
                    
                    deposit = sc.nextInt();  
                     
                    balance = balance + deposit;  
                    System.out.println("Your Money has been successfully depsited");  
                    System.out.println("");  
                    break;  
   
                case 3:  
         
                    System.out.println("Balance : "+balance);  
                    System.out.println("");  
                    break;  
                    
                    
                case 4:
                	
                	System.out.print("Enter money to be transfer:");  
                    transfer = sc.nextInt();
                    if(balance >= transfer)
                    {  
                    	balance = balance - transfer;
                    	 
                        System.out.println("Enter account number for transaction: ");
                        acc_no=sc.nextInt();
                        if(acc_no!=8910)
                        {
                        	System.out.println("your account number is not valid. Please enter valid account number for transaction:");
                        }
                        else
                        {
                        	System.out.println("Your money has been successfully transfered");
                        }

                    } 
                    else  
                    {  
                    	System.out.println("Insufficient Balance");  
                    }  
                    System.out.println("");  
                    break;  
                    
                case 5:
                	System.out.println("Balance before transaction:"+balance);
                	System.out.println("Transaction date:"+T_date);
                	System.out.println("Transaction ID:"+T_id);
                	System.out.println("Balance after transaction:\n 1.Deposit \n 2.Withdraw \n 3.Transfer");
                	
                	
                	
                	

   
                case 6:  
        
                    System.exit(0);  
            }  
        }  
    }  

}
