package Archive.Generics;

import java.util.Optional;

/*����� �������� ��������� ������ ������? ("���������" = "���������� ������������")
- �������� ������� X
- �������� (obj instanceof X)
- ���������� obj � ���� X     ------------------------------------->  +
- �������� ���������� X
- ��������� ���������� Optional<x> ����� Optional.empty() --------->  +
- �������� (obj instanceof Optional<x>)
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