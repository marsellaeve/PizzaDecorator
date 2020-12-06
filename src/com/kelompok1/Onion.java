package com.kelompok1;

public class Onion extends PizzaDecorator{
	public Onion(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Onion Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+3;
    }
}
