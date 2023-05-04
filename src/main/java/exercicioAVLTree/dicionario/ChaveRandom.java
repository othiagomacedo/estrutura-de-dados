package exercicioAVLTree.dicionario;

import java.util.Random;

public class ChaveRandom {

    public static char aqueleCaractereLa(){
        Random random = new Random();
        return (char) (random.nextInt(26) + 'a');
    }
}
