package banco;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaFuncionario extends javax.swing.JFrame {

    ArrayList<Funcionario> funcionarios;
    
    public TelaFuncionario(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
        initComponents();
    }

//    TelaFuncionario(ArrayList<Conta> contas) {;
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        inputCPF = new javax.swing.JTextField();
        cpf = new javax.swing.JLabel();
        inputEndereco = new javax.swing.JTextField();
        endereco = new javax.swing.JLabel();
        inputMatricula = new javax.swing.JTextField();
        matricula = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        salario = new javax.swing.JLabel();
        inputSalario = new javax.swing.JTextField();
        buttonListar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonExcluirFuncionario = new javax.swing.JButton();
        buttonEditarFuncionario1 = new javax.swing.JButton();
        buttonLimparCampos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaFuncionarios = new javax.swing.JTextArea();
        comboBoxFuncionarios = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Banco Funcionarios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePrincipal"); // NOI18N

        nome.setText("Nome");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        inputCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPFActionPerformed(evt);
            }
        });

        cpf.setText("CPF");

        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });

        endereco.setText("Endereço");

        inputMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMatriculaActionPerformed(evt);
            }
        });

        matricula.setText("Matrícula");

        telefone.setText("Telefone");

        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        salario.setText("Salario");

        inputSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSalarioActionPerformed(evt);
            }
        });

        buttonListar.setText("Listar");
        buttonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonListarActionPerformed(evt);
            }
        });

        buttonSalvar.setText("Salvar");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        buttonExcluirFuncionario.setText("Excluir");
        buttonExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirFuncionarioActionPerformed(evt);
            }
        });

        buttonEditarFuncionario1.setText("Editar");
        buttonEditarFuncionario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarFuncionario1ActionPerformed(evt);
            }
        });

        buttonLimparCampos.setText("Limpar Campos");
        buttonLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nome)
                                    .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpf)
                                    .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(endereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefone)
                                    .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(matricula)
                            .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salario)
                                .addComponent(inputSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonListar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEditarFuncionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome)
                            .addComponent(cpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(matricula)
                        .addGap(38, 38, 38))
                    .addComponent(inputMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco)
                            .addComponent(telefone)
                            .addComponent(salario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(inputSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSalvar)
                    .addComponent(buttonListar)
                    .addComponent(buttonExcluirFuncionario)
                    .addComponent(buttonEditarFuncionario1)
                    .addComponent(buttonLimparCampos))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTextAreaFuncionarios.setColumns(20);
        jTextAreaFuncionarios.setRows(5);
        jScrollPane1.setViewportView(jTextAreaFuncionarios);

        comboBoxFuncionarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxFuncionariosItemStateChanged(evt);
            }
        });
        comboBoxFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxFuncionariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCPFActionPerformed

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoActionPerformed

    private void inputMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMatriculaActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void inputSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSalarioActionPerformed

    private void buttonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonListarActionPerformed
        atualizarTelaFuncionario();
        jTextAreaFuncionarios.setText("");
        funcionarios.forEach(c -> {
            jTextAreaFuncionarios.append("Nome "+c.getNome());
            jTextAreaFuncionarios.append("\nCPF:"+c.getCpf());
            jTextAreaFuncionarios.append("\nEndereço: "+c.getEndereco());
            jTextAreaFuncionarios.append("\nTelefone: "+c.getTelefone());
            jTextAreaFuncionarios.append("\nMatrícula: "+c.getMatricula());
            jTextAreaFuncionarios.append("\nSalário: "+c.getSalario());
            jTextAreaFuncionarios.append("\n\n");
            
          });
             
    }//GEN-LAST:event_buttonListarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
