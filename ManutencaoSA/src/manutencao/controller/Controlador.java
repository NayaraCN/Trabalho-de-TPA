/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.controller;

import java.util.ArrayList;
import manutencao.model.Empresa;
import manutencao.model.Funcionario;
import manutencao.model.Peca;
import manutencao.model.Pessoa;
import manutencao.model.Servico;
/*
 * @author danie_000
 */
public class Controlador
{
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Pessoa> clientesp;
    private ArrayList<Empresa> clientese;
    private ArrayList<Servico> servicos;
    private ArrayList<Peca> pecas;

    public ArrayList<Funcionario> getFuncionarios()
    {
        return funcionarios;
    }  
    
    public ArrayList<Peca> getPeca() 
    {
        return pecas;
    }

    public Controlador()
    {
        this.funcionarios = new ArrayList();
        this.clientesp = new ArrayList();
        this.clientese = new ArrayList();
        this.servicos = new ArrayList(0);
        this.pecas = new ArrayList();
    }
    
    public boolean validaMatricula(String matricula)
    {
        for(int i=0;i<funcionarios.size();i++)
        {
            if(funcionarios.get(i).getMatricula().compareTo(matricula)==0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean BuscaCPF(String cpf)
    {
        for(int i=0;i<clientesp.size();i++)
        {
            if(clientesp.get(i).getCpf().compareTo(cpf)!=0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean BuscaCNPJ(String cnpj)
    {
        for(int i=0;i<clientese.size();i++)
        {
            if(clientese.get(i).getCnpj().compareTo(cnpj)!=0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean CadastrarFuncionario(String matricula, float salario, String nome, String endereco, String telefone)
    {
        if(validaMatricula(matricula))
        {
            Funcionario f = new Funcionario(matricula,salario,nome,endereco,telefone);
            funcionarios.add(f);
            
            return true;
        }
        
        return false;
    }
    
    public boolean CadastrarFuncionario(Funcionario f)
    {
        if(validaMatricula(f.getMatricula()))
        {
            Funcionario g = f;
            funcionarios.add(f);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarFuncionario(Funcionario f, float salario, String endereco, String telefone)
    {
       f.setSalario(salario);
       f.setEndereco(endereco);
       f.setTelefone(telefone);
    }
    
    public void ExcluirFuncionario(Funcionario f)
    {
        funcionarios.remove(f);
    }
    
    public void CadastrarPessoa(String cpf, String email, String nome, String endereco, String telefone)
    {
        if(BuscaCPF(cpf))
        {
            Pessoa p = new Pessoa(cpf,email,nome,endereco,telefone);
            clientesp.add(p);
        }
    }
    
    public void AlterarPessoa(Pessoa p, String email, String endereco, String telefone)
    {
       p.setEmail(email);
       p.setEndereco(endereco);
       p.setTelefone(telefone);
    }
    
    public void ExcluirPessoa(Pessoa p)
    {
        clientesp.remove(p);
    }
    
    public void CadastrarEmpresa(String cnpj, String contato, String email, String nome, String endereco, String telefone)
    {
        if(BuscaCNPJ(cnpj))
        {
            Empresa e = new Empresa(cnpj, contato, email, nome, endereco, telefone);
            clientese.add(e);
        }
    }
    
    public void AlterarEmpresa(Empresa e, String contato, String email, String endereco, String telefone)
    {
       e.setContato(contato);
       e.setEmail(email);
       e.setEndereco(endereco);
       e.setTelefone(telefone);
    }
    
    public void ExcluirEmpresa(Empresa e)
    {
        clientese.remove(e);
    }
        
    public boolean validaCodigo(String codigo) {
        for(int i=0;i<pecas.size();i++)
        {
            if(pecas.get(i).getCodigo().compareTo(codigo)==0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public boolean CadastrarPeca(String codigo, String nome, float preco, float valor) {
        if(validaCodigo(codigo))
        {
            Peca p = new Peca(codigo,nome,preco,valor);
            pecas.add(p);
            
            return true;
        }
        
        return false;
    }
    
    public void AlterarPeca(Peca p, float valor)
    {
       p.setValor(valor);
    }
    
    public void ExcluirPeca(Peca p)
    {
        pecas.remove(p);
    }
    
}
