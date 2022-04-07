package com.example.demo.entidades;

public class Habitante extends Persona {

    private Tutor tutor;
    private Expediente expediente;

    public Habitante() {
    }

    public Habitante(Tutor tutor, Expediente expediente) {
        this.tutor = tutor;
        this.expediente = expediente;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public byte[] getDatoBiometrico() {
        return datoBiometrico;
    }

    public void setDatoBiometrico(byte[] datoBiometrico) {
        this.datoBiometrico = datoBiometrico;
    }



    
}
