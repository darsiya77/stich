package Archive._2PrimitiveTypes.PrimitivnieTipi;

public class Tovar {
    public double priceCalculation(double price, int count) {
        return price*count; //Твой код здесь
    }

    public  void main(String[] args) {
        double y;
        y=priceCalculation(8.5,2);
        System.out.println(y);
    }
}
   /* Напишите публичный метод priceCalculation, который считает стоимость товара.
        В метод передается цена товара (может быть дробной) и количество товара, метод должен возвращать итоговую цену покупки.

        Пример ввода: 8.50, 2
        Пример вывода: 17.0

        Требования:
        Сигнатура метода должна быть: priceCalculation(double price, int count)
___________________________________________________________________________________
        public double priceCalculation(double price, int count) {
	//Твой код здесь
}
        */
