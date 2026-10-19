package FileIpuStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopydemo {

    public static void main(String[] args){
        try {
            copyFile("xxx", "xxx");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 复制文件
    public static void copyFile(String srcPath, String destPath) throws Exception {
        // 1、创建一个文件字节输入流管道与源文件接通
        InputStream fis = new FileInputStream(srcPath);
        OutputStream fos = new FileOutputStream(destPath);
        // 2、读取一个字节数组，写入一个字节数组 1024 + 1024 + 3
        byte[] buffer = new byte[1024];
        int len;
        while ((len = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, len); // 1024
        }
        System.out.println("复制成功！");
    }

    }
