/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.model;
/**
 *
 * @author danie_000
 */
public class Pessoa extends Cliente
{
    private final String cpf; //unico

    public String getCpf()
    {
        return cpf;
    }

    public Pessoa(String cpf, String email, String nome, String endereco, String telefone)
    {
        super(email, nome, endereco, telefone);
        this.cpf = cpf;
    }
}
