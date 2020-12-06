package com.kelompok1;

public class Pepperoni extends PizzaDecorator{
	public Pepperoni(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Pepperoni Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+4;
    }
}
