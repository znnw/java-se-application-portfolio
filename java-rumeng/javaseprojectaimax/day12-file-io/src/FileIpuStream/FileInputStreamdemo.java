package FileIpuStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class  FileInputStreamdemo{
    public static void main(String[] args) throws Exception{
    InputStream is =new FileInputStream("D://JAVA//java_daima/java-rumeng/javaseprojectaimax/day12-file-io/src/FileIpuStream/delei02txt");
    byte[] buffer =new byte[3];
    int len;
    while ((len =is.read(buffer))!=-1) {
        String str = new String(buffer,0,len);
        System.out.println(str);
    }
    }
}
