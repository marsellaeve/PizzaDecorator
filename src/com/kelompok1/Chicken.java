package com.kelompok1;

public class Chicken extends PizzaDecorator{
	public Chicken(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Chicken Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+5;
    }
}
