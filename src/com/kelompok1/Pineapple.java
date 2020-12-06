package com.kelompok1;

public class Pineapple extends PizzaDecorator{
	public Pineapple(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Pineapple Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+2;
    }
}
