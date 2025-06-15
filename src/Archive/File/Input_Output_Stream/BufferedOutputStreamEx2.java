package Archive.File.Input_Output_Stream;

import java.io.*;

// https://metanit.com/java/tutorial/6.5.php

/*Для оптимизации операций ввода-вывода используются буферизуемые потоки. Эти потоки добавляют к стандартным
специальный буфер в памяти, с помощью которого повышается производительность при чтении и записи потоков.
Класс BufferedInputStream накапливает вводимые данные в специальном буфере без постоянного обращения к устройству ввода.

    BufferedInputStream(InputStream inputStream)
    BufferedInputStream(InputStream inputStream, int bufSize)

Первый параметр - это поток ввода, с которого данные будут считываться в буфер. Второй параметр - размер буфера.

Например, буферизируем считывание данных из потока ByteArrayInputStream:
*/

public class BufferedOutputStreamEx2 {
    public static void main(String[] args) {

        String text1 = "Hello world!";
        byte[] buffer1 = text1.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer1);

        try (BufferedInputStream bis = new BufferedInputStream(in)) {

            int c;
            while ((c = bis.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        System.out.println();

/*Класс BufferedInputStream в конструкторе принимает объект InputStream. В данном случае таким объектом является экземпляр
класса ByteArrayInputStream.

Как и все потоки ввода BufferedInputStream обладает методом read(), который считывает данные. И здесь мы считываем
с помощью метода read каждый байт из массива buffer.

Фактические все то же самое можно было сделать и с помощью одного ByteArrayInputStream, не прибегая к буферизированному
потоку. Класс BufferedInputStream просто оптимизирует производительность при работе с потоком ByteArrayInputStream.
Естественно вместо ByteArrayInputStream может использоваться любой другой класс, который унаследован от InputStream.

Класс BufferedOutputStream аналогично создает буфер для потоков вывода. Этот буфер накапливает выводимые байты без
постоянного обращения к устройству. И когда буфер заполнен, производится запись данных.

        BufferedOutputStream(OutputStream outputStream)
        BufferedOutputStream(OutputStream outputStream, int bufSize)

Первый параметр - это поток вывода, который унаследован от OutputStream, а второй параметр - размер буфера.
*/
        String text2 = "Hello world!";                                             // строка для записи
        try (FileOutputStream out = new FileOutputStream("notes.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
                                                                                   // перевод строки в байты
            byte[] buffer2 = text2.getBytes();
            bos.write(buffer2, 0, buffer2.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
/*Класс BufferedOutputStream в конструкторе принимает в качестве параметра объект OutputStream - в данном случае это
файловый поток вывода FileOutputStream. И также производится запись в файл. Опять же BufferedOutputStream не добавляет
много новой функциональности, он просто оптимизирует действие потока вывода.*/

    }
}
