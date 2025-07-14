package Archive.Generics;

import java.util.Optional;

/*Какие операции разрешены внутри метода? ("Разрешены" = "Компилятор скомпилирует")
- Создание массива X
- Проверка (obj instanceof X)
- Приведение obj к типу X     ------------------------------------->  +
- Создание экземпляра X
- Получение экземпляра Optional<x> через Optional.empty() --------->  +
- Проверка (obj instanceof Optional<x>)
*/
public class Example<X>{
    public void someMethod(Object obj) {
//        X xArr[] = new X[1];
//        boolean b2 = (obj instanceof X);
        X x1 = (X) obj;
//        X x3 = new X();
        Optional<X> x2 = Optional.empty();
//        boolean b1 = (obj instanceof Optional<X>);



    }
}