import persistencias.api.persist.tools.MapList;

public class MainTeste {

    public static void main(String[] args) {
        Cliente cli = new Cliente("Thiago",26,3000);
        MapList.printarChaveValores(cli);
    }

}
