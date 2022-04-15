package executores;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import robos.GaiaRobo;

@DisplayName("Classe de testes para a pagina inicial")
public class PaginaInicialTest {

    @Test //isso dah superpoderes de execucao dessa classe de testes ....vem do Junit
    @DisplayName("Validando se o titulo da pagina esta correto") //isso apresenta uma informacao mais precisa do que estah cocrrendo no momento do teste...substitui o nome do metodo
    public void validarTituloDaPagina(){
        GaiaRobo gaiaTiaDoJonas = new GaiaRobo();

        gaiaTiaDoJonas.acessarUmSite("http://www.juliodelima.com.br/taskit");
        String tituloDaPagina = gaiaTiaDoJonas.peagrOTituloDaPagina();
        Assertions.assertEquals("Task it!", tituloDaPagina);//vem do Junit



    }

    @Test //isso dah superpoderes de execucao dessa classe de testes
    @DisplayName("Validando se o campo na tela esta correto") //isso apresenta uma informacao no momento do teste
    public void validarCampoNaTela(){


    }

}
