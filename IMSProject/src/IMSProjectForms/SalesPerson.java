/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMSProjectForms;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.*;

/**
 *
 * @author AmeerHamza
 */
public class SalesPerson extends javax.swing.JFrame {

    /**
     * Creates new form SalesPerson
     */
    public SalesPerson() {
        initComponents();
        items();
    }
         public void items(){
        
         TextAutoCompleter textAutoAcompleter = new TextAutoCompleter(AutoText);
         
         
        try {
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs =  Connections.st.executeQuery("select Item_Name from items");
            
            while(rs.next())
            {
                textAutoAcompleter.addItem(rs.getString("Item_Name"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
   

         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jOptionPane1 = new javax.swing.JOptionPane();
        SidePanel = new javax.swing.JPanel();
        Status = new javax.swing.JLabel();
        viewProducts = new javax.swing.JLabel();
        Invoices = new javax.swing.JLabel();
        ReturnBill = new javax.swing.JLabel();
        ChangePass = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        ClosePrograme = new javax.swing.JLabel();
        InformToIm = new javax.swing.JLabel();
        SidePanelImage = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        StatusPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        statustbl = new javax.swing.JTable();
        ViewProduct = new javax.swing.JPanel();
        RefreshItemButton = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        AutoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        InvoicePanel = new javax.swing.JPanel();
        CreateBillButton = new javax.swing.JLabel();
        ItemStockPurchaseScroll = new javax.swing.JScrollPane();
        ItemStockPurchase = new javax.swing.JTable();
        Invoice = new javax.swing.JScrollPane();
        InvoiceTbl = new javax.swing.JTable();
        RBill = new javax.swing.JLabel();
        PurchaseImageLabel = new javax.swing.JLabel();
        ReturnProduct = new javax.swing.JPanel();
        InvoiceR = new javax.swing.JTextField();
        ItemIdR = new javax.swing.JTextField();
        ItemNameR = new javax.swing.JTextField();
        CategoryR = new javax.swing.JTextField();
        QtyR = new javax.swing.JTextField();
        AmountR = new javax.swing.JTextField();
        CancelBill = new javax.swing.JLabel();
        ReturnSummaryTbl = new javax.swing.JScrollPane();
        RST = new javax.swing.JTable();
        ReturnProductSummary = new javax.swing.JLabel();
        InformToIM = new javax.swing.JPanel();
        InformID = new javax.swing.JTextField();
        InformItemName = new javax.swing.JTextField();
        InformItemCategory = new javax.swing.JTextField();
        INformItemQuantity = new javax.swing.JTextField();
        InforIMScroll = new javax.swing.JScrollPane();
        InformToIMTbl = new javax.swing.JTable();
        Submit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        MegaLableBackground = new javax.swing.JLabel();

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setOpaque(false);
        jScrollPane2.setVerifyInputWhenFocusTarget(false);

        jTable1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Qty", "Price"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/StatusClick.png"))); // NOI18N
        Status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StatusMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StatusMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                StatusMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                StatusMouseReleased(evt);
            }
        });
        SidePanel.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 80));

        viewProducts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ProductDefault.png"))); // NOI18N
        viewProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProductsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewProductsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewProductsMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                viewProductsMouseReleased(evt);
            }
        });
        SidePanel.add(viewProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 320, 100));

        Invoices.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"))); // NOI18N
        Invoices.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvoicesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InvoicesMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InvoicesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InvoicesMouseReleased(evt);
            }
        });
        SidePanel.add(Invoices, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 145, 320, 50));

        ReturnBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"))); // NOI18N
        ReturnBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnBillMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ReturnBillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ReturnBillMouseReleased(evt);
            }
        });
        SidePanel.add(ReturnBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 320, 60));

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
        SidePanel.add(ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 170, 70));

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
        SidePanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 325, 170, 60));

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
        SidePanel.add(ClosePrograme, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 370, 310, 100));

        InformToIm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InformDefault.png"))); // NOI18N
        InformToIm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InformToImMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InformToImMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                InformToImMouseReleased(evt);
            }
        });
        SidePanel.add(InformToIm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, -1, 50));

        SidePanelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PanelSide.png"))); // NOI18N
        SidePanel.add(SidePanelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, -1));

        getContentPane().add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 310, 460));

        CenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        CenterPanel.setLayout(new java.awt.CardLayout());

        StatusPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StatusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        statustbl.setModel(new javax.swing.table.DefaultTableModel(
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
        statustbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statustblMouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(statustbl);

        StatusPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        CenterPanel.add(StatusPanel, "card3");

        ViewProduct.setDoubleBuffered(false);
        ViewProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RefreshItemButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RefreshDefault.png"))); // NOI18N
        RefreshItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefreshItemButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RefreshItemButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RefreshItemButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RefreshItemButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RefreshItemButtonMouseReleased(evt);
            }
        });
        ViewProduct.add(RefreshItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 170, 50));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search.png"))); // NOI18N
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
        });
        ViewProduct.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 15, 160, 40));

        AutoText.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        AutoText.setBorder(null);
        AutoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AutoTextMouseEntered(evt);
            }
        });
        AutoText.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                AutoTextCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                AutoTextInputMethodTextChanged(evt);
            }
        });
        AutoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoTextActionPerformed(evt);
            }
        });
        AutoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AutoTextKeyTyped(evt);
            }
        });
        ViewProduct.add(AutoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 17, 605, 40));

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item_Name", "Category", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(myTable);

        ViewProduct.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 75, 800, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/panelCenter.png"))); // NOI18N
        ViewProduct.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        CenterPanel.add(ViewProduct, "card4");

        InvoicePanel.setPreferredSize(new java.awt.Dimension(813, 462));
        InvoicePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateBillButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CreateBillDefault.png"))); // NOI18N
        CreateBillButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateBillButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateBillButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateBillButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CreateBillButtonMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CreateBillButtonMouseReleased(evt);
            }
        });
        InvoicePanel.add(CreateBillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, 40));

        ItemStockPurchaseScroll.setBackground(new java.awt.Color(255, 255, 255));
        ItemStockPurchaseScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ItemStockPurchaseScroll.setOpaque(false);
        ItemStockPurchaseScroll.setVerifyInputWhenFocusTarget(false);

        ItemStockPurchase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ItemStockPurchase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Item ID", "Item Name", "Category", "Quantity", "Price", "Sold"
            }
        ));
        ItemStockPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ItemStockPurchaseMouseEntered(evt);
            }
        });
        ItemStockPurchaseScroll.setViewportView(ItemStockPurchase);

        InvoicePanel.add(ItemStockPurchaseScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 46, 784, 210));

        Invoice.setBackground(new java.awt.Color(255, 255, 255));
        Invoice.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Invoice.setOpaque(false);
        Invoice.setVerifyInputWhenFocusTarget(false);

        InvoiceTbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InvoiceTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Invoice No.", "Item ID", "Item Name", "Category", "Qty", "Total Bill"
            }
        ));
        InvoiceTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InvoiceTblMouseEntered(evt);
            }
        });
        Invoice.setViewportView(InvoiceTbl);

        InvoicePanel.add(Invoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 322, 745, 125));

        RBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RerutnDefault.png"))); // NOI18N
        RBill.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RBillAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RBillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RBillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RBillMouseReleased(evt);
            }
        });
        InvoicePanel.add(RBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, 260, 60));

        PurchaseImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Purchase.jpg"))); // NOI18N
        InvoicePanel.add(PurchaseImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 813, 470));

        CenterPanel.add(InvoicePanel, "card5");

        ReturnProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InvoiceR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvoiceRActionPerformed(evt);
            }
        });
        ReturnProduct.add(InvoiceR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 77, 132, 42));

        ItemIdR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemIdRActionPerformed(evt);
            }
        });
        ReturnProduct.add(ItemIdR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 126, 132, 42));

        ItemNameR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNameRActionPerformed(evt);
            }
        });
        ReturnProduct.add(ItemNameR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 176, 132, 42));

        CategoryR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryRActionPerformed(evt);
            }
        });
        ReturnProduct.add(CategoryR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 227, 132, 42));

        QtyR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyRActionPerformed(evt);
            }
        });
        ReturnProduct.add(QtyR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 277, 132, 42));
        ReturnProduct.add(AmountR, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 327, 132, 42));

        CancelBill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RerutnDefault.png"))); // NOI18N
        CancelBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelBillMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CancelBillMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CancelBillMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CancelBillMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CancelBillMouseReleased(evt);
            }
        });
        ReturnProduct.add(CancelBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 360, 240, 90));

        ReturnSummaryTbl.setBackground(new java.awt.Color(255, 255, 255));
        ReturnSummaryTbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ReturnSummaryTbl.setOpaque(false);
        ReturnSummaryTbl.setVerifyInputWhenFocusTarget(false);

        RST.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Quantity", "Amount"
            }
        ));
        RST.setOpaque(false);
        RST.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                RSTAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RSTMouseEntered(evt);
            }
        });
        ReturnSummaryTbl.setViewportView(RST);

        ReturnProduct.add(ReturnSummaryTbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 505, 380));

        ReturnProductSummary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Return.jpg"))); // NOI18N
        ReturnProduct.add(ReturnProductSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        CenterPanel.add(ReturnProduct, "card5");

        InformToIM.setPreferredSize(new java.awt.Dimension(813, 462));
        InformToIM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InformID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformIDActionPerformed(evt);
            }
        });
        InformToIM.add(InformID, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 87, 130, 38));

        InformItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformItemNameActionPerformed(evt);
            }
        });
        InformToIM.add(InformItemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 137, 130, 38));

        InformItemCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformItemCategoryActionPerformed(evt);
            }
        });
        InformToIM.add(InformItemCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 188, 130, 38));

        INformItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INformItemQuantityActionPerformed(evt);
            }
        });
        InformToIM.add(INformItemQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 237, 130, 39));

        InforIMScroll.setBackground(new java.awt.Color(255, 255, 255));
        InforIMScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InforIMScroll.setOpaque(false);
        InforIMScroll.setVerifyInputWhenFocusTarget(false);

        InformToIMTbl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InformToIMTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Item Name", "Category", "Quantity", "Amount"
            }
        ));
        InformToIMTbl.setOpaque(false);
        InformToIMTbl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                InformToIMTblAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        InformToIMTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InformToIMTblMouseEntered(evt);
            }
        });
        InforIMScroll.setViewportView(InformToIMTbl);

        InformToIM.add(InforIMScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 505, 250));

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
        InformToIM.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/InformToIM.png"))); // NOI18N
        InformToIM.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 813, 462));

        CenterPanel.add(InformToIM, "card6");

        getContentPane().add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 810, 460));

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Minimize.png"))); // NOI18N
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 16, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1149, 16, -1, -1));

        MegaLableBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SalesPersonFormCutted.png"))); // NOI18N
        MegaLableBackground.setText("jLabel3");
        getContentPane().add(MegaLableBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_formMouseClicked

    private void viewProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductsMousePressed
        // TODO add your handling code here:
               ImageIcon II = new ImageIcon(getClass().getResource("/Images/ProductClick.png"));
                viewProducts.setIcon(II);
                
                ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/StatusDefault.png"));
                Status.setIcon(II2);
        
                ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
                Invoices.setIcon(II3);
                
                 ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                  ReturnBill.setIcon(II4);
                  
                  ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
                InformToIm.setIcon(II5);

    }//GEN-LAST:event_viewProductsMousePressed

    private void viewProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductsMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_viewProductsMouseExited

    private void viewProductsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductsMouseReleased
        // TODO add your handling code here:
              
               
    }//GEN-LAST:event_viewProductsMouseReleased

    private void viewProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProductsMouseClicked
        // TODO add your handling code here:
     CenterPanel.removeAll();   
     CenterPanel.repaint();
     CenterPanel.revalidate();
     
     CenterPanel.add(ViewProduct);
     CenterPanel.repaint();
     CenterPanel.revalidate();

    }//GEN-LAST:event_viewProductsMouseClicked

    private void StatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMouseClicked
        // TODO add your handling code here:
        
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
            statustbl.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
   CenterPanel.removeAll();   
     CenterPanel.repaint();
     CenterPanel.revalidate();
     
     CenterPanel.add(StatusPanel);
     CenterPanel.repaint();
     CenterPanel.revalidate();
    }//GEN-LAST:event_StatusMouseClicked

    private void StatusMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMousePressed
        // TODO add your handling code here:
              ImageIcon II = new ImageIcon(getClass().getResource("/Images/StatusClick.png"));
              Status.setIcon(II);
              
               ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
               ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
              Invoices.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                ReturnBill.setIcon(II4);
                
                ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
                InformToIm.setIcon(II5);
    }//GEN-LAST:event_StatusMousePressed

    private void StatusMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMouseReleased
        // TODO add your handling code here:
