import java.util.ArrayList;
import java.util.List; 

public class EliminarReceta {
    private List<Receta> recetas = new ArrayList<>();

    public void eliminarReceta(Receta receta) {
        recetas.remove(receta);
    }

    public List<Receta> obtenerRecetas() {
        return recetas;
    }
}
