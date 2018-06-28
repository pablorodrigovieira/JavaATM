package Bank;

import Exceptions.EmptyInputException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/** 
 * Bank WithdrawLimit UI
 * @author Pablo
 */
public class AITBankWithdrawLimit extends javax.swing.JFrame {

    /**
     * Creates new form AITBankWithdrawLimit
     */
    public AITBankWithdrawLimit() {
        initComponents();
    }

    /**
     * Method that loads Savings withdraw limit
     * 
     */
    public void loadWithDrawlimit(){
        //load current withdraw limit
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");

            String sql = "SELECT WITHDRAWLIMIT FROM CUSTOMERACCOUNT WHERE ACCOUNTID = "+Helper.Constants.SavignsID+" AND CUSTOMERID = "+Helper.Constants.UserID;
            
            Statement st = conn.createStatement();
  
            ResultSet rs = st.executeQuery(sql);            
            while (rs.next()){
                Helper.Constants.WithdrawLimit = rs.getString("WITHDRAWLIMIT");
            }
            rs.close();
            st.close();
            conn.close();
                            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    
    /**
     Method that update the Database with withdraw limit for Savings Account
     * @param amount
     
     */
    public void setWithdrawLimit(String amount){
        try{
            String connectionURL = "jdbc:derby://localhost:1527/BankDatabase";
            Connection conn = DriverManager.getConnection(connectionURL, "bank","bank");
            
            String updateWithdrawLimit = "UPDATE CUSTOMERACCOUNT SET WITHDRAWLIMIT = "+amount+" WHERE ACCOUNTID = "+Helper.Constants.SavignsID+"AND CUSTOMERID = "+Helper.Constants.UserID;     
            
            Statement st = conn.createStatement();
            st.executeUpdate(updateWithdrawLimit);
            st.close();
            conn.close();
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
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

        jPanelOptions = new javax.swing.JPanel();
        jLabelOptions = new javax.swing.JLabel();
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
        jLabelLogo = new javax.swing.JLabel();
        jPanelScreen = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextFieldAmountLimit = new javax.swing.JTextField();
        jLabelEnterAmountLimit = new javax.swing.JLabel();
        jLabelClickEnter = new javax.swing.JLabel();
        jTextFieldLimit = new javax.swing.JTextField();
        jTextFieldWithdrawLimitAmount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo1.png"))); // NOI18N

        jPanelScreen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelScreen.setPreferredSize(new java.awt.Dimension(567, 294));

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Set Withdraw Limit for Savigns Account");
        jLabelTitle.setToolTipText("");

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

        jTextFieldAmountLimit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldAmountLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldAmountLimit.setText("$");
        jTextFieldAmountLimit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAmountLimitKeyTyped(evt);
            }
        });

        jLabelEnterAmountLimit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelEnterAmountLimit.setForeground(new java.awt.Color(102, 102, 102));
        jLabelEnterAmountLimit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEnterAmountLimit.setText("Enter the amount limit");

        jLabelClickEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClickEnter.setForeground(new java.awt.Color(102, 102, 102));
        jLabelClickEnter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClickEnter.setText("And click on Enter");

        jTextFieldLimit.setEditable(false);
        jTextFieldLimit.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldLimit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jTextFieldLimit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldLimit.setText("Withdraw Limit");
        jTextFieldLimit.setBorder(null);
        jTextFieldLimit.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldLimit.setEnabled(false);
        jTextFieldLimit.setFocusable(false);
        jTextFieldLimit.setPreferredSize(new java.awt.Dimension(19, 35));
        jTextFieldLimit.setSelectionColor(new java.awt.Color(255, 255, 255));

