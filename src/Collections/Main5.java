package Collections;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        System.out.println("__________TEST_________________");
        System.out.println("������� 6000 3\n" + "���� 4000 2\n" + "������ 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
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
            //���������� ����� compareTo �� ������ Double ��� ��������� ���
            int result = d.compareTo(p.price);
            if (result == 0) {
                //���������� ����� compareTo �� ������ String ��� ��������� ����
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
                    " ���� = " + price +
                    ") ";
        }

    }

    public static class Human implements Buyer {
        private String firstName;
        private String lastName;
        private double money; // �������� ���� ��������
        private Set<Product> products; // ��������� ��������

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
        private double money; // �������� ���� ��������
        private Map<Product, Integer> products; // �������� � �� ����������

        //  ���������� ����� ���� 0 !
        public void sellProduct(Product product, Human human) throws SellProductException {
            if (this.products.get(product) == 0 || this.products.get(product) == null) {
                throw new SellProductException("�������� � ������ " + product.productName + " ��� � �������");

            } else if (human.money < product.price) {
                throw new SellProductException("��������� " + human.firstName + " " + human.lastName + ", ��� ������� ������ ������������ �������");
            } else {

                this.products.put(product, this.products.get(product) - 1);
                this.money += product.price - calculateNds(product.price);
                System.out.println(human.firstName + ", �� ������� ��������� �������! � ���������, " + this.name);
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
        // ���������� ����������� �����������
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
            System.out.println("������� ��� � ��������� ������� ��������.");
            String s1 = inn.nextLine();

            String[] dataShop = s1.split(" ");

            this.shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));
            System.out.println("������� ���������� �������");

            int amount;
            amount = inn.nextInt();
            int amountProductsOfShop = 0;
            inn = new Scanner(System.in);

            Map<Product, Integer> map = new HashMap<>();
            do {
                System.out.println("��������� � �������: ���������� ������, ��� ��������� � ���������� � �������");
                String[] dataProductsOfShop;
                String s2 = inn.nextLine();

                dataProductsOfShop = s2.split(" ");
                Product pr = new Product(dataProductsOfShop[0], Double.parseDouble(dataProductsOfShop[1]));
                Integer in = Integer.parseInt(dataProductsOfShop[2]);
                map.put(pr, in);
                amountProductsOfShop++;
            } while (amountProductsOfShop < amount);
            this.shop.setProducts(map);

            // ������� ��������������� ���� �� ���� ��� ��������� ��� ����� � �������
            List<Product> productList = new ArrayList<>(map.keySet());
            Collections.sort(productList);

            // human (human.firstName, human.lastName, human.money)
            System.out.println("������� ������ � ��������");
            String[] dataHuman = inn.nextLine().split(" ");
            this.human = new Human(dataHuman[0], dataHuman[1], Double.parseDouble(dataHuman[2]));
            this.human.products = products;
            System.out.println("�������� ����� ����:\n1. ���������� ������ �������\n2. �����");
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




