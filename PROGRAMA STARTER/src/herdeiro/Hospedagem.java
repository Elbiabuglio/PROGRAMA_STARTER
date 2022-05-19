package herdeiro;

public class Hospedagem {

	public void printValor() {
	}
	
		public float ValorHospedagem;
		   
		   public float getValorHospedagem(){
		   return this.ValorHospedagem;
		   }
		   public void setValorHospedagem(float valorHospedagem){
		   this.ValorHospedagem = valorHospedagem;
		   }
		   public void imprimeValor(float valor){
		   valor = this.ValorHospedagem;
		   System.out.printf("Valor do hospedagem:"+ valor);
		   }
}	

