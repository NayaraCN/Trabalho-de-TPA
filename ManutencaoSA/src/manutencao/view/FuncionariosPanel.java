/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import manutencao.controller.Controlador;
import manutencao.model.Funcionario;
/**
 *
 * @author danie_000
 */
public class FuncionariosPanel extends javax.swing.JPanel
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
    public FuncionariosPanel(Controlador c)
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

        BotaoCadastrar = new javax.swing.JButton();
        MatriculaLabel = new javax.swing.JLabel();
        TextoMatricula = new javax.swing.JTextField();
        NomeLabel = new javax.swing.JLabel();
        TextoNome = new javax.swing.JTextField();
        EnderecoLabel = new javax.swing.JLabel();
        TextoEndereco = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        TextoTelefone = new javax.swing.JTextField();
        SalarioLabel = new javax.swing.JLabel();
        TextoSalario = new javax.swing.JTextField();
        BotaoLimpar = new javax.swing.JButton();
        ScrollPanelFuncionarios = new javax.swing.JScrollPane();
        ListaFuncionarios = new javax.swing.JList<>();
        BotaoAlterar = new javax.swing.JButton();
        BotaoExcluir = new javax.swing.JButton();

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        MatriculaLabel.setText("Matrícula:");

        TextoMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoMatriculaActionPerformed(evt);
            }
        });

        NomeLabel.setText("Nome:");

        EnderecoLabel.setText("Endereço:");

        TelefoneLabel.setText("Telefone:");

        SalarioLabel.setText("Salário:");

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
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
        ScrollPanelFuncionarios.setViewportView(ListaFuncionarios);

        BotaoAlterar.setText("Alterar");

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addComponent(ScrollPanelFuncionarios)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MatriculaLabel)
                            .addComponent(NomeLabel)
                            .addComponent(EnderecoLabel)
                            .addComponent(TelefoneLabel)
                            .addComponent(SalarioLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoTelefone)
                            .addComponent(TextoEndereco)
                            .addComponent(TextoNome)
                            .addComponent(TextoMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextoSalario))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanelFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MatriculaLabel)
                    .addComponent(TextoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeLabel)
                    .addComponent(TextoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnderecoLabel)
                    .addComponent(TextoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefoneLabel)
                    .addComponent(TextoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalarioLabel)
                    .addComponent(TextoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(BotaoExcluir))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoCadastrarActionPerformed
    {//GEN-HEADEREND:event_BotaoCadastrarActionPerformed
        if((!"".equals(TextoMatricula.getText()))&&(!"".equals(TextoSalario.getText()))&&(!"".equals(TextoNome.getText()))&&(!"".equals(TextoEndereco.getText()))&&(!"".equals(TextoTelefone.getText())))
        {
            if(control.CadastrarFuncionario(TextoMatricula.getText( ),Float.parseFloat(TextoSalario.getText()),TextoNome.getText(),TextoEndereco.getText(),TextoTelefone.getText()))
            {
                attLista();
            }
            
            else
            {
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar funcionário");
                //System.out.println("Erro ao cadastrar");                             
            }
        }
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoLimparActionPerformed
    {//GEN-HEADEREND:event_BotaoLimparActionPerformed
        TextoMatricula.setText("");
        TextoSalario.setText("");
        TextoNome.setText("");
        TextoEndereco.setText("");
        TextoTelefone.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void TextoMatriculaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TextoMatriculaActionPerformed
    {//GEN-HEADEREND:event_TextoMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoMatriculaActionPerformed

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BotaoExcluirActionPerformed
    {//GEN-HEADEREND:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JList<Funcionario> ListaFuncionarios;
    private javax.swing.JLabel MatriculaLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JLabel SalarioLabel;
    private javax.swing.JScrollPane ScrollPanelFuncionarios;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JTextField TextoEndereco;
    private javax.swing.JTextField TextoMatricula;
    private javax.swing.JTextField TextoNome;
    private javax.swing.JTextField TextoSalario;
    private javax.swing.JTextField TextoTelefone;
    // End of variables declaration//GEN-END:variables
}
