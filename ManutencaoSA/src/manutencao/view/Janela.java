/*
 * SERVICOS DE MANUTENCAO
 */
package manutencao.view;

import manutencao.controller.Controlador;
//import manutencao.view.FuncionariosPanel;
import manutencao.view.PrincipalPanel;
/*
 * @author Daniel, Nayara, Sthefany 
 */
public class Janela extends javax.swing.JFrame
{
     Controlador control = new Controlador();       
   
    ClientesPanel cpanel = new ClientesPanel(control);
    PecasPanel ppanel = new PecasPanel(control);
    FuncionarioPanel fpanel = new FuncionarioPanel(control);
    PrincipalPanel mainpanel = new PrincipalPanel();
    //Janela janela1;
           
    public Janela()
    {
        initComponents();
        //setVisible(true);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Funcionario = new javax.swing.JButton();
        Cliente = new javax.swing.JButton();
        Peça = new javax.swing.JButton();
        AltMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        MenuVoltar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UFF Manutenções 2018");
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        Funcionario.setText("Funcionario");
        Funcionario.setMinimumSize(new java.awt.Dimension(0, 0));
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(Funcionario);

        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        getContentPane().add(Cliente);

        Peça.setText("Peça");
        Peça.setMaximumSize(new java.awt.Dimension(20, 20));
        Peça.setMinimumSize(new java.awt.Dimension(20, 20));
        Peça.setPreferredSize(new java.awt.Dimension(20, 20));
        Peça.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PeçaActionPerformed(evt);
            }
        });
        getContentPane().add(Peça);

        AltMenu.setName("AltMenu"); // NOI18N

        jMenu1.setText("File");
        AltMenu.add(jMenu1);

        jMenu2.setText("Edit");
        AltMenu.add(jMenu2);

        MenuVoltar.setText("Voltar");
        MenuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVoltarActionPerformed(evt);
            }
        });
        AltMenu.add(MenuVoltar);

        setJMenuBar(AltMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed
       //Chama o panel funcionario ao clicar no botão funcionário      
       this.setContentPane(fpanel);
       this.setVisible(true);
        
    }//GEN-LAST:event_FuncionarioActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        //Chama o panel cliente ao clicar no botão cliente
        this.setContentPane(cpanel);
        this.setVisible(true);
    }//GEN-LAST:event_ClienteActionPerformed

    private void PeçaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PeçaActionPerformed
        //Chama o panel peça ao clicar no botão peça
        this.setContentPane(ppanel);
        this.setVisible(true);
    }//GEN-LAST:event_PeçaActionPerformed

    private void MenuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVoltarActionPerformed
        //   adicionar ação, em construção       
        
    }//GEN-LAST:event_MenuVoltarActionPerformed
       
    /**                                                 
     * @param args the command line arguments           
     */                                                 
    public static void main(String args[])              
    {                          
                   
        
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //Cria e exibe o formulário
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {    
                Janela janela = new Janela();
                janela.setVisible(true);
               // janela.setContentPane(fpanel);
                          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar AltMenu;
    private javax.swing.JButton Cliente;
    private javax.swing.JButton Funcionario;
    private javax.swing.JMenu MenuVoltar;
    private javax.swing.JButton Peça;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