        jTextFieldWithdrawLimitAmount.setEditable(false);
        jTextFieldWithdrawLimitAmount.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldWithdrawLimitAmount.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextFieldWithdrawLimitAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldWithdrawLimitAmount.setText("$0.00");
        jTextFieldWithdrawLimitAmount.setBorder(null);
        jTextFieldWithdrawLimitAmount.setDisabledTextColor(new java.awt.Color(0, 153, 153));
        jTextFieldWithdrawLimitAmount.setEnabled(false);
        jTextFieldWithdrawLimitAmount.setFocusable(false);
        jTextFieldWithdrawLimitAmount.setPreferredSize(new java.awt.Dimension(19, 35));
        jTextFieldWithdrawLimitAmount.setSelectionColor(new java.awt.Color(255, 255, 255));

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
                        .addComponent(jTextFieldAmountLimit)
                        .addGap(137, 137, 137))
                    .addComponent(jLabelEnterAmountLimit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClickEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelScreenLayout.createSequentialGroup()
                        .addComponent(jTextFieldLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldWithdrawLimitAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelScreenLayout.setVerticalGroup(
            jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelScreenLayout.createSequentialGroup()
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanelScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldWithdrawLimitAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabelEnterAmountLimit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAmountLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClickEnter)
                .addGap(22, 22, 22))
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
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber1ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"1");
        } 
    }//GEN-LAST:event_jButtonNumber1ActionPerformed

    private void jTextFieldAmountLimitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAmountLimitKeyTyped
        //Check for number only and maximum 15 character
        char vchar = evt.getKeyChar();
        if(!(Character.isDigit(vchar))||
                (vchar == KeyEvent.VK_BACK_SPACE)||
                (vchar == KeyEvent.VK_DELETE)||
                (jTextFieldAmountLimit.getText().length() >= 15))
        {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAmountLimitKeyTyped

    private void jButtonNumber2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber2ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"2");
        }
    }//GEN-LAST:event_jButtonNumber2ActionPerformed

    private void jButtonNumber3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber3ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"3");
        }
    }//GEN-LAST:event_jButtonNumber3ActionPerformed

    private void jButtonNumber4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber4ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"4");
        }
    }//GEN-LAST:event_jButtonNumber4ActionPerformed

    private void jButtonNumber5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber5ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"5");
        }
    }//GEN-LAST:event_jButtonNumber5ActionPerformed

    private void jButtonNumber6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber6ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"6");
        }
    }//GEN-LAST:event_jButtonNumber6ActionPerformed

    private void jButtonNumber7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber7ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"7");
        }
    }//GEN-LAST:event_jButtonNumber7ActionPerformed

    private void jButtonNumber8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber8ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"8");
        }
    }//GEN-LAST:event_jButtonNumber8ActionPerformed

    private void jButtonNumber9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber9ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"9");
        }
    }//GEN-LAST:event_jButtonNumber9ActionPerformed

    private void jButtonNumber0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNumber0ActionPerformed
        if(jTextFieldAmountLimit.getText().length() < 15)
        {
            jTextFieldAmountLimit.setText(jTextFieldAmountLimit.getText()+"0");
        }
    }//GEN-LAST:event_jButtonNumber0ActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        Helper.displayScreens display = new Helper.displayScreens();
        display.openMainUI(); //open Main Screen
        this.setVisible(false);//close current screen
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        jTextFieldAmountLimit.setText("$");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        try{
            if((jTextFieldAmountLimit.getText().equals("$"))){
               throw new EmptyInputException(Helper.Constants.EmptyFieldError);
            }
            else if((jTextFieldAmountLimit.getText().isEmpty())){
               throw new EmptyInputException(Helper.Constants.EmptyFieldError);
            }
            else{
                setWithdrawLimit(jTextFieldAmountLimit.getText().substring(1));
                loadWithDrawlimit();//load current withdraw limit
                jTextFieldWithdrawLimitAmount.setText("$"+Helper.Constants.WithdrawLimit);

                jTextFieldAmountLimit.setText("$");//Clear field
            }
        }
        catch(EmptyInputException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
        
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //load current withdraw limit
        loadWithDrawlimit();
        jTextFieldWithdrawLimitAmount.setText("$"+Helper.Constants.WithdrawLimit);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AITBankWithdrawLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AITBankWithdrawLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AITBankWithdrawLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AITBankWithdrawLimit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AITBankWithdrawLimit().setVisible(true);
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
    private javax.swing.JLabel jLabelClickEnter;
    private javax.swing.JLabel jLabelEnterAmountLimit;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelOptions;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelOptions;
    private javax.swing.JPanel jPanelScreen;
    private javax.swing.JTextField jTextFieldAmountLimit;
    private javax.swing.JTextField jTextFieldLimit;
    private javax.swing.JTextField jTextFieldWithdrawLimitAmount;
    // End of variables declaration//GEN-END:variables
}