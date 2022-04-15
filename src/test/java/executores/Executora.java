package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {

    //psvm...pra ela executar as coisas...ela incluisive fica com um verdinho indicando que ela pode ser executada...seria a classe que inicia as coias
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();//instanciando a classe GaiaRobo e transformando a variavel em objeto...new GaiaRobo => tira a classe GaiaRobo do papel e traz pra vida
        JonasRobo meuAmigoJonas = new JonasRobo();


        //umaGaiaRobo.abrirChrome(); //eliminado pq criei o construtor
        umaGaiaRobo.acessarUmSite("http://www.juliodelima.com.br/taskit");
        umaGaiaRobo.fazerLogin("julio", "1234");
        //umaGaiaRobo.lancarNota();
        //meuAmigoJonas.extrairRelatorio();//algo que pode ser feito em paralelo numa outra classe por exemplo

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();//como tenho um construtor, vai abrir outra instancia do browser
        umaOutraGaiaRobo.acessarUmSite("http://www.google.com.br");


    }
}
