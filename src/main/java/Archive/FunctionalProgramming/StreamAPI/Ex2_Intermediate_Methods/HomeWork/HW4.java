package Archive.FunctionalProgramming.StreamAPI.Ex2_Intermediate_Methods.HomeWork;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HW4 {
    public static void main(String[] args) {

        String xmlLines = "<dependency>\n" +
                "<groupId>junit</groupId>\n" +
                "<artifactId>junit</artifactId>\n" +
                "<version>4.4</version>\n" +
                "<scope>test</scope>\n" +
                "</dependency>\n" +
                "<dependency>\n" +
                "<groupId>org.powermock</groupId>\n" +
                "<artifactId>powermock-reflect</artifactId>\n" +
                "<version>3.2</version>\n" +
                "</dependency>";

        // ������������ ����� ����� � ��������� �������� �����

        List<String> groupIds = Arrays.stream(xmlLines.split("\\s+"))
                .filter(line -> line.contains("<groupId>")) // ��������� ������ � groupId
                .map(line -> {
                    // ���������� ���������� ��������� ��� ���������� ����������� ����
                    Matcher m = Pattern.compile("<groupId>(.*?)</groupId>").matcher(line);
                    return m.find() ? m.group(1) : null;
                })
                .filter(java.util.Objects::nonNull) // ������� ��������� null (���� ���-�� ����� �� ���)
                .collect(Collectors.toList());

        // ������� ���������
        groupIds.forEach(System.out::println);
    }

}

/*
            ���� �������� �������� XML ��������� (pom.xml � ������������ � Maven ��� ��������
        ������������)
<dependency>
<groupId>junit</groupId>
<artifactId>junit</artifactId>
<version>4.4</version>
<scope>test</scope>
</dependency>
<dependency>
<groupId>org.powermock</groupId>
<artifactId>powermock-reflect</artifactId>
<version>3.2</version>
</dependency>

        ��������� ��� ������ � ������ �����, �������� ����� �� ��� ������ � �������� �������� � ���� <groupid> �
        �������� ��������� � ������ �����.
        */
