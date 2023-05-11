package persistencias.api.persist.tools;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class MapList {

    public static <Objeto> void printarChaveValores(Objeto classeEntidade){
        Map<Object,Object> mapa = obterListagem(classeEntidade);
        for (Map.Entry<Object, Object> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    private static <Objeto> Map<Object, Object> obterListagem(Objeto classeEntidade) {
        Map<Object, Object> mapa = new HashMap<>();
        Field[] campos = classeEntidade.getClass().getDeclaredFields();

        for (Field cp : campos) {
            if (!Modifier.isStatic(cp.getModifiers())) {
                cp.setAccessible(true);
                try {
                    mapa.put(cp.getName(), cp.get(null));
                } catch (IllegalAccessException ex) {
                    System.out.println(ex);
                }
            }
        }

        return mapa;
    }
}
