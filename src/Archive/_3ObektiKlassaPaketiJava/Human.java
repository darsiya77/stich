package Archive._3ObektiKlassaPaketiJava;

public class Human {
    private final String secret; //���������
    private final String news; //�������
    private final String experience; //����
    private final String gossip; //�������

    public Human(String secret, String news, String experience, String gossip) {
        this.secret = secret;
        this.news = news;
        this.experience = experience;
        this.gossip = gossip;
    }
    private String getSecret() {
        return secret;
    }
    public String getNews() {
        return news;
    }
    protected String getExperience() {
        return experience;
    }
    String getGossip() {
        return gossip;
    }

     //���� ��� �����
}

/*
        1. secret � ������ ������� ����� ������, ������� �� �� �� ����� �������� �� � ���.

        2. news � ������ ������� ����� �������, ������� �� ����� �� ���������� ����, ��� ��� �� ���� �������.

        3. experience � ����. ������ ������� �������� ��������� ��������� ������, �������� � �������� �� ����� �� ����
        � ������, ���� � ����, � ��� ��������� � ����� ���� (������)

        4. gossip � �������. ��� ����� �����������, �� ������ ��� ��� ��� ������� ������ ���� (������).
�������:

        �������� � ����� Human 4 ������:

        1. getSecret()

        2. getNews()

        3. getExperience()

        4. getGossip()

        ������� ������� ��� ����������� ��� ������� �������� ������ ����������� � ������� ������. ��� ����� �����������
        � �������� ������ ������������ �������.*/
