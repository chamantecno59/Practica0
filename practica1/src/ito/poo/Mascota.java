package ito.poo;

public class Mascota {

private String nombre;
private String especie;
private String raza;
private int edad;

public Mascota(String nombre, int edad, String especie, String raza)
{
    this.nombre  = nombre;
    this.edad    = edad;
    this.especie = especie;
    this.raza    = raza;
}

public void cumpleaños()  {this.edad++;}
public String Getnombre() {return nombre;}
public int Getedad()      {return edad;}
public String Getraza()   {return raza;}
public String Getespecie(){return especie;}
@Override
public String toString(){return "Mascota:{"+nombre+","+edad+","+especie+","+raza+"}";}


    }

