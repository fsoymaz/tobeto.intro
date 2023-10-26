package oopWithNlayeredAPP.dataAccess;

import oopWithNlayeredAPP.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        //sade db erişim kodları buraya yazılır ...SQL
        System.out.println("Hibernate ile veri tabanına eklendi");
    }
}
