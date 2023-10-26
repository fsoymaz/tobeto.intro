package oopWithNlayeredAPP.dataAccess;

import oopWithNlayeredAPP.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        //sade db erişim kodları buraya yazılır ...SQL
        System.out.println("JDBC ile veri tabanına eklendi");
    }
}

//hibernate
