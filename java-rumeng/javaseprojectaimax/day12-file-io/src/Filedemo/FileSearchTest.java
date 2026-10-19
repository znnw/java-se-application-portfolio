package Filedemo;

import java.io.File;

public class FileSearchTest {
    public static void main(String args[]){

        File dir =new File("D:/" );
        try {
            searchFile(dir,"QQ.exe");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void searchFile(File dir,String fileName) throws Exception{
        if(dir==null||!dir.exists()||dir.isFile()){
            return;
        }
        File[] files =dir.listFiles();

        if (files!=null&&files.length>0){
            for (File file:files) {
                if (file.isFile()) {
                    if (file.getName().equals(fileName)) {
                        System.out.println("找到文件夹：" + file.getAbsolutePath());
                    }
                    Runtime r = Runtime.getRuntime();
                    r.exec(file.getAbsolutePath());
                }else{
                        searchFile(file,fileName);
                    }
                }

            }
        }
    }