//        fun3 = new Funcionario("joão", "345", "Rua do joao", 9878.90f, "678");
        float salariO = Float.parseFloat(inputSalario.getText());
        String matriculA = inputMatricula.getText();
        String nomE = inputNome.getText();
        String telefonE = inputTelefone.getText();
        String enderecO = inputEndereco.getText();
        String cpF = inputCPF.getText();
        
        funcionarios.add(new Funcionario(nomE, cpF, enderecO, salariO, matriculA, telefonE));
        
        inputSalario.setText("");
        inputMatricula.setText("");
        inputNome.setText("");
        inputTelefone.setText("");
        inputEndereco.setText("");
        inputCPF.setText("");
        JOptionPane.showMessageDialog(null, "Funcionario registrado com sucesso");
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirFuncionarioActionPerformed
        Funcionario auxFuncionario = (Funcionario) comboBoxFuncionarios.getSelectedItem();
        funcionarios.remove(auxFuncionario);
        
        //LIMPANDO CAMPOS
        inputSalario.setText("");
        inputMatricula.setText("");
        inputNome.setText("");
        inputTelefone.setText("");
        inputEndereco.setText("");
        inputCPF.setText("");
        JOptionPane.showMessageDialog(null, "Funcionario excluido com sucesso"); 
        atualizarTelaFuncionario();
        limparCampos();
    }//GEN-LAST:event_buttonExcluirFuncionarioActionPerformed

    private void buttonEditarFuncionario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarFuncionario1ActionPerformed
        Funcionario auxFuncionario = (Funcionario) comboBoxFuncionarios.getSelectedItem();
        //PEGANDO PARÂMETROS DA TELA
        float salariO = Float.parseFloat(inputSalario.getText());
        String matriculA = inputMatricula.getText();
        String nomE = inputNome.getText();
        String telefonE = inputTelefone.getText();
        String enderecO = inputEndereco.getText();
        String cpF = inputCPF.getText();
        
        //ALTERANDO DADOS DA CONTA
        auxFuncionario.setNome(nomE);
        auxFuncionario.setCpf(cpF);
        auxFuncionario.setMatricula(matriculA);
        auxFuncionario.setEndereco(enderecO);
        auxFuncionario.setTelefone(telefonE);
        auxFuncionario.setSalario(salariO);
        
        //LIMPANDO OS CAMPOS
        inputSalario.setText("");
        inputMatricula.setText("");
        inputNome.setText("");
        inputTelefone.setText("");
        inputEndereco.setText("");
        inputCPF.setText("");
        JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso");
       
    }//GEN-LAST:event_buttonEditarFuncionario1ActionPerformed

    private void comboBoxFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxFuncionariosActionPerformed
        
    }//GEN-LAST:event_comboBoxFuncionariosActionPerformed

    private void comboBoxFuncionariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxFuncionariosItemStateChanged
        Funcionario auxFuncionario = (Funcionario) comboBoxFuncionarios.getSelectedItem();
        if(auxFuncionario != null){
            inputNome.setText(""+auxFuncionario.getNome());
            inputCPF.setText(""+auxFuncionario.getCpf());
            inputMatricula.setText(""+auxFuncionario.getMatricula());
            inputEndereco.setText(""+auxFuncionario.getEndereco());
            inputTelefone.setText(""+auxFuncionario.getTelefone());
            inputSalario.setText(""+auxFuncionario.getSalario());
            
        }
    }//GEN-LAST:event_comboBoxFuncionariosItemStateChanged

    private void buttonLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_buttonLimparCamposActionPerformed

    public void atualizarTelaFuncionario(){
        comboBoxFuncionarios.removeAllItems();
        funcionarios.forEach(c -> {
            comboBoxFuncionarios.addItem(c);
        });
    }
    
    public void limparCampos(){
        //LIMPANDO OS CAMPOS
        inputSalario.setText("");
        inputMatricula.setText("");
        inputNome.setText("");
        inputTelefone.setText("");
        inputEndereco.setText("");
        inputCPF.setText("");
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarFuncionario1;
    private javax.swing.JButton buttonExcluirFuncionario;
    private javax.swing.JButton buttonLimparCampos;
    private javax.swing.JButton buttonListar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JComboBox<Funcionario> comboBoxFuncionarios;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField inputCPF;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputMatricula;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputSalario;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaFuncionarios;
    private javax.swing.JLabel matricula;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel salario;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}