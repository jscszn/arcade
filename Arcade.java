/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arcade;

import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.ImageIcon;
import javax.swing.UIManager;

/**
 *
 * @author j19se
 */
public class Arcade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
        
        UIManager.put("OptionPane.okButtonText", "Continuar");
        
        // Imagenes contexto
        
        ImageIcon seleccion = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//0.png//"); // Imagen de selección
        
        ImageIcon imagen_1 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//1.png"); // Primera imagen contexto 
        
        ImageIcon imagen_2 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//2.png"); // Segunda imagen contexto 
        
        ImageIcon imagen_3 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//3.png"); // Tercera imagen contexto 
       

        JOptionPane.showMessageDialog(null, seleccion, "ECO-ARCADE", JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, imagen_1, "ECO-ARCADE", JOptionPane.PLAIN_MESSAGE);
        
        JOptionPane.showMessageDialog(null, imagen_2, "ECO-ARCADE", JOptionPane.PLAIN_MESSAGE);
        
        // Imagenes juegos
        
        ImageIcon imagen_4 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//4.png"); // Imagen principal "Eco-Rescate"
        
        ImageIcon imagen_5 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//5.png"); // Victoria "Eco-Rescate"
        
        ImageIcon imagen_6 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//6.png"); // Derrota "Eco-Rescate"
        
        ImageIcon imagen_7 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//7.png"); // Imagen principal "Mareas del destino"
        
        ImageIcon imagen_8 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//8.png"); // Victoria "Mareas del destino"
        
        ImageIcon imagen_9 = new ImageIcon("C://Users//j19se//OneDrive//Documents//Code//Proyectos - NetBeans//arcade//ilustraciones//9.png"); // Derrota "Mareas del destino"
        
        int select_arcade = Integer.parseInt(JOptionPane.showInputDialog(null, imagen_3,
                "ECO-ARCADE", JOptionPane.INFORMATION_MESSAGE));
        
        try {
        
 if (select_arcade == 1) {
            
            JOptionPane.showMessageDialog(null, 
    imagen_4,
    "¡ECORESCATE!", JOptionPane.INFORMATION_MESSAGE);

            
            
            int arbol = 0, arboles_restantes = 100, rondas = 1;
            double temperatura = 0;
            boolean a;
            
            while ((temperatura < 2.0) && (arbol < 100)) {
                
            int accion = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Qué deseas hacer? \n" +
                    "1. Plantar 10 arboles \n" +
                    "2. Reducir emisiones (mantener temperatura) \n" +
                    "3. Saltar",
                    "RONDA " +
                    rondas, JOptionPane.QUESTION_MESSAGE));
            
                    rondas += 1;
                    
                switch (accion) {
                    case 1:
                        
                        arbol += 10;
                        arboles_restantes -= 10;
                        JOptionPane.showMessageDialog(null, 
    "¡Excelente! Has plantado 10 árboles. Hacen falta " +arboles_restantes+ " árboles.",
    "PROGRESO", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                        
                    case 2:
                        
                        
                        temperatura += 0;
                        
                        JOptionPane.showMessageDialog(null, 
    "¡Muy bien! La temperatura global se mantiene en " + String.format("%.2f", temperatura) + " °C.",
    "PROGRESO", JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                        
                    case 3:
                        
                  double aumento = 0.2 + (0.3 *Math.random());
                  temperatura += aumento;
                  
                  JOptionPane.showMessageDialog(null,
                          "¡Atención! No has hecho nada en este turno. ¡Muy mal!\n" +
                          "La temperatura ha aumentado en " + String.format("%.2f", aumento) + "°C\n" +
                          "Temperatura actual: " + String.format("%.2f", temperatura) + "°C\n",
                  "ALERTA CLIMÁTICA", JOptionPane.WARNING_MESSAGE);
                  
                  
                        
                        break;
                        
                        
                    default:
                        throw new AssertionError();
                }
        
            
                
            } if(temperatura > 2.0) {
                
             JOptionPane.showMessageDialog(null, imagen_6, "DERROTA", JOptionPane.PLAIN_MESSAGE);
                           
            } else {
                
                    JOptionPane.showMessageDialog(null, imagen_5, "VICTORIA", JOptionPane.PLAIN_MESSAGE);
                
            }
            
        
        
        
    } else if (select_arcade == 2) {
        
        JOptionPane.showMessageDialog(null, 
                imagen_7,
    "¡MAREAS DEL DESTINO!", JOptionPane.INFORMATION_MESSAGE);
        
        int presupuesto = 100,avance_mar = 0, resistencia = 0, accion_1;
        
     for (int annos = 1; annos <= 10; annos++) {
         
                  int nivel_mar = (int) ((Math.random() *3) +1);
                  avance_mar += nivel_mar;

         
         do {
             
         accion_1 = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Actualmente, el nivel del mar está en " +avance_mar+ " metro(s) \n" +
                "Tu presupuesto es de " +presupuesto+ " tokens \n" +
                "Tu resistencia es de " +resistencia+ " puntos \n" +        
                "¿Qué resistencia deseas adquirir? \n" +
                    "1. Manglares +2 resistencia (10 tokens) \n" +
                    "2. Drenaje pluvial +5 resistencia (20 tokens) \n" +
                    "3. Diques +8 resistencia (35 tokens)",
                    "AÑO " +
                    annos, JOptionPane.QUESTION_MESSAGE));    
             
         } while ((accion_1 != 1) && (accion_1 != 2) && (accion_1 != 3));
         
         switch (accion_1) {
             case 1:
                 
                 if (presupuesto >= 10) {
                     
                 
                 resistencia += 2;
                 presupuesto -= 10;
                 
                 JOptionPane.showMessageDialog(null,
    "🌿 ¡Excelente! Has comprado un manglar.\n",
    "PROGRESO", JOptionPane.INFORMATION_MESSAGE);
    
                 } else {
                     
                                       JOptionPane.showMessageDialog(null,
                          "¡No! No tienes presupuesto para esta opción...\n",
                  "PRESUPUESTO", JOptionPane.WARNING_MESSAGE);
                     
                 }
               
                 break;
                 
             case 2:
                 
                 if (presupuesto >= 20) {
                     
                 
                 resistencia += 5;
                 presupuesto -= 20;
                 
                 JOptionPane.showMessageDialog(null,
    "💧 ¡Excelente! Has comprado un drenaje pluvial.\n",
    "PROGRESO", JOptionPane.INFORMATION_MESSAGE);
    
                 } else {
                     
                                       JOptionPane.showMessageDialog(null,
                          "¡No! No tienes presupuesto para esta opción...\n",
                  "PRESUPUESTO", JOptionPane.WARNING_MESSAGE);
                     
                 }
                 
                 break;
                 
             case 3:
                 
                 if (presupuesto >= 35) {
                     
                 
                 resistencia += 8;
                 presupuesto -= 35;
                 
                 JOptionPane.showMessageDialog(null,
    "🚧 ¡Excelente! Has comprado un dique.\n",
    "PROGRESO", JOptionPane.INFORMATION_MESSAGE);
    
                 } else {
                     
                                       JOptionPane.showMessageDialog(null,
                          "¡No! No tienes presupuesto para esta opción...\n",
                  "PRESUPUESTO", JOptionPane.WARNING_MESSAGE);
                     
                 }
                 
                 break;
                 
                 
             default:
            throw new AssertionError();
         }
         
     }
     
     if (resistencia > avance_mar) {
         
         JOptionPane.showMessageDialog(null, imagen_8, "VICTORIA", JOptionPane.PLAIN_MESSAGE);;
         
     } else {
         
                     JOptionPane.showMessageDialog(null, imagen_9, "DERROTA", JOptionPane.PLAIN_MESSAGE);
         
     }
        
        
        
        
    }
    } catch (Exception e) {
        
            System.out.println("Error inesperado. Intente nuevamente.");
            
    }
        
    }
    
    
}