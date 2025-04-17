package weekidk.shop;

public class Test {
        public static void main(String[] args) {
        Product phone = new Product();
        Product fridge = new Product();

        phone.setName("14");
        phone.setManufacturer("iphone");
        phone.setPrice(1000.00);
        phone.setYear(2024);

        fridge.setName("Smart Fridge");
        fridge.setManufacturer("Samsung");
        fridge.setPrice(800.00);
        fridge.setYear(2022);

        SMS sms  = new SMS();
        sms.addProduct(phone);
        sms.addProduct(fridge);

        sms.printInfo();

    }
}
