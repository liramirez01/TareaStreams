package org.example;
class Pelicula
{
    private String titulo;
    private String director;
    private int estreno;

    public Pelicula(String titulo, String director, int estreno)
    {
        this.titulo = titulo;
        this.director = director;
        this.estreno = estreno;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getDirector()
    {
        return director;
    }

    public int getEstreno()
    {
        return estreno;
    }

    @Override
    public String toString()
    {
        return titulo + " (" + director + ", " + estreno + ")";
    }
}