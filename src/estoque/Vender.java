/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import static estoque.MySQL.RemoverItemEstoque;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Marlon Santos
 */
public class Vender extends javax.swing.JPanel {
    public int id_Cliente , id_Produto, quantidade, BD;
    public float desconto, emtrada, valor_Venda, totalComDesconto, totalSemDesconto;
    public String aux;
    ResultSet res;
    /**
     * Creates new form Vender
     */
    public Vender() {
        initComponents();
        ListaCliente();
        ListaProduto();
    }

    public void ListaCliente(){
        jComboBoxCliente.removeAllItems();
        res = MySQL.ListaCliente();
        if( res!=null ) {
            try {
                while(res.next()) {
                    jComboBoxCliente.addItem(res.getString("id_cliente") + "  -  " +res.getString("nome"));
		}
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problema para exibir registros!");
            }
	} else {
            JOptionPane.showMessageDialog(null, "Não ha Cliente cadastrados!");
	}
    }
    
    public void ListaProduto(){
        jComboBoxProduto.removeAllItems();
        res = MySQL.ListaProduto();
        if( res!=null ) {
            try {
                while(res.next()) {
                    jComboBoxProduto.addItem(res.getString("id_produto") + "  -  " +res.getString("nome"));
		}
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Problema para exibir registros!");
            }
	} else {
            JOptionPane.showMessageDialog(null, "Não ha produtos cadastrados!");
	}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCliente = new javax.swing.JLabel();
        jLabelProduto = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox();
        jComboBoxProduto = new javax.swing.JComboBox();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabelVenda = new javax.swing.JLabel();
        jTextFieldVenda = new javax.swing.JTextField();
        jLabelEntrada = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelValorEmtrada = new javax.swing.JLabel();
        jLabelDesconto = new javax.swing.JLabel();
        jTextFieldDesconto = new javax.swing.JTextField();
        jLabelSemDesconto = new javax.swing.JLabel();
        jLabelComDesconto = new javax.swing.JLabel();
        jLabelR$ = new javax.swing.JLabel();
        jLabelTotalSemDesconto = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelTotalComDesconto = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jLabelQuantidaNoEstoque = new javax.swing.JLabel();
        jLabelUnitemNoEstoque = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vender", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jLabelCliente.setText("Cliente");

        jLabelProduto.setText("Produto");

        jLabelQuantidade.setText("Quantidade");

        jComboBoxCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxClienteMouseClicked(evt);
            }
        });

        jComboBoxProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxProdutoMouseClicked(evt);
            }
        });

        jSpinnerQuantidade.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabelVenda.setText("Valor Da Venda Unidade");

        jLabelEntrada.setText("Valor De Emtrada");

        jLabel7.setText("R$");

        jLabelValorEmtrada.setText("0,00");

        jLabelDesconto.setText("Desconto");

        jLabelSemDesconto.setText("Valor Total Sem Desconto");

        jLabelComDesconto.setText("Valor Total Com Desconto");

        jLabelR$.setText("R$");

        jLabelTotalSemDesconto.setText("0,00");

        jLabel13.setText("R$");

        jLabelTotalComDesconto.setText("0,00");

        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enviar.png"))); // NOI18N
        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jButtonLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jLabelQuantidaNoEstoque.setText("Quantidade em Estoque:");

        jLabelUnitemNoEstoque.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelDesconto)
                            .addComponent(jLabelProduto)
                            .addComponent(jLabelCliente)
                            .addComponent(jLabelQuantidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSemDesconto)
                                    .addComponent(jLabelComDesconto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelR$)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTotalSemDesconto))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTotalComDesconto))
                                    .addComponent(jButtonLimpar)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBoxProduto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                        .addComponent(jTextFieldDesconto))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelQuantidaNoEstoque)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelUnitemNoEstoque)
                                            .addGap(32, 32, 32)
                                            .addComponent(jLabelEntrada)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabelValorEmtrada))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelVenda)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jComboBoxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonEnviar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCliente)
                            .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelProduto))
                    .addComponent(jComboBoxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEntrada)
                    .addComponent(jLabel7)
                    .addComponent(jLabelValorEmtrada)
                    .addComponent(jLabelQuantidaNoEstoque)
                    .addComponent(jLabelUnitemNoEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDesconto)
                    .addComponent(jTextFieldDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVenda)
                    .addComponent(jTextFieldVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSemDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelComDesconto))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelR$)
                            .addComponent(jLabelTotalSemDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabelTotalComDesconto))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEnviar)
                    .addComponent(jButtonLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        aux = (String) jComboBoxCliente.getSelectedItem();
        aux = aux.substring(0,1);
        id_Cliente = Integer.valueOf(aux);
        
        aux = (String) jComboBoxProduto.getSelectedItem();
        aux = aux.substring(0,1);
        id_Produto = Integer.valueOf(aux);
        
        quantidade = (int) jSpinnerQuantidade.getValue();
        desconto = Float.valueOf(jTextFieldDesconto.getText());
        valor_Venda = Float.valueOf(jTextFieldDesconto.getText());
        
        BD = MySQL.CadastrarVenda(id_Cliente, id_Produto, quantidade, valor_Venda, desconto);
        RemoverItemEstoque(id_Produto, quantidade);
        
        if ( BD == 1 ){
            Home.ok();
            Limpar();
        }else{
            Home.erro();
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed
    
    public void Limpar(){
        jComboBoxCliente.removeAllItems();
        jComboBoxProduto.removeAllItems();
        jSpinnerQuantidade.setValue(1);
        jTextFieldDesconto.setText("");
        jTextFieldVenda.setText("");
        jLabelUnitemNoEstoque.setText("");
        jLabelValorEmtrada.setText("");
    }
    
    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        
        // Busca a quantidade no estoque e o valor de compra
        jLabelUnitemNoEstoque.setText("");
        jLabelValorEmtrada.setText("");
        
        int id;
        aux = (String) jComboBoxProduto.getSelectedItem();
        aux = aux.substring(0,1);
        id = Integer.valueOf(aux);
        
        res = MySQL.quantidadeValorEntrada(id);
        try {
            while(res.next()) {
                jLabelUnitemNoEstoque.setText(res.getString("quantidade"));
                jLabelValorEmtrada.setText(res.getString("valor_unidade"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problema para exibir registros!");
        }
        
        
        // jLabel Desconto e total
        quantidade = (int) jSpinnerQuantidade.getValue();
        valor_Venda = Float.valueOf(jTextFieldDesconto.getText());
        totalSemDesconto = quantidade * valor_Venda;
        aux = String.valueOf(totalSemDesconto);
        jLabelTotalSemDesconto.setText(aux);
        
        quantidade = (int) jSpinnerQuantidade.getValue();
        valor_Venda = Float.valueOf(jTextFieldDesconto.getText());
        desconto = Float.valueOf(jTextFieldDesconto.getText());
        totalComDesconto = quantidade * valor_Venda;
        totalComDesconto = totalComDesconto - desconto;
        aux = String.valueOf(totalComDesconto);
        jLabelTotalComDesconto.setText(aux);    
    }//GEN-LAST:event_formMouseEntered

    private void jComboBoxClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxClienteMouseClicked
        // TODO add your handling code here:
        ListaCliente();
    }//GEN-LAST:event_jComboBoxClienteMouseClicked

    private void jComboBoxProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxProdutoMouseClicked
        // TODO add your handling code here:
        ListaProduto();
    }//GEN-LAST:event_jComboBoxProdutoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox jComboBoxCliente;
    private javax.swing.JComboBox jComboBoxProduto;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelComDesconto;
    private javax.swing.JLabel jLabelDesconto;
    private javax.swing.JLabel jLabelEntrada;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidaNoEstoque;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelR$;
    private javax.swing.JLabel jLabelSemDesconto;
    private javax.swing.JLabel jLabelTotalComDesconto;
    private javax.swing.JLabel jLabelTotalSemDesconto;
    private javax.swing.JLabel jLabelUnitemNoEstoque;
    private javax.swing.JLabel jLabelValorEmtrada;
    private javax.swing.JLabel jLabelVenda;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTextField jTextFieldDesconto;
    private javax.swing.JTextField jTextFieldVenda;
    // End of variables declaration//GEN-END:variables
}
