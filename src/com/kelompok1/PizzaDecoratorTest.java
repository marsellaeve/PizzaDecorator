package com.kelompok1;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

public class PizzaDecoratorTest {
	private static int  choice;  
	public static void main(String[] args) throws NumberFormatException, IOException {
		do{
			System.out.println("Welcome to Pizza Shop! Please choose the menu below: ");
			System.out.println("1. Pizza with Cheese, and Pepperoni");
			System.out.println("2. Pizza with Bacon, Mushrooms, and Cheese");
			System.out.println("3. Pizza with Tuna, Tomatoes, Onion, Olives");
			System.out.println("4. Exit");
			
		    System.out.print("Enter your choice: ");  
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));   
	        choice=Integer.parseInt(br.readLine());  
	        switch (choice) {  
		        case 1:{
		        	System.out.println("Order pizza with Cheese and Pepperoni");
		        	 Pizza pizza = new BasePizza();
		             pizza = new Cheese(pizza);
		             pizza = new Pepperoni(pizza);
		    	    System.out.println("Price " + pizza.getCost());
		        }  
		        break;  
		        case 2:{  
		        	System.out.println("Order pizza with Bacon, Mushrooms, and Cheese");
		        	 Pizza pizza = new BasePizza();
		             pizza = new Cheese(pizza);
		             pizza = new Bacon(pizza);
		             pizza = new Mushrooms(pizza);
		    	    System.out.println("Price " + pizza.getCost());
		        }  
		        break;    
		        case 3:{  
		        	System.out.println("Order pizza with Tuna, Tomatoes, Onion, Olives");
		        	 Pizza pizza = new BasePizza();
		             pizza = new Tuna(pizza);
		             pizza = new Tomatoes(pizza);
		             pizza = new Onion(pizza);
		             pizza = new Olives(pizza);
		    	    System.out.println("Price " + pizza.getCost());
		        }
		        break;
		              
		        default:{
		            System.out.println("Other than these no pizza available");  
		        }         
		        return;  
	        }
          
		}while(choice!=4);
	}
}
