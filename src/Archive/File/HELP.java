package Archive.File;
import java.io.File;
import java.io.IOException;
// � Java �� ����/����� �������� ������� ���-�� ������� (����� � import java.io.File; � � ������ �������).
// ��������� �� ��� ��������� ���������������� ���� �����.
//������ ������� � �������� ������� � ����� ������ ����� File.
// ���������� ������ File ������������ ����� ����� � ���������� �� �����
// ����� ����� - ������, �� �������� ����� ������� ������
// ����� ������ - ������, � ������� ����� ���������� ������


public class HELP {
    // =================================  java.io.File  ====================================================

    // on Windows :
    File javaExecutable = new File (
            "C :\\ jdk1 .8.0 _60 \\ bin \\ java .exe ");
    // "����" � ��������� ��������� ����� ������������, ������ �� ����� ������ - \
    File networkFolder = new File (
            " \\\\ server \\ share ");
    // on Unix :
    File lsExecutable = new File ("/usr / bin /ls");
    // =================================  ������ ����  ====================================================

    // ���� � � ��������� �������� ���� � ������, �� ���� ����������� ����������� File.separator ��� File.separatorChar
    // ������� �� ������� �� ��� ���.�������� ����� ���������
    String sourceDirName = " src ";
    String mainFileName = " Main . java ";
    String mainFilePath = sourceDirName
            + File.separator
            + mainFileName
            + File.pathSeparator // - ������, ���. ���������� ����� �����. ��� Windows - ;
            + File.pathSeparatorChar; // Unix - :
    // ��� 1 ������ ������� ���� � ���������� ������������ ��� ������������ �-� File � 2-�� �����������:
    // �� ������ ���� ������ 2 ����-�� ���� ��������� ������ �����������
    File mainFile =
            new File ( sourceDirName , mainFileName );

    public static void main(String[] args) throws IOException {
        // ====================== ���������� � ������������� ���� ===========================================

        // ���-� ��.File ������ ������� � ���.����� � � �������������:
        File absoluteFile = new File ("/usr / bin / java ");// ������� � ����� �������� �������
        absoluteFile.isAbsolute (); // true
        absoluteFile . getAbsolutePath ();
        // / usr/ bin / java
        File relativeFile = new File (" readme . txt ");// ����� ����� ����� ������� ����������
        relativeFile . isAbsolute (); // false
        relativeFile . getAbsolutePath ();
// / home / stepic / readme . txt
        // ===============================  ������ ����  ========================================================

        File file = new File ("/usr /bin / java ");
        String path = file . getPath (); // / usr / bin / java
        String name = file . getName (); // java
        String parent = file . getParent (); // / usr / bin
        // - ���������� ������ ��� ��������� ���������� ���
        // =============================== ������������ ���� ===================================================

        // ���� 2 ���. ����, ��� ������ ��������� �� ��� �� 1 � ��� �� ���� �� �����?
        // ������� 2 ���� � ������������� ���� �� ����� ���������� ��� ������
        // getCanonicalPath () ����� ������� ���������� - IOException, �.�. ������� ���������� � �����
        File file1 = new File ("./ prj /../ symlink . txt ");
        String canonicalPath = file1. getCanonicalPath ();
// "/ home / stepic / readme .txt
        //==================================== ������ � ������� ===============================================

        // ������������� ������� File �� ��������� � ������������� ����� ��� ���������� �� �����. ����������� File("/usr /bin / java ")
        // ������ �� ����� �� �������. �.� ���� ����� ��������� �� �������������� ���� ��� ����������.
        File java = new File ("/usr /bin / java ");
        java . exists (); // true
        java . isFile (); // true
        java . isDirectory (); // false
        java . length (); // 1536
        java . lastModified (); // 1231914805000

        //==================================== ������ � ������������ ===============================================
        File usrbin = new File ("/ usr /bin ");
        usrbin . exists (); // true
        usrbin . isFile (); // false
        usrbin . isDirectory (); // true
        usrbin . list (); // String [] - �������� ���������� ����������
        usrbin . listFiles (); // File [] - ���������� ������ ����������� File - ���������� ���������� ������ �� 1 �������

        //==================================== ���������� ������ ===============================================
        // ���� ��������-� ���-�� ������� list � listFiles ����������� ������
        // ������ ��� ������, ����������� ��������� ���� FileFilter ���� FilenameFilter. ��� ���������� ��������
        // �����.����� accept() �� ����� �� ����� �������������� ��� ���. ������ ���������

        File dir = null;
        File [] javaSourceFiles = dir . listFiles (
                f -> f . getName (). endsWith (". java " ));
// java .io. FileFilter :
// boolean accept ( File pathname )
// java .io. FilenameFilter :
// boolean accept ( File dir , String name )

        //==================================== �������� ����� ================================================
        // createNewFile () - ������� ����� ������ ����. ���� ����� ������������ �� ��. �����, �.�. ������ ��� �����
        // �� ������ ������� ����, � �������� � ���� ������. �������� ���.���������� ������� ������, ���� ��� �������
        // createNewFile () - ����� ��� �� ���������, ��� ���� ���� ������ ������ ����� ���������� ������ ������

        try {
            boolean success = file . createNewFile ();
        } catch ( IOException e) {
// handle error
        }

        // ================================== �������� ���������� ================================================
        File dir1 = new File ("a/b/c/d");
        boolean success = dir1 . mkdir ();       // �� 1 ����� ����� ������� ������ 1 ����������
        boolean success2 = dir1 . mkdirs ();     // �� 1 ����� ����� ������� ��� ������ �����������

        // =============================== �������� ����� ��� ���������� =========================================

        boolean success1 = file . delete ();    //  - ������� ���� ��� ����������. ����������� ������ ���� ������ ����� �� ������

        // ================================ ��������������/����������� ===============================================
        File targetFile = new File("");
        boolean success3 = file . renameTo ( targetFile );

        // ================================ ������ ����������� � ��. File ������ ��� ===================================
        //

    }
}

