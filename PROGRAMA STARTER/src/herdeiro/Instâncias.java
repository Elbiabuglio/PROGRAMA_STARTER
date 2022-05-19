package herdeiro;

public class Instâncias {

	public class Istancia extends HospedagemVIP{
	    float TaxaAdicional;
	   
	    public void setTaxaAdicional(float valor){
	        this.TaxaAdicional = valor;
	    }
	    public float getTaxaAdicional(){
	        return this.TaxaAdicional;
	    }  
	    public float valorHospedagemAdd(float valor){
	        valor= this.ValorAdicional;
	        float valorAdd =(this.TaxaAdicional*this.ValorHospedagem)*2+this.ValorHospedagem;
	    return valorAdd;
	    }
	}   
