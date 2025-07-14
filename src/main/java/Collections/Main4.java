package Collections;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Map<Product, Integer> map = new HashMap<>();
        Product p1 = new Product("Пылесос",7000);
        Product p2 = new Product("Чайник",2000);
        Product p3 = new Product("Стол",9000);
        Product p4 = new Product("Диван",4000);
        map.put(p1, 14);
        map.put(p2, 9);
        map.put(p3, 5);
        map.put(p4, 0);
        System.out.println("HashMap<> map = " + map);
        System.out.println("_______");

// HashSet не сортирует, в нем элементы размещены не в порядке добавления
        Set<Product> setProducts = new HashSet<>(map.keySet());
        System.out.println("HashSet<> setProducts =" + setProducts);
        System.out.println("_______");

// сортировка Set методом Collections.sort()
        List<Product> listProducts = new ArrayList<>(map.keySet());
        Collections.sort(listProducts);
        System.out.println("ArrayList<> listProducts = " + listProducts);
        System.out.println("__________");
// TreeMap сортирует Map
        Map<Product, Integer> sordedMap = new TreeMap<>(map);
        System.out.println("TreeMap<> sordedMap = " + sordedMap);
        System.out.println("________SET_____");

        ArrayList<Product> productKeys = new ArrayList<>(sordedMap.keySet());
        System.out.println(productKeys);
        System.out.println("--------ArrayList---------");

        ArrayList<Integer> productValues = new ArrayList<>(sordedMap.values());
