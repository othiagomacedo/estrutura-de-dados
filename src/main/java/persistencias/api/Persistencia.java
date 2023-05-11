package persistencias.api;

import java.util.List;

public interface Persistencia<Objeto> {
    Object buscar(long id);

    void inserir(Objeto objeto);

    List listar();

    void deletar(Objeto objeto);
}
