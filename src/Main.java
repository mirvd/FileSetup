import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.Files.createDirectory;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder logFiles = new StringBuilder();

        String temp = "C://Java//Games//temp";
        Files.createDirectories(Paths.get(temp));
        if (Files.exists(Paths.get(temp))) logFiles.append("Каталог" + temp + " создан\n");
        else logFiles.append("Каталог " + temp + " не создан\n");

        String src = "C://Java//Games//src";
        Files.createDirectories(Paths.get(src));
        if (Files.exists(Paths.get(src))) logFiles.append("Каталог" + src + " создан\n");
        else logFiles.append("Каталог " + src + " не создан\n");

        String res = "C://Java//Games//res";
        Files.createDirectories(Paths.get(res));
        if (Files.exists(Paths.get(res))) logFiles.append("Каталог" + res + " создан\n");
        else logFiles.append("Каталог " + res + " не создан\n");

        String savegames = "C://Java//Games//savegames";
        Files.createDirectories(Paths.get(savegames));
        if (Files.exists(Paths.get(savegames))) logFiles.append("Каталог" + savegames + " создан\n");
        else logFiles.append("Каталог " + savegames + " не создан\n");

        String main = "C://Java//Games//src//main";
        Files.createDirectories(Paths.get(main));
        if (Files.exists(Paths.get(main))) logFiles.append("Каталог" + main + " создан\n");
        else logFiles.append("Каталог " + main + " не создан\n");


        String test = "C://Java//Games//src//test";
        Files.createDirectories(Paths.get(test));
        if (Files.exists(Paths.get(test))) logFiles.append("Каталог" + test + " создан\n");
        else logFiles.append("Каталог " + test + " не создан\n");

        String drawables = "C://Java//Games//res//drawables";
        Files.createDirectories(Paths.get(drawables));
        if (Files.exists(Paths.get(drawables))) logFiles.append("Каталог" + drawables + " создан\n");
        else logFiles.append("Каталог " + drawables + " не создан\n");

        String vectors = "C://Java//Games//res//vectors";
        Files.createDirectories(Paths.get(vectors));
        if (Files.exists(Paths.get(vectors))) logFiles.append("Каталог" + vectors + " создан\n");
        else logFiles.append("Каталог " + vectors + " не создан\n");

        String icons = "C://Java//Games//res//icons";
        Files.createDirectories(Paths.get(icons));
        if (Files.exists(Paths.get(icons))) logFiles.append("Каталог" + icons + " создан\n");
        else logFiles.append("Каталог " + icons + " не создан\n");

        try {
            String fileMain = "C://Java//Games//src//main//Main.java";
            Files.createFile(Paths.get(fileMain));
            if (Files.exists(Paths.get(fileMain))) logFiles.append("Файл" + fileMain + " создан\n");
            else logFiles.append("Каталог " + fileMain + " не создан\n");

            String fileUtils = "C://Java//Games//src//main//Utils.java";
            Files.createFile(Paths.get(fileUtils));
            if (Files.exists(Paths.get(fileUtils))) logFiles.append("Файл" + fileUtils + " создан\n");
            else logFiles.append("Каталог " + fileUtils + " не создан\n");

            String fileTemp = "C://Java//Games//temp//temp.txt";
            Files.createFile(Paths.get(fileTemp));
            if (Files.exists(Paths.get(fileTemp))) logFiles.append("Файл" + fileTemp + " создан\n");
            else logFiles.append("Каталог " + fileTemp + " не создан\n");


        } catch (IOException ex) {
            logFiles.append(ex.getMessage() + '\n');
        }
//        List<File> folderList = Arrays.asList(
//                new File("C://Java//Games"),
//                new File("C://Java//Games//temp"),
//                new File("C://Java//Games//src"),
//                new File("C://Java//Games//res"),
//                new File("C://Java//Games//savegames"),
//                new File("C://Java//Games//src//main"),
//                new File("C://Java//Games//src//test"),
//                new File("C://Java//Games//res//drawables"),
//                new File("C://Java//Games//res//vectors"),
//                new File("C://Java//Games//res//icons")
//        );
//        List<File> fileList = Arrays.asList(
//                new File("C://Java//Games//src//main//Main.java"),
//                new File("C://Java//Games//src//main//Utils.java"),
//                new File("C://Java//Games//temp//temp.txt")
//        );

//        folderList.stream().forEach(folder -> {
//            if (folder.mkdir()) logFiles.append("Каталог " + folder + " создан\n");
//            else logFiles.append("Каталог " + folder + " не создан\n");
//        });
//        fileList.stream().forEach(file -> {
//            try {
//                if (file.createNewFile()) logFiles.append("Файл " + file + " создан\n");
//                else logFiles.append("Файл " + file + " не создан\n");
//            } catch (IOException ex) {
//                logFiles.append(ex.getMessage() + '\n');
//            }
//        });
        try (
                FileWriter log = new FileWriter("C://Java//Games//temp//temp.txt", false)) {
            log.write(logFiles.toString());
            log.flush();
        } catch (IOException ex) {
            logFiles.append(ex.getMessage() + '\n');
        }
        try (BufferedReader br = new BufferedReader(new FileReader("C://Java//Games//temp//temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (
                IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
