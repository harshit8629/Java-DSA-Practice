class Restaurant {
    void prepareFood() {
        System.out.println("Preparing Food...");
    }
}

class PizzaRestaurant extends Restaurant {
    void prepareFood() {
        System.out.println("Preparing Pizza...");
        System.out.println("Order Ready in 20 minutes");
    }
}

class BurgerRestaurant extends Restaurant {
    void prepareFood() {
        System.out.println("Preparing Burger...");
        System.out.println("Order Ready in 10 minutes");
    }
}

class SouthIndianRestaurant extends Restaurant {
    void prepareFood() {
        System.out.println("Preparing Dosa...");
        System.out.println("Order Ready in 15 minutes");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Restaurant r1 = new PizzaRestaurant();
        Restaurant r2 = new BurgerRestaurant();
        Restaurant r3 = new SouthIndianRestaurant();

        r1.prepareFood();
        System.out.println();

        r2.prepareFood();
        System.out.println();

        r3.prepareFood();
    }
}