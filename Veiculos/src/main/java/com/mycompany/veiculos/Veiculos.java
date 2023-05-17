package com.mycompany.veiculos;

public abstract class Veiculos {

    public String placa;
    public String modelo;
    public int ano;
    public int horasPermanecidas;

    
    public abstract double calcularValorEstacionamentoPelasHorasPermanecidas();

    public Veiculos(String placa, String modelo, int ano, int horasPermanecidas) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.horasPermanecidas = horasPermanecidas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHorasPermanecidas() {
        return horasPermanecidas;
    }

    public void setHorasPermanecidas(int horasPermanecidas) {
        this.horasPermanecidas = horasPermanecidas;
    } 
    
    public String exibirVeiculos() {
        return "Veiculos{" + "placa=" + placa + ", modelo=" + modelo + ", ano=" + ano + ", horasPermanecidas=" +horasPermanecidas+ '}'+ " estacionamento= R$" +calcularValorEstacionamentoPelasHorasPermanecidas();
    }
    
    
    
}
