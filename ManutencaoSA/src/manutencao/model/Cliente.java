/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.model;
/**
 *
 * @author danie_000
 */
public abstract class Cliente extends Registro
{
    private String email;

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Cliente(String email, String nome, String endereco, String telefone)
    {
        super(nome, endereco, telefone);
        this.email = email;
    }  
}
