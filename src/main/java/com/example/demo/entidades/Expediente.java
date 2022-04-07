package com.example.demo.entidades;

import java.io.File;

public class Expediente {

    private byte[] imagenes;
    private String informacionGeneral;
    private File documento;

    public Expediente() {
    }

    public Expediente(byte[] imagenes, String informacionGeneral, File documento) {
        this.imagenes = imagenes;
        this.informacionGeneral = informacionGeneral;
        this.documento = documento;
    }

    public byte[] getImagenes() {
        return imagenes;
    }

    public void setImagenes(byte[] imagenes) {
        this.imagenes = imagenes;
    }

    public String getInformacionGeneral() {
        return informacionGeneral;
    }

    public void setInformacionGeneral(String informacionGeneral) {
        this.informacionGeneral = informacionGeneral;
    }

    public File getDocumento() {
        return documento;
    }

    public void setDocumento(File documento) {
        this.documento = documento;
    }

    
}
