package clases;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

/**
 * En esta clase vamos a implementar el mismo ejercicio de filtro para encontrar
 * valores o palabras, objetos specifics usando methodological más avanzadas
 */
public class Problema_Dos_Pro
{
    Spotify objeto = new Spotify("Caifanes",123);

    //Creamos el metodo main para gestionar y hacer pruebas de nuestra clase
    public static void main(String[] args)
    {
        Problema_Dos_Pro invocar = new Problema_Dos_Pro();
        invocar.almacen();
        invocar.buscador();
    }

    //Creamos el almacena en modo global
    List<Spotify> baseDatos = new ArrayList<>();

    //*Creamos el metodo donde vamos a almacenar nuestras palabras
    public <T> void almacen()
    {
        baseDatos.add(new Spotify("Caifanes",123)); //Hacer el cambio para agregar objetos
        baseDatos.add("Soda Stereo");
        baseDatos.add("Coldplay");
        baseDatos.add("Beatles");
        baseDatos.add("Comisario pantera");

        //Tarea extra crear también numeros y objetos
    }

    //*Creamos el metodo buscador pero con diferentes funciones mas avanzadas
    public void buscador()
    {
        String letra = JOptionPane.showInputDialog(null,"Digite la letra a buscar: ").toLowerCase();
        if(letra.length() != 1)
        {
            JOptionPane.showMessageDialog(null,"Digite solo una letra por favor");
            return;
        }


        //Creamos el uso de lambda
        Predicate<String> empiezaConLetra = palabra -> palabra.toLowerCase().startsWith(letra);

        List<String> filtrados = baseDatos.stream().filter(empiezaConLetra).collect(Collectors.toList());

        if(filtrados.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"No se encontraron las canciones con esa palabra");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Son: " + filtrados);
        }
    }

}
