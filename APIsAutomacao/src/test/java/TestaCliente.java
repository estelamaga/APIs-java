import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestaCliente {

    String enderecoApi = "localhost:8080"

    @Test
    @DisplayName("Quando pegar lista de clientes sem adicionar clientes, Entao a lista deve estar vazia")
    public void pegaTodosClientes(){
        given()

    }
}
