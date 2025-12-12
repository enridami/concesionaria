package com.edsuica.concesionaria.logica;


public class Automovil {
    
    private String modelo;
    private String marca;
    private String motor;
    private String patente;
    private int canPuertas;

    public Automovil() {
    }

    public Automovil(String modelo, String marca, String motor, String patente, int canPuertas) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
        this.patente = patente;
        this.canPuertas = canPuertas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCanPuertas() {
        return canPuertas;
    }

    public void setCanPuertas(int canPuertas) {
        this.canPuertas = canPuertas;
    }
    
    
    
}
