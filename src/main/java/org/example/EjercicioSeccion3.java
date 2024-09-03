package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class EjercicioSeccion3
{
    public static void main(String[] args)
    {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));

        //Obtener un sublistado con las películas estrenadas en el siglo XXI (a partir del año 2000, inclusive)
        List<Pelicula> peliculasEstrenadasSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());
        System.out.println("Películas estrenadas en el siglo XXI (apartir del 2000):");
        System.out.println(peliculasEstrenadasSigloXXI);

        //Mostrar por pantalla, separados por comas, los títulos de las películas de Steven Spielberg
        String titulosDeSpielberg = peliculas.stream()
                .filter(p -> "Steven Spielberg".equals(p.getDirector()))
                .map(p->p.getTitulo())
                .collect(Collectors.joining(", ","Títulos de películas de Steven Spielberg: ",""));
        System.out.println(titulosDeSpielberg);

        //Obtener un sublistado con los nombres de las películas, ordenados alfabéticamente
        List<String> titulosOrdenados = peliculas.stream()
                .map(p->p.getTitulo())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Títulos de películas ordenados alfabéticamente:");
        System.out.println(titulosOrdenados);
    }
}
