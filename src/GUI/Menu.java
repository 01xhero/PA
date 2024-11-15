/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Font;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private VentanaLIstado listado;
    private Posicion posicion;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ingreso = new javax.swing.JButton();
        BD = new javax.swing.JButton();
        ClientesFrecuentes = new javax.swing.JButton();
        Reporte = new javax.swing.JButton();
        btn_posicion = new javax.swing.JButton();
        Ingreso2 = new javax.swing.JButton();
        panelEjecucion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(231, 246, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5b4e34b209ba4b158d6e0e7d51555b67-free.png"))); // NOI18N

        Ingreso.setBackground(new java.awt.Color(253, 239, 239));
        Ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/correo.png"))); // NOI18N
        Ingreso.setText("CORREO");
        Ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoActionPerformed(evt);
            }
        });

        BD.setBackground(new java.awt.Color(253, 239, 239));
        BD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        BD.setText("LISTADO");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });

        ClientesFrecuentes.setBackground(new java.awt.Color(253, 239, 239));
        ClientesFrecuentes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/preguntas-frecuentes.png"))); // NOI18N
        ClientesFrecuentes.setText("CLIENTES FRECUENTES");
        ClientesFrecuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesFrecuentesActionPerformed(evt);
            }
        });

        Reporte.setBackground(new java.awt.Color(253, 239, 239));
        Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico-de-barras.png"))); // NOI18N
        Reporte.setText("REPORTE");
        Reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteActionPerformed(evt);
            }
        });

        btn_posicion.setBackground(new java.awt.Color(253, 239, 239));
        btn_posicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ubicacion.png"))); // NOI18N
        btn_posicion.setText("POSICION");
        btn_posicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posicionActionPerformed(evt);
            }
        });

        Ingreso2.setBackground(new java.awt.Color(253, 239, 239));
        Ingreso2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario (1).png"))); // NOI18N
        Ingreso2.setText("INGRESO");
        Ingreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingreso2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClientesFrecuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BD, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(Ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClientesFrecuentes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_posicion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 270, -1));

        panelEjecucion.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelEjecucionLayout = new javax.swing.GroupLayout(panelEjecucion);
        panelEjecucion.setLayout(panelEjecucionLayout);
        panelEjecucionLayout.setHorizontalGroup(
            panelEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        panelEjecucionLayout.setVerticalGroup(
            panelEjecucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(panelEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 0, 730, 576));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoActionPerformed

    }//GEN-LAST:event_IngresoActionPerformed

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        
        if (listado == null) { // Si listado es null, significa que aún no se ha creado
            listado = new VentanaLIstado();
            listado.setVisible(true);

            // Agrega un listener para cuando la ventana se cierre
            listado.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    listado = null; // Restablece listado a null cuando la ventana se cierre
                }
            });
        } else {
            listado.toFront(); // Lleva la ventana al frente si ya está abierta
        }
    }//GEN-LAST:event_BDActionPerformed

    private void ClientesFrecuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesFrecuentesActionPerformed
             Document documento = new Document();

        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Informe_de_Frecuencia.pdf"));
            documento.open();

            Paragraph title = new Paragraph("Informe de Frecuencia\n\n", FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLD));
            documento.add(title);

            PdfPTable vehicleTable = new PdfPTable(2);
            vehicleTable.addCell("Fecha");
            vehicleTable.addCell("Cantidad de Vehículos");

            String vehicleQuery = "SELECT DATE(entrada), COUNT(*) FROM listados GROUP BY DATE(entrada)";
            try (Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "");
                 PreparedStatement pst = cn.prepareStatement(vehicleQuery);
                 ResultSet rs = pst.executeQuery()) {

                while (rs.next()) {
                    vehicleTable.addCell(rs.getString(1));
                    vehicleTable.addCell(rs.getString(2));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            documento.add(vehicleTable);

            documento.close();
            JOptionPane.showMessageDialog(null, "INFORME DE FRECUENCIA GENERADO");
        } catch (DocumentException | HeadlessException | FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("Generando reporte...");
    

    }//GEN-LAST:event_ClientesFrecuentesActionPerformed

    private void ReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteActionPerformed
        
         String[] options = {"Generar Reporte"};

        int result = JOptionPane.showOptionDialog(null, "Generar Listado", "Reporte",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        if (result == 0) {
            Document documento = new Document();

            try {
                String ruta = System.getProperty("user.home");
                PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Desktop/Reporte_de_la_lista.pdf"));
                documento.open();

                PdfPTable tabla = new PdfPTable(12); // Tabla con 12 columnas
                tabla.setWidthPercentage(100); // Ajustar al 100% del ancho de la página
                tabla.setSpacingBefore(10f);
                tabla.setSpacingAfter(10f);

                // Encabezados con estilos básicos
                BaseColor headerColor = new BaseColor(200, 200, 200); // Gris claro
                String[] headers = {"ID", "Propietario", "Correo", "Tipo Vehiculo", "Precio por Hora",
                        "Placa", "Ciudad", "Posición", "Entrada", "Salida", "Estado", "Monto"};

                for (String header : headers) {
                    PdfPCell cellHeader = new PdfPCell(new Phrase(header));
                    cellHeader.setBackgroundColor(headerColor); // Fondo gris
                    cellHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellHeader.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellHeader.setPadding(8); // Espaciado interno
                    tabla.addCell(cellHeader);
                }

                // Contenido de las celdas
                try {
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd", "root", "");
                    PreparedStatement pst = cn.prepareStatement("SELECT * FROM listados");

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        do {
                            for (int i = 1; i <= 12; i++) {
                                String cellValue = rs.getString(i);
                                if (cellValue == null) {
                                    cellValue = ""; // Asignar cadena vacía si es null
                                }

                                PdfPCell cellContent = new PdfPCell(new Phrase(cellValue));
                                cellContent.setHorizontalAlignment(Element.ALIGN_CENTER);
                                cellContent.setVerticalAlignment(Element.ALIGN_MIDDLE);
                                cellContent.setPadding(5);
                                tabla.addCell(cellContent);
                            }
                        } while (rs.next());
                        documento.add(tabla); // Agregar tabla al documento
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Error al obtener datos de la base de datos.");
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE GENERADO");

            } catch (DocumentException | FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al generar el reporte.");
            }

            System.out.println("Generando reporte...");
        }
    

    }//GEN-LAST:event_ReporteActionPerformed

    private void btn_posicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_posicionActionPerformed
        if (posicion == null) { // Si listado es null, significa que aún no se ha creado
        posicion = new Posicion();
        posicion.setVisible(true);
        
        // Agrega un listener para cuando la ventana se cierre
        posicion.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                posicion = null; // Restablece listado a null cuando la ventana se cierre
            }
        });
    } else {
        posicion.toFront(); // Lleva la ventana al frente si ya está abierta
    }
    }//GEN-LAST:event_btn_posicionActionPerformed

    private void Ingreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingreso2ActionPerformed
        Ingreso ingreso = new Ingreso();
        ingreso.setSize(730, 576);
        ingreso.setLocation(0, 0);

        panelEjecucion.removeAll();
        panelEjecucion.add(ingreso, Menu.CENTER_ALIGNMENT);
        panelEjecucion.repaint();

    }//GEN-LAST:event_Ingreso2ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD;
    private javax.swing.JButton ClientesFrecuentes;
    private javax.swing.JButton Ingreso;
    private javax.swing.JButton Ingreso2;
    private javax.swing.JButton Reporte;
    private javax.swing.JButton btn_posicion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelEjecucion;
    // End of variables declaration//GEN-END:variables
}
