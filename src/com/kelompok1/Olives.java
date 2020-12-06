package com.kelompok1;

public class Olives extends PizzaDecorator{
	public Olives(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Olive Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+4;
    }
}
