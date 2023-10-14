package com.company.intecap.Automovil.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Automovil implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Marca;
    private String Modelo;
    private String Color;
    private String Placa;
    private int Precio;

    public Automovil(){

    }

    public Automovil(Integer id, String marca,String modelo, String color, String placa, int precio){
        this.id = id;
        this.Marca = marca;
        this.Modelo = modelo;
        this.Color = color;
        this.Placa = placa;
        this.Precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }
}
