abstract class FoodOrder {
    String customerName;
    double orderAmount;

    FoodOrder(String customerName, double orderAmount) {
        this.customerName = customerName;
        this.orderAmount = orderAmount;
    }

    abstract void prepareFood();

    abstract void deliverFood();
}

class PizzaOrder extends FoodOrder {

    PizzaOrder(String customerName, double orderAmount) {
        super(customerName, orderAmount);
    }

    void prepareFood() {
        System.out.println("Preparing Pizza...");
    }

    void deliverFood() {
        System.out.println("Pizza Delivered Successfully");
    }
}

class BurgerOrder extends FoodOrder {

    BurgerOrder(String customerName, double orderAmount) {
        super(customerName, orderAmount);
    }

    void prepareFood() {
        System.out.println("Preparing Burger...");
    }

    void deliverFood() {
        System.out.println("Burger Delivered Successfully");
    }
}

class DessertOrder extends FoodOrder {

    DessertOrder(String customerName, double orderAmount) {
        super(customerName, orderAmount);
    }

    void prepareFood() {
        System.out.println("Preparing Dessert...");
    }

    void deliverFood() {
        System.out.println("Dessert Delivered Successfully");
    }
}

public class OnlineFoodDeliveryApplication {
    public static void main(String[] args) {

        FoodOrder f1 = new PizzaOrder("Harshit", 500);
        FoodOrder f2 = new BurgerOrder("Rahul", 250);
        FoodOrder f3 = new DessertOrder("Aman", 300);

        f1.prepareFood();
        f1.deliverFood();

        System.out.println();

        f2.prepareFood();
        f2.deliverFood();

        System.out.println();

        f3.prepareFood();
        f3.deliverFood();
    }
}