package basic;
import java.util.Scanner;

public class  Restaurant_Ordering_System {
	
 static	int rate,quantity,amount = 0;
 static Scanner id = new Scanner(System.in);

	
	void cal(int q, int r)
	{
		
		amount = amount+ q*r;
	}

	public static void main(String[] args) {
		 
		 int a1 = 0, a2 =0,a3 = 0,a4 = 0,a5 = 0,a6 = 0;
		 char chi, co;
		 int c1 = 0, q1 = 0, q = 0,c = 0, c3 = 0,q3 = 0;
		 String u = "admin";
		 String p = "admin1234";
		Hotel_Booking ob = new Hotel_Booking();
		System.out.println("NAMASTE, WELCOME TO OUR RESTAURANT ");
		System.out.println("Enter user name and pass ");
		System.out.println("user name : ");
		String user = id.nextLine();
		System.out.println("password : ");
		String pass = id.nextLine();
		
		if( user.equals(u) &&   pass.equals(p))
		{
		System.out.println(" Successfully logged in ");
		System.out.println("Press 1 : if you want to order ");
		int ch = id.nextInt();
			if(ch==1)
				do {	
		{
			System.out.println("press 1 to see starters");
			System.out.println("press 2 to see main course");
			System.out.println("press 3 to see beverages");
			System.out.println("press 4 to see deserts");
			int choice = id.nextInt();
			
			switch(choice)
			{
			case 1: System.out.println("Available starters are : ");
			System.out.println("  Dish           Rate");
			System.out.println("1.Burger         Rs 150 ");
			System.out.println("2.Alfredo pasta  Rs 200 ");
			System.out.println("3.Crispy Corn    Rs 150 ");
			System.out.println("4.Sandwhiches    Rs 180 ");
			System.out.println("5.Pizza          Rs 250 ");
			System.out.println("press the respective number of the dish you like to ordery?");
			 c = id.nextInt();
			System.out.println("enter the quantity you would like to order?");
			 q = id.nextInt();
			switch(c)
			{
			case 1: ob.cal(q, 150);
			if(q==1)
			System.out.println("you ordered " + q + " burger and your total amount is: " + amount);
			else
			System.out.println("you ordered " + q + " burgers and your total amount is: " + amount);	
			break;
			
			case 2: ob.cal(q, 200);
			if(q==1)
				System.out.println("you ordered " + q + " plate Alfredo pasta and your total amount is: " + amount);
				else
				System.out.println("you ordered " + q + " plates Alfredo pasta and your total amount is: " + amount);
			break;
			
			case 3: ob.cal(q, 150);
			if(q==1)
			System.out.println("you ordered " + q + " plate crispy corn and your total amount is: " + amount);
			else
			System.out.println("you ordered " + q + " plates crispy corn and your total amount is: " + amount);
			break;
			
			case 4: ob.cal(q, 180);
			if(q==1)
				System.out.println("you ordered " + q + " sandwhich and your total amount is: " + amount);
				else
				System.out.println("you ordered " + q + " sandwhiches and your total amount is: " + amount);
			break;
			
			case 5: ob.cal(q, 250);
			if(q==1)
				System.out.println("you ordered " + q + " pizza and your total amount is: " + amount);
				else
				System.out.println("you ordered " + q + " pizzas and your total amount is: " + amount);
			break;
			}
			
			break;
			
			case 2: 
				System.out.println(" press y if you like to order sabji");
				char c2 = id.next().charAt(0);
				System.out.println(" press y if you like to order breads or rice?");
				 chi = id.next().charAt(0);
				
				if(c2=='y' || c2 =='Y')
				{
				System.out.println("Available Sabjis in main course are : ");
			System.out.println("  Sabji          Rate");
			System.out.println("1.PLain Daal     Rs 50 ");
			System.out.println("2.Tadka Daal     Rs 70 ");
			System.out.println("3.Palak Panner   Rs 100 ");
			System.out.println("4.Kadai Panner   Rs 120 ");
			System.out.println("5.Doodh Sev      Rs 100 ");
			System.out.println("6.Thali          Rs 350 ");
			System.out.println("press the respective number of the Sabji you like to ordery?");
			 c1 = id.nextInt();
			System.out.println("enter the quantity you would like to order?");
			 q1 = id.nextInt();
				}
			 if(chi=='y' || chi =='Y')
				{
				System.out.println("Available Breads and Rice in main course are : ");
				System.out.println("  Breads & Rice  Rate");
				System.out.println("1.Tawa Roti      Rs 5 ");
				System.out.println("2.Tandoori Roti  Rs 7 ");
				System.out.println("3.Laccha Pratha  Rs 10 ");
				System.out.println("4.Plane Rice     Rs 20 ");
				System.out.println("5.Jeera Rice     Rs 30 ");
				System.out.println("press the respective number of the bread/rice you like to ordery?");
				c3 = id.nextInt();
				System.out.println("enter the quantity you would like to order?");
				 q3 = id.nextInt();
				}
			switch(c1)
			{
			case 1: ob.cal(q1, 50);
			a1 = amount;
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
			System.out.print("you ordered " + q1 + " plate plain daal ");
			}
			else
			{
				 System.out.print("you ordered " + q1 + " plate plain daal and your total amount is : " + a1);
			}
			break;
			
			case 2: ob.cal(q1, 70);
			 a2 = amount;
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
			System.out.print("you ordered " + q1 + " plate tadka  daal ");
			}
			else
			 System.out.print("you ordered " + q1 + " plate tadka  daal and your total amount is : " + a2);
			break;
			
			case 3: ob.cal(q1, 100);
			a3 = amount;
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
			System.out.print("you ordered " + q1 + " plate palak panner ");
			}
			else
			{
				 System.out.print("you ordered " + q1 + " plate palak panner and your total amount is :  " + a3);
			}
			  
			break;
			
			case 4: ob.cal(q1, 120);
			 a4 = amount;
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
			System.out.print("you ordered " + q1 + " plate kadai panner ");
			}
			else
			{
				 System.out.print("you ordered " + q1 + " plate kadai panner and your total amount is :  " + a4);
			}
			
			break;
			
			case 5: ob.cal(q1, 100);
			  a5 = amount;
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
			System.out.print("you ordered " + q1 + " plate doodh sev ");
			}
			else
			{
				 System.out.print("you ordered " + q1 + " plate doodh sev and your total amount is :  " + a5);
			}

			break;
			
			case 6: ob.cal(q1, 350);
			 a6 = amount;
			 System.out.print("you ordered " + q1 + " plate thali and your total amount is : " + a6);
			break;
			}
			
				
			switch(c3)
			{
			case 1: ob.cal(q3, 5);
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
				amount = amount + a1;
			System.out.println("and " + q3 + " tawa roti and your total amount is : " + amount);
			}
			else
			{
				System.out.println("you ordered" + q3 + " tawa roti and your total amount is : " + amount);
			}	
			break;
			
