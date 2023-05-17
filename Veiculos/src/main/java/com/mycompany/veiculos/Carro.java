package com.mycompany.veiculos;

public class Carro extends Veiculos {
    
    private TipoDeCarros tipoDeCarro;
    private int quantidadeDePassageiros;

    @Override
    public double calcularValorEstacionamentoPelasHorasPermanecidas() {
        double taxaPorHoraEstacionamento = 0.10;
        return taxaPorHoraEstacionamento*horasPermanecidas;
    }

    public Carro(TipoDeCarros tipoDeCarro, int quantidadeDePassageiros, String placa, String modelo, int ano, int horasPermanecidas) {
        super(placa, modelo, ano, horasPermanecidas);
        this.tipoDeCarro = tipoDeCarro;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }
    
    public TipoDeCarros getTipoDeCarro() {
        return tipoDeCarro;
    }

    public void setTipoDeCarro(TipoDeCarros tipoDeCarro) {
        this.tipoDeCarro = tipoDeCarro;
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

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }

    public void setQuantidadeDePassageiros(int quantidadeDePassageiros) {
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public int getHorasPermanecidas() {
        return horasPermanecidas;
    }

    public void setHorasPermanecidas(int horasPermanecidas) {
        this.horasPermanecidas = horasPermanecidas;
    }

    public String exibirVeiculos() {
        return "Carro{" + "tipoDeCarro=" + tipoDeCarro + ", quantidadeDePassageiros=" + quantidadeDePassageiros + '}'+ "horasPermanecidas= " +calcularValorEstacionamentoPelasHorasPermanecidas() + super.exibirVeiculos();
    }
    
    
    
}
