import com.hamburger.DeluxeBurger;
import com.hamburger.Hamburger;
import com.hamburger.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Beef", 3.56, "Wrap");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        hamburger.itemizeHamburger();

        System.out.println("\n-----------------\n");

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", "Beef", 5.67, "Sandwich");
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        healthyBurger.itemizeHamburger();

        System.out.println("\n-----------------\n");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should not do this", 50.53);
        db.itemizeHamburger();

    }
}