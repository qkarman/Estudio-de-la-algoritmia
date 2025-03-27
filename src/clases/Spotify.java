package clases;

public class Spotify
{
    //Creamos variables globales que vamos a utilizar
    private String cancion;
    private int precio;

    //Creamos el constructor para agregar elementos al objeto
    public Spotify(String cancion, int precio)
    {
        this.cancion = cancion;
        this.precio = precio;
    }

    public String getCancion()
    {
        return cancion;
    }

    public void setCancion(String cancion)
    {
        this.cancion = cancion;
    }

    public int getPrecio()
    {
        return precio;
    }

    public void setPrecio(int precio)
    {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "Spotify_Objeto" +
                "{" +
                "cancion: '" + cancion + '\'' +
                ", precio: " + precio +
                '}';
    }
}
