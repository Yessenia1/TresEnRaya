/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.tresenraya;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class codigo {
    int turno;
    int px;
    int po;

    public codigo(int turno, int px, int po) {
        this.turno = turno;
        this.px = px;
        this.po = po;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public int getPx() {
        return px;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public int getPo() {
        return po;
    }

    public void setPo(int po) {
        this.po = po;
    }
    
    public void intercam(){
        if(getTurno()==0){
            setTurno(1);
        }
        else{
            setTurno(0);
        }
    }
    
    public int juego(int matriz[][]){
        if(matriz[0][0]==matriz[0][1]&&matriz[0][0]==matriz[0][2]){
        return 1;
    }
        if(matriz[1][0]==matriz[1][1]&&matriz[1][0]==matriz[1][2]){
        return 2;
    }
        if(matriz[2][0]==matriz[2][1]&&matriz[2][0]==matriz[2][2]){
        return 3;
    }
        
        if(matriz[0][0]==matriz[1][0]&&matriz[0][0]==matriz[2][0]){
        return 4;
    }
         if(matriz[0][1]==matriz[1][1]&&matriz[0][1]==matriz[2][1]){
        return 5;
    }
         if(matriz[0][2]==matriz[1][2]&&matriz[0][2]==matriz[2][2]){
        return 6;
    }
         
         if(matriz[0][0]==matriz[1][1]&&matriz[0][0]==matriz[2][2]){
        return 7;
    }
         if(matriz[2][0]==matriz[1][1]&&matriz[2][0]==matriz[0][2]){
        return 8;
    }
        return 0;
    }
    
    public int ejecutar(javax.swing.JButton bt, int i,int j, int matriz[][],javax.swing.JLabel jx, javax.swing.JLabel jo){
      matriz[i][j]=getTurno();
      String n=new String();
      if(getTurno()==0){
          n="X";
          bt.setForeground(Color.red);
      }else{
          bt.setForeground(Color.blue);
      }
      intercam();
      bt.setText(n);
      bt.setEnabled(false);
      
      if(juego(matriz)!=0){
          JOptionPane.showMessageDialog(null, "Usted Gano"+n);
          if(getTurno()==1){
              setPx(getPx()+1);
              jx.setText(String.valueOf(getPx()));
          }
          if(getTurno()==0){
              setPx(getPo()+1);
              jx.setText(String.valueOf(getPo()));
          }
          return 1;
      }
      
        return 0;
    }
    
}
    

