package com.kelompok1;

public class Peppers extends PizzaDecorator{
	public Peppers(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Pepper Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+2;
    }
}
