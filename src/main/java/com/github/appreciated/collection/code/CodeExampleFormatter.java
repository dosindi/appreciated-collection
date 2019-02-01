package com.github.appreciated.collection.code;

import com.github.appreciated.collection.demo.applayout.code.YourAppLayoutRouterLayout;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CodeExampleFormatter {

    private List<String> classContent;

    public CodeExampleFormatter(String packagePath) {
        packagePath = packagePath.replaceAll("\\.", "/") + ".java";
        URL path = getClass().getClassLoader().getResource(packagePath);

        try {
            classContent = Files.readAllLines(Paths.get(path.toURI()))
                    .stream()
                    .filter(s -> s.length() > 0)
                    .filter(s -> !s.startsWith("import") && !s.startsWith("package"))
                    .collect(Collectors.toList());

            for (int i = 0; i < classContent.size(); i++) {
                String s = classContent.get(i);
                /*if (s.contains("/*RM")){
                    classContent.
                }*/
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (FileSystemNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new CodeExampleFormatter(YourAppLayoutRouterLayout.class.getName()).getCodeExample());
    }

    public String getCodeExample() {
        String file = "";
        if (classContent != null) {
            for (String s : classContent) {
                file += s + "\n";
            }
        }
        return file;
    }
}
