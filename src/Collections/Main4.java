package Collections;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Map<Product, Integer> map = new HashMap<>();
        Product p1 = new Product("�������",7000);
        Product p2 = new Product("������",2000);
        Product p3 = new Product("����",9000);
        Product p4 = new Product("�����",4000);
        map.put(p1, 14);
        map.put(p2, 9);
        map.put(p3, 5);
        map.put(p4, 0);
        System.out.println("HashMap<> map = " + map);
        System.out.println("_______");

// HashSet �� ���������, � ��� �������� ��������� �� � ������� ����������
        Set<Product> setProducts = new HashSet<>(map.keySet());
        System.out.println("HashSet<> setProducts =" + setProducts);
        System.out.println("_______");

// ���������� Set ������� Collections.sort()
        List<Product> listProducts = new ArrayList<>(map.keySet());
        Collections.sort(listProducts);
        System.out.println("ArrayList<> listProducts = " + listProducts);
        System.out.println("__________");
// TreeMap ��������� Map
        Map<Product, Integer> sordedMap = new TreeMap<>(map);
        System.out.println("TreeMap<> sordedMap = " + sordedMap);
        System.out.println("________SET_____");

        ArrayList<Product> productKeys = new ArrayList<>(sordedMap.keySet());
        System.out.println(productKeys);
        System.out.println("--------ArrayList---------");

        ArrayList<Integer> productValues = new ArrayList<>(sordedMap.values());
//        Collections.sort(productValues);
        System.out.println(productValues);
        System.out.println("������� 6000 3\n" + "���� 4000 2\n" + "������ 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
        StringBuilder sortListSum = new StringBuilder();

        ArrayList<String> productString = new ArrayList<>();
        String s;
        for (int k = 0; k < productKeys.size(); k++) {
            s = (k+1 + ". " + productKeys.get(k).productName)+" - "+productValues.
                    get(k)+" - "+productKeys.get(k).price;
//            s = sortListSum.append(productKeys.get(k).productName).append(" - ").append(productValues.
//                    get(k)).append(" - ").append(productKeys.get(k).price).toString();
            productString.add(s);
        }
        for (String st : productString) {
            System.out.println(st);
        }
        System.out.println("__________TEST_________________");
        System.out.println("������� 6000 3\n" + "���� 4000 2\n" + "������ 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
        ConsoleService cS = new ConsoleService();
        cS.start();
//        Scanner inn = new Scanner(System.in);
//        System.out.println("��� ��� �����?");
//        String name1 = inn.nextLine();
//        System.out.printf("������������, %s!\n", name1);
//        System.out.println("________AAA__");


        /*Scanner inn = new Scanner(System.in);

        // shop(shop.name, shop.money)
        System.out.println("������ ��� ��������:\n ������� 1) ��� � 2) ��������� ������� ��������.");
        String[] dataShop = inn.nextLine().split(" ");
        Shop shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));
        System.out.println(shop);*/
        /*Product p1 = new Product("�������");
        Product p2 = new Product("������");
        Product p3 = new Product("����");
        Product p4 = new Product("�����");

        Product p10 = new Product("�������");
        Product p11 = new Product("�������");

        System.out.println(p1.equals(p10));
        System.out.println(p1.equals(p3));

        Map<Product, Integer> map = new HashMap<>();
        map.put(p1, 10);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 0);
        System.out.println("----MAP-----");
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("_________");
        System.out.println(map.containsKey(new Product("������")));
        System.out.println(map.containsKey(p10));
        System.out.println(map.containsKey(p11));
        System.out.println(map.get(p3));
        System.out.println("____null____");

        if (map.get(p11) == null || map.get(p11) == 0) {
            System.out.println(map.get(p3));
        }
        if (map.get(p4) == null || map.get(p4) == 0) {
            System.out.println(map.get(p3));
        }
        if (map.get(p10) == null || map.get(p10) == 0) {
            System.out.println(map.get(p4));
        } else {
            throw new SellProductException("�������� � ������ " + p4.getProductName() + " ��� � �������");
        }*/
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
//            ConsoleService consol = new ConsoleService();
//            shop = consol.shop;
            // ����� ��������� �� ���� 2 ��������� - �������� ����������� ��������
            // � �������, � ������� ������������ �������
            // ������ �������������� ����� sellProduct ������ Shop
            // ������ ���� �������� ����������,
            // ������� ����� ���������� ��� ������ ������ sellProduct
            try {
                shop.sellProduct(product, Human.this);
                this.products.add(product);
                this.money -= product.price;
            } catch (SellProductException e) {
                e.getMessage();
            }
            // � ������ �������� ������� - ������� ����������� � Set products
            // � � ��������� ����� �������� ���������� ��������� ��������

            // � ������ ��������� ������� / ���������� - � ������� ������ ����������
            // �������, �� ������� ������� �� ��������� - ��������� ����������
        }

        public Human(String firstName, String lastName, double money) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.money = money;
        }
        // getters
        // setters
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
//            ConsoleService console = new ConsoleService();
//            human = console.human;
            // �� ���� ��������� ��� ����������� ��������
            // � ��������, ������� ����� ���������� ���� �������
            // ����� ������ ��������� ������� ��������
            // � ������ ���� ����� ����������, ������ ������������� ����������
            // SellProductException � ������� -
            // "�������� � ������ {product_name} ��� � �������"
            if (this.products.get(product) == 0 || this.products.get(product) == null) {
                throw new SellProductException("�������� � ������ " + product.productName + " ��� � �������");
                // ����� ������ ��������� - ���������� �� ������� � ����������
                // � ������ ���� ������� ������������, ������ ������������� ����������
                // SellProductException � ������� -
                // "��������� {first_name lastName}, ��� ������� ������ ������������ �������
            } else if (human.money < product.price) {
                throw new SellProductException("��������� " + human.firstName + " " + human.lastName + ", ��� ������� ������ ������������ �������");
                // � ������ �������� �������, ������ ����������� ��� � ����������� ����������
                // ��������, � ��� �� ����������� �������� ���� � ������ ���, ����� ���� ������� �� �����
                // "{first_name} + ", �� ������� ��������� �������! � ���������, " + {shop_name}
            } else {
                // � ������ �������� �������, ������ ����������� ��� � ����������� ����������
                // ��������, � ��� �� ����������� �������� ���� � ������ ���, ����� ���� ������� �� �����
                // "{first_name} + ", �� ������� ��������� �������! � ���������, " + {shop_name}
                this.products.put(product, this.products.get(product) - 1);
                this.money += product.price - calculateNds(product.price);
                System.out.println(human.firstName + ", �� ������� ��������� �������! � ���������, " + this.name);
            }
        }

        private double calculateNds(double price) {
            // ����� ��������� �� ���� ����������� ���� ��������
            // ������ ���������� 13 % �� ��������� ��������
            return price * 0.13;
        }

        public List<Product> printAndGetAllProductsWithCount() {

            // ������ �������� � ������� ��� ��������� ������ � �� ����������
            // � ������� ����������� �� �� ����
            // ������ ������: 1. ������� - 2 - 12000.00
            // ������ �������� ������ ������� - ���������� ��� ConsoleService
            Map<Product, Integer> sortedMapProducts = new TreeMap<>(products);

            List<Product> productListKeys = new ArrayList<>(sortedMapProducts.keySet());
            List<Integer> productSetValues = new ArrayList<>(sortedMapProducts.values());
            List<String> productString = new ArrayList<>();
            String s;
            for (int i = 0; i < productListKeys.size(); i++) {
                s = (i+1 + ". " + productListKeys.get(i).productName) + " - " + productSetValues.
                        get(i) + " - " + productListKeys.get(i).price;
                productString.add(s);
            }
            for (String str : productString) {
                System.out.println(str);
            }
            return productListKeys;
        }
