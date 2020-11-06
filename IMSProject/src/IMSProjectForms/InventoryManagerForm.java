/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMSProjectForms;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AmeerHamza
 */
public class InventoryManagerForm extends javax.swing.JFrame {

    /**
     * Creates new form InventoryManagerForm
     */
    public InventoryManagerForm() {
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

        SidePanel = new javax.swing.JPanel();
        Status = new javax.swing.JLabel();
        ItemDemandLable = new javax.swing.JLabel();
        AddItem = new javax.swing.JLabel();
        ChangePass = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ClosePrograme = new javax.swing.JLabel();
        SidePanelImage = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        GenerateReports = new javax.swing.JPanel();
        StatusScroll = new javax.swing.JScrollPane();
        ImStatus = new javax.swing.JTable();
        ItemDemandPanel = new javax.swing.JPanel();
        DemandScroll = new javax.swing.JScrollPane();
        ItemDemand = new javax.swing.JTable();
        AddItemButton = new javax.swing.JLabel();
        AddItemPanel = new javax.swing.JPanel();
        Submit = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        ItemName = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        AddItemSummary = new javax.swing.JScrollPane();
        AddItemTbl = new javax.swing.JTable();
        BackImage = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        BackGroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/GenerateReportClick.png"))); // NOI18N
        Status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatusMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StatusMousePressed(evt);
            }
        });
        SidePanel.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 100));

        ItemDemandLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ItemDemandDefault.png"))); // NOI18N
        ItemDemandLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemDemandLableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ItemDemandLableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ItemDemandLableMouseReleased(evt);
            }
        });
        SidePanel.add(ItemDemandLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 330, 80));

        AddItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddItemsDefault.png"))); // NOI18N
        AddItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddItemMousePressed(evt);
            }
        });
        SidePanel.add(AddItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 330, 80));

        ChangePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ChangePasswordDefault.png"))); // NOI18N
        ChangePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangePassMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ChangePassMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ChangePassMouseReleased(evt);
            }
        });
        SidePanel.add(ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 170, 70));

        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LogOutDefault.png"))); // NOI18N
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LogoutMouseReleased(evt);
            }
        });
        SidePanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 305, 170, 60));

        ClosePrograme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CloseProgramDefault.png"))); // NOI18N
        ClosePrograme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseProgrameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseProgrameMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CloseProgrameMousePressed(evt);
            }
        });
        SidePanel.add(ClosePrograme, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 360, 310, 100));

        SidePanelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PanelSide.png"))); // NOI18N
        SidePanel.add(SidePanelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 310, 480));

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 310, 450));
        SidePanel.getAccessibleContext().setAccessibleName("");

        CenterPanel.setLayout(new java.awt.CardLayout());

        GenerateReports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImStatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Stock", "Price", "Sold"
            }
        ));
        StatusScroll.setViewportView(ImStatus);
        if (ImStatus.getColumnModel().getColumnCount() > 0) {
            ImStatus.getColumnModel().getColumn(3).setHeaderValue("Stock");
            ImStatus.getColumnModel().getColumn(5).setHeaderValue("Sold");
        }

        GenerateReports.add(StatusScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 816, 462));

        CenterPanel.add(GenerateReports, "card2");

        ItemDemand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Quantity"
            }
        ));
        DemandScroll.setViewportView(ItemDemand);

        AddItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddDefault.png"))); // NOI18N
        AddItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddItemButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddItemButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddItemButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddItemButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                AddItemButtonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ItemDemandPanelLayout = new javax.swing.GroupLayout(ItemDemandPanel);
        ItemDemandPanel.setLayout(ItemDemandPanelLayout);
        ItemDemandPanelLayout.setHorizontalGroup(
            ItemDemandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemDemandPanelLayout.createSequentialGroup()
                .addComponent(DemandScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(ItemDemandPanelLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(AddItemButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ItemDemandPanelLayout.setVerticalGroup(
            ItemDemandPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemDemandPanelLayout.createSequentialGroup()
                .addComponent(DemandScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddItemButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        CenterPanel.add(ItemDemandPanel, "card3");

        AddItemPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SubmitDefault.png"))); // NOI18N
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SubmitMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SubmitMouseReleased(evt);
            }
        });
        AddItemPanel.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 350, 250, 40));
        AddItemPanel.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 120, 30));
        AddItemPanel.add(ItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, 30));
        AddItemPanel.add(Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, 30));

        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        AddItemPanel.add(Qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 236, 131, 39));

        AddItemSummary.setBackground(new java.awt.Color(255, 255, 255));
        AddItemSummary.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddItemSummary.setOpaque(false);
        AddItemSummary.setVerifyInputWhenFocusTarget(false);

        AddItemTbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddItemTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Price", "Sold", "Stock"
            }
        ));
        AddItemTbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                AddItemTblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        AddItemTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddItemTblMouseEntered(evt);
            }
        });
        AddItemSummary.setViewportView(AddItemTbl);

        AddItemPanel.add(AddItemSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 60, 500, 380));

        BackImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddItemForm.png"))); // NOI18N
        AddItemPanel.add(BackImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 812, 460));

        CenterPanel.add(AddItemPanel, "card4");

        getContentPane().add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 225, 812, 460));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 13, -1, -1));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 7, 40, 40));

        BackGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InventoryManagerForm.png"))); // NOI18N
        getContentPane().add(BackGroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMouseClicked
        // TODO add your handling code here:
        CenterPanel.removeAll();
        CenterPanel.revalidate();
        CenterPanel.repaint();
        
        CenterPanel.add(GenerateReports);
        CenterPanel.revalidate();
        CenterPanel.repaint();
          
         DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        String str = "Select * from items";
        try{
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery(str);

            rsmd = rs.getMetaData();
            int column = rsmd.getColumnCount();
            dtm = new DefaultTableModel();
            Vector column_name = new Vector();
            Vector row_data = new Vector();
            for(int i = 1; i<=column; i++){
                column_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(column_name);
            while(rs.next()){
                row_data = new Vector();
                for(int j =1;j<=column;j++){
                    row_data.addElement(rs.getString(j));
                }
                dtm.addRow(row_data);
            }
            ImStatus.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_StatusMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(InventoryManagerForm.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void ItemDemandLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemDemandLableMouseClicked
        // TODO add your handling code here:
        CenterPanel.removeAll();
        CenterPanel.revalidate();
        CenterPanel.repaint();
        
        CenterPanel.add(ItemDemandPanel);
        CenterPanel.revalidate();
        CenterPanel.repaint();
        
             try {
            // TODO add your handling code here:
            
            DefaultTableModel dtm;
            ResultSetMetaData  rsmd;
            String str = "Select * from InformToIM";
            
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery(str);

            rsmd = rs.getMetaData();
            int column = rsmd.getColumnCount();
            dtm = new DefaultTableModel();
            Vector column_name = new Vector();
            Vector row_data = new Vector();
            for(int i = 1; i<=column; i++){
                column_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(column_name);
            while(rs.next()){
                row_data = new Vector();
                for(int j =1;j<=column;j++){
                    row_data.addElement(rs.getString(j));
                }
                dtm.addRow(row_data);
            }
            ItemDemand.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ItemDemandLableMouseClicked

    private void ItemDemandLableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemDemandLableMousePressed
        // TODO add your handling code here:
              ImageIcon II = new ImageIcon(getClass().getResource("/Images/GenerateReportDefault.png"));
              Status.setIcon(II);
              
             ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ItemDemandClick.png"));
             ItemDemandLable.setIcon(II2);
               
             ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/AddItemsDefault.png"));
             AddItem.setIcon(II3);

               
        
        
    }//GEN-LAST:event_ItemDemandLableMousePressed

    private void ItemDemandLableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemDemandLableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemDemandLableMouseReleased

    private void StatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMousePressed
        // TODO add your handling code here:
             ImageIcon II = new ImageIcon(getClass().getResource("/Images/GenerateReportClick.png"));
              Status.setIcon(II);
              
               ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ItemDemandDefault.png"));
               ItemDemandLable.setIcon(II2);
               
              ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/AddItemsDefault.png"));
              AddItem.setIcon(II3);
                
                
    }//GEN-LAST:event_StatusMousePressed

    private void AddItemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemMousePressed
        // TODO add your handling code here:
              ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddItemsClick.png"));
              AddItem.setIcon(II);
        
              ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/GenerateReportDefault.png"));
              Status.setIcon(II3);
              
               ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ItemDemandDefault.png"));
               ItemDemandLable.setIcon(II2);

    }//GEN-LAST:event_AddItemMousePressed

    private void AddItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemMouseClicked
        // TODO add your handling code here:
        
        CenterPanel.removeAll();
        CenterPanel.revalidate();
        CenterPanel.repaint();
        
        CenterPanel.add(AddItemPanel);
        CenterPanel.revalidate();
        CenterPanel.repaint();
    }//GEN-LAST:event_AddItemMouseClicked

    private void ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseClicked
        // TODO add your handling code here:

        ChangePassword Cp = new ChangePassword();
        Cp.setVisible(true);
    }//GEN-LAST:event_ChangePassMouseClicked

    private void ChangePassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ChangePasswordClick.png"));
        ChangePass.setIcon(II);
    }//GEN-LAST:event_ChangePassMousePressed

    private void ChangePassMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ChangePasswordDefault.png"));
        ChangePass.setIcon(II);
    }//GEN-LAST:event_ChangePassMouseReleased

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login in = new Login();
        in.setVisible(true);

    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_LogoutMousePressed

    private void LogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/LogOutDefault.png"));
        Logout.setIcon(II);
    }//GEN-LAST:event_LogoutMouseReleased

    private void CloseProgrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseProgrameMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseProgrameMouseClicked

    private void CloseProgrameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseProgrameMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CloseProgram.png"));
        ClosePrograme.setIcon(II);
    }//GEN-LAST:event_CloseProgrameMouseEntered

    private void CloseProgrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseProgrameMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CloseProgramClick.png"));
        ClosePrograme.setIcon(II);
    }//GEN-LAST:event_CloseProgrameMousePressed

    private void AddItemButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddOver.png"));
        AddItemButton.setIcon(II);
    }//GEN-LAST:event_AddItemButtonMouseEntered

    private void AddItemButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddDefault.png"));
        AddItemButton.setIcon(II);
    }//GEN-LAST:event_AddItemButtonMouseExited

    private void AddItemButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddClick.png"));
        AddItemButton.setIcon(II);
    }//GEN-LAST:event_AddItemButtonMousePressed

    private void AddItemButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddOver.png"));
        AddItemButton.setIcon(II);
    }//GEN-LAST:event_AddItemButtonMouseReleased

    private void SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitOver.png"));
        Submit.setIcon(II);
    }//GEN-LAST:event_SubmitMouseEntered

    private void SubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitDefault.png"));
        Submit.setIcon(II);
    }//GEN-LAST:event_SubmitMouseExited

    private void SubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitClick.png"));
        Submit.setIcon(II);
    }//GEN-LAST:event_SubmitMousePressed

    private void SubmitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitOver.png"));
        Submit.setIcon(II);
    }//GEN-LAST:event_SubmitMouseReleased

    private void AddItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemButtonMouseClicked
        // TODO add your handling code here:
        
        int row = ItemDemand.getSelectedRow();
        
       ID.setText((String) ItemDemand.getValueAt(row, 0));
       ItemName.setText((String) ItemDemand.getValueAt(row, 1));
       Category.setText((String) ItemDemand.getValueAt(row, 2));
       Qty.setText((String) ItemDemand.getValueAt(row, 3));
       
        CenterPanel.removeAll();
        CenterPanel.revalidate();
        CenterPanel.repaint();
        
        CenterPanel.add(AddItemPanel);
        CenterPanel.revalidate();
        CenterPanel.repaint();
       
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/AddItemsClick.png"));
        AddItem.setIcon(II); 
        
        
        ImageIcon III = new ImageIcon(getClass().getResource("/Images/ItemDemandDefault.png"));
        ItemDemandLable.setIcon(III);
        
       
        

        
    }//GEN-LAST:event_AddItemButtonMouseClicked

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyActionPerformed

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
                                          
            // TODO add your handling code here:
            
            
            int IDG =Integer.parseInt(ID.getText());
            String NameGet = ItemName.getText();
            String Cat = Category.getText();
            int Quantity = Integer.parseInt(Qty.getText());
            
            
            
            try {
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
           Connections.st.executeUpdate("insert into AddItemSUmmary values("+IDG+",'"+NameGet+"','"+Cat+"','"+Quantity+"')");
           Connections.st.executeUpdate("Update Items set Quantity = Quantity + "+Quantity+" where ID="+IDG+" ");
            } catch (SQLException ex) {
                Logger.getLogger(InventoryManagerForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try{
            DefaultTableModel dtm;
            ResultSetMetaData  rsmd;
            String str2 = "Select * from AddItemSUmmary";
            
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery(str2);

            rsmd = rs.getMetaData();
            int column = rsmd.getColumnCount();
            dtm = new DefaultTableModel();
            Vector column_name = new Vector();
            Vector row_data = new Vector();
            for(int i = 1; i<=column; i++){
                column_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(column_name);
            while(rs.next()){
                row_data = new Vector();
                for(int j =1;j<=column;j++){
                    row_data.addElement(rs.getString(j));
                }
                dtm.addRow(row_data);
            }
            AddItemTbl.setModel(dtm);
            
        } catch (SQLException ex) {
            Logger.getLogger(InventoryManagerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitMouseClicked

    private void AddItemTblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_AddItemTblAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_AddItemTblAncestorAdded

    private void AddItemTblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddItemTblMouseEntered
        // TODO add your handling code here:

        DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        String str = "Select * from AddItemSUmmary";
        try{
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery(str);

            rsmd = rs.getMetaData();
            int column = rsmd.getColumnCount();
            dtm = new DefaultTableModel();
            Vector column_name = new Vector();
            Vector row_data = new Vector();
            for(int i = 1; i<=column; i++){
                column_name.addElement(rsmd.getColumnName(i));
            }
            dtm.setColumnIdentifiers(column_name);
            while(rs.next()){
                row_data = new Vector();
                for(int j =1;j<=column;j++){
                    row_data.addElement(rs.getString(j));
                }
                dtm.addRow(row_data);
            }
            AddItemTbl.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_AddItemTblMouseEntered

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
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItem;
    private javax.swing.JLabel AddItemButton;
    private javax.swing.JPanel AddItemPanel;
    public static javax.swing.JScrollPane AddItemSummary;
    public static javax.swing.JTable AddItemTbl;
    private javax.swing.JLabel BackGroundImage;
    private javax.swing.JLabel BackImage;
    private javax.swing.JLabel Category;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel ClosePrograme;
    private javax.swing.JScrollPane DemandScroll;
    private javax.swing.JPanel GenerateReports;
    private javax.swing.JLabel ID;
    private javax.swing.JTable ImStatus;
    private javax.swing.JTable ItemDemand;
    private javax.swing.JLabel ItemDemandLable;
    private javax.swing.JPanel ItemDemandPanel;
    private javax.swing.JLabel ItemName;
    private javax.swing.JLabel Logout;
    private javax.swing.JTextField Qty;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel SidePanelImage;
    private javax.swing.JLabel Status;
    private javax.swing.JScrollPane StatusScroll;
    public static javax.swing.JLabel Submit;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
