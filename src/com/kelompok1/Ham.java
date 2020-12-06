package com.kelompok1;

public class Ham extends PizzaDecorator{
	public Ham(Pizza newPizza) {
        super(newPizza);
    }
 
    @Override
    public String bakePizza() {
        return super.bakePizza() + " with Ham Topings";
    }
 
    @Override
    public float getCost() {
        return super.getCost()+5;
    }
}
