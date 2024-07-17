package com.mycompany.desafionavidad.logica;

import java.util.Random;

public class Controladora {
    
    public String[][] generarMatriz() {
        
        Random random = new Random();
        String emojis[] = {"⭐", "🎄", "🎅", "🎁"};
        String matriz[][] = new String[4][4];
        
        
        for (int f=0; f<4; f++) {
            for (int c=0; c<4; c++) {
                
                matriz[f][c] = emojis[random.nextInt(emojis.length)];
                
            }
        }
        
        return matriz;
        
    }

    public int cantEncontrados(String emojiOri, int cantidad, String[][] matriz) {
        
        int cantEncontrados=0;
        
        for (int f=0; f<4; f++) {
            for (int c=0; c<4; c++) {
                
                if (matriz[f][c].equals(emojiOri)) {
                    cantEncontrados = cantEncontrados + 1;
                }
                
            }
        }
        
        return cantEncontrados;
        
    }
    
}
