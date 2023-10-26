package oopWithNlayeredAPP;

import oopWithNlayeredAPP.business.ProductManager;
import oopWithNlayeredAPP.core.loging.DatabaseLogger;
import oopWithNlayeredAPP.core.loging.FileLogger;
import oopWithNlayeredAPP.core.loging.Logger;
import oopWithNlayeredAPP.dataAccess.HibernateProductDao;
import oopWithNlayeredAPP.dataAccess.JdbcProductDao;
import oopWithNlayeredAPP.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger()};
        Product product1 = new Product(1, "Iphone Xr", 10000);
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}
