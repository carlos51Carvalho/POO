import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {


    public static void main(String[] args){
         Lojas lojas = new Lojas();
         Transportadoras transportadoras = new Transportadoras();
         Voluntarios voluntarios = new Voluntarios();
         Utilizadores utilizadors = new Utilizadores();
         Map<String, Encomenda> encomendas = new TreeMap<>();
         Set<Produto> produtos;

         Modelo m = new Modelo(lojas,transportadoras,voluntarios,utilizadors,encomendas);
         m.parse("./proj_grupo49/src/logs");


        ControladorGeral g = new ControladorGeral(m);
        g.run();

        //ler logs






    }



}