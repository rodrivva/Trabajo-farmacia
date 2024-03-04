package PaqG4;
import java.util.Random;
public class Generador {
    static String[] listaNombres = {
            "Neuroflexina",
            "Cardiozol",
            "Dermatovitamina",
            "Osteocalcium",
            "Gastroplexin",
            "Pulmonotril",
            "Hematoglicina",
            "Articuloflex",
            "Renalox",
            "Oftalmovita",
            "Metformina",
            "Paracetamol",
            "Ibuprofeno",
            "Omeprazol",
            "Acomicil",
            "Adiro",
            "Citalopram",
            "Migraleve",
            "Nolotil",
            "Furosemida"
    };
    static String[] indicaciones = {
            "Dolor leve",
            "Fiebre",
            "Inflamación",
            "Acidez estomacal",
            "Tos seca",
            "Insomnio",
            "Congestión nasal",
            "Alergias",
            "Hipertensión",
            "Dolor muscular"
    };
    static String[] nombresFarmaceuticas = {
            "Pfizer",
            "Novartis",
            "Roche",
            "Sanofi",
            "GSK (GlaxoSmithKline)",
            "AstraZeneca",
            "Bayer",
            "AbbVie",
            "Merck & Co.",
            "Eli Lilly & Co."
    };
    public static String nombre(){ //Devuelve un nombre aleatorio
        Random random = new Random();
        int indiceAleatorio = random.nextInt(listaNombres.length); //Devuelve un indice entre 0 y 50
        return listaNombres[indiceAleatorio];
    }
    public static int id(){
        Random random = new Random();
        int id = random.nextInt(100, 10000);
        return id;
    }
    public static String indicaciones(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(indicaciones.length);
        return indicaciones[indiceAleatorio];
    }
    public static String fabricante(){
        Random random = new Random();
        int indiceAleatorio = random.nextInt(nombresFarmaceuticas.length);
        return nombresFarmaceuticas[indiceAleatorio];
    }
    public static boolean receta(){
        Random random = new Random();
        int aleatorio = random.nextInt(2); //Devuelve 0 o 1
        if (aleatorio == 0) {
            return true;
        }
        else return false;
    }
}
