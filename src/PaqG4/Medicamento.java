package PaqG4;

public class Medicamento {
    private int ID;
    private String indicacionesUso;
    private String fabricante;
    private boolean receta;
    private String nombre;

    public Medicamento(int ID, String indicacionesUso, String fabricante, boolean receta, String nombre) {
        this.ID = ID;
        this.indicacionesUso = indicacionesUso;
        this.fabricante = fabricante;
        this.receta = receta;
        this.nombre = nombre;
    }
    public Medicamento(){
        this.ID = Generador.id();
        this.indicacionesUso = Generador.indicaciones();
        this.fabricante = Generador.fabricante();
        this.receta = Generador.receta();
        this.nombre = Generador.nombre();
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "ID=" + ID +
                ", indicacionesUso='" + indicacionesUso + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", receta=" + receta +
                ", nombre=" +nombre+
                '}';
    }
}
