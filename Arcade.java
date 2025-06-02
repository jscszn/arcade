/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arcade;

import java.util.Scanner;
import javax.swing.JOptionPane;

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
        
        int select_arcade = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido al eco-arcade. ¿Qué juego deseas jugar?\n" +
                "1. Eco-rescate: Reforesta antes del colapso\n" +
                "2. Mareas del destino: Defensa costera",
                "ECO-ARCADE", JOptionPane.INFORMATION_MESSAGE));
        
 if (select_arcade == 1) {
            
            JOptionPane.showMessageDialog(null, 
    "Hola, activista. El medio-ambiente está en crisis. La naturaleza se rebeló.\n" +
    "Planta 100 árboles antes de que la temperatura global llegue a 2.0 °C.\n" +
    "Tu misión empieza ahora.",
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
                
             JOptionPane.showMessageDialog(null,
                     "💀 Game over. La temperatura global ha superado los 2.0 °C \n" +
                     "El colapso climático es irreversible. El planeta sufre las consecuencias",
                     "CRISIS CLIMÁTICA", JOptionPane.ERROR_MESSAGE);
                           
            } else {
                
                    JOptionPane.showMessageDialog(null,
    "🌿 ¡Victoria! Has plantado 100 árboles antes del colapso.\n" +
    "La temperatura se estabiliza y el planeta respira nuevamente.\n" +
    "¡Gracias por ser un héroe climático!",
    "MISIÓN CUMPLIDA", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        
        
        
    } else if (select_arcade == 2) {
        
        JOptionPane.showMessageDialog(null, 
    "Hola, activista. El cambio climático está afectando la ciudad.\n" +
    "El nivel del mar está aumentando dramáticamente.\n" +
    "Tienes diez años para salvar la ciudad de un desastre.\n" +
    "Comienza ahora.",
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
         
         JOptionPane.showMessageDialog(null,
    "🌊 ¡Victoria! Has resistido el aumento del nivel del mar.\n" +
    "Salvaste a la ciudad de hundirse para siempre.\n" +
    "¡Gracias por ser un héroe climático!",
    "MISIÓN CUMPLIDA", JOptionPane.INFORMATION_MESSAGE);
         
     } else {
         
                      JOptionPane.showMessageDialog(null,
                     "💀 Game over. El nivel del mar superó las resistencias... \n" +
                     "La inundación es inevitable. Todos mueren ahogados.",
                     "CRISIS CLIMÁTICA", JOptionPane.ERROR_MESSAGE);
         
     }
        
        
        
        
    }
    }
        
    }
