/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package graficasbasicas;

import java.awt.Color;


public class DibujoGraficasView extends javax.swing.JFrame {

   
    public DibujoGraficasView() {
        initComponents();
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDibujaBruja = new javax.swing.JButton();
        btnDibujarAbeja = new javax.swing.JButton();
        btnDibujaOso = new javax.swing.JButton();
        Pizarra = new javax.swing.JPanel();
        btnDibujoMariquita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDibujaBruja.setText("Bruja");
        btnDibujaBruja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDibujaBrujaMouseClicked(evt);
            }
        });
        btnDibujaBruja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujaBrujaActionPerformed(evt);
            }
        });

        btnDibujarAbeja.setText("Abeja");
        btnDibujarAbeja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDibujarAbejaMouseClicked(evt);
            }
        });
        btnDibujarAbeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDibujarAbejaActionPerformed(evt);
            }
        });

        btnDibujaOso.setText("Oso");
        btnDibujaOso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDibujaOsoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PizarraLayout = new javax.swing.GroupLayout(Pizarra);
        Pizarra.setLayout(PizarraLayout);
        PizarraLayout.setHorizontalGroup(
            PizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        PizarraLayout.setVerticalGroup(
            PizarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        btnDibujoMariquita.setText("Mariquita");
        btnDibujoMariquita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDibujoMariquitaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnDibujaBruja, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDibujarAbeja, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDibujaOso, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnDibujoMariquita)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDibujaOso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDibujarAbeja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDibujoMariquita))
                    .addComponent(btnDibujaBruja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addComponent(Pizarra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDibujaBrujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujaBrujaActionPerformed
        // TODO add your handling code here:
      
      
    }//GEN-LAST:event_btnDibujaBrujaActionPerformed

    private void btnDibujarAbejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDibujarAbejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDibujarAbejaActionPerformed

    private void btnDibujaBrujaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDibujaBrujaMouseClicked
        // TODO add your handling code here:
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),190, 60 , 238, 115);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),238, 115, 217, 115);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),217, 115, 260, 180);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 180, 138, 180);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),138, 180,190, 60);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),180, 130, 210, 130);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 130, 210, 160);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 160, 180, 160);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),180, 160, 180, 130);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),185, 135, 205, 135);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),205, 135, 205, 155);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),205, 155, 185, 155);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),185, 155, 185, 135);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),159, 135, 180, 135);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),153, 155, 180, 155);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 155, 240, 155);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 135, 230, 135);
        
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 180, 300, 180);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),300, 180, 300, 190);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),300, 190, 100, 190);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 190, 100, 180);
        
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),160, 190, 140, 240);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),140, 240, 140, 270);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),140, 270, 170, 300);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),170, 300, 230, 300);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),230, 300, 260, 270);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 270, 260, 240);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 240, 240, 190);
    
        //Cabello Izquierdo
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),140, 190, 88, 240);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),88, 240, 100, 250);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 250, 130, 210);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),130, 210, 100, 265);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 265, 110, 270);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),110, 270, 130, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),130, 230, 120, 280);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),120, 280, 130, 290);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),130, 290, 140, 240);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 240, 240, 190);
        //Cabello derecho
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 240, 280, 290);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),280, 290, 290, 282);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),290, 282, 270, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),270, 230, 290, 270);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),290, 270, 300, 255);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),300, 255, 270, 210);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),270, 210, 300, 250);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),300, 250, 320, 240);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),320, 240, 266, 190);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),170, 300, 140, 350);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),140, 350, 140, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),140, 360, 260, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 360, 260, 350);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),260, 350, 230, 300);
       //Palo de escoba
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),70, 360, 340, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),340, 360, 340, 370);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),340, 370, 70, 370);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),70, 370, 70, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),340, 370, 70, 370);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),70, 370, 70, 360);
       //escoba
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),350, 340, 390, 340);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),390, 340, 390, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),390, 390, 350, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),350, 390,340, 370);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),340, 370, 340, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),340, 360, 350, 340);
       //piernas
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),150, 370, 165, 405);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),165, 405, 180, 405);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),180, 405, 180, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),180, 390, 170, 370);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),180, 390, 195, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),195, 390, 195, 405);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),195, 405, 180, 405);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),195, 390, 208, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),208, 390, 208, 420);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),208, 420, 195, 405);
        
        //---
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),208, 370, 212, 380);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),212, 380, 212, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),212, 390, 195, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),195, 390, 190, 370);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),212, 380, 225, 380);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),225, 380, 225, 390);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),225, 390, 212, 390);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),225, 380, 240, 380);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),240, 380, 240, 410);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),240, 410, 225, 390);
        
       //
  
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),170, 300, 100, 345);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 345, 110, 350);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),110, 350,165, 310);
         
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 345, 110, 350);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),110, 350, 110, 360);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),100, 345, 90, 350);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),90, 350, 90, 360);
       
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),230, 300, 287, 295);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),287, 295, 296, 300);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),296, 300, 235, 310);
       
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),287, 295, 292, 290);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),292, 290, 295, 290);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),295, 290, 294, 292);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),294, 292, 300, 290);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),300, 290, 302, 295);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),302, 295, 295, 300);
        
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),160, 200, 192, 200);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),192, 200, 192, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),192, 230, 160, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),160, 230, 160, 200);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),170, 206, 192, 206);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),192, 206, 192, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),192, 230, 170, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),170, 230, 170, 206);
        //
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 200, 240, 200);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),240, 200, 240, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),240, 230, 210, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 230, 210, 200);
        
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),210, 206, 230, 206);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),230, 206, 230, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(),230, 230, 210, 230);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 210, 230, 210, 206);
        
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 152, 230, 240, 230);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 152, 230, 152, 240);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 152, 240, 200, 240);        
         //
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 160, 260, 160, 270);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 160, 270, 170, 280);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 170, 280, 220, 280);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 220, 280, 230, 270);
         Dibujo.DibujarBruja1(Pizarra.getGraphics(), 230, 270, 230, 260);
         
         //
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 360, 60, 380, 80);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 380, 80, 380, 120);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 380, 120, 360, 140);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 360, 140, 370, 120);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 370, 120, 370, 80);
        Dibujo.DibujarBruja1(Pizarra.getGraphics(), 370, 80, 360, 60);
        
        
    }//GEN-LAST:event_btnDibujaBrujaMouseClicked

    private void btnDibujarAbejaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDibujarAbejaMouseClicked
        // TODO add your handling code here      
        
        Dibujo.AlasAbeja(Pizarra.getGraphics(), 150, 50, 100, 100);
        Dibujo.AlasAbeja(Pizarra.getGraphics(), 250, 50, 100, 100);
        //Borrador 
               
        Dibujo.CuerpoAbeja1(Pizarra.getGraphics(),100, 150, 150, 200);
        
        Dibujo.CuerpoAbeja2(Pizarra.getGraphics(),180, 150, 150, 200);
        
        Dibujo.CuerpoAbeja1(Pizarra.getGraphics(),260, 150, 150, 200);
        
        Dibujo.CuerpoAbeja2(Pizarra.getGraphics(),340, 150, 150, 200);
        
        Dibujo.OjosAbeja(Pizarra.getGraphics(), 450, 100, 150, 150);
        Dibujo.OjosAbeja(Pizarra.getGraphics(), 450, 100, 150, 150);
        
        Dibujo.OjosAbeja(Pizarra.getGraphics(), 350, 100, 150, 150);
        Dibujo.OjosAbeja(Pizarra.getGraphics(), 350, 100, 150, 150);
        //Pupilas de abeja
        Dibujo.CuerpoAbeja1(Pizarra.getGraphics(),400, 150, 50, 50);
        Dibujo.CuerpoAbeja1(Pizarra.getGraphics(),500, 150, 50, 50);
        //Borrador 
        Dibujo.LapizBorrador(Pizarra.getGraphics(),80, 350, 90, 150);
        Dibujo.LapizBorrador(Pizarra.getGraphics(),80, 350, 90, 150);
        
        Dibujo.Lapiz1(Pizarra.getGraphics(),120, 350, 90, 150);
        Dibujo.Lapiz1(Pizarra.getGraphics(),120, 350, 90, 150);
        
        int [] x13 = {160, 450, 430, 450, 160};
        int [] y13 = {350, 350, 425, 500, 500};
        Dibujo.Lapiz2(Pizarra.getGraphics(), x13, y13, 5);
        
        int [] x14 = {450, 500, 450, 430};
        int [] y14 = {350, 425, 500, 425};
        Dibujo.Lapiz3(Pizarra.getGraphics(), x14, y14, 4);
        
        int [] x15 = {485, 500, 485};
        int [] y15 = {400, 425, 450};
        Dibujo.Lapiz4(Pizarra.getGraphics(), x15, y15, 3);
        
        Dibujo.BocaAbeja(Pizarra.getGraphics(), 400, 250, 50, 50, 180, 180);
        
        int [] x18 = {150, 250, 240};
        int [] y18 = {100, 100, 200};
        Dibujo.Alas1(Pizarra.getGraphics(), x18, y18, 3);
        
        int [] x19 = {260, 353, 240};
        int [] y19 = {100, 100, 200};
        Dibujo.Alas2(Pizarra.getGraphics(), x19, y19, 3);
    }//GEN-LAST:event_btnDibujarAbejaMouseClicked

    private void btnDibujaOsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDibujaOsoMouseClicked
        // Oso
        int [] x = {100, 200, 100, 45};
        int [] y = {40, 100, 245, 100}; 
        Dibujo.Orejaizquierda(Pizarra.getGraphics(), x, y, 4);
        
        int [] x1 = {200, 300, 400, 540, 500, 360, 300, 245, 100, 60};
        int [] y1 = {100, 80, 100, 300, 400, 480, 460, 480,400, 300};
        Dibujo.CaraOso(Pizarra.getGraphics(), x1, y1, 10);
        
        int [] x2 = {400, 500, 560, 500};
        int [] y2= {100, 40, 135, 240}; 
        Dibujo.Orejaderecha(Pizarra.getGraphics(), x2, y2, 4);
          
        int [] x3 = {200, 250, 100, 60};
        int [] y3 = {100, 150, 400, 300};
        Dibujo.PerfilIzquierdo(Pizarra.getGraphics(), x3, y3, 4);
        
        int [] x4 = {400, 540, 500, 340};
        int [] y4 = {100, 300, 400, 150};
        Dibujo.PerfilDerecho(Pizarra.getGraphics(), x4, y4, 4);
        
        int [] x5 = {250, 250, 200, 160};
        int [] y5 = {150, 300, 350, 300};
        Dibujo.OjoIzquierdo(Pizarra.getGraphics(), x5, y5, 4);
        
        int [] x6 = {340, 440, 380, 340};
        int [] y6 = {150, 300, 350, 300};
        Dibujo.OjoDerecho(Pizarra.getGraphics(), x6, y6, 4);
        
        int [] x7 = {160, 200, 245, 100};
        int [] y7 = {300, 350, 480, 400};
        Dibujo.MejillaIzquierda(Pizarra.getGraphics(), x7, y7, 4);
        
       int [] x8 = {380, 437, 500, 360};
       int [] y8 = {350, 300, 400, 480};
       Dibujo.MejillaDerecha(Pizarra.getGraphics(), x8, y8, 4);
        
       int [] x9 = {245, 300, 360, 300};
       int [] y9 = {480, 460, 480, 520};
       Dibujo.Barbilla(Pizarra.getGraphics(), x9, y9, 4);
       
       int [] x10 = {270, 300, 333, 300};
       int [] y10 = {470, 460, 470, 480};
        Dibujo.BocaOso(Pizarra.getGraphics(), x10, y10, 4);
       
        int [] x11 = {296, 300, 304, 304, 300,296};
        int [] y11 = {428, 430, 428, 461, 460,461 };
        Dibujo.NarizOso1(Pizarra.getGraphics(), x11, y11, 6);
        
        int [] x12 = {250, 300, 350, 330, 300,270};
        int [] y12 = {400, 410, 400, 420, 430,420 };
        Dibujo.NarizOso2(Pizarra.getGraphics(), x12, y12, 6);
         
    }//GEN-LAST:event_btnDibujaOsoMouseClicked

    private void btnDibujoMariquitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDibujoMariquitaMouseClicked
        // TODO add your handling code here:
         int [] x19 = {350, 400, 450, 500, 500, 450, 360, 300, 300};
        int [] y19 = {100, 70, 100, 200, 400,460, 460, 400, 200 };
        Dibujo.NarizOso2(Pizarra.getGraphics(), x19, y19, 9);
        
         Dibujo.AlasMariquitas(Pizarra.getGraphics(), 290, 120, 120, 300);
         Dibujo.AlasMariquitas(Pizarra.getGraphics(), 400, 120, 120, 300);
         //Manchas
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 310, 140, 50, 50);
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 450, 140, 50, 50);
         
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 315, 200, 50, 50);
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 460, 200, 50, 50);
         
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 310, 300, 50, 50);
         Dibujo.OjosAbeja(Pizarra.getGraphics(), 450, 300, 50, 50);
         
       
        
    }//GEN-LAST:event_btnDibujoMariquitaMouseClicked

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
            java.util.logging.Logger.getLogger(DibujoGraficasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DibujoGraficasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DibujoGraficasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DibujoGraficasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DibujoGraficasView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pizarra;
    private javax.swing.JButton btnDibujaBruja;
    private javax.swing.JButton btnDibujaOso;
    private javax.swing.JButton btnDibujarAbeja;
    private javax.swing.JButton btnDibujoMariquita;
    // End of variables declaration//GEN-END:variables
}
