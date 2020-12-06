package com.kelompok1;

public class Tomatoes extends PizzaDecorator{
	public Tomatoes(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Tomato Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+1;
    }
}
