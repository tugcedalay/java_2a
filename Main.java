package oop1;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05552329889");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ömer");
        individualCustomer.setLastName("Özgür");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Metzger Gıda LTD. ŞTİ.");
        corporateCustomer.setPhone("05334540098");
        corporateCustomer.setTaxNumber("2190980981");
        corporateCustomer.setCustomerNumber("12312");

        Customer[] customers = {individualCustomer,corporateCustomer};
    }
}