package package2;

import package1.Product;

public class ProductCart {
    public void showProduct(String productId) {
        Product product = new Product();
        product.setProductId(productId);
        product.setProductName("SOny");
        product.setCost(122434f);
        System.out.println(product);

    }
}
