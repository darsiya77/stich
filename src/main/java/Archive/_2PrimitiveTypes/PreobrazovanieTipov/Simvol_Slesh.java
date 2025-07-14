package Archive._2PrimitiveTypes.PreobrazovanieTipov;

public class Simvol_Slesh {
    public static char charExpression(int a){
        return (char)('\\'+a);
     /*   char q = '\\';
        char w = (char)(a);
        char s = (char)(q+w);
         return s;*/
    }
    public static void main(String[] args) {

        System.out.println(charExpression(1));
    }
}
/* Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
        В качестве примера написано заведомо неправильное выражение. Исправьте его.

        Требования:
        1. Сигнатура метода должна быть: charExpression(int a)
        _________________________________________________________________
        public static char charExpression(int a) {
	//Твой код здесь
}
        */