//        Collections.sort(productValues);
        System.out.println(productValues);
        System.out.println("Пылесос 6000 3\n" + "Стол 4000 2\n" + "Чайник 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
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
        System.out.println("Пылесос 6000 3\n" + "Стол 4000 2\n" + "Чайник 3000 8\n" + "DNS 30000\n" + "Ivan Ivanov 15000\n");
        ConsoleService cS = new ConsoleService();
        cS.start();
//        Scanner inn = new Scanner(System.in);
//        System.out.println("Как вас зовут?");
//        String name1 = inn.nextLine();
//        System.out.printf("Здравствуйте, %s!\n", name1);
//        System.out.println("________AAA__");


        /*Scanner inn = new Scanner(System.in);

        // shop(shop.name, shop.money)
        System.out.println("Данные для магазина:\n Задайте 1) имя и 2) стартовый капитал магазина.");
        String[] dataShop = inn.nextLine().split(" ");
        Shop shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));
        System.out.println(shop);*/
        /*Product p1 = new Product("Пылесос");
        Product p2 = new Product("Чайник");
        Product p3 = new Product("Стол");
        Product p4 = new Product("Диван");

        Product p10 = new Product("Пылесос");
        Product p11 = new Product("Кровать");

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
        System.out.println(map.containsKey(new Product("Чайник")));
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
            throw new SellProductException("Продукта с именем " + p4.getProductName() + " нет в наличии");
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
            //используем метод compareTo из класса Double для сравнения цен
            int result = d.compareTo(p.price);
            if (result == 0) {
                //используем метод compareTo из класса String для сравнения имен
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
//            ConsoleService consol = new ConsoleService();
//            shop = consol.shop;
            // Метод принимает на вход 2 параметра - название покупаемого продукта
            // и магазин, в котором производится покупка
            // Должен использоваться метод sellProduct класса Shop
            // Должны быть обработы исключения,
            // которые могут возникнуть при вызове метода sellProduct
            try {
                shop.sellProduct(product, Human.this);
                this.products.add(product);
                this.money -= product.price;
            } catch (SellProductException e) {
                e.getMessage();
            }
            // В случае успешной покупки - продукт добавляется в Set products
            // и с денежнего счета человека вычитается стоимость продукта

            // В случае неудачной покупки / исключения - в консоль должна выводиться
            // причина, по которой покупка не произошла - сообщение исключения
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
        private double money; // денежный счет магазина
        private Map<Product, Integer> products; // продукты и их количество
        //  количество может быть 0 !


        public void sellProduct(Product product, Human human) throws SellProductException {
//            ConsoleService console = new ConsoleService();
//            human = console.human;
            // На вход принимает имя покупаемого продукта
            // и человека, который хочет приобрести этот продукт
            // Метод должен проверять наличие продукта
            // В случае если товар закончился, должно выбрасываться исключение
            // SellProductException с текстом -
            // "Продукта с именем {product_name} нет в наличии"
            if (this.products.get(product) == 0 || this.products.get(product) == null) {
                throw new SellProductException("Продукта с именем " + product.productName + " нет в наличии");
                // Метод должен проверять - достаточно ли средств у покупателя
                // В случае если средств недостаточно, должно выбрасываться исключение
                // SellProductException с текстом -
                // "Уважаемый {first_name lastName}, для покупки товара недостаточно средств
            } else if (human.money < product.price) {
                throw new SellProductException("Уважаемый " + human.firstName + " " + human.lastName + ", для покупки товара недостаточно средств");
                // В случае успешной покупки, должен вычисляться НДС и уменьшаться количество
                // продукта, а так же пополняться денежный счет с учетом НДС, после чего выводит на экран
                // "{first_name} + ", вы успешно совершили покупку! С уважением, " + {shop_name}
            } else {
                // В случае успешной покупки, должен вычисляться НДС и уменьшаться количество
                // продукта, а так же пополняться денежный счет с учетом НДС, после чего выводит на экран
                // "{first_name} + ", вы успешно совершили покупку! С уважением, " + {shop_name}
                this.products.put(product, this.products.get(product) - 1);
                this.money += product.price - calculateNds(product.price);
                System.out.println(human.firstName + ", вы успешно совершили покупку! С уважением, " + this.name);
            }
        }

        private double calculateNds(double price) {
            // Метод принимает на вход изначальную цену продукта
            // Должен возвращать 13 % от стоимости продукта
            return price * 0.13;
        }

        public List<Product> printAndGetAllProductsWithCount() {

            // Должен выводить в консоль все имеющиеся товары и их количество
            // в порядке возрастания по их цене
            // Формат вывода: 1. Пылесос - 2 - 12000.00
            // Должен отдавать список товаров - необходимо для ConsoleService
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
//        Пылесос 6000.00 3
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

        // необходимо реализовать констркутор

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
            System.out.println("Задайте имя и стартовый капитал магазина.");
            String s1 = inn.nextLine();

            String[] dataShop = s1.split(" ");

            this.shop = new Shop(dataShop[0], Double.parseDouble(dataShop[1]));


            // количество элементов для перечня Map products в магазине - shop.products
            // сколько раз будет sout с данными продукта
            System.out.println("Укажите количество товаров");

            int amount;
            amount = inn.nextInt();
            int amountProductsOfShop = 0;
            inn = new Scanner(System.in);

            Map<Product, Integer> map = new HashMap<>();

// DNS 1000
            do {
                System.out.println("Заполните в формате: назначение товара, его стоимость и количество в наличии");
                String[] dataProductsOfShop;
                String s2 = inn.nextLine();

                dataProductsOfShop = s2.split(" ");
                Product pr = new Product(dataProductsOfShop[0],Double.parseDouble(dataProductsOfShop[1]));
                Integer in =Integer.parseInt(dataProductsOfShop[2]);
                map.put(pr, in);
                amountProductsOfShop++;
            } while (amountProductsOfShop < amount);
            shop.setProducts(map);

            // Создаем отсортированный лист по цене тех продуктов что ввели с консоли
            List<Product> productList = new ArrayList<>(map.keySet());
            Collections.sort(productList);

            // human (human.firstName, human.lastName, human.money)
            System.out.println("Введите данные о человеке");
            String[] dataHuman = inn.nextLine().split(" ");
            this.human = new Human(dataHuman[0], dataHuman[1], Double.parseDouble(dataHuman[2]));
            this.human.products = products;
            System.out.println("Выберете пункт меню:\n1. Посмотреть список товаров\n2. Выход");
            int var = inn.nextInt();

            if(var == 2) {
                inn.close();
            } else if(var == 1) {
                this.shop.printAndGetAllProductsWithCount();
                int buye = inn.nextInt() - 1;
                this.human.buyProduct(productList.get(buye), this.shop);
                inn.close();
            } else inn.close();

            // Метод необходим для консольного управления программой

    /*
       Метод используется при запуске приложения в методе main
       и должен изначально требовать заполнить данные для магазина
       и человека

       Пользователю должны по очередно выводиться сообщения:

       1. Задайте имя и стартовый капитал магазина
       Пользователь вводит, к примеру DNS 20000.00

       2. Укажите количество товаров - к примеру 3

       3. Количество товара = количество заполняемых товаров, в данном случае 3

       Заполнение в формате: название товара, его стоимость и количество в наличии
       К примеру - Пылесос 6000.00 3

       4. Предлагается заполнить данные о человеке - имя, фамилия,
       и количество денежных средств
       К примеру - Иван Иванов 200000.00


       После процесса заполнения пользователю должно вывестись меню
       со следующими пунктами:

       1. Посмотреть список товаров
       2. Выход

       При вводе в консоль 1 - пользователю выводится список продуктов
       в соответствии с логикой метода printAndGetAllProductsWithCount класса Shop

       При выборе какого-либо продукта из списка, по его позиции,
       к примеру 2 - происходит процесс покупки человеком в соответсвии с логикой
       метода buyProduct класса Human

       После процесса покупки программа завершает работу

       При вводе цифры 2 в консоль - программа завершает работу

    */
        }
    }
}




