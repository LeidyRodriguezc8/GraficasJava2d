/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graficasbasicas;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Dibujo {   
        public static void DibujarBruja1(Graphics g, int x1, int y1, int x2, int y2)
                {
                   
                  
                   g.drawLine(x1, y1, x2, y2);    
                  
                }
        
        public static void AlasAbeja(Graphics g, int x16, int y16, int alto, int ancho )
                {
                g.setColor(Color.LIGHT_GRAY);
                g.fillOval(x16, y16, alto, ancho);

                }
        public static void BocaAbeja(Graphics g, int y, int x , int u , int o , int l, int w)
         {
             g.drawArc(y, x, u, o, l, w);
         }      
        
        public static void CuerpoAbeja1(Graphics g, int x, int y, int ancho, int alto)
                {
                g.setColor(Color.BLACK);
                g.fillOval(x, y, ancho, alto);
                }
         public static void CuerpoAbeja2(Graphics g, int x, int y, int alto , int ancho )
                {
                g.setColor(Color.YELLOW);
                g.fillOval(x, y, alto, ancho);
                g.setColor(Color.BLACK);
                g.drawOval(x, y, alto, ancho);
                }
        public static void OjosAbeja(Graphics g, int x, int y, int alto , int ancho )
                {
                g.setColor(Color.WHITE);
                g.fillOval(x, y, alto, ancho);
                g.setColor(Color.BLACK);
                g.drawOval(x, y, alto, ancho);
                }
        
          public static void LapizBorrador(Graphics g, int x, int y, int alto , int ancho )
                {
                g.setColor(Color.MAGENTA);
                g.fillOval(x, y, alto, ancho);
                g.setColor(Color.BLACK);
                g.drawOval(x, y, alto, ancho);
                }
           public static void Lapiz1(Graphics g, int x, int y, int alto , int ancho )
                {
                g.setColor(Color.GRAY);
                g.fillOval(x, y, alto, ancho);
                g.setColor(Color.BLACK);
                g.drawOval(x, y, alto, ancho);
                }
            public static void Lapiz2(Graphics g, int [] x13, int [] y13, int o13)
                {
                g.setColor(Color.YELLOW);
                g.fillPolygon(x13, y13, o13);
                g.setColor(Color.BLACK);
                g.drawPolygon(x13, y13, o13);
                }
             public static void Lapiz3(Graphics g, int [] x14, int [] y14, int o14)
                {
                g.setColor(Color.PINK);
                g.fillPolygon(x14, y14, o14);
                g.setColor(Color.BLACK);
                g.drawPolygon(x14, y14, o14);
                }
              public static void Lapiz4(Graphics g, int [] x15, int [] y15, int o15)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x15, y15, o15);
                g.setColor(Color.BLACK);
                g.drawPolygon(x15, y15, o15);
                }
              
               public static void Alas1(Graphics g, int [] x18, int [] y18, int o18)
                {
                g.setColor(Color.LIGHT_GRAY);
                g.fillPolygon(x18, y18, o18);
                
                }
               public static void Alas2(Graphics g, int [] x19, int [] y19, int o19)
                {
                g.setColor(Color.LIGHT_GRAY);
                g.fillPolygon(x19, y19, o19);
                
                }
      //Oso Panda
        public static void Orejaizquierda(Graphics g, int [] x, int [] y, int o)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x, y, o);
                
                }
         public static void CaraOso(Graphics g, int [] x1, int [] y1, int o1)
                {
                g.setColor(Color.white);
                g.fillPolygon(x1, y1, o1);
                g.setColor(Color.BLACK);
                g.drawPolygon(x1, y1, o1);
                }
        
        public static void Orejaderecha(Graphics g, int [] x2, int [] y2, int o2)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x2, y2, o2);
                }
        
         public static void PerfilIzquierdo(Graphics g, int [] x3, int [] y3, int o3)
                {
                g.setColor(Color.BLACK);
                g.drawPolygon(x3, y3, o3);
                }
          public static void PerfilDerecho(Graphics g, int [] x4, int [] y4, int o4)
                {
                g.setColor(Color.BLACK);
                g.drawPolygon(x4, y4, o4);
                }
          public static void OjoIzquierdo(Graphics g, int [] x5, int [] y5, int o5)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x5, y5, o5);
                }
           public static void OjoDerecho(Graphics g, int [] x6, int [] y6, int o6)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x6, y6, o6);
                }
       public static void MejillaIzquierda(Graphics g, int [] x7, int [] y7, int o7)
                {
                g.setColor(Color.BLACK);
                g.drawPolygon(x7, y7, o7);
                }
        public static void MejillaDerecha(Graphics g, int [] x8, int [] y8, int o8)
                {
                g.setColor(Color.BLACK);
                g.drawPolygon(x8, y8, o8);
                }
        
        public static void Barbilla(Graphics g, int [] x9, int [] y9, int o9)
                {
                g.setColor(Color.white);
                g.fillPolygon(x9, y9, o9);
                g.setColor(Color.BLACK);
                g.drawPolygon(x9, y9, o9);
                }
        public static void BocaOso(Graphics g, int [] x10, int [] y10, int o10)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x10, y10, o10);
                }
        public static void NarizOso1(Graphics g, int [] x11, int [] y11, int o11)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x11, y11, o11);
                }
        public static void NarizOso2(Graphics g, int [] x12, int [] y12, int o12)
                {
                g.setColor(Color.BLACK);
                g.fillPolygon(x12, y12, o12);
                }
        
           public static void Mariquita(Graphics g, int [] x19, int [] y19, int o19)
                {
                
                g.setColor(Color.BLACK);
                g.drawPolygon(x19, y19, o19);
                }
          public static void AlasMariquitas(Graphics g, int x20, int y20, int alto , int ancho)
                 {
                g.setColor(Color.RED);
                g.fillOval(x20, y20, alto, ancho);
                g.setColor(Color.BLACK);
                g.drawOval(x20, y20, alto, ancho);
                }
          
          
}

 
     

