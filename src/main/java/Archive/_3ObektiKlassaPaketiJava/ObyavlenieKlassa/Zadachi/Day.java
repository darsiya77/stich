package Archive._3ObektiKlassaPaketiJava.ObyavlenieKlassa.Zadachi;

public enum Day {
    MONDAY("Понедельник",false),
    TUESDAY("Вторник", false),
    WEDNESDAY("Среда", false),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", true);
    final String meaning;
    final boolean vocationStatus;

    Day(String meaning, boolean vocationStatus){
        this.meaning = meaning;
        this.vocationStatus = vocationStatus;
    }
    public boolean isWeekend() {
        return vocationStatus;
    }
    public String getRusName() {
        return meaning;
    }
}

    /*Реализовать Enum Day, который будет отвечать за дни недели. Этот Enum должен содержать следующие элементы:
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        Также в этом Enum должны быть релизованы два метода:
        1. public boolean isWeekend() — метод, отвечающий на вопрос, является ли конкретный элемент выходным днем.
        Выходными днями являются только суббота и воскресенье.
        2. public String getRusName() — метод, возвращающий русское название дня недели.*/