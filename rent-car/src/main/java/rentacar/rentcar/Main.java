/*
package rentacar.rentcar;

import rentacar.rentcar.entities.Brand;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Brand> brands = new ArrayList<>();

        Brand brand1 = new Brand();
        brand1.setBrandId(1);
        brand1.setBrandName("tesla");
        brands.add(brand1);

        Brand brand2 = new Brand();
        brand2.setBrandId(2);
        brand2.setBrandName("BMW");
        brands.add(brand2);


        Brand brand3 = new Brand();
        brand3.setBrandId(3);
        brand3.setBrandName("Audi");
        brands.add(brand3);

        //lambda expression => Java 8
        brands.forEach((item) -> {
            String name = item.getBrandName();
            System.out.println(name);
        });


        brands.forEach((item) -> System.out.println(item.getBrandId())); // one line function


        //stream apı
        // koleksiyonlar üzerinde işlem yapmamızı kolaylaştırır
        List<GetListBrandResponse> result =
                brands
                        .stream()
                        .map((brand) -> new GetListBrandResponse(brand.getBrandId(), brand.getBrandName())).toList();


        List<Brand> sortedBrands = brands.stream().sorted((b1, b2) -> b1.getBrandName().compareTo(b2.getBrandName())).toList();
        sortedBrands.forEach((brand) -> System.out.println(brand.getBrandName()));

        System.out.println("****************************");
        List<Brand> sortedBrand2 = brands.stream().sorted(Comparator.comparing(Brand::getBrandName).thenComparing(Brand::getBrandName
        )).toList();
        sortedBrand2.forEach((brand) -> System.out.println(brand.getBrandName()));
        System.out.println("****************************");
        List<Brand> filteredBrands =
                brands.stream().filter((brand) -> brand.getBrandName().length() > 4).toList();
        System.out.println(filteredBrands.size());
        System.out.println("****************************");
        List<Brand> filterBrand2 = brands.stream().filter((brand) -> {
            int minLength = 3;
          return  brand.getBrandId() > minLength && brand.getBrandName().equals("BMW");
        }).toList();
            System.out.println(filterBrand2.size());
            // multiple line lambda expressionlarda eğer method bir dönüş tipi nekliyor ise, return keywordu kullanılmalı
    }
}
*/