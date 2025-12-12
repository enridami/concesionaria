package com.edsuica.concesionaria.persistencia;

import com.edsuica.concesionaria.logica.Automovil;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }
}
