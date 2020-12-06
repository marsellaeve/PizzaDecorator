package com.kelompok1;

public class Bacon extends PizzaDecorator{
	public Bacon(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Bacon Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+5;
    }
}
