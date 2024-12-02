/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.ambiente.bancario.views;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mycompany.ambiente.bancario.dto.AccountDto;
import com.mycompany.ambiente.bancario.dto.CashDTO;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.ApiService;
import utils.Message;
import utils.Validate;

/**
 *
 * @author igorl
 */
public class Banco extends javax.swing.JFrame {

    AccountDto accountData;

    /**
     * Creates new form Account
     */
    public Banco() {
        initComponents();
    }

    public Banco(AccountDto accountData) throws HeadlessException {
        this.accountData = accountData;
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

        jLabel1 = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chequeEspecialLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        poupancaLabel = new javax.swing.JLabel();
        tipoDeContaLabel = new javax.swing.JLabel();
        depositarButton = new javax.swing.JButton();
        sacarButton = new javax.swing.JButton();
        valorTextField = new javax.swing.JTextField();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Saldo disponível:");

        saldoLabel.setText("R$ " + accountData.getBalance() );

        jLabel3.setText("Cheque Especial:");
        if (!"especial".equals(accountData.getType())) {
            jLabel3.setVisible(false); // Torna a label invisível
            chequeEspecialLabel.setVisible(false); // Também esconde o label relacionado
        }

        chequeEspecialLabel.setText("R$ " + accountData.getExtraWithdrawal());

        jLabel5.setText("Rendimento poupanca:");
        if (!"poupanca".equals(accountData.getType())) {
            jLabel5.setVisible(false); // Torna a label invisível
            poupancaLabel.setVisible(false); // Também esconde o label relacionado
        }

        poupancaLabel.setText(accountData.getIncome()+"%");

        tipoDeContaLabel.setText(accountData.getType());

        depositarButton.setText("Depositar");
        depositarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositarButtonActionPerformed(evt);
            }
        });

        sacarButton.setText("Sacar");
        sacarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarButtonActionPerformed(evt);
            }
        });

        valorTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTextFieldActionPerformed(evt);
            }
        });

        voltarButton.setText("Voltar");
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addGap(186, 186, 186)
                        .addComponent(tipoDeContaLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chequeEspecialLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(poupancaLabel)))
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sacarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(depositarButton))
                    .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tipoDeContaLabel)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(voltarButton)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(saldoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(poupancaLabel)
                    .addComponent(jLabel3)
                    .addComponent(chequeEspecialLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(valorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositarButton)
                    .addComponent(sacarButton))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sacarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarButtonActionPerformed
        ApiService apiService = new ApiService();

        if (new Validate().isValidNumber(valorTextField.getText())) {
            if (Float.valueOf(valorTextField.getText()) <= accountData.getBalance() || "especial".equals(accountData.getType())) {
                Double withdrawCalc = accountData.getBalance() - Float.valueOf(valorTextField.getText());

                try {
                    CashDTO cashDto = new CashDTO();

                    cashDto.setAccountId(accountData.getId());

                    if (accountData.getBalance() == 0.0 && "especial".equals(accountData.getType())) {
                        cashDto.setBalance(Double.valueOf(accountData.getExtraWithdrawal()));
                    } else {
                        cashDto.setBalance(withdrawCalc);
                        accountData.setBalance(withdrawCalc);
                    }

                    CashDTO response = apiService.Sacar(cashDto);

                    if (response != null) {
                        if (accountData.getBalance() == 0.0 && "especial".equals(accountData.getType())) {
                            saldoLabel.setText("R$ " + String.valueOf(accountData.getExtraWithdrawal()- Float.valueOf(valorTextField.getText())));
                        } else {
                            saldoLabel.setText("R$ " + String.valueOf(withdrawCalc));
                        }

                        new Message(this, "Saque realizado com sucesso", "Atenção!").sucessMessage();
                        this.repaint();
                        this.revalidate();
                    } else {
                        new Message(this, "Não foi possível Sacar", "Atenção!").warningMessage();
                    }
                } catch (JsonProcessingException ex) {
                    new Message(this, "Erro ao validar conta, tente novamente.", "Atenção!").errorMessage();
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException e) {
                    new Message(this, "Erro ao validar conta, tente novamente.", "Atenção!").errorMessage();
                    throw new RuntimeException(e);
                }

            } else {
                new Message(this, "Valor do saque é maior que o saldo.", "Atenção!").errorMessage();
            }

        } else {
            new Message(this, "Saque precisa ser um número.", "Atenção!").errorMessage();

        }    }//GEN-LAST:event_sacarButtonActionPerformed

    private void valorTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        new Index().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void depositarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositarButtonActionPerformed
        ApiService apiService = new ApiService();

        if (new Validate().isValidNumber(valorTextField.getText())) {
            Double depositCalc = accountData.getBalance() + Float.valueOf(valorTextField.getText());

            try {
                CashDTO cashDto = new CashDTO();

                cashDto.setAccountId(accountData.getId());
                cashDto.setBalance(depositCalc);
                accountData.setBalance(depositCalc);

                CashDTO response = apiService.Depositar(cashDto);

                if (response != null) {
                    saldoLabel.setText("R$ " + String.valueOf(depositCalc));
                    new Message(this, "Depósito realizado com sucesso", "Atenção!").sucessMessage();
                    this.repaint();
                    this.revalidate();
                } else {
                    new Message(this, "Não foi possível Depositar", "Atenção!").warningMessage();
                }
            } catch (JsonProcessingException ex) {
                new Message(this, "Erro ao validar conta, tente novamente.", "Atenção!").errorMessage();
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
                new Message(this, "Erro ao validar conta, tente novamente.", "Atenção!").errorMessage();
                throw new RuntimeException(e);
            }
        } else {
            new Message(this, "Deposito precisa ser um número.", "Atenção!").errorMessage();
        }
    }//GEN-LAST:event_depositarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Banco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chequeEspecialLabel;
    private javax.swing.JButton depositarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel poupancaLabel;
    private javax.swing.JButton sacarButton;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JLabel tipoDeContaLabel;
    private javax.swing.JTextField valorTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}