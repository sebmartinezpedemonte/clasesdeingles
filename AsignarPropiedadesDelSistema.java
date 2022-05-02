package clases.ingles;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class AsignarPropiedadesDelSistema {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");
        }catch(FileNotFoundException e){
            System.out.println("No existe el archivo  " + e);
        }


    }
}
