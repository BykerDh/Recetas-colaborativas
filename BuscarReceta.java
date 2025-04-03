import java.util.ArrayList;
import java.util.List;

public class BuscarReceta {
    private List<Receta> recetas = new ArrayList<>();
    
    public Receta buscarReceta(String nombre) {
        for (Receta receta : recetas) {
            if (receta.getNombre().equalsIgnoreCase(nombre)) {
                return receta;
            }
        }
        return null;
    }

}