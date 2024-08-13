import java.io.File;

public class Main {
    public static void main(String[] args){
        File app = new File("C:\\Users\\gueva\\OneDrive\\Desktop\\examenMobile\\AutomationMobile\\src\\test\\resources\\app\\mda-2.0.2-23.apk");
        System.out.println("RUTA: " + app.getAbsolutePath().replace("\\", "/"));
    }
}
