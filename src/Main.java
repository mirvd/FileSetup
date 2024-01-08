import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        StringBuilder logFiles = new StringBuilder();
        List<File> folderList = Arrays.asList(
                new File("C://Java//Games"),
                new File("C://Java//Games//temp"),
                new File("C://Java//Games//src"),
                new File("C://Java//Games//res"),
                new File("C://Java//Games//savegames"),
                new File("C://Java//Games//src//main"),
                new File("C://Java//Games//src//test"),
                new File("C://Java//Games//res//drawables"),
                new File("C://Java//Games//res//vectors"),
                new File("C://Java//Games//res//icons")
        );
        List<File> fileList = Arrays.asList(
                new File("C://Java//Games//src//main//Main.java"),
                new File("C://Java//Games//src//main//Utils.java"),
                new File("C://Java//Games//temp//temp.txt")
        );
        folderList.stream().forEach(folder -> {
            if (folder.mkdir()) logFiles.append("Каталог " + folder + " создан\n");
            else logFiles.append("Каталог " + folder + " не создан\n");
        });
        fileList.stream().forEach(file -> {
            try {
                if (file.createNewFile()) logFiles.append("Файл " + file + " создан\n");
                else logFiles.append("Файл " + file + " не создан\n");
            } catch (IOException ex) {
                logFiles.append(ex.getMessage() + '\n');
            }
        });
        try (FileWriter log = new FileWriter("C://Java//Games//temp//temp.txt", false)) {
            log.write(logFiles.toString());
            log.flush();
        } catch (IOException ex) {
            logFiles.append(ex.getMessage() + '\n');
        }
        try (BufferedReader br = new BufferedReader(new FileReader("C://Java//Games//temp//temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}