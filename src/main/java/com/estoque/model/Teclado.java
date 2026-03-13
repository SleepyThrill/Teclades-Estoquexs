package com.estoque.model;

public class Teclado {

    // Atributos //



    private String marca;

    private String modelo;

    private int estoque;



    // Construtores //



    // Construtor padrão
    public Teclado() {
    }


    // Construtor com parâmetros
    public Teclado(String marca, String modelo, int estoque) {
        this.marca = marca;
        this.modelo = modelo;
        this.estoque = estoque;
    }
    


    // Métodos //


    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getEstoque() {
        return estoque;
    }

    
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }


    // Adder. (só adiciona uma qtd no estoque q já existe sem ter q somar 4+10)
                              // (Economiza muito tempo pra certas pessoas :D )

    public void addEstoque(int qtd) {
        this.estoque += qtd;
    }


    @Override
    public String toString() {
        return "\nTeclado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}