import java.io.File;
import java.io.IOException;

/**
 * @author: cmq
 * @date: 8/28/2024 - 08 - 28 - 8:33 PM
 * @version: 1.0
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\caime\\Desktop\\java projects\\hi.txt");
        File f1 = new File("C:\\Users\\caime\\Desktop\\java projects\\hi.txt");
        File f3 = new File("C:\\Users\\caimeee\\Desktop\\java projects\\hi.txt");
        //help you get the separator of your system.
        File f2 = new File("C:"+File.separator+"Users");//multi-platform:use this
        System.out.println(f3.canRead());
        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println("name: "+f.getName());
        System.out.println("parent: "+f.getParent());
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println("hidden?: "+f.isHidden());
        System.out.println("size: "+f.length());
        System.out.println("exist?: "+f.exists());
        System.out.println("exist?: "+f3.exists());
//        if (f.exists()) {
//            f.delete();
//        } else {
//            f.createNewFile();
//        }
        System.out.println(f == f1);//compare the address of two objects;
        System.out.println(f.equals(f1));//compare the path

        System.out.println("absolute path: "+f.getAbsolutePath());
        System.out.println("path: "+f.getPath());
        System.out.println("print: "+f.toString());

        File f5 = new File("demo.txt");
        if (!f5.exists()) {
            f5.createNewFile();
        }
        System.out.println("absolute path: "+f5.getAbsolutePath());
        System.out.println("path: "+f5.getPath());
        //toString -> path
        System.out.println("print: "+f5.toString());
    }
}
