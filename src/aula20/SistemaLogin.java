package aula20;

public class SistemaLogin {
    private String senhaSecreta;

    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (!this.senhaSecreta.equals(senha)) {
            throw new LoginInvalidoException("Acesso Negado: Credenciais incorretas");
        }
        System.out.println("Login bem-sucedido!");
    }
}
