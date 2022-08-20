package classwork.lesson17;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        File file  = new File(" ");
        file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }

        //    @Override
            public boolean accept(File dir,String name) {
                return name.endsWith(".txt");
            }
        });

        }

    }

