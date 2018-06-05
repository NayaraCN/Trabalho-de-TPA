/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.model;
/**
 *
 * @author danie_000
 */
public class Empresa extends Cliente
{
    private final String cnpj; //unico
    private String contato;

    public String getCnpj()
    {
        return cnpj;
    }

    public String getContato()
    {
        return contato;
    }

    public void setContato(String contato)
    {
        this.contato = contato;
    }

    public Empresa(String cnpj, String contato, String email, String nome, String endereco, String telefone)
    {
        super(email, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.contato = contato;
    }
}
