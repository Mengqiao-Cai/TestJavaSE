import java.io.File;

/**
 * @author: cmq
 * @date: 9/9/2024 - 09 - 09 - 4:01 PM
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\TestJavaSE");
        //folder related methods
        File f2 = new File("C:\\a\\b\\c");
        //f2.mkdir();
        //f2.mkdirs();

        //only delete current folder, if there's content inside, won't delete
        //f2.delete();

        File f3 = new File("C:\\a");
        f3.delete();

        //look:
        String[] list = f.list();
        for (String s:list) {
            System.out.println(s);
        }
        System.out.println("=========");
        File[] files = f.listFiles();
        for (File file:files) {
            System.out.println(file.getName()+","+file.getPath());
        }
    }
}
