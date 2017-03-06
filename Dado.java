/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;



public class Dado {
    
    public int valor1;
    public int valor2;
    
    public void lanzar() {
        
        valor1=(int) (Math.random()*6+1);
        valor2=(int) (Math.random()*6+1);
        
    }
        
}
