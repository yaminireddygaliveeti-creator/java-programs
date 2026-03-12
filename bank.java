package pavani;
import java.util.*;
class bankaccount
{
	int balance;
	void withdraw(int money)
	{
		if(balance>=money)
		{
			balance=balance-money;
			//System.out.println("money debited"+"  "+balance);
		}
		else
		{
			System.out.println("not having the sufficient balance");
		}
	}
	void creat(int amount)
	{
		balance=balance+amount;
	}
	void display()
	{
		System.out.println("total balance"+" "+balance);
	}
}

public class bank {
	public static void main(String[] args)
	{
		Scanner sin =new Scanner(System.in);
		System.out.println("enter the balance");
		int balance=sin.nextInt();
		System.out.println("enter the amount to debit");
		int money=sin.nextInt();
		bankaccount ba=new bankaccount();
		ba.withdraw(money);
		System.out.println("enetr the amount to crediyt");
		int amount=sin.nextInt();
		ba.creat(amount);
		ba.display();
		
	}

}
