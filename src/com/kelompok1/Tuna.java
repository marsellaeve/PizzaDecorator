package com.kelompok1;

public class Tuna extends PizzaDecorator{
	public Tuna(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Tuna Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+4;
    }
}
