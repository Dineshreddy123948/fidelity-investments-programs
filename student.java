package fidelity.programs;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class student {
    public static void main(String[] args) {
        File file = new File("\"C:\\Users\\a807120\\Downloads\\Screenshot_2-3-2026_143840_www.online-java.com.jpeg\"");
        if (!file.exists()) {
            System.out.println("students.txt file not found");
            return;
        }
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String fileData = content.toString();

        String[] lines = fileData.split("\\n");
        System.out.println("Student Records:\n");
        for (int i = 1; i < lines.length; i++) {  
            String line = lines[i].trim();
            if (!line.isEmpty()) {
                String[] parts = line.split(",");
                int rollNo = Integer.parseInt(parts[0].trim());
                String name = parts[1].trim();
                int marks = Integer.parseInt(parts[2].trim());
                System.out.println("Roll No : " + rollNo);
                System.out.println("Name    : " + name);
                System.out.println("Marks   : " + marks);
                System.out.println("---------------------");
            }
        }
    }
}
