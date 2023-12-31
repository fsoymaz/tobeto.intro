package oopWithNlayeredAPP.business;

import oopWithNlayeredAPP.core.loging.Logger;
import oopWithNlayeredAPP.dataAccess.HibernateProductDao;
import oopWithNlayeredAPP.dataAccess.ProductDao;
import oopWithNlayeredAPP.entities.Product;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //response request patent
        //iş kuralları business roles
        if (product.getUnitPrice() < 10){
            throw new Exception("ürün fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) { //[db, file]
            logger.log(product.getName());
        }
    }
}
