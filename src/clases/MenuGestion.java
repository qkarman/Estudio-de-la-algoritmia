package clases;
import javax.swing.JOptionPane;

public class MenuGestion
{
    //Creamos las variables globales
    private int opcion = 0;
    Problema_Uno invocacion = new Problema_Uno();

    //Creamos el metodo main para hacer pruebas de nuestro programa
    public static void main(String[] args)
    {
        //Hacemos el llamado a las funciones o metodos a utilizar
        MenuGestion invocar = new MenuGestion();
        invocar.menu();
    }

    //*Creamos  el metodo menu para hacer gestion de todos nuestros programas o problemas
    public void menu()
    {
        while( opcion != 4)
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                        *** GESTION DE PROGRAMAS Y PROBLEMAS ***
                        1.- Busqueda de palabras
                        2.-
                        3.-
                        4.-
                        5.-
                        Selecciona una opcion:
                        """));

                switch(opcion)
                {
                    case 1 -> invocacion.dateNote();
                    case 2 -> System.out.println("w");
                    case 3 -> System.out.println("e");
                    default -> System.out.println(" Encontramos un problema ");
                }
            }
            catch(Exception e )
            {
                System.out.println("Tienes un problema de tipo: " + e.getMessage());
            }
        }
    }
}
