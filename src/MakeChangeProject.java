
public class MakeChangeProject {
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		
		System.out.println("Hello! What is the total price for the items? ");
		Double itemPrice = kb.nextDouble();
		System.out.println("Please tell me how much money was tendered by the customer: ");
		Double moneyGiven = kb.nextDouble();
		
		kb.close();
		
		double change = moneyGiven - itemPrice + .005;
		
		if (itemPrice > moneyGiven) {
			System.out.println("Insufficient funds");
		}
		if (itemPrice < moneyGiven) {
			System.out.println("Here is your change: ");
		}
		if (itemPrice.equals(moneyGiven)) {
			System.out.println("Thank you come again!");
		}
			
		double twtyDollars = 20.0, tenDollars = 10.0, fvDollars = 5.0, oneDollar = 1.0, quarter = 0.25, dime = 0.10, nickle = .05, penny = .01;
		int countTty = 0, countTen =0, countFv =0, countOne =0, ctQuart =0, ctDime =0, ctNick =0, ctPenny = 0;
		
		while (change > 0.0) {
			
			if (change >= twtyDollars) {
				change -= twtyDollars;
				countTty++;
			}
			
			else if(change >= tenDollars) {
				change -= tenDollars;
				countTen++;
			}
			else if (change >= fvDollars) {
				change-= fvDollars;
				countFv++;
			}
			
			else if (change >= oneDollar) {
				change-= oneDollar;
				countOne++;
			}
			else if (change >= quarter) {
				change-= quarter;
				ctQuart++;
			}
			else if (change >= dime) {
				change-= dime;
				ctDime++;
			}
			else if (change >= nickle) {
				change-= nickle;
				ctNick++;
			}
			else {
	//			change =(int)(change - penny); (things that didn't work)
				ctPenny = (int)(change % penny);
				if (ctPenny == 0) {
					ctPenny = (int)(change / penny);
				}
				change = 0;
	//			ctPenny++; (things that didn't work)
				
			} 
		
		}
		
		
		if (countTty > 0) {
			System.out.println(countTty + ": $20 bill. ");
		}
		if (countTen > 0) {
			System.out.println(countTen + ": $10 bill. ");
		}
		if (countFv > 0) {
			System.out.println(countFv + ": $5 bill. ");
		}
		if (countOne > 0) {
			System.out.println(countOne + ": $1 bill. ");
		}
		if (ctQuart > 0) {
			System.out.println(ctQuart + ": $.25 coin. ");
		}
		if (ctDime > 0) {
			System.out.println(ctDime + ": $.10 coin. ");
		}
		if (ctNick > 0) {
			System.out.println(ctNick + ": $.05 coin. ");
		}
		if (ctPenny > 0) {
			System.out.println(ctPenny + ": $.01 coin. ");
		}
		
	}
	
}
// Old code that I gave up on after getting frustrated that it wouldn't work. I got frustrated at trying to truncate 
//doubles to int so tried multiplying everything by *100 to avoid the conversion. 

//		while (change != -1) { 
//			
//			while (change >= 2000) {
//			change = (int)(change - 2000);
//			twtyDollars ++;
//			System.out.println(twtyDollars + " $20 bill! ");
//			System.out.println(change);
//			}
//		
//			while (change >= 1000) {
//			change = (int)(change - 1000);
//			tenDollars++;
//			System.out.println(tenDollars + " $10 ");
//			System.out.println(change);
//			}
//			
//			while (change >= 500) {
//			change = (int)(change - 500);
//			fvDollars++;
//			System.out.println(fvDollars + " $5 ");
//			System.out.println(change);
//			}
//			
//			while(change >= 100) {
//			change = (int)change - 100;
//			oneDollar++;
//			System.out.println(oneDollar + " $1 ");
//			System.out.println(change);
//			}
//			
//			while(change >= 25) {
//			change = (int)change - 25;
//			quarter++;
//			System.out.println(quarter + " $.25 ");
//			System.out.println(change);
//			}
//			
//			while (change >= 10) {
//			change = (int)change - 10;
//			dime++;
//			System.out.println(dime + " $.10 ");
//			System.out.println(change);
//			}
//		
//			while (change >= 5) {
//			change = (int)change - 5;
//			nickle++;
//			System.out.println(nickle + " $.05 ");
//			System.out.println(change);
//			}	
//			
//			while (penny > 0) {
//			penny = change;
//			System.out.println(penny + " $.01");
//			}
//			
//			System.out.println( "your total owed is: " + twtyDollars + tenDollars + fvDollars + oneDollar);
//			
//		}
		
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	

