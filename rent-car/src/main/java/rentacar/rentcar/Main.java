package rentacar.rentcar;

import org.apache.el.stream.Stream;
import rentacar.rentcar.entities.Brands;
import rentacar.rentcar.services.dtos.brand.responses.GetListBrandResponse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Brands> brands = new ArrayList<>();

        Brands brands1 = new Brands();
        brands1.setBrandId(1);
        brands1.setBrandName("tesla");
        brands.add(brands1);

        Brands brands2 = new Brands();
        brands2.setBrandId(2);
        brands2.setBrandName("BMW");
        brands.add(brands2);


        Brands brands3 = new Brands();
        brands3.setBrandId(3);
        brands3.setBrandName("Audi");
        brands.add(brands3);

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


        List<Brands> sortedBrands = brands.stream().sorted((b1, b2) -> b1.getBrandName().compareTo(b2.getBrandName())).toList();
        sortedBrands.forEach((brand) -> System.out.println(brand.getBrandName()));

        System.out.println("****************************");
        List<Brands> sortedBrands2 = brands.stream().sorted(Comparator.comparing(Brands::getBrandName).thenComparing(Brands::getBrandName
        )).toList();
        sortedBrands2.forEach((brand) -> System.out.println(brand.getBrandName()));
        System.out.println("****************************");
        List<Brands> filteredBrands =
                brands.stream().filter((brand) -> brand.getBrandName().length() > 4).toList();
        System.out.println(filteredBrands.size());
        System.out.println("****************************");
        List<Brands> filterBrands2 = brands.stream().filter((brand) -> {
            int minLength = 3;
          return  brand.getBrandId() > minLength && brand.getBrandName().equals("BMW");
        }).toList();
            System.out.println(filterBrands2.size());
            // multiple line lambda expressionlarda eğer method bir dönüş tipi nekliyor ise, return keywordu kullanılmalı
    }
}
