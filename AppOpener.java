import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class AppOpener {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            System.out.println("Enter the name of the application you want to open:");
            String appName = scanner.nextLine();

            openApplication(appName.trim());
        }
    }

    private static void openApplication(String appName) {
        //String filePath = appName + ".exe";
        File file = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        File file_2= new File("C:\\Program Files\\CodeBlocks\\codeblocks.exe");
        File file_3= new File("C:\\Users\\rohit\\OneDrive\\Desktop\\GitHub.lnk");
        File file_4=new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Amazon.com.lnk");
        File file_5=new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\PowerPoint.lnk");
        if (!file.exists()) {
            System.out.println("Error: The specified application doesn't exist.");
            return;
        }
        if(Objects.equals(appName, "chrome")){
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(file);
        } catch (IOException e) {
            System.out.println("Error opening application: " + e.getMessage());
        }}
        else if(Objects.equals(appName, "code blocks")){
            try {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file_2);
            } catch (IOException e) {
                System.out.println("Error opening application: " + e.getMessage());
            }
        }
        else if(Objects.equals(appName, "amazon")){
            try {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file_4);
            } catch (IOException e) {
                System.out.println("Error opening application: " + e.getMessage());
            }
        }
        else if(Objects.equals(appName, "power point")){
            try {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file_5);
            } catch (IOException e) {
                System.out.println("Error opening application: " + e.getMessage());
            }
        }
        else {
            try {
                Desktop desktop = Desktop.getDesktop();
                desktop.open(file_3);
            } catch (IOException e) {
                System.out.println("Error opening application: " + e.getMessage());
            }
        }
    }
}