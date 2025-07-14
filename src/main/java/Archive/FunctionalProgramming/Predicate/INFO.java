package Archive.FunctionalProgramming.Predicate;

// https://drive.google.com/file/d/1ryu96JpsNycVsqBaSo3VEqKPyMpwGNMd/view
// https://youtu.be/rfVhHnxBdc0?si=itjxG6Jr9ymtYBWs

public @interface INFO {
}
//    boolean test(T t);

/*  Predicate<T> - функциональный интерфейс появившийся в Java 8. Используется для
    проверки того или иного условия. Основная область применения это фильтрация данных
    (подходит объект для дальнейшей обработки или нет).*/

/*    boolean test(T t) Проверяет удовлетворяет ли объект по ссылке t
    заданному условию. Если да то метод должен вернуть
        true, в противном случае false.

default Predicate<T> and(Predicate<? super T> other) Возвращает составной предикат (в виде краткого
        логического И) на основе текущего и того что выступает
        параметром other.

default Predicate<T> or(Predicate<? super T> other) Возвращает составной предикат (в виде краткого

        логического ИЛИ) на основе текущего и того что выступает
        параметром other.

default Predicate<T> negate() Возвращает предикат в виде логического НЕ на основании

        текущего предиката

static <T> Predicate<T> not(Predicate<? super T> other) Возвращает предикат в виде логического НЕ на основе
        предиката используемого в качестве параметра other.
static <T> Predicate<T> isEqual(Object targetRef) Возвращает предикат, который проверяет, равны ли два
        аргумента согласно Objects.equals (Object, Object). Объект
        с которым будут сравниваться другие задается
        параметром targetRef*/
