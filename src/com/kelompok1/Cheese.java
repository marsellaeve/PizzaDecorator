package com.kelompok1;

public class Cheese extends PizzaDecorator{
	public Cheese(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Cheese Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+1;
    }
}
