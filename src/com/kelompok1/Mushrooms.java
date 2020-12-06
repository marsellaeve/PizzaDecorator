package com.kelompok1;

public class Mushrooms extends PizzaDecorator{
	public Mushrooms(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Mushroom Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+3;
    }
}
