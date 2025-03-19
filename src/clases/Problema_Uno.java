package clases;

import javax.swing.*;
import java.util.*;

/**
 * Este programa va a estar enfocado en la solucion de busqueda de datos, numeros, y objetos
 * con el fin de aprender a hacer búsquedas específicas y el buen manejo del mismo algoritmo
 */

public class Problema_Uno
{
    //Creamos este espacio para manejar las variables globales
    private String busqueda;
    List<String> almacen = new ArrayList<>();

    //Creamos el metodo main para poder probar nuestro programa de la prueba y error
    public static void main(String[] args)
    {
        Problema_Uno invocar = new Problema_Uno();
        invocar.dateNote();
    }

    //* En este metodo donde se va a contener los datos de tipo Integer
    public void dateReal()
    {
        List<String> datosInter = new ArrayList<>();

        String telefono = JOptionPane.showInputDialog(null," Digita tu numero de teléfono de diez digitos: ");

        if (telefono != null && telefono.matches("\\d{10}"))
        {
            JOptionPane.showMessageDialog(null,"Se ha creado exitosamente tu numero: " + telefono);
            datosInter.add(telefono);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error al crear tu numero de teléfono se requiere 10 digitos ");
        }

        //Creamos una funcion para mostrar todos los elementos de la lista
        if(datosInter.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"No hay datos almacenados");
        }
        else
        {
            StringBuilder mensaje = new StringBuilder("Numeros almacenados");
            for(int i = 0; i < datosInter.size(); i++)
            {
                mensaje.append(i).append(". ").append(datosInter.get(i)).append("\n");
            }
            JOptionPane.showMessageDialog(null,mensaje.toString());
        }

        JOptionPane.showMessageDialog(null,"Tu dato almacenado es : " + telefono);
    }

    //* En este metodo vamos a contener los datos de tipo String
    public void dateNote()
    {
        for(int i = 0; i < 3; i++)
        {
            String palabra = JOptionPane.showInputDialog(null,"Digita una palabra: ");
            almacen.add(palabra);
        }

        JOptionPane.showMessageDialog(null,"Datos almacenados: " + almacen);

        gestionUnion();

    }

    //* En este metodo vamos a contener los objetos
    public void objetos()
    {

    }

    //* En este metodo vamos a crear el algoritmo que nos va a permitir hacer las búsquedas que requerimos
    public void algoritmia()
    {

    }

    //* En este metodo vamos a tratar de combinar y agrupar el algoritmo con los datos y objetos
    public String gestionUnion()
    {
        for(int i = 0; i < almacen.size(); i++)
        {
            if(almacen.get(i).equals(busqueda) )
            {
                return "Elemento encontrado en el indice" + i;
            }
        }
        return "Elemento no encontrado";
    }
}
