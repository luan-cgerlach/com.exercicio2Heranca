package com.mycompany.veiculos;

public class Moto extends Veiculos {
    
    public double cilindradas;
    public TipoDeMotos tipoDeMoto;


    @Override
    public double calcularValorEstacionamentoPelasHorasPermanecidas() {
    double taxaPorHoraEstacionamento = 0.05;
    return taxaPorHoraEstacionamento*horasPermanecidas;
    }

    public Moto(double cilindradas, TipoDeMotos tipoDeMoto, String placa, String modelo, int ano, int horasPermanecidas) {
        super(placa, modelo, ano, horasPermanecidas);
        this.cilindradas = cilindradas;
        this.tipoDeMoto = tipoDeMoto;
    }


    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public TipoDeMotos getTipoDeMoto() {
        return tipoDeMoto;
    }

    public void setTipoDeMoto(TipoDeMotos tipoDeMoto) {
        this.tipoDeMoto = tipoDeMoto;
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
        return "Moto{" + "cilindradas=" + cilindradas + ", tipoDeMoto=" + tipoDeMoto + '}'
                + "horasPermanecidas= " +calcularValorEstacionamentoPelasHorasPermanecidas()
                +super.exibirVeiculos();
    }
    
    
}
