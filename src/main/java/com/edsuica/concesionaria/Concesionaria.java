package com.edsuica.concesionaria;

import com.edsuica.concesionaria.igu.Principal;


public class Concesionaria {

    public static void main(String[] args) {
        
        Principal princ = new Principal();
        
        // LLamamos y hacemos visible a nuestra IGU
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
}