//        ������� 6000.00 3
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
//        String message;
        public SellProductException(String message) {
//            this.message = message;
            System.out.println(message);
        }

//        @Override
//        public String getMessage() {
//            return this.message;
//        }

        // ���������� ����������� �����������

    }


    public static class ConsoleService {
        private Shop shop;
        private Human human;
        public void start() {
            Scanner inn = new Scanner(System.in);
            Set<Product> products = new HashSet<>();
//            List<Product> productList;

//            Set<Product> products = new HashSet<>();

            // shop(shop.name, shop.money)
            System.out.println("������� ��� � ��������� ������� ��������.");
            String s1 = inn.nextLine();

            String[] dataShop = s1.split(" ");

            this.shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));


            // ���������� ��������� ��� ������� Map products � �������� - shop.products
            // ������� ��� ����� sout � ������� ��������
            System.out.println("������� ���������� �������");

            int amount;
            amount = inn.nextInt();
            int amountProductsOfShop = 0;
            inn = new Scanner(System.in);

            Map<Product, Integer> map = new HashMap<>();

// DNS 1000
            do {
                System.out.println("��������� � �������: ���������� ������, ��� ��������� � ���������� � �������");
                String[] dataProductsOfShop;
                String s2 = inn.nextLine();

                dataProductsOfShop = s2.split(" ");
                Product pr = new Product(dataProductsOfShop[0],Double.parseDouble(dataProductsOfShop[1]));
                Integer in =Integer.parseInt(dataProductsOfShop[2]);
                map.put(pr, in);
                amountProductsOfShop++;
            } while (amountProductsOfShop < amount);
            shop.setProducts(map);

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

            if(var == 2) {
                inn.close();
            } else if(var == 1) {
                this.shop.printAndGetAllProductsWithCount();
                int buye = inn.nextInt() - 1;
                this.human.buyProduct(productList.get(buye), this.shop);
                inn.close();
            } else inn.close();

            // ����� ��������� ��� ����������� ���������� ����������

    /*
       ����� ������������ ��� ������� ���������� � ������ main
       � ������ ���������� ��������� ��������� ������ ��� ��������
       � ��������

       ������������ ������ �� �������� ���������� ���������:

       1. ������� ��� � ��������� ������� ��������
       ������������ ������, � ������� DNS 20000.00

       2. ������� ���������� ������� - � ������� 3

       3. ���������� ������ = ���������� ����������� �������, � ������ ������ 3

       ���������� � �������: �������� ������, ��� ��������� � ���������� � �������
       � ������� - ������� 6000.00 3

       4. ������������ ��������� ������ � �������� - ���, �������,
       � ���������� �������� �������
       � ������� - ���� ������ 200000.00


       ����� �������� ���������� ������������ ������ ��������� ����
       �� ���������� ��������:

       1. ���������� ������ �������
       2. �����

       ��� ����� � ������� 1 - ������������ ��������� ������ ���������
       � ������������ � ������� ������ printAndGetAllProductsWithCount ������ Shop

       ��� ������ ������-���� �������� �� ������, �� ��� �������,
       � ������� 2 - ���������� ������� ������� ��������� � ����������� � �������
       ������ buyProduct ������ Human

       ����� �������� ������� ��������� ��������� ������

       ��� ����� ����� 2 � ������� - ��������� ��������� ������

    */
        }
    }
}




