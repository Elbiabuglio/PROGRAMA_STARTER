package herdeiro;

public class HospedagemVIP extends Hospedagem {
	public float ValorAdicional;

	public float getValorAdicional(){
	    return this.ValorAdicional;
	    }
	    public void setValorAdicional(float valorAdicional){
	        this.ValorAdicional = valorAdicional;
	    }
	    public float valorHospeagemVip(float valorhospedagem){
	         this.ValorHospedagem = valorhospedagem;
	        return this.ValorHospedagem + (this.ValorAdicional* this.ValorHospedagem);       
	    }
	}