//              ImageIcon II = new ImageIcon(getClass().getResource("/Images/StatusDefault.png"));
//              Status.setIcon(II);
    }//GEN-LAST:event_StatusMouseReleased

    private void InvoicesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicesMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/InvoiceClick.png"));
        Invoices.setIcon(II);
        
                ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
                 ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/StatusDefault.png"));
                Status.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                ReturnBill.setIcon(II4);
                ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
                InformToIm.setIcon(II5);
    }//GEN-LAST:event_InvoicesMousePressed

    private void InvoicesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicesMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_InvoicesMouseReleased

    private void ReturnBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBillMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnProductClick.png"));
        ReturnBill.setIcon(II);
        
                       ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
               ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
              Invoices.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                ReturnBill.setIcon(II4);
                ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
                InformToIm.setIcon(II5);
    }//GEN-LAST:event_ReturnBillMousePressed

    private void ReturnBillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBillMouseReleased
        // TODO add your handling code here:
          ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnProductClick.png"));
        ReturnBill.setIcon(II);
        
                       ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
               ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
              Invoices.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/StatusDefault.png"));
               Status.setIcon(II4);
               
               ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
                InformToIm.setIcon(II5);
       
    }//GEN-LAST:event_ReturnBillMouseReleased

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

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LogoutMousePressed

    private void LogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/LogOutDefault.png"));
        Logout.setIcon(II); 
    }//GEN-LAST:event_LogoutMouseReleased

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

    private void CloseProgrameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseProgrameMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseProgrameMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
        Login in = new Login();
        in.setVisible(true);
        
    }//GEN-LAST:event_LogoutMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        
        this.setState(SalesPerson.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void RefreshItemButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshItemButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RefreshOver.png"));
        RefreshItemButton.setIcon(II);
    }//GEN-LAST:event_RefreshItemButtonMouseEntered

    private void RefreshItemButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshItemButtonMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RefreshDefault.png"));
        RefreshItemButton.setIcon(II);
    }//GEN-LAST:event_RefreshItemButtonMouseExited

    private void RefreshItemButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshItemButtonMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RefreshClick.png"));
        RefreshItemButton.setIcon(II);
    }//GEN-LAST:event_RefreshItemButtonMousePressed

    private void RefreshItemButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshItemButtonMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RefreshDefault.png"));
        RefreshItemButton.setIcon(II);
    }//GEN-LAST:event_RefreshItemButtonMouseReleased

    private void RefreshItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefreshItemButtonMouseClicked
        // TODO add your handling code here:
                DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        String str = " select ID , Item_Name , Category , Quantity , Price from Items  ";
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
            myTable.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_RefreshItemButtonMouseClicked

    private void InvoicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicesMouseClicked
        // TODO add your handling code here:
        
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
            ItemStockPurchase.setModel(dtm);
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          CenterPanel.removeAll();   
          CenterPanel.repaint();
          CenterPanel.revalidate();
        
          CenterPanel.add(InvoicePanel);
          CenterPanel.repaint();
          CenterPanel.revalidate();
          

        try{

       
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery("Select * from Invoice");

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
            SalesPerson.InvoiceTbl.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
          
          
             
    }//GEN-LAST:event_InvoicesMouseClicked

    private void CreateBillButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBillButtonMouseEntered
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CreateBillOver.png"));
        CreateBillButton.setIcon(II);
        
    }//GEN-LAST:event_CreateBillButtonMouseEntered

    private void CreateBillButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBillButtonMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CreateBillDefault.png"));
        CreateBillButton.setIcon(II);
    }//GEN-LAST:event_CreateBillButtonMouseExited

    private void CreateBillButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBillButtonMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CreateBillClick.png"));
        CreateBillButton.setIcon(II);
    }//GEN-LAST:event_CreateBillButtonMousePressed

    private void CreateBillButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBillButtonMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/CreateBillOver.png"));
        CreateBillButton.setIcon(II);
    }//GEN-LAST:event_CreateBillButtonMouseReleased

    private void StatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StatusMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusMouseExited

    private void CreateBillButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBillButtonMouseClicked
        // TODO add your handling code here:

       SalesForm ss = new SalesForm();
      

        
     int row = ItemStockPurchase.getSelectedRow();
          SalesPerson.ItemStockPurchase.getValueAt(row, 0);
          SalesPerson.ItemStockPurchase.getValueAt(row, 1);
          SalesPerson.ItemStockPurchase.getValueAt(row, 2);
          SalesPerson.ItemStockPurchase.getValueAt(row, 3);
          SalesPerson.ItemStockPurchase.getValueAt(row, 4);
          SalesPerson.ItemStockPurchase.getValueAt(row, 5);
     
          SalesForm.ItemIdG.setText((String) SalesPerson.ItemStockPurchase.getValueAt(row, 0));
          SalesForm.ItemNameG.setText((String) SalesPerson.ItemStockPurchase.getValueAt(row, 1));
          SalesForm.CategoryG.setText((String) SalesPerson.ItemStockPurchase.getValueAt(row, 2));
     int IDG =Integer.parseInt(SalesForm.ItemIdG.getText());
     String NameG = SalesForm.ItemNameG.getText();
     String CategoryGet = SalesForm.CategoryG.getText();
     ss.setVisible(true);
         
    }//GEN-LAST:event_CreateBillButtonMouseClicked

    private void InvoicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoicesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoicesMouseEntered

    private void InvoiceTblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvoiceTblMouseEntered
        // TODO add your handling code here:
         DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        String str = "Select * from Invoice";
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
            InvoiceTbl.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }//GEN-LAST:event_InvoiceTblMouseEntered

    private void statustblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statustblMouseEntered
        // TODO add your handling code here:
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
            statustbl.setModel(dtm);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_statustblMouseEntered

    private void ReturnBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnBillMouseClicked
        // TODO add your handling code here:
        
          CenterPanel.removeAll();   
          CenterPanel.repaint();
          CenterPanel.revalidate();
          
          CenterPanel.add(ReturnProduct);
          CenterPanel.repaint();
          CenterPanel.revalidate();
    }//GEN-LAST:event_ReturnBillMouseClicked

    private void CancelBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBillMouseEntered
        // TODO add your handling code here:
        
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnOver.png"));
        CancelBill.setIcon(II);
    }//GEN-LAST:event_CancelBillMouseEntered

    private void CancelBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBillMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RerutnDefault.png"));
        CancelBill.setIcon(II);
    }//GEN-LAST:event_CancelBillMouseExited

    private void CancelBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBillMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnClick.png"));
        
        CancelBill.setIcon(II);
        
    }//GEN-LAST:event_CancelBillMousePressed

    private void CancelBillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBillMouseReleased
        // TODO add your handling code here:
        ImageIcon III = new ImageIcon(getClass().getResource("/Images/ReturnOver.png"));
        CancelBill.setIcon(III);
    }//GEN-LAST:event_CancelBillMouseReleased

    private void ItemIdRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemIdRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemIdRActionPerformed

    private void ItemNameRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNameRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNameRActionPerformed

    private void CategoryRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoryRActionPerformed

    private void ChangePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangePassMouseClicked
        // TODO add your handling code here:
        
        ChangePassword Cp = new ChangePassword();
        Cp.setVisible(true);
    }//GEN-LAST:event_ChangePassMouseClicked

    private void CancelBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelBillMouseClicked
        // TODO add your handling code here:
        
            int Invoice;
            int IDR;
            String Item_NameR;
            String CategorR;
            int QuantityR;
            int QuantityMinusR;
            int QuantityPlusR;
            int SoldR;
            int AmountsR;
            

            
        try {
            
            Invoice =  Integer.parseInt(InvoiceR.getText());
            IDR = Integer.parseInt(ItemIdR.getText());
            Item_NameR = ItemNameR.getText();
            CategorR = CategoryR.getText();
            QuantityR = Integer.parseInt(QtyR.getText());
            AmountsR = Integer.parseInt(AmountR.getText());
            

            
             
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            Connections.st.executeUpdate("insert into Returnx values ("+IDR+",'"+Item_NameR+"','"+CategorR+"',"+QuantityR+","+AmountsR+")");
            Connections.st.executeUpdate("delete from Invoice where Invoice_No="+Invoice+"");
            
            //QuantityMinusR = Integer.parseInt(QtyR.getText());
            Connections.st.executeUpdate(" Update Items set Quantity = Quantity + "+QuantityR+" where  ID  = "+IDR+" ");
          //  QuantityPlusR = Integer.parseInt(QtyR.getText());
            Connections.st.executeUpdate(" Update Items set Sold = Sold - "+QuantityR+" where  ID  = "+IDR+" ");
            InvoiceR.setText("");
            ItemIdR.setText("");
            ItemNameR.setText("");
            CategoryR.setText("");
            QtyR.setText("");
            AmountR.setText("");
             DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        String str = "Select * from Returnx";
        
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
            RST.setModel(dtm);
            
           
           
        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_CancelBillMouseClicked

    private void RSTAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RSTAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RSTAncestorAdded

    private void RSTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RSTMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RSTMouseEntered

    private void InformItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformItemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformItemNameActionPerformed

    private void InformToImMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformToImMouseClicked
        // TODO add your handling code here:
        CenterPanel.removeAll();   
          CenterPanel.repaint();
          CenterPanel.revalidate();
        
        
        CenterPanel.add(InformToIM);
        CenterPanel.repaint();
          CenterPanel.revalidate();
    }//GEN-LAST:event_InformToImMouseClicked

    private void InformToImMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformToImMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/InformDefault.png"));
        InformToIm.setIcon(II);
        
                       ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
               ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
              Invoices.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                ReturnBill.setIcon(II4);
                
                ImageIcon II5 = new ImageIcon(getClass().getResource("/Images/StatusDefault.png"));
                Status.setIcon(II5);

    }//GEN-LAST:event_InformToImMousePressed

    private void InformToImMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformToImMouseReleased
        // TODO add your handling code here:
            ImageIcon II = new ImageIcon(getClass().getResource("/Images/InformClick.png"));
        InformToIm.setIcon(II);
        
                       ImageIcon II2 = new ImageIcon(getClass().getResource("/Images/ProductDefault.png"));
               viewProducts.setIcon(II2);
               
               ImageIcon II3 = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
              Invoices.setIcon(II3);
              
               ImageIcon II4 = new ImageIcon(getClass().getResource("/Images/ReturnProductDefault.png"));
                ReturnBill.setIcon(II4);
   
    }//GEN-LAST:event_InformToImMouseReleased

    private void InformItemCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformItemCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformItemCategoryActionPerformed

    private void InformIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformIDActionPerformed

    private void INformItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INformItemQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_INformItemQuantityActionPerformed

    private void InformToIMTblAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_InformToIMTblAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_InformToIMTblAncestorAdded

    private void InformToIMTblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformToIMTblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_InformToIMTblMouseEntered

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        // TODO add your handling code here:
         int InID = Integer.parseInt(InformID.getText().toString());
       String InName = InformItemName.getText().toString();
       String InCategory = InformItemCategory.getText().toString();
       int InQuantity = Integer.parseInt(INformItemQuantity.getText().toString());
       
       
        
        try {
          

            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
           Connections.st.executeUpdate("insert into InformToIM values("+InID+",'"+InName+"','"+InCategory+"','"+InQuantity+"')");
           
            
           
        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            InformToIMTbl.setModel(dtm);
        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_SubmitMouseClicked

    private void SubmitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitClick.png"));
        Submit.setIcon(II);
        
     
    }//GEN-LAST:event_SubmitMousePressed

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

    private void SubmitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseReleased
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/Images/SubmitOver.png"));
        Submit.setIcon(II);
    }//GEN-LAST:event_SubmitMouseReleased

    private void RBillMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBillMouseEntered
        // TODO add your handling code here:
         ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnOver.png"));
        RBill.setIcon(II);
    }//GEN-LAST:event_RBillMouseEntered

    private void RBillMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBillMouseExited
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/RerutnDefault.png"));
        RBill.setIcon(II);
    }//GEN-LAST:event_RBillMouseExited

    private void RBillMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBillMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnClick.png"));
        RBill.setIcon(II);
    }//GEN-LAST:event_RBillMousePressed

    private void RBillMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBillMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/Images/ReturnOver.png"));
        RBill.setIcon(II);
    }//GEN-LAST:event_RBillMouseReleased

    private void RBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBillMouseClicked
        // TODO add your handling code here:
        int row = InvoiceTbl.getSelectedRow();
        
        InvoiceTbl.getValueAt(row, 0);
        InvoiceTbl.getValueAt(row, 1);
        InvoiceTbl.getValueAt(row, 2);
        InvoiceTbl.getValueAt(row, 3);
        InvoiceTbl.getValueAt(row, 4);
        InvoiceTbl.getValueAt(row, 5);
        
        InvoiceR.setText((String) InvoiceTbl.getValueAt(row,0));
        ItemIdR.setText(((String) InvoiceTbl.getValueAt(row, 1)));
        ItemNameR.setText(((String) InvoiceTbl.getValueAt(row, 2)));
        CategoryR.setText(((String) InvoiceTbl.getValueAt(row, 3)));
        QtyR.setText((String) InvoiceTbl.getValueAt(row, 4));
        AmountR.setText((String) InvoiceTbl.getValueAt(row, 5));
               
          CenterPanel.removeAll();   
          CenterPanel.repaint();
          CenterPanel.revalidate();
          
          CenterPanel.add(ReturnProduct);
          CenterPanel.repaint();
          CenterPanel.revalidate();
          
          ImageIcon II = new ImageIcon(getClass().getResource("/Images/InvoiceDefault.png"));
          Invoices.setIcon(II);
          ImageIcon III = new ImageIcon(getClass().getResource("/Images/ReturnProductClick.png"));
          ReturnBill.setIcon(III);
          

    }//GEN-LAST:event_RBillMouseClicked

    private void RBillAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RBillAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_RBillAncestorAdded

    private void QtyRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyRActionPerformed
       
        

    }//GEN-LAST:event_QtyRActionPerformed

    private void ItemStockPurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemStockPurchaseMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemStockPurchaseMouseEntered

    private void InvoiceRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvoiceRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InvoiceRActionPerformed

    private void AutoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoTextActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AutoTextActionPerformed

    private void AutoTextCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AutoTextCaretPositionChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_AutoTextCaretPositionChanged

    private void AutoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AutoTextKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_AutoTextKeyTyped

    private void AutoTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AutoTextMouseEntered
        // TODO add your handling code here:


    }//GEN-LAST:event_AutoTextMouseEntered

    private void AutoTextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_AutoTextInputMethodTextChanged
        // TODO add your handling code here:
             
    }//GEN-LAST:event_AutoTextInputMethodTextChanged

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        // TODO add your handling code here:
                         String TextGet =  AutoText.getText();
                  DefaultTableModel dtm;
        ResultSetMetaData  rsmd;
        try {
            Connections.Connections();
            Connections.st = Connections.cn.createStatement();
            ResultSet rs = Connections.st.executeQuery("select * from Items where Item_Name='"+TextGet+"' ");
            

            
           
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
            myTable.setModel(dtm);

        } catch (SQLException ex) {
            Logger.getLogger(SalesPerson.class.getName()).log(Level.SEVERE, null, ex);   
        
    }//GEN-LAST:event_SearchMouseClicked
    } 

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
            java.util.logging.Logger.getLogger(SalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesPerson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesPerson().setVisible(true);

          

            
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AmountR;
    private javax.swing.JTextField AutoText;
    private javax.swing.JLabel CancelBill;
    private javax.swing.JTextField CategoryR;
    private static javax.swing.JPanel CenterPanel;
    private javax.swing.JLabel ChangePass;
    private javax.swing.JLabel ClosePrograme;
    public static javax.swing.JLabel CreateBillButton;
    private javax.swing.JTextField INformItemQuantity;
    private javax.swing.JScrollPane InforIMScroll;
    private javax.swing.JTextField InformID;
    private javax.swing.JTextField InformItemCategory;
    private javax.swing.JTextField InformItemName;
    private javax.swing.JPanel InformToIM;
    private javax.swing.JTable InformToIMTbl;
    private javax.swing.JLabel InformToIm;
    private javax.swing.JScrollPane Invoice;
    public static javax.swing.JPanel InvoicePanel;
    private javax.swing.JTextField InvoiceR;
    public static javax.swing.JTable InvoiceTbl;
    private javax.swing.JLabel Invoices;
    private javax.swing.JTextField ItemIdR;
    private javax.swing.JTextField ItemNameR;
    public static javax.swing.JTable ItemStockPurchase;
    private javax.swing.JScrollPane ItemStockPurchaseScroll;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel MegaLableBackground;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel PurchaseImageLabel;
    private javax.swing.JTextField QtyR;
    private javax.swing.JLabel RBill;
    private javax.swing.JTable RST;
    private javax.swing.JLabel RefreshItemButton;
    private javax.swing.JLabel ReturnBill;
    private javax.swing.JPanel ReturnProduct;
    private javax.swing.JLabel ReturnProductSummary;
    private javax.swing.JScrollPane ReturnSummaryTbl;
    private javax.swing.JLabel Search;
    private javax.swing.JPanel SidePanel;
    private javax.swing.JLabel SidePanelImage;
    private javax.swing.JLabel Status;
    private static javax.swing.JPanel StatusPanel;
    private javax.swing.JLabel Submit;
    private static javax.swing.JPanel ViewProduct;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable myTable;
    private javax.swing.JTable statustbl;
    private javax.swing.JLabel viewProducts;
    // End of variables declaration//GEN-END:variables
}
