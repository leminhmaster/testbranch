import package2.ProductCart;
import package2.UserService;

public class Main {
    public static void main(String[] args) {
        System.out.println("ham main");
        ProductCart productCart = new ProductCart();
        UserService userService = new UserService();
        productCart.showProduct("192022");
        userService.showAllUser("minh");
    }
}
