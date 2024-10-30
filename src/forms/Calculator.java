package forms;
import classOnes.Operator;

public class Calculator extends javax.swing.JFrame {
    
    double num1;
    double num2;
    
    Operator calculate = new Operator();
    
    public Calculator() {
        initComponents();
        this.setTitle("Calculator");
        this.setLocationRelativeTo(null);
    }
    
    public void input(){
        num1 = Double.parseDouble(number1txt.getText());
        num2 = Double.parseDouble(number2txt.getText());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        divideBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        number2txt = new javax.swing.JTextField();
        resultxt = new javax.swing.JTextField();
        number1txt = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        multiiplyBtn = new javax.swing.JButton();
        powBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        divideBtn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        divideBtn.setText("÷");
        divideBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideBtnActionPerformed(evt);
            }
        });

        subBtn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        subBtn.setText("-");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        number2txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number2txt.setText("0");
        number2txt.setToolTipText("");

        resultxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultxt.setText("0");
        resultxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultxtActionPerformed(evt);
            }
        });

        number1txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number1txt.setText("0");
        number1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1txtActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        addBtn.setText("+");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        multiiplyBtn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        multiiplyBtn.setText("x");
        multiiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiiplyBtnActionPerformed(evt);
            }
        });

        powBtn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        powBtn.setText("^");
        powBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("ENTER NUMBER ONE");

        jLabel4.setText("ENTER NUMBER TWO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(number1txt, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(powBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(multiiplyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(resultxt)
                    .addComponent(subBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divideBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(number2txt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(number1txt)
                    .addComponent(number2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(multiiplyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divideBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(powBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        input();
        calculate.add(num1, num2);
        resultxt.setText(String.valueOf(calculate.result));
        number1txt.requestFocus();
        number1txt.selectAll();
    }//GEN-LAST:event_addBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        input();
        calculate.sub(num1, num2);
        resultxt.setText(String.valueOf(calculate.result));
        number1txt.requestFocus();
        number1txt.selectAll();
    }//GEN-LAST:event_subBtnActionPerformed

    private void multiiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiiplyBtnActionPerformed
        input();
        calculate.mul(num1, num2);
        resultxt.setText(String.valueOf(calculate.result));
        number1txt.requestFocus();
        number1txt.selectAll();
    }//GEN-LAST:event_multiiplyBtnActionPerformed

    private void resultxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultxtActionPerformed
        
    }//GEN-LAST:event_resultxtActionPerformed

    private void number1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number1txtActionPerformed

    private void divideBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideBtnActionPerformed
        input();
        calculate.div(num1, num2);
        resultxt.setText(String.valueOf(calculate.result));
        number1txt.requestFocus();
        number1txt.selectAll();
    }//GEN-LAST:event_divideBtnActionPerformed

    private void powBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powBtnActionPerformed
        input();
        calculate.pow(num1, num2);
        resultxt.setText(String.valueOf(calculate.result));
        number1txt.requestFocus();
        number1txt.selectAll();
    }//GEN-LAST:event_powBtnActionPerformed

    
    public static void main(String args[]) {
        Calculator obj = new Calculator();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton divideBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton multiiplyBtn;
    private javax.swing.JTextField number1txt;
    private javax.swing.JTextField number2txt;
    private javax.swing.JButton powBtn;
    private javax.swing.JTextField resultxt;
    private javax.swing.JButton subBtn;
    // End of variables declaration//GEN-END:variables
}
