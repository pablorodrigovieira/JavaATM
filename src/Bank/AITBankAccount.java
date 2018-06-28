package Bank;

import javax.swing.JOptionPane;

/**
 * Select Bank Account UI
 * @author Pablo
 */
public class AITBankAccount extends javax.swing.JFrame {

    /**
     * Creates new form AITBankAccount
     */
    public AITBankAccount() {
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
        jButtonSavings = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jButtonNetSaver = new javax.swing.JButton();
        jButtonCheque = new javax.swing.JButton();
        jButtonFixed = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
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
        setPreferredSize(new java.awt.Dimension(630, 730));
        setResizable(false);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo1.png"))); // NOI18N

        jPanelScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelScreen.setPreferredSize(new java.awt.Dimension(567, 294));

        jButtonSavings.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSavings.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSavings.setForeground(new java.awt.Color(0, 153, 153));
        jButtonSavings.setText("Savings");
        jButtonSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSavingsActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Select your Account");

        jButtonNetSaver.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNetSaver.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonNetSaver.setForeground(new java.awt.Color(0, 153, 153));
        jButtonNetSaver.setText("Net  Saver");
        jButtonNetSaver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNetSaverActionPerformed(evt);
            }
        });

        jButtonCheque.setBackground(new java.awt.Color(204, 204, 204));
        jButtonCheque.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonCheque.setForeground(new java.awt.Color(0, 153, 153));
        jButtonCheque.setText("Cheque");
        jButtonCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChequeActionPerformed(evt);
            }
        });

        jButtonFixed.setBackground(new java.awt.Color(204, 204, 204));
        jButtonFixed.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonFixed.setForeground(new java.awt.Color(0, 153, 153));
        jButtonFixed.setText("Fixed");
        jButtonFixed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFixedActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanelScreenLayout = new javax.swing.GroupLayout(jPanelScreen);
        jPanelScreen.setLayout(jPanelScreenLayout);
        jPanelScreenLayout.setHorizontalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jButtonSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNetSaver, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jButtonCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelScreenLayout.setVerticalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScreenLayout.createSequentialGroup()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelTitle)
                .addGap(46, 46, 46)
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNetSaver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCheque, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanelButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelButtons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButtonNumber1.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber1.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber1.setLabel("1");

        jButtonNumber2.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber2.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber2.setText("2");

        jButtonNumber3.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber3.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber3.setText("3");

        jButtonNumber4.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber4.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber4.setLabel("4");

        jButtonNumber5.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber5.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber5.setLabel("5");

        jButtonNumber6.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber6.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber6.setLabel("6");

        jButtonNumber7.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber7.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber7.setLabel("7");

        jButtonNumber8.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber8.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber8.setLabel("8");

        jButtonNumber9.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber9.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber9.setText("9");

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

        jButtonEnter.setBackground(new java.awt.Color(0, 204, 0));
        jButtonEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonEnter.setText("Enter");

        jButtonNumber0.setBackground(new java.awt.Color(204, 204, 204));
        jButtonNumber0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonNumber0.setForeground(new java.awt.Color(102, 102, 102));
        jButtonNumber0.setText("0");

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
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        if(Helper.Constants.isDeposit){
            Helper.displayScreens display = new Helper.displayScreens();
            display.openDepositUI();
            this.setVisible(false);//close current screen
            Helper.Constants.isDeposit = false; //reset flag
        }
        if(Helper.Constants.isWithdraw){
            Helper.displayScreens display = new Helper.displayScreens();
            display.openWithdrawUI();
            this.setVisible(false);//close current screen
            Helper.Constants.isWithdraw = false; //reset flag
        }
        //Reset variables
        Helper.Constants.depositAmount = "0.00";
        Helper.Constants.withdrawAmount = "0.00";
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSavingsActionPerformed
        try{
            int row;
            BankClasses.Savings_Account savigns = new BankClasses.Savings_Account();
            if(Helper.Constants.isDeposit){
                row = savigns.makeDeposit();            
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Deposit effected");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isDeposit = false; //reset flag
                this.setVisible(false);//close current screen
            }
            if(Helper.Constants.isWithdraw){
                row = savigns.makeWithdraw();            
                if(row == 1)
                {                
                    JOptionPane.showMessageDialog(null, "Withdraw effected!\nTake your notes, please.\nNotes of $100: "+Helper.Constants._100note+"\nNotes of $50: "+Helper.Constants._50note+"\nNotes of $20: "+Helper.Constants._20note);
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }           
                else if(row < 0)
                {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                else if(row == 2)
                {
                    JOptionPane.showMessageDialog(null, "Withdraw limit exceed.");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isWithdraw = false; //reset flag
                this.setVisible(false);//close current screen
            }
            this.setVisible(false);//close current screen
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButtonSavingsActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        if(Helper.Constants.isDeposit){
            Helper.displayScreens display = new Helper.displayScreens();
            display.openDepositUI();
            this.setVisible(false);//close current screen
            Helper.Constants.isDeposit = false; //reset flag
        }
        if(Helper.Constants.isWithdraw){
            Helper.displayScreens display = new Helper.displayScreens();
            display.openWithdrawUI();
            this.setVisible(false);//close current screen
            Helper.Constants.isWithdraw = false; //reset flag
        }
        //Reset variables
        Helper.Constants.depositAmount = "0.00";
        Helper.Constants.withdrawAmount = "0.00";
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChequeActionPerformed
        try{
            int row;
            BankClasses.Cheque_Account cheque = new BankClasses.Cheque_Account();
            if(Helper.Constants.isDeposit){
                row = cheque.makeDeposit();            
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Deposit effected");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isDeposit = false; //reset flag
                this.setVisible(false);//close current screen
            }
            if(Helper.Constants.isWithdraw){
                row = cheque.makeWithdraw();            
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Withdraw effected!\nTake your notes, please.\nNotes of $100: "+Helper.Constants._100note+"\nNotes of $50: "+Helper.Constants._50note+"\nNotes of $20: "+Helper.Constants._20note);
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                else if(row < 0)
                {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isWithdraw = false; //reset flag
                this.setVisible(false);//close current screen
            }
            this.setVisible(false);//close current screen
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButtonChequeActionPerformed

    private void jButtonNetSaverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNetSaverActionPerformed
        try{
            int row;
            BankClasses.NetSaver_Account netSaver = new BankClasses.NetSaver_Account();
            if(Helper.Constants.isDeposit){
                row = netSaver.makeDeposit();                           
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Deposit effected");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isDeposit = false; //reset flag
                this.setVisible(false);//close current screen
            }
            if(Helper.Constants.isWithdraw){
                row = netSaver.makeWithdraw();            
                if(row == 1)
                {                
                    JOptionPane.showMessageDialog(null, "Withdraw effected!\nTake your notes, please.\nNotes of $100: "+Helper.Constants._100note+"\nNotes of $50: "+Helper.Constants._50note+"\nNotes of $20: "+Helper.Constants._20note);
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                else if(row < 0)
                {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                else if(row == 2)
                {
                    JOptionPane.showMessageDialog(null, String.format("Withdraw limit exceed.\nNet Saver withdraw limit: $%.2f",Helper.Constants.WithdrawLimitNetSaver));
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isWithdraw = false; //reset flag
                this.setVisible(false);//close current screen
            }
            this.setVisible(false);//close current screen
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButtonNetSaverActionPerformed

    private void jButtonFixedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFixedActionPerformed
        try{
            int row;
            BankClasses.Fixed_Account fixed = new BankClasses.Fixed_Account();
            if(Helper.Constants.isDeposit){
                row = fixed.makeDeposit();            
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Deposit effected");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isDeposit = false; //reset flag
                this.setVisible(false);//close current screen
            }
            if(Helper.Constants.isWithdraw){
                row = fixed.makeWithdraw();            
                if(row > 0)
                {                
                    JOptionPane.showMessageDialog(null, "Withdraw effected!\nTake your notes, please.\nNotes of $100: "+Helper.Constants._100note+"\nNotes of $50: "+Helper.Constants._50note+"\nNotes of $20: "+Helper.Constants._20note);
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                else if(row < 0)
                {
                    JOptionPane.showMessageDialog(null, "Insufficient funds.");
                    Helper.displayScreens display = new Helper.displayScreens();
                    display.openMainUI();
                }
                Helper.Constants.isWithdraw = false; //reset flag
                this.setVisible(false);//close current screen
            }
            this.setVisible(false);//close current screen
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_jButtonFixedActionPerformed

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
            java.util.logging.Logger.getLogger(AITBankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AITBankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AITBankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AITBankAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AITBankAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonCheque;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JButton jButtonFixed;
    private javax.swing.JButton jButtonNetSaver;
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
    private javax.swing.JButton jButtonSavings;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelOptions;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelScreen;
    // End of variables declaration//GEN-END:variables
}