			case 2: ob.cal(q3, 7);
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
				amount = amount + a2;
			System.out.println("and " + q3 + " tandoori roti and your total amount is : " + amount);
			}
			else
			{
				System.out.println("you ordered" + q3 + " tandoori roti and your total amount is : " + amount);
			}	
			break;
			
			case 3: ob.cal(q3, 10);
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
				amount = amount + a3;
			System.out.println("and " + q3 + " laccha pratha and your total amount is : " + amount);
			}
			else
			{
				System.out.println("you ordered" + q3 + " laccha paratha and your total amount is : " + amount);
			}	
			break;
			
			case 4: ob.cal(q3, 20);
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
				amount = amount + a4;
			System.out.println("and " + q3 + " plane rice and your total amount is : " + amount);
			}
			else
			{
				System.out.println("you ordered" + q3 + " plane rice and your total amount is : " + amount);
			}	
			break;
			
			case 5: ob.cal(q3, 30);
			if((chi == 'y' || chi=='Y') && (c2 == 'y' || c2 == 'Y'))
			{
				amount = amount +a5;

			System.out.println("and " + q3 + " jeera rice and your total amount is : " + amount);
			}
			else
			{
				System.out.println("you ordered" + q3 + " jeera rice and your total amount is : " + amount);
			}	
			break;
			}
			break;
			
			case 3: System.out.println("Available beverages are : ");
			System.out.println("  Drinks          Rate");
			System.out.println("1.Cold Coffee     Rs 300 ");
			System.out.println("2.Chocolate Shake Rs 450 ");
			System.out.println("3.Milk shake      Rs 250 ");
			System.out.println("4.Hot Chocolate   Rs 180 ");
			System.out.println("5.Ice Tea         Rs 150 ");
			System.out.println("press the respective number of the beverage you like to ordery?");
			int choi = id.nextInt();
			System.out.println("enter the quantity you would like to order ");
			int qui = id.nextInt();
			
			switch(choi)
			{
			case 1: ob.cal(qui, 300);
			System.out.println(" your oredered " + qui + " colde coffee and your total amt is " + amount);
			break;
			
			case 2: ob.cal(qui, 450);
			System.out.println(" your oredered " + qui + " chococlate shake and your total amt is " + amount);
			break;
			
			case 3: ob.cal(qui, 250);
			System.out.println(" your oredered " + qui + " milk shake and your total amt is " + amount);
			break;
			
			case 4: ob.cal(qui, 180);
			System.out.println(" your oredered " + qui + " hot chococlate and your total amt is " + amount);
			break;
			
			case 5: ob.cal(qui, 150);
			System.out.println(" your oredered " + qui + " Ice tea and your total amt is " + amount);
			break;
			
			}
			break;
			
			case 4: System.out.println("Available deserts are : ");
			System.out.println("  Deserts           Rate");
			System.out.println("1.Brownie           Rs 250 ");
			System.out.println("2.Chocolate pastry  Rs 150 ");
			System.out.println("3.Tiramisu          Rs 350 ");
			System.out.println("4.Muffin            Rs 180 ");
			System.out.println("press the respective number of the beverage you like to ordery?");
			int choi1 = id.nextInt();
			System.out.println("enter the quantity you would like to order ");
			int qui1 = id.nextInt();
			
			switch(choi1)
			{
			case 1: ob.cal(qui1, 250);
			System.out.println(" your oredered " + qui1 + " brownie and your total amt is " + amount);
			break;
			
			case 2: ob.cal(qui1, 150);
			System.out.println(" your oredered " + qui1 + " chococlate pastry and your total amt is " + amount);
			break;
			
			case 3: ob.cal(qui1, 350);
			System.out.println(" your oredered " + qui1 + " tiramisu and your total amt is " + amount);
			break;
			
			case 4: ob.cal(qui1, 180);
			System.out.println(" your oredered " + qui1 + " muffin and your total amt is " + amount);
			break;
			}
			break;
			}
			
			}
			
			System.out.println('\n'+ "if you want to continue order press 'y'");
			 co = id.next().charAt(0);
			
		}while(co == 'y' || co == 'Y');
			
			System.out.println("your final amount is " + amount);
			}
		else
		{
			System.out.println("enter correct user name and pass ");
		}
	}
	
		}
			 
	

