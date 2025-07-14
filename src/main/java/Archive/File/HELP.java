package Archive.File;
import java.io.File;
import java.io.IOException;
// В Java за ввод/вывод отвечает большое кол-во классов (живут в import java.io.File; и в других пакетах).
// Некоторые из них дублируют функциональность друг друга.
//Задачу доступа к файловой системе в Джава решает класс File.
// Экземпляры класса File представляют собой ФАЙЛЫ и ДИРЕКТОРИИ НА ДИСКЕ
// ПОТОК ВВОДА - объект, из которого можно СЧИТАТЬ данные
// ПОТОК ВЫВОДА - объект, в который можно ЗАПИСЫВАТЬ данные


public class HELP {
    // =================================  java.io.File  ====================================================

    // on Windows :
    File javaExecutable = new File (
            "C :\\ jdk1 .8.0 _60 \\ bin \\ java .exe ");
    // "слэш" в строковых литералах нужно экранировать, потому он здесь удвоен - \
    File networkFolder = new File (
            " \\\\ server \\ share ");
    // on Unix :
    File lsExecutable = new File ("/usr / bin /ls");
    // =================================  Сборка пути  ====================================================

    // Если я в программе формирую пути к файлам, то надо пользваться константами File.separator или File.separatorChar
    // Зависит от текущей ОС под кот.запущена джава программа
    String sourceDirName = " src ";
    String mainFileName = " Main . java ";
    String mainFilePath = sourceDirName
            + File.separator
            + mainFileName
            + File.pathSeparator // - символ, кот. разделяетя набор путей. Под Windows - ;
            + File.pathSeparatorChar; // Unix - :
    // Еще 1 способ собрать путь с правильным разделителем это использовать к-р File с 2-мя параметрами:
    // он внутри себя склеит 2 комп-та пути используя нужный разделитель
    File mainFile =
            new File ( sourceDirName , mainFileName );

    public static void main(String[] args) throws IOException {
        // ====================== Абсолютные и относительные пути ===========================================

        // Экз-р кл.File можено создать с абс.путем и с относительным:
        File absoluteFile = new File ("/usr / bin / java ");// начиная с корня файловой системы
        absoluteFile.isAbsolute (); // true
        absoluteFile . getAbsolutePath ();
        // / usr/ bin / java
        File relativeFile = new File (" readme . txt ");// нужно знать некую базовую директорию
        relativeFile . isAbsolute (); // false
        relativeFile . getAbsolutePath ();
// / home / stepic / readme . txt
        // ===============================  Разбор пути  ========================================================

        File file = new File ("/usr /bin / java ");
        String path = file . getPath (); // / usr / bin / java
        String name = file . getName (); // java
        String parent = file . getParent (); // / usr / bin
        // - отдельного метода для получения расширения НЕТ
        // =============================== Канонические пути ===================================================

        // есть 2 экз. файл, как понять указывают ли они на 1 и тот же файл на диске?
        // приведя 2 пути к каноническому виду их можно сравнивать как строки
        // getCanonicalPath () могут бросать исключения - IOException, т.к. требует обращаения к диску
        File file1 = new File ("./ prj /../ symlink . txt ");
        String canonicalPath = file1. getCanonicalPath ();
// "/ home / stepic / readme .txt
        //==================================== Работа с файлами ===============================================

        // Существование объекта File не привязано к существованию файла или директории на диске. Конструктор File("/usr /bin / java ")
        // ничего на диске не создает. Т.о путь может указывать на несуществующий файл или директорию.
        File java = new File ("/usr /bin / java ");
        java . exists (); // true
        java . isFile (); // true
        java . isDirectory (); // false
        java . length (); // 1536
        java . lastModified (); // 1231914805000

        //==================================== Работа с директориями ===============================================
        File usrbin = new File ("/ usr /bin ");
        usrbin . exists (); // true
        usrbin . isFile (); // false
        usrbin . isDirectory (); // true
        usrbin . list (); // String [] - получаем содержимое директории
        usrbin . listFiles (); // File [] - возвращает массив экземпляров File - возвращает содержимое только на 1 уровень

        //==================================== Фильтрация файлов ===============================================
        // Есть перегруж-е вар-ты методов list и listFiles принимающие фильтр
        // Фильтр это объект, реализующий интерфейс либо FileFilter либо FilenameFilter. Эти интерфейсы содержат
        // абстр.метод accept() по этому их можно инстанцировать при пом. лямбда выражения

        File dir = null;
        File [] javaSourceFiles = dir . listFiles (
                f -> f . getName (). endsWith (". java " ));
// java .io. FileFilter :
// boolean accept ( File pathname )
// java .io. FilenameFilter :
// boolean accept ( File dir , String name )

        //==================================== Создание файла ================================================
        // createNewFile () - создает новый пустой файл. Этот метод используется не оч. часто, т.к. обычно нам нужно
        // не просто создать файл, а записать в него данные. Аклассны кот.зантмаются записью данных, сами его создают
        // createNewFile () - нужен что бы убедиться, что этот файл создан именно нашей программой именно сейчас

        try {
            boolean success = file . createNewFile ();
        } catch ( IOException e) {
// handle error
        }

        // ================================== Создание директории ================================================
        File dir1 = new File ("a/b/c/d");
        boolean success = dir1 . mkdir ();       // за 1 вызов может создать только 1 директорию
        boolean success2 = dir1 . mkdirs ();     // за 1 вызов может создать все уровни вложенности

        // =============================== Удаление файла или директории =========================================

        boolean success1 = file . delete ();    //  - удаляет файл или директорию. Обязательно должна быть пустой иначе не удалит

        // ================================ Переименование/перемещение ===============================================
        File targetFile = new File("");
        boolean success3 = file . renameTo ( targetFile );

        // ================================ Метода копирования в кл. File вообще нет ===================================
        //

    }
}

