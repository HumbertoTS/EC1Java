package main;

public class Auto extends Vehiculo {

    private String Marca;
    private String Kilometraje;
    private String CapacidadEstanque;

    public Auto(String modelo, int fabricacion, String caballosFuerza, String Marca , String Kilometraje, String CapacidadEstanque) {
        super(modelo, fabricacion, caballosFuerza);
        this.Marca = Marca;
        this.Kilometraje = Kilometraje;
        this.CapacidadEstanque = CapacidadEstanque;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        Kilometraje = kilometraje;
    }

    public String getCapacidadEstanque() {
        return CapacidadEstanque;
    }

    public void setCapacidadEstanque(String capacidadEstanque) {
        CapacidadEstanque = capacidadEstanque;
    }

    @Override
    public String toString() {
        return (super.toString() +
                "\nMarca= " + Marca +
                "\nKilometraje= " + Kilometraje +
                "\nCapacidadEstanque= " + CapacidadEstanque);
    }
}
