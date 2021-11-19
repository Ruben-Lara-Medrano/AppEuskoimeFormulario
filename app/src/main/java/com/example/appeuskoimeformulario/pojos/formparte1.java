package com.example.appeuskoimeformulario.pojos;

public class formparte1 {

    private String Cliente;
    private String Obra;
    private String Domicilio;
    private String Poblaion;
    private String Descripcion;

    public formparte1(String Cliente, String Obra, String Domicilio, String Poblacion, String Descripcion){
        this.Cliente = Cliente;
        this.Obra = Obra;
        this.Domicilio = Domicilio;
        this.Poblaion = Poblacion;
        this.Descripcion= Descripcion;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getObra() {
        return Obra;
    }

    public void setObra(String obra) {
        Obra = obra;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getPoblaion() {
        return Poblaion;
    }

    public void setPoblaion(String poblaion) {
        Poblaion = poblaion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
