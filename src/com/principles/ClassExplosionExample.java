package com.principles;

public class ClassExplosionExample {
    
	/*Imagine you are building a pizza 
	ordering system and want to account for all 
	possible pizza types. You might initially
	 
	create:Pizza (Base class)
	
	
	If you use inheritance to create specific combinations,
	a class explosion occurs:
		
		MargheritaPizza
		MargheritaExtraCheese
		PizzaPepperoniPizza
		PepperoniExtraCheese
		PizzaMargheritaGluten
		FreePizzaPepperoniGluten
		FreeExtraCheesePizza

    With composition, we can combine any Crust and Toppings dynamically,
    using only 3 types (Pizza, Crust, Topping) instead of 48+ subclasses.
*/
	
    public static void main(String[] args) {
        System.out.println("=== Pizza Composition over Inheritance Demo ===");

        // 1. Thin Crust Pizza with Cheese and Pepperoni
        Pizza pizza1 = new Pizza(Crust.THIN);
        pizza1.addTopping(Topping.CHEESE);
        pizza1.addTopping(Topping.PEPPERONI);
        System.out.println("Pizza 1 Description: " + pizza1.getDescription());
        System.out.println("Pizza 1 Cost: $" + pizza1.getCost());
        System.out.println();

        // 2. Gluten-Free Pizza with Mushrooms and Jalapenos
        Pizza pizza2 = new Pizza(Crust.GLUTEN_FREE);
        pizza2.addTopping(Topping.MUSHROOMS);
        pizza2.addTopping(Topping.JALAPENOS);
        System.out.println("Pizza 2 Description: " + pizza2.getDescription());
        System.out.println("Pizza 2 Cost: $" + pizza2.getCost());
        System.out.println();

        // 3. Thick Crust Pizza with Cheese, Mushrooms, and Jalapenos
        Pizza pizza3 = new Pizza(Crust.THICK);
        pizza3.addTopping(Topping.CHEESE);
        pizza3.addTopping(Topping.MUSHROOMS);
        pizza3.addTopping(Topping.JALAPENOS);
        System.out.println("Pizza 3 Description: " + pizza3.getDescription());
        System.out.println("Pizza 3 Cost: $" + pizza3.getCost());
    }
}