package Collections;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("__________TEST_________________");
        System.out.println("ѕылесос 6000 3\n" + "—тол 4000 2\n" + "„айник 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
        ConsoleService cS = new ConsoleService();
//        cS.start();
        long a =  (System.currentTimeMillis());
        double b =  (System.currentTimeMillis() % 100);
        System.out.println(a);
        System.out.println(b);


    }


    public static class Product implements Comparable<Product> {
        private String productName;
        private double price;
        // constructors, getters&setters, compareTo, equals&hashCode
        public Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Product p) {
            Double d = this.price;
            //используем метод compareTo из класса Double дл€ сравнени€ цен
            int result = d.compareTo(p.price);
            if (result == 0) {
                //используем метод compareTo из класса String дл€ сравнени€ имен
                result = this.productName.compareTo(p.productName);
            }
            return result;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return Double.compare(product.price, price) == 0 && Objects.equals(productName, product.productName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(productName, price);
        }

        @Override
        public String toString() {
            return "(" + productName +
                    " цена = " + price +
                    ") ";
        }

    }

    public static class Human implements Buyer {
        private String firstName;
        private String lastName;
        private double money; // денежный счет человека
        private Set<Product> products; // купленные продукты

        public void buyProduct(Product product, Shop shop) {
            try {
                shop.sellProduct(product, Human.this);
                this.products.add(product);
                this.money -= product.price;
            } catch (SellProductException e) {

            }
        }

        public Human(String firstName, String lastName, double money) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.money = money;
        }
    }

    public interface Buyer {
        void buyProduct(Product product, Shop shop) throws SellProductException;
    }

    public static class Shop {
        private String name;
        private double money; // денежный счет магазина
        private Map<Product, Integer> products; // продукты и их количество

        //  количество может быть 0 !
        public void sellProduct(Product product, Human human) throws SellProductException {
            if (this.products.get(product) == 0 || this.products.get(product) == null) {
                throw new SellProductException("ѕродукта с именем " + product.productName + " нет в наличии");

            } else if (human.money < product.price) {
                throw new SellProductException("”важаемый " + human.firstName + " " + human.lastName + ", дл€ покупки товара недостаточно средств");
            } else {

                this.products.put(product, this.products.get(product) - 1);
                this.money += product.price - calculateNds(product.price);
                System.out.println(human.firstName + ", вы успешно совершили покупку! — уважением, " + this.name);
            }
        }

        private double calculateNds(double price) {

            return price * 0.13;
        }

        public List<Product> printAndGetAllProductsWithCount() {

            Map<Product, Integer> sortedMapProducts = new TreeMap<>(products);
            List<Product> productListKeys = new ArrayList<>(sortedMapProducts.keySet());
            List<Integer> productSetValues = new ArrayList<>(sortedMapProducts.values());
            List<String> productString = new ArrayList<>();
            String s;
            for (int i = 0; i < productListKeys.size(); i++) {
                s = (i + 1 + ". " + productListKeys.get(i).productName) + " - " + productSetValues.
                        get(i) + " - " + productListKeys.get(i).price;
                productString.add(s);
            }
            for (String str : productString) {
                System.out.println(str);
            }
            return productListKeys;
        }

        public Shop(String name, double money) {
            this.name = name;
            this.money = money;
        }

        @Override
        public String toString() {
            return "name='" + name + '\'' +
                    ", money=" + money +
                    '}';
        }

        public void setProducts(Map<Product, Integer> products) {
            this.products = products;
        }
    }

    public static class SellProductException extends Exception {
        // необходимо реализовать констркутор
        public SellProductException(String message) {
            System.out.println(message);
        }
    }

    public static class ConsoleService {
        private Shop shop;
        private Human human;

        public void start() {
            Scanner inn = new Scanner(System.in);
            Set<Product> products = new HashSet<>();

            // shop(shop.name, shop.money)
            System.out.println("«адайте им€ и стартовый капитал магазина.");
            String s1 = inn.nextLine();

            String[] dataShop = s1.split(" ");

            this.shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));
            System.out.println("”кажите количество товаров");

            int amount;
            amount = inn.nextInt();
            int amountProductsOfShop = 0;
            inn = new Scanner(System.in);

            Map<Product, Integer> map = new HashMap<>();
            do {
                System.out.println("«аполните в формате: назначение товара, его стоимость и количество в наличии");
                String[] dataProductsOfShop;
                String s2 = inn.nextLine();

                dataProductsOfShop = s2.split(" ");
                Product pr = new Product(dataProductsOfShop[0], Double.parseDouble(dataProductsOfShop[1]));
                Integer in = Integer.parseInt(dataProductsOfShop[2]);
                map.put(pr, in);
                amountProductsOfShop++;
            } while (amountProductsOfShop < amount);
            this.shop.setProducts(map);

            // —оздаем отсортированный лист по цене тех продуктов что ввели с консоли
            List<Product> productList = new ArrayList<>(map.keySet());
            Collections.sort(productList);

            // human (human.firstName, human.lastName, human.money)
            System.out.println("¬ведите данные о человеке");
            String[] dataHuman = inn.nextLine().split(" ");
            this.human = new Human(dataHuman[0], dataHuman[1], Double.parseDouble(dataHuman[2]));
            this.human.products = products;
            System.out.println("¬ыберете пункт меню:\n1. ѕосмотреть список товаров\n2. ¬ыход");
            int var = inn.nextInt();

            if (var == 2) {
                inn.close();
            } else if (var == 1) {
                this.shop.printAndGetAllProductsWithCount();
                int buye = inn.nextInt() - 1;
                this.human.buyProduct(productList.get(buye), this.shop);
                inn.close();
            } else inn.close();
        }
    }
}




