/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.view;

import javax.swing.DefaultListModel;
import manutencao.controller.Controlador;
import manutencao.model.Funcionario;
import javax.swing.JOptionPane;
/**
 *
 * @author danie_000
 */
public class FuncionarioPanel extends javax.swing.JPanel
{
    private Controlador control;
    
    DefaultListModel listModel = new DefaultListModel();
   
    public void attLista()
    {
        listModel.clear();
        
        for(int i = 0; i < control.getFuncionarios().size(); i++) 
        {
            listModel.addElement(control.getFuncionarios().get(i).getNome());
        }
        
    }
    
    /**
     * Creates new form FuncionariosPanel
     * @param c
     */
    public FuncionarioPanel(Controlador c)
    {
        this.control = c;
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab_Funcionario = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        TextoTelefone = new javax.swing.JTextField();
        TextoMatricula = new javax.swing.JTextField();
        NomeLabel3 = new javax.swing.JLabel();
        TextoNome = new javax.swing.JTextField();
        TextoEndereco = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        ScrollPanelClientesp4 = new javax.swing.JScrollPane();
        ListaFuncionarios = new javax.swing.JList<>();
        EnderecoLabel3 = new javax.swing.JLabel();
        TelefoneLabel3 = new javax.swing.JLabel();
        BotaoExcluir = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        BotaoLimpar = new javax.swing.JButton();
        MatriculaLabel = new javax.swing.JLabel();
        TextoSalario = new javax.swing.JTextField();
        BotaoSalvar = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        Salario = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(0, 0));

        Tab_Funcionario.setMinimumSize(new java.awt.Dimension(400, 300));
        Tab_Funcionario.setPreferredSize(new java.awt.Dimension(0, 0));

        jPanel6.setPreferredSize(new java.awt.Dimension(400, 300));

        TextoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoMatriculaActionPerformed(evt);
            }
        });

        NomeLabel3.setText("Nome:");

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        ListaFuncionarios.setModel(listModel);
        ListaFuncionarios.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ListaFuncionariosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ListaFuncionariosFocusLost(evt);
            }
        });
        ListaFuncionarios.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                ListaFuncionariosComponentShown(evt);
            }
        });
        ScrollPanelClientesp4.setViewportView(ListaFuncionarios);

        EnderecoLabel3.setText("Endereço:");

        TelefoneLabel3.setText("Telefone:");

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        MatriculaLabel.setText("Matricula:");

        BotaoSalvar.setText("Salvar");
        BotaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarActionPerformed(evt);
            }
        });

        jTextField5.setText("                                                                  Lista de Funcionários");

        Salario.setText("Salário:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BotaoAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ScrollPanelClientesp4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NomeLabel3)
                                    .addComponent(EnderecoLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TelefoneLabel3)
                                    .addComponent(Salario)
                                    .addComponent(MatriculaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TextoTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                                    .addComponent(TextoEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoSalario))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPanelClientesp4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MatriculaLabel)
                    .addComponent(TextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel3)
                    .addComponent(TextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnderecoLabel3)
                    .addComponent(TextoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneLabel3)
                    .addComponent(TextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salario))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoExcluir)
                    .addComponent(BotaoSalvar))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        Tab_Funcionario.addTab("Cliente Funcionario", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab_Funcionario, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        Tab_Funcionario.getAccessibleContext().setAccessibleName("Cliente Funcionario");
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarActionPerformed
        // TODO add your handling code here:
        TextoMatricula.setEnabled(true);
        TextoNome.setEnabled(true);
        if((!"".equals(TextoMatricula.getText()))&&(!"".equals(TextoSalario.getText()))&&(!"".equals(TextoNome.getText()))&&(!"".equals(TextoEndereco.getText()))&&(!"".equals(TextoTelefone.getText())))
        {
            control.AlterarFuncionario(control.getFuncionario(TextoMatricula.getText()),Float.parseFloat(TextoSalario.getText()),TextoEndereco.getText(),TextoTelefone.getText());
            JOptionPane.showMessageDialog(null,"Alterado com Sucesso!");
        }
        else
        JOptionPane.showMessageDialog(null,"Não foi possivel alterar pois há campos vazios!");

        TextoMatricula.setText("");
        TextoSalario.setText("");
        TextoNome.setText("");
        TextoEndereco.setText("");
        TextoTelefone.setText("");
    }//GEN-LAST:event_BotaoSalvarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        TextoMatricula.setText("");
        TextoSalario.setText("");
        TextoNome.setText("");
        TextoEndereco.setText("");
        TextoTelefone.setText("");
        TextoMatricula.setEnabled(true);
        TextoNome.setEnabled(true);
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
        // TODO add your handling code here:
        if(!control.validaMatricula(TextoMatricula.getText()))
        {
            TextoMatricula.setEnabled(false);
            TextoNome.setEnabled(false);
            TextoNome.setText(control.getNomeFuncionario(TextoMatricula.getText()));
            TextoEndereco.setText(control.getEndFuncionario(TextoMatricula.getText()));
            TextoTelefone.setText(control.getTelFuncionario(TextoMatricula.getText()));
            TextoSalario.setText(String.valueOf(control.getSalarioFuncionario(TextoMatricula.getText())));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não existe Funcionario com esse CPF");
        }
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
        if(!control.validaMatricula(TextoMatricula.getText()))
        {
            control.ExcluirFuncionario(control.getFuncionario(TextoMatricula.getText()));
            listModel.removeElement(control.getNomeFuncionario((TextoMatricula.getText())));
            attLista();
            JOptionPane.showMessageDialog(null,"Excluido com Sucesso!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Não existe Funcionario com esse CPF");
        }
        TextoMatricula.setText("");
    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void ListaFuncionariosComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ListaFuncionariosComponentShown
        /*TextoMatricula.setText(control.getFuncionarios().get(1).getMatricula());
        //TextoSalario.setText(control.getFuncionarios().get(1).getSalario());
        TextoNome.setText(control.getFuncionarios().get(1).getNome());
        TextoEndereco.setText(control.getFuncionarios().get(1).getEndereco());
        TextoTelefone.setText(control.getFuncionarios().get(1).getTelefone());*/
    }//GEN-LAST:event_ListaFuncionariosComponentShown

    private void ListaFuncionariosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaFuncionariosFocusLost
        /*TextoMatricula.setText("");
        TextoSalario.setText("");
        TextoNome.setText("");
        TextoEndereco.setText("");
        TextoTelefone.setText("");*/
    }//GEN-LAST:event_ListaFuncionariosFocusLost

    private void ListaFuncionariosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ListaFuncionariosFocusGained
        /*if(control.getFuncionarios()!=null)
        {
            TextoMatricula.setText(control.getFuncionarios().get(0).getMatricula());
            //TextoSalario.setText(control.getFuncionarios().get(1).getSalario());
            TextoNome.setText(control.getFuncionarios().get(0).getNome());
            TextoEndereco.setText(control.getFuncionarios().get(0).getEndereco());
            TextoTelefone.setText(control.getFuncionarios().get(0).getTelefone());
        }*/
    }//GEN-LAST:event_ListaFuncionariosFocusGained

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        if((!"".equals(TextoMatricula.getText()))&&(!"".equals(TextoSalario.getText()))&&(!"".equals(TextoNome.getText()))&&(!"".equals(TextoEndereco.getText()))&&(!"".equals(TextoTelefone.getText())))
        {
            if(control.CadastrarFuncionario(TextoMatricula.getText( ),Float.parseFloat(TextoSalario.getText()),TextoNome.getText(),TextoEndereco.getText(),TextoTelefone.getText()))
            {
                attLista();
                JOptionPane.showMessageDialog(null,"Cadastrado com Sucesso!");
            }

            else
            {
                System.out.println("Erro ao cadastrar");
                JOptionPane.showMessageDialog(null,"Ja existe Funcionario com esse CPF");
            }
        }
        else
        JOptionPane.showMessageDialog(null,"Não foi possivel Cadastar, pois há campos vazios!");

        TextoMatricula.setText("");
        TextoSalario.setText("");
        TextoNome.setText("");
        TextoEndereco.setText("");
        TextoTelefone.setText("");
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void TextoMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMatriculaActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoSalvar;
    private javax.swing.JLabel EnderecoLabel3;
    private javax.swing.JList<Funcionario> ListaFuncionarios;
    private javax.swing.JLabel MatriculaLabel;
    private javax.swing.JLabel NomeLabel3;
    private javax.swing.JLabel Salario;
    private javax.swing.JScrollPane ScrollPanelClientesp4;
    private javax.swing.JTabbedPane Tab_Funcionario;
    private javax.swing.JLabel TelefoneLabel3;
    private javax.swing.JTextField TextoEndereco;
    private javax.swing.JTextField TextoMatricula;
    private javax.swing.JTextField TextoNome;
    private javax.swing.JTextField TextoSalario;
    private javax.swing.JTextField TextoTelefone;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

   

    
}
