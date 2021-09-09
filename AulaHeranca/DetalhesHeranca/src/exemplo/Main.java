package exemplo;

import com.company.Animal;
import com.company.Cachorro;
import com.company.Gato;
import com.company.Labrador;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Thor", 8);
        Gato gato = new Gato("Tom", 4);
        //gato.peso = -1000;
        System.out.println("Cachorro:"+ cachorro.fazerBarulho()+ cachorro);
        System.out.println("Gato:"+gato.fazerBarulho()+gato);
        Labrador labrador = new Labrador("Lessie", 18);
        System.out.println("Labrador:"+labrador.fazerBarulho()+labrador);
    }
}
