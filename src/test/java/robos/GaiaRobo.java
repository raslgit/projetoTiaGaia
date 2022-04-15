//criando o pacote (Pacote armazena classes da mesma categoria)
package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//criando a classe
public class GaiaRobo {

    //propriedades....a propriedade eh como se fosse a variavel da classe e pode ser vista por todos os metodos
    //(Modificadores) quando se torna algo private, somente a propia classe (neste caso GaiaRobo) pode utilizar/alterar. As outras classes nem conseguem enxergar. Isso é usado para questão de seguranca no desenvolvimento do SW
    private ChromeDriver browser;


/*
    //criando os metodos (habilidades que a classe vai ter)...tudo que é escrito dentro do metodo fica dentro do metodo.
    public void abrirChrome() {
        WebDriverManager.chromedriver().setup(); //pra indicar que é com o Chrome que é pra interagir
        //ChromeDriver browser = new ChromeDriver(); //Aqui browser eh uma variável que só pde ser usada neste metodo
        browser = new ChromeDriver(); //apos a criacao da propiedade ChromeDriver browser, eu posso usar em browser em qualquer metodo
    }*/

    //CONSTRUTOR
    //como para todos os metodos existe uma grande dependencia do metodo abrirchrome...podemos criar um construtor ao invez de um metodo
    //um contrutor será executado sempre que houver um "new" da classe (sempre que instanciar a classe)...neste caso aqui o new da classe executora
    //criando um construtor (modificador mais nome da classe)
    public GaiaRobo(){
        //O que estiver aqui sera executado sempre que eu der um new GaiaRobo em outra classe...neste caso aqui o new da classe executora
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();


    }

    //METODO
    public void acessarUmSite(String url){
        browser.get(url);//necessario criar uma propriedade do browser. A propriedade pode ser cosnumida por mais de um metodo
    }

    public String peagrOTituloDaPagina() {

        return browser.getTitle();
    }



    public void fazerLogin(String login, String senha) {
        System.out.println("vou fazer Login!");

    }

    public void lancarNota() {
        System.out.println("Vou lancar uma nota!");

    }


}
