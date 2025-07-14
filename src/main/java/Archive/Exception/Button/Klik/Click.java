package Archive.Exception.Button.Klik;

import Archive.Exception.Button.IEventHandler;

public class Click {
    public static void main(String[] args) {
        Click pressLight = new Click(new Light());
        Click pressTV = new Click(new TV());
        pressLight.click();
        pressLight.click();
        pressTV.click();
        pressTV.click();
    }

    IEventHandler iEventHandler;

    public Click(IEventHandler iEventHandler) {
        this.iEventHandler = iEventHandler;
    }
    public void click() {
        iEventHandler.execute();
    }
}
/*� ������ Click ������ ������ (����������� Click(...)) �� ������, ����������� ��������� IEventHandler ����� ����
���� ������ �� ����� �������. ���� ����� ����� ������ 1 �������, � ������ Light � �V, ����������� ��������� ����� 2
�������. �.�. ������� 1,2 �� ������� ��. �� ��. � ����� ���� ������ ��������� �����������.
 */
