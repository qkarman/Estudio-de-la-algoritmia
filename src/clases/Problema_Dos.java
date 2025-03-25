package clases;
import java.util.*;
import javax.swing.JOptionPane;

/**
 * Este programa ayudará a saber si hacer una busqueda con la inicial de una cancion
 * y arroje todos los resultados con la inicial de esa letra
 */

public class Problema_Dos
{
    public static void main(String[] args)
    {
        Problema_Dos invocar = new Problema_Dos();
        invocar.almacen();
        invocar.buscador();
    }

    //Creamos las variables globales a ocupar
    private List<String> baseDatos = new ArrayList<>();

    //*En este metodo vamos almacenar los datos
    public void almacen()
    {
        baseDatos.add("Adios amor");
        baseDatos.add("Buscame de nuevo");
        baseDatos.add("Cierra las puertas");
        baseDatos.add("Dominio");
        baseDatos.add("Elefante mortal");
        baseDatos.add("Dulce amor");
        baseDatos.add("Dormir contigo");
    }

    //*En este metodo creamos el buscador
    public void buscador()
    {
        String buscar = JOptionPane.showInputDialog(null,"Digita la letra de busqueda: ");

        //Hacemos una validation para que solo acepte una letra
        if(buscar.length() != 1)
        {
            JOptionPane.showMessageDialog(null,"Por favor ingrese solo una letra.");
        }

        StringBuilder resultados = new StringBuilder();

        //Hacemos un forEach para poder recorrer la base de datos y buscar coincidences
        //Si algun dato tienen esta letra muestras todas los datos con esa letra
        for(String palabra: baseDatos)
        {
            if(palabra.toLowerCase().startsWith(buscar))
            {
                resultados.append(palabra).append("\n");
            }
        }

        if(resultados.length() > 0)
        {
            JOptionPane.showMessageDialog(null,"*** Palabras que comiencen con " + buscar + " : \n " + resultados);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No se encontraron las palabras");
        }
    }
}
