/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package help4travelling;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Agustin
 */
public class ConsultarServicio extends javax.swing.JFrame {
    private IControladorCategoria ICCategoria;
    private IControladorArticulo ICArticulo = Factory.GetInstance().getIControladorArticulo();
    /**
     * Creates new form AltaUsuario
     */
    public ConsultarServicio() {
        initComponents();
        ICCategoria = Factory.GetInstance().getIControladorCategoria();
    }
    
    private Image ScaledImage(Image img, int w, int h){
        BufferedImage resizedImage = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImage.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(img, 0, 0, w, h,null);
        g2.dispose();
        return resizedImage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tree_servicios = new javax.swing.JTree();
        jLabel153 = new javax.swing.JLabel();
        cmb_serviciosXcat = new javax.swing.JComboBox<>();
        jLabel154 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        lbl_img2 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        lbl_img3 = new javax.swing.JLabel();
        lbl_img1 = new javax.swing.JLabel();
        lbl_nombre1 = new javax.swing.JLabel();
        lbl_desc1 = new javax.swing.JLabel();
        lbl_origen1 = new javax.swing.JLabel();
        lbl_destino1 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        lbl_proveedor1 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setBounds(new java.awt.Rectangle(0, 0, 1218, 707));
        setMinimumSize(new java.awt.Dimension(1218, 707));
        setResizable(false);
        setSize(new java.awt.Dimension(1218, 707));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(51, 51, 51));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1220, 10));

        jLabel149.setBackground(java.awt.Color.darkGray);
        jLabel149.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel149.setForeground(java.awt.Color.darkGray);
        jLabel149.setText("Servicios por proveedor");
        getContentPane().add(jLabel149, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        tree_servicios.setAutoscrolls(true);
        tree_servicios.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                tree_serviciosTreeExpanded(evt);
            }
        });
        tree_servicios.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                tree_serviciosValueChanged(evt);
            }
        });
        jScrollPane5.setViewportView(tree_servicios);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 540));

        jLabel153.setBackground(java.awt.Color.darkGray);
        jLabel153.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel153.setForeground(java.awt.Color.darkGray);
        jLabel153.setText("SERVICIOS POR CATEGORIA");
        getContentPane().add(jLabel153, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        cmb_serviciosXcat.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        cmb_serviciosXcat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_serviciosXcatItemStateChanged(evt);
            }
        });
        cmb_serviciosXcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_serviciosXcatMouseClicked(evt);
            }
        });
        cmb_serviciosXcat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_serviciosXcatActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_serviciosXcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 290, 20));

        jLabel154.setBackground(java.awt.Color.darkGray);
        jLabel154.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel154.setForeground(java.awt.Color.darkGray);
        jLabel154.setText("Ciudad Destino");
        getContentPane().add(jLabel154, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, -1, -1));

        jLabel155.setBackground(java.awt.Color.darkGray);
        jLabel155.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel155.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel155, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 290, 20));

        jLabel156.setBackground(java.awt.Color.darkGray);
        jLabel156.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel156.setForeground(java.awt.Color.darkGray);
        jLabel156.setText("Imagenes");
        getContentPane().add(jLabel156, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        jLabel157.setBackground(java.awt.Color.darkGray);
        jLabel157.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel157.setForeground(java.awt.Color.darkGray);
        jLabel157.setText("Precio");
        getContentPane().add(jLabel157, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 20));

        jLabel158.setBackground(java.awt.Color.darkGray);
        jLabel158.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel158.setForeground(java.awt.Color.darkGray);
        jLabel158.setText("Ciudad Origen");
        getContentPane().add(jLabel158, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, -1, -1));

        lbl_img2.setBackground(java.awt.Color.white);
        lbl_img2.setOpaque(true);
        getContentPane().add(lbl_img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel162.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/confirmar.png"))); // NOI18N
        jLabel162.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel162.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel162.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel162.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel162.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel162MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel162, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 650, 43, 43));

        lbl_img3.setBackground(java.awt.Color.white);
        lbl_img3.setOpaque(true);
        getContentPane().add(lbl_img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lbl_img1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_img1.setOpaque(true);
        getContentPane().add(lbl_img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lbl_nombre1.setBackground(java.awt.Color.lightGray);
        lbl_nombre1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lbl_desc1.setBackground(java.awt.Color.lightGray);
        lbl_desc1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        lbl_desc1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lbl_desc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lbl_origen1.setBackground(java.awt.Color.lightGray);
        lbl_origen1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(lbl_origen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        lbl_destino1.setBackground(java.awt.Color.lightGray);
        lbl_destino1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(lbl_destino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel213.setBackground(java.awt.Color.darkGray);
        jLabel213.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel213.setForeground(java.awt.Color.darkGray);
        jLabel213.setText("Proveedor");
        getContentPane().add(jLabel213, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        lbl_proveedor1.setBackground(java.awt.Color.lightGray);
        lbl_proveedor1.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        getContentPane().add(lbl_proveedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        jLabel159.setBackground(java.awt.Color.darkGray);
        jLabel159.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel159.setForeground(java.awt.Color.darkGray);
        jLabel159.setText("Nombre");
        getContentPane().add(jLabel159, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel160.setBackground(java.awt.Color.darkGray);
        jLabel160.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel160.setForeground(java.awt.Color.darkGray);
        jLabel160.setText("Descripcion");
        getContentPane().add(jLabel160, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel163.setBackground(java.awt.Color.darkGray);
        jLabel163.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel163.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel163, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 290, 20));

        jLabel164.setBackground(java.awt.Color.darkGray);
        jLabel164.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel164.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel164, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 290, 20));

        jLabel165.setBackground(java.awt.Color.darkGray);
        jLabel165.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel165.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel165, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 290, 20));

        jLabel166.setBackground(java.awt.Color.darkGray);
        jLabel166.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel166.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel166, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 290, 20));

        jLabel167.setBackground(java.awt.Color.darkGray);
        jLabel167.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel167.setForeground(java.awt.Color.darkGray);
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel167.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 740, 120));

        jLabel168.setBackground(java.awt.Color.darkGray);
        jLabel168.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel168.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel168, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 280, 170));

        jLabel169.setBackground(java.awt.Color.darkGray);
        jLabel169.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel169.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel169, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 280, 170));

        jLabel170.setBackground(java.awt.Color.darkGray);
        jLabel170.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        jLabel170.setForeground(java.awt.Color.darkGray);
        getContentPane().add(jLabel170, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 280, 170));

        jLabel1.setBackground(java.awt.Color.white);
        jLabel1.setEnabled(false);
        jLabel1.setFocusable(false);
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1218, 590));

        jLabel3.setFont(new java.awt.Font("Ubuntu Light", 0, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Ver información de servicio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/help4travelling/img/banner2.png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tree_serviciosTreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_tree_serviciosTreeExpanded
        cmb_serviciosXcat.removeAllItems();
        jLabel163.setText("");
        jLabel164.setText("");
        jLabel165.setText("");
        jLabel166.setText("");
        jLabel155.setText("");
        jLabel167.setText("");
        jLabel168.setIcon(null);
        jLabel169.setIcon(null);
        jLabel170.setIcon(null);
    }//GEN-LAST:event_tree_serviciosTreeExpanded

    private void tree_serviciosValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_tree_serviciosValueChanged
        try{
            jLabel163.setText("");
            jLabel164.setText("");
            jLabel165.setText("");
            jLabel166.setText("");
            jLabel155.setText("");
            jLabel167.setText("");
            jLabel168.setIcon(null);
            jLabel169.setIcon(null);
            jLabel170.setIcon(null);
            cmb_serviciosXcat.removeAllItems();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode)tree_servicios.getLastSelectedPathComponent();
            if(!(node == null)){
                String nameCat = (String)node.getUserObject();
                ArrayList<DtServicio> servs = ICCategoria.listarServicios(nameCat);
                if(!servs.isEmpty() || servs == null){
                    cmb_serviciosXcat.removeAllItems();
                    int x = servs.size();
                    for(int e = 0; e < x; e++){
                        cmb_serviciosXcat.addItem(servs.get(e).getNickProveedor() + "," + servs.get(e).getNombre());
                    }
                }
            }
        }
        catch(Exception ex){

        }
    }//GEN-LAST:event_tree_serviciosValueChanged

    private void cmb_serviciosXcatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatItemStateChanged
        String nickP, nombreA;
        if(cmb_serviciosXcat.getModel().getSize() != 0){
            nickP = cmb_serviciosXcat.getSelectedItem().toString().substring(0, cmb_serviciosXcat.getSelectedItem().toString().lastIndexOf(","));
            nombreA = cmb_serviciosXcat.getSelectedItem().toString().substring(cmb_serviciosXcat.getSelectedItem().toString().lastIndexOf(",")+1);
            DtServicio ret = ICArticulo.datosServicio(nombreA, nickP);
            
            jLabel169.setIcon(null);
            if(ManejadorSQL.GetInstance().selectImgServicio("imagen1", nickP, nombreA) != null){
                Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen1", nickP, nombreA)).getImage();
                ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel169.getWidth(),jLabel169.getHeight()));
                jLabel169.setIcon(icon);
            }
            
            jLabel170.setIcon(null);
            if(ManejadorSQL.GetInstance().selectImgServicio("imagen2", nickP, nombreA) != null){
                Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen2", nickP, nombreA)).getImage();
                ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel170.getWidth(),jLabel170.getHeight()));
                jLabel170.setIcon(icon);
            }
            
            jLabel168.setIcon(null);
            if(ManejadorSQL.GetInstance().selectImgServicio("imagen3", nickP, nombreA) != null){
                Image a =  new ImageIcon(ManejadorSQL.GetInstance().selectImgServicio("imagen3", nickP, nombreA)).getImage();
                ImageIcon icon = new ImageIcon(ScaledImage(a,jLabel168.getWidth(),jLabel168.getHeight()));
                jLabel168.setIcon(icon);
            }

            jLabel163.setText(nickP);
            jLabel164.setText(ret.getNombre());
            jLabel165.setText(""+ret.getPrecio());
            jLabel155.setText(ret.getCiudadDestino());
            jLabel166.setText(ret.getCiudadOrigen());
            jLabel167.setText(ret.getDescripcion());
        }
    }//GEN-LAST:event_cmb_serviciosXcatItemStateChanged

    private void cmb_serviciosXcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_serviciosXcatMouseClicked

    private void cmb_serviciosXcatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_serviciosXcatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_serviciosXcatActionPerformed

    private void jLabel162MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel162MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel162MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultMutableTreeNode tree = new DefaultMutableTreeNode("todas");
        ArrayList<DtCategoria> categorias = ICCategoria.listarCategorias();

        int max =0;
        for (int i = 0; i < categorias.size(); i++){
            if (max < categorias.get(i).getNivel()){
                max =categorias.get(i).getNivel();
            }
        }
        HashMap<String, DefaultMutableTreeNode> tree2 = new HashMap();
        tree2.put("todas", tree);
        for (int j = 0; j < max+1; j++){
            for (DtCategoria categoria : categorias) {
                if(j == categoria.getNivel()){
                    DefaultMutableTreeNode cat = new DefaultMutableTreeNode();
                    cat.setUserObject(categoria.getNombre());
                    for(String name : tree2.keySet()){
                        if(name.equals(categoria.getNombrePadre()))
                            tree2.get(name).add(cat);
                    }
                    //tree.add(cat);
                    tree2.put(categoria.getNombre(), cat);
                }
            }
        }

        DefaultTreeModel modeloTree = new DefaultTreeModel(tree);
        tree_servicios.setModel(modeloTree);
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
            java.util.logging.Logger.getLogger(ConsultarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_serviciosXcat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_desc1;
    private javax.swing.JLabel lbl_destino1;
    private javax.swing.JLabel lbl_img1;
    private javax.swing.JLabel lbl_img2;
    private javax.swing.JLabel lbl_img3;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_origen1;
    private javax.swing.JLabel lbl_proveedor1;
    private javax.swing.JTree tree_servicios;
    // End of variables declaration//GEN-END:variables
}