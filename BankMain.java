package Bank;

import java.util.*;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account[] a_arr=new Account [1];
//		ArrayList<Account> list=new ArrayList<>();
	//	Account[] a_arr=new Account [5];
		System.out.println("*************************************************");
		System.out.println("1.Open Account ::");
		System.out.println("2.Deposite Mony ::");
		System.out.println("3.Withdraw ::");
		System.out.println("4.Balance Enquiry ::");
		System.out.println("5.List All ::");
		System.out.println("6.Exit ::");
		System.out.println("*************************************************");
		
		
		
		
        int choice = 0;
        boolean found;
		while(choice!=8)
		{
			    System.out.println("*************************************************");
				System.out.println("Enter The Choice ::");
				
				 choice=sc.nextInt();
				
				switch(choice)
				{
						case 1:
						{
							
							System.out.println("*********************** Open Account **************************");
							for(int i=0;i<a_arr.length;i++)
							{
									
								
									System.out.println("Enter The Person Name ::");
									String name=sc.next();
									
									System.out.println("Enter The City Name ::");
									sc.nextLine();
									String city=sc.next();
									
									System.out.println("Account Balance ::");
									int balance=sc.nextInt();
							    
									
								Account ac=new Account(name,city,balance ); 
							      a_arr[i]=ac;
							   //   ac.display();
						  }
							
							}
							
							
						   break;
						case 2:
						{
							System.out.println("******************** Account Deposite **********************");
							found=false;
							System.out.println("Enter The Account Number ::");
							int accno=sc.nextInt();
							for(int i=0;i<a_arr.length;i++)
							 {
								if(accno==a_arr[i].getAccno())
								{
									System.out.println("Customer Name ::"+a_arr[i].getName());
									System.out.println("Customer City ::"+a_arr[i].getCity());
									System.out.println("Account Balance ::"+a_arr[i].getBal());
									
									System.out.println("\n Enter the Amount To Deposite ::");
									int balance=sc.nextInt();
									a_arr[i].setBal(a_arr[i].getBal()+balance);
									System.out.println("*******Deposite Successfully********");
									//break;
								}
								else
								{
									System.out.println("Invalide Account Number");
								}
								
							 }
							
						}
						   break;
						
						case 3:
						{
							found=false;
							System.out.println("************************ Account Withdraw **************************");	
							System.out.println("Enter The Account Number ::");
							int accno=sc.nextInt();
							for(int i=0;i<a_arr.length;i++)
							{
								
							 
								if(accno==a_arr[i].getAccno())
								{
									System.out.println("Customer Name ::"+a_arr[i].getName());
									System.out.println("Customer City ::"+a_arr[i].getCity());
									System.out.println("Account Balance ::"+a_arr[i].getBal());
									
									System.out.println("\nEnter the Amount To Withdraw ::");
									int balance=sc.nextInt();
									if(balance<=a_arr[i].getBal()+balance)
										{
										a_arr[i].setBal(a_arr[i].getBal()-balance);
										  System.out.println("******* Withdraw Successfully********");
										}
										else
										{
											System.out.println("Insufficint Balance ......!!!");
										}
									break;
								}
									if(!found)
									{
										System.out.println("Invalide Account Number");
									}
								
								
							 }
							
						 }
						
							break;
							
						case 4:
						{
							found=false;
							System.out.println("************************** Account Balance Enquiry *************************");
							System.out.println("Enter The Account Number ::");
							int accno=sc.nextInt();
							for(int i=0;i<a_arr.length;i++)
							 {
								if(accno==a_arr[i].getAccno())
								{
									System.out.println("Customer Name ::"+a_arr[i].getName());
									System.out.println("Customer City ::"+a_arr[i].getCity());
									System.out.println("Account Balance ::"+a_arr[i].getBal());
									break;
								}
								else if(!found)
								{
									System.out.println("Invalide Account Number");
								}
								
							 }
							
						}
						   break;
						
						case 5:
						{
							System.out.println("*********************** List All**************************");
							 for(int i=0;i<a_arr.length;i++)
						       {
								   System.out.println("Account Opend..!!!");
								   System.out.println("Acountant Name ::"+a_arr[i].getAccno());
						    	   System.out.println("Acountant Name ::"+a_arr[i].getName());
						    	   System.out.println("Accountant City ::"+a_arr[i].getCity());
						    	   System.out.println("Balance ::"+a_arr[i].getBal());
						       }
						}
					    	break;
						
						case 6:
						{
							System.out.println("************ Thank For Visiting ******************* ");
						}
						   break;
							
						default:
							System.out.println("Invalid Choice ");
				
		             
				}
				break;
	}
}
}



