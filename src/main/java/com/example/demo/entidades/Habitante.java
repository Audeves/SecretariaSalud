package com.example.demo.entidades;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "habitantes")
public class Habitante extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int idhabitante;

    @Column(nullable = false)
    private Tutor tutor;

    @Column(nullable = false)
    private Expediente expediente;

    public Habitante() {
    }

    public Habitante(int idhabitante, Tutor tutor, Expediente expediente) {
        this.tutor = tutor;
        this.expediente = expediente;
        this.idhabitante = idhabitante;
    }

    public int getId(){
        return idhabitante;
    }

    public void setId(int idhabitante){
        this.idhabitante = idhabitante;
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
