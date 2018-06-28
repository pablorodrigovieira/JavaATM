package Bank;

import Exceptions.EmptyInputException;
import Exceptions.ZeroInputExcepetion;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/** 
 * Bank Deposit UI
 * @author Pablo
 */
public class AITBankDeposit extends javax.swing.JFrame {

    /**
     * Creates new form AITBankDeposit
     */
    public AITBankDeposit() {
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

        jLabelLogo = new javax.swing.JLabel();
        jPanelScreen = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextFieldAmountDeposit = new javax.swing.JTextField();
        jLabelEnterAmountDepositTitle = new javax.swing.JLabel();
        jLabelError = new javax.swing.JLabel();
        jPanelButtons = new javax.swing.JPanel();
        jButtonNumber1 = new javax.swing.JButton();
        jButtonNumber2 = new javax.swing.JButton();
        jButtonNumber3 = new javax.swing.JButton();
        jButtonNumber4 = new javax.swing.JButton();
        jButtonNumber5 = new javax.swing.JButton();
        jButtonNumber6 = new javax.swing.JButton();
        jButtonNumber7 = new javax.swing.JButton();
        jButtonNumber8 = new javax.swing.JButton();
        jButtonNumber9 = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        jButtonNumber0 = new javax.swing.JButton();
        jButtonNumber10 = new javax.swing.JButton();
        jButtonNumber11 = new javax.swing.JButton();
        jButtonNumber12 = new javax.swing.JButton();
        jPanelOptions = new javax.swing.JPanel();
        jLabelOptions = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Deposit"); // NOI18N
        setPreferredSize(new java.awt.Dimension(630, 730));
        setResizable(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo1.png"))); // NOI18N

        jPanelScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelScreen.setPreferredSize(new java.awt.Dimension(567, 294));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Deposit");

        jButtonBack.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(0, 153, 153));
        jButtonBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back2.png"))); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.setPreferredSize(new java.awt.Dimension(115, 25));
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jTextFieldAmountDeposit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAmountDeposit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAmountDeposit.setText("$");
        jTextFieldAmountDeposit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAmountDepositKeyTyped(evt);
            }
        });

        jLabelEnterAmountDepositTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEnterAmountDepositTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEnterAmountDepositTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEnterAmountDepositTitle.setText("Enter the amount and Click on Enter");

        jLabelError.setForeground(new java.awt.Color(255, 0, 0));
        jLabelError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelError.setText("     ");
        jLabelError.setToolTipText("");

        javax.swing.GroupLayout jPanelScreenLayout = new javax.swing.GroupLayout(jPanelScreen);
        jPanelScreen.setLayout(jPanelScreenLayout);
        jPanelScreenLayout.setHorizontalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScreenLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jTextFieldAmountDeposit, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addGap(137, 137, 137))
                    .addComponent(jLabelEnterAmountDepositTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelScreenLayout.setVerticalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScreenLayout.createSequentialGroup()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabelError)
                .addGap(54, 54, 54)
                .addComponent(jLabelEnterAmountDepositTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAmountDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanelButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonNumber1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber1.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber1.setLabel("1");
        jButtonNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber1ActionPerformed(evt);
            }
        });

        jButtonNumber2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber2.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber2.setText("2");
        jButtonNumber2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber2ActionPerformed(evt);
            }
        });

        jButtonNumber3.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber3.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber3.setText("3");
        jButtonNumber3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber3ActionPerformed(evt);
            }
        });

        jButtonNumber4.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber4.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber4.setLabel("4");
        jButtonNumber4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber4ActionPerformed(evt);
            }
        });

        jButtonNumber5.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber5.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber5.setLabel("5");
        jButtonNumber5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber5ActionPerformed(evt);
            }
        });

        jButtonNumber6.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber6.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber6.setLabel("6");
        jButtonNumber6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber6ActionPerformed(evt);
            }
        });

        jButtonNumber7.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber7.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber7.setLabel("7");
        jButtonNumber7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber7ActionPerformed(evt);
            }
        });

        jButtonNumber8.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber8.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber8.setLabel("8");
        jButtonNumber8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber8ActionPerformed(evt);
            }
        });

        jButtonNumber9.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber9.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber9.setText("9");
        jButtonNumber9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber9ActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(255, 255, 0));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonEnter.setBackground(new java.awt.Color(0, 204, 0));
        jButtonEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEnter.setText("Enter");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        jButtonNumber0.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber0.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber0.setText("0");
        jButtonNumber0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNumber0ActionPerformed(evt);
            }
        });

        jButtonNumber10.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber10.setForeground(new java.awt.Color(102, 102, 102));

        jButtonNumber11.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber11.setForeground(new java.awt.Color(102, 102, 102));

        jButtonNumber12.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber12.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelButtonsLayout.createSequentialGroup()
                        .addComponent(jButtonNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelButtonsLayout.createSequentialGroup()
                        .addComponent(jButtonNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelButtonsLayout.createSequentialGroup()
                        .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                .addComponent(jButtonNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNumber11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNumber12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                                .addComponent(jButtonNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumber4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNumber7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNumber0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNumber10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonNumber11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNumber12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOptions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelOptions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Card_Money_1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanelOptionsLayout = new javax.swing.GroupLayout(jPanelOptions);
        jPanelOptions.setLayout(jPanelOptionsLayout);
        jPanelOptionsLayout.setHorizontalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOptions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOptionsLayout.setVerticalGroup(
            jPanelOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOptions)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabelLogo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        Helper.displayScreens display = new Helper.displayScreens();
        display.openMainUI(); //open Main Screen
        this.setVisible(false);//close current screen
        //Reset variable
        Helper.Constants.depositAmount = "0.00";
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextFieldAmountDepositKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAmountDepositKeyTyped
        try {
            if(jTextFieldAmountDeposit.getText().startsWith("0")||(jTextFieldAmountDeposit.getText().startsWith("$0")))
            {
                throw new ZeroInputExcepetion();
            }  
            else{//Check for number only and maximum 15 character
                char vchar = evt.getKeyChar();
                if(!(Character.isDigit(vchar))||
                    (vchar == KeyEvent.VK_BACK_SPACE)||
                    (vchar == KeyEvent.VK_DELETE)||
                    (jTextFieldAmountDeposit.getText().length() >= 15))
                {
                    evt.consume();
                }
            }
        }
        catch (ZeroInputExcepetion ex) {
            jLabelError.setText(ex.toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }


    }//GEN-LAST:event_jTextFieldAmountDepositKeyTyped

    private void jButtonNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber1ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"1");
        }
    }//GEN-LAST:event_jButtonNumber1ActionPerformed

    private void jButtonNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber2ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"2");
        }
    }//GEN-LAST:event_jButtonNumber2ActionPerformed

    private void jButtonNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber3ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"3");
        }
    }//GEN-LAST:event_jButtonNumber3ActionPerformed

    private void jButtonNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber4ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"4");
        }
    }//GEN-LAST:event_jButtonNumber4ActionPerformed

    private void jButtonNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber5ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"5");
        }
    }//GEN-LAST:event_jButtonNumber5ActionPerformed

    private void jButtonNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber6ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"6");
        }
    }//GEN-LAST:event_jButtonNumber6ActionPerformed

    private void jButtonNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber7ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"7");
        }
    }//GEN-LAST:event_jButtonNumber7ActionPerformed

    private void jButtonNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber8ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"8");
        }
    }//GEN-LAST:event_jButtonNumber8ActionPerformed

    private void jButtonNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber9ActionPerformed
        if(jTextFieldAmountDeposit.getText().length() < 15)
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"9");
        }
    }//GEN-LAST:event_jButtonNumber9ActionPerformed

    private void jButtonNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber0ActionPerformed
        if((jTextFieldAmountDeposit.getText().length() < 15) && !(jTextFieldAmountDeposit.getText().equals("$")))
        {
            jTextFieldAmountDeposit.setText(jTextFieldAmountDeposit.getText()+"0");
        }
    }//GEN-LAST:event_jButtonNumber0ActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Helper.displayScreens display = new Helper.displayScreens();
        display.openMainUI(); //open Main Screen
        this.setVisible(false);//close current screen
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldAmountDeposit.setText("$");
        jLabelError.setText("   ");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        try
        {
            if(jTextFieldAmountDeposit.getText().startsWith("0"))
            {
                throw new Exceptions.ZeroInputExcepetion();
            }
            else if(jTextFieldAmountDeposit.getText().startsWith("$0"))
            {
                throw new Exceptions.ZeroInputExcepetion();
            } 
            else if(jTextFieldAmountDeposit.getText().equals("$"))
            {
                throw new Exceptions.EmptyInputException(Helper.Constants.EmptyFieldError);
            }
            else if(jTextFieldAmountDeposit.getText().isEmpty())
            {
                throw new Exceptions.EmptyInputException(Helper.Constants.EmptyFieldError);
            }
            else{
                if(!(jTextFieldAmountDeposit.getText().equals("$"))){
                Helper.Constants.isDeposit = true;//set flag to true
                Helper.Constants.depositAmount = jTextFieldAmountDeposit.getText().substring(1);

                //Open Account UI
                Helper.displayScreens display = new Helper.displayScreens();
                display.openAccountUI();
                this.setVisible(false);//close current screen
                }
            }
        }
        catch(ZeroInputExcepetion ex){
            jLabelError.setText(ex.toString());
        }
        catch(EmptyInputException ex) {
            jLabelError.setText(ex.toString());
        }
        catch(Exception ex){
            jLabelError.setText(ex.toString());
        }
       
    }//GEN-LAST:event_jButtonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(AITBankDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AITBankDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AITBankDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AITBankDeposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AITBankDeposit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonNumber0;
    private javax.swing.JButton jButtonNumber1;
    private javax.swing.JButton jButtonNumber10;
    private javax.swing.JButton jButtonNumber11;
    private javax.swing.JButton jButtonNumber12;
    private javax.swing.JButton jButtonNumber2;
    private javax.swing.JButton jButtonNumber3;
    private javax.swing.JButton jButtonNumber4;
    private javax.swing.JButton jButtonNumber5;
    private javax.swing.JButton jButtonNumber6;
    private javax.swing.JButton jButtonNumber7;
    private javax.swing.JButton jButtonNumber8;
    private javax.swing.JButton jButtonNumber9;
    private javax.swing.JLabel jLabelEnterAmountDepositTitle;
    private javax.swing.JLabel jLabelError;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelOptions;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JTextField jTextFieldAmountDeposit;
    // End of variables declaration//GEN-END:variables
}