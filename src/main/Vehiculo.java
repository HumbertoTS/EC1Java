package main;

public class Vehiculo {

    private String Modelo;
    private int Fabricacion;
    private String CaballosFuerza;

    public Vehiculo(String modelo, int fabricacion, String caballosFuerza) {
        this.Modelo = modelo;
        this.Fabricacion = fabricacion;
        this.CaballosFuerza = caballosFuerza;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getFabricacion() {
        return Fabricacion;
    }

    public void setFabricacion(int fabricacion) {
        Fabricacion = fabricacion;
    }

    public String getCaballosFuerza() {
        return CaballosFuerza;
    }

    public void setCaballosFuerza(String caballosFuerza) {
        CaballosFuerza = caballosFuerza;
    }

    @Override
    public String toString() {
        return  "\nModelo= " + Modelo +
                "\nFabricacion= " + Fabricacion +
                "\nCaballosFuerza= " + CaballosFuerza ;
    }
}
