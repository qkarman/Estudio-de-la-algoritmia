package clases;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * Aquí vamos a crear todos los llamados de los tipos de variables
 */

public class Problema_Uno_Tipos
{
   //Creamos el metodo main para hacer pruebas en nuestra clase
   public static void main(String[] args)
   {
   }

   //*Creamos el primer metodo para crear el algoritmo con el generic <>
    public <T> void algoritmia(List<String> almacen, T elemento)
    {
        boolean encontrado = false;

        for(int i = 0; i < almacen.size(); i++)
        {
            if(almacen.get(i).equals(elemento))
            {
                JOptionPane.showMessageDialog(null,"Elemento encontrado: " + almacen.get(i) + " Posicion: " + i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado)
        {
            JOptionPane.showMessageDialog(null,"Elemento no encontrado.");
        }
    }
}
