import java.util.*;
import java.text.DecimalFormat;
public class currency
{
	
	public static void main(String args[])
	{
			double code ,amount ,dollar,pound,euro,ruppe;
			char choice ;
			do
	{
			DecimalFormat f =new DecimalFormat("##.##");
			Scanner sc=new Scanner(System.in);
			System.out.println("welcome to our currency converter");
			System.out.println("which currency do you want to convert");
			System.out.println("1.Ruppe\n2.Dollar\n3.Pound\n4.Euro\n");
			code=sc.nextInt();
			
			System.out.println("How much currency you want to convert");
			amount=sc.nextInt();
		
			
			
			
			//ruppe
			
			if(code==1)
			{
				dollar=amount/70;
				System.out.println("Your "+amount+" Ruppe is "+f.format(dollar)+"Dollar");
				
				pound=amount/88;
				System.out.println("Your "+amount+" Ruppe is "+f.format(pound)+"Pound");
				
				euro=amount/80;
				System.out.println("Your "+amount+" Ruppe is "+f.format(euro)+"Euro");
				
				
			}
			//doller
			
			else if(code==2)
			{
				ruppe=amount*72.61;
				System.out.println("Your "+amount+"  Dollar is "+f.format(ruppe)+" Ruppe");
				
				pound=amount* 0.71;
				System.out.println("Your "+amount+"  Dollar is "+f.format(pound)+" Pound");
				
				euro=amount*0.82;
				System.out.println("Your "+amount+"  Dollar is "+f.format(euro)+" Euro");
					
			}
			//pound
			else if(code==3)
			{
				ruppe=amount*102.54;
				System.out.println("Your "+amount+"  Pound is "+f.format(ruppe)+" Ruppe");
				
				dollar=amount*1.41;
				System.out.println("Your "+amount+"  Pound is "+f.format(dollar)+" Dollar");
				
				euro=amount* 1.16;
				System.out.println("Your "+amount+"  Pound is "+f.format(euro)+" Euro");
				
			}
			//Euro
			
			else if(code==4)
			{
				ruppe=amount*88.62;
				System.out.println("Your "+amount+"  Euro is "+f.format(ruppe)+" Ruppe");
				
				dollar=amount*1.22;
				System.out.println("Your "+amount+"  Euro is "+f.format(dollar)+" Dollar");
				
				pound=amount* 0.86;
				System.out.println("Your "+amount+"  Euro is "+f.format(pound)+" Pound");
				
				
				
			}
			else
			{
				System.out.println("Invalid Input");
				
			}
			System.out.println("Do you want to continue(Y/N)");
	
			 choice =sc.next().charAt(0);
	
	}
		while(choice=='Y' || choice=='y');
			
			
		System.out.println("Thank you for the visiting");
		
		
		
		
	}
}