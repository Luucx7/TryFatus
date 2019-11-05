/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Date;

/**
 *
 * @author USER
 */
public class Venda implements Comparable<Venda>{
    
    int idVenda;
    String Clientes_CPF;
    String Produto;
    double valorTotal;
    double valorPago;
    int quantiaParcelas;
    String metodoPagamento;
    Date dataCompra;
    Date dataVencimento;
    int ativa;
    
    public int getID() {
        return idVenda;
    }
    public void setID(int ID) {
        this.idVenda = ID;
    }
    
    public String getCliente() {
        return Clientes_CPF;
    }
    public void setCliente(String cliente) {
        this.Clientes_CPF = cliente;
    }
    
    public String getProduto(){
        return Produto;
    }
    public void setProduto(String produto) {
        this.Produto = produto;
    }
    
    public double getValor() {
        return valorTotal;
    }
    public void setValor(double valor) {
        this.valorTotal=valor;
    }
    
    public double getPago() {
        return valorPago;
    }
    public void setPago(double pago) {
        this.valorPago=pago;
    }
    
    public int getParcelas() {
        return quantiaParcelas;
    }
    public void setParcelas(int parcelas) {
        this.quantiaParcelas=parcelas;
    }
    
    public String getMetodo() {
        return metodoPagamento;
    }
    public void setMetodo(String metodo) {
        this.metodoPagamento=metodo;
    }
    
    public Date getData() {
        return dataCompra;
    }
    public void setData(Date data) {
        this.dataCompra=data;
    }
    
    public Date getVencimento() {
        return dataVencimento;
    }
    public void setVencimento(Date vencimento) {
        this.dataVencimento=vencimento;
    }
    
    public int getAtivo() {
        return ativa;
    }
    public void setAtiva(int ativa) {
        this.ativa=ativa;
    }
    
    //
    @Override
    public int compareTo(Venda v) {
        if (getVencimento()== null || v.getVencimento()== null) {
            return 0;
        }
        return getVencimento().compareTo(v.getVencimento());
    }
}

