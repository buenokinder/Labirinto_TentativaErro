public class Posicao {
	
	public int coluna;
	public int linha;
	
	
	
	public Posicao(int linha, int coluna){
		this.linha = linha;
		this.coluna = coluna;
	}
	
	
	public boolean IsValid(){
		if(this.coluna < 0 || this.linha < 0)
			return false;
		
		return true;
	}
	
	public boolean IsInsideArray(int linhas, int colunas){
		if(this.linha > linhas || this.coluna > colunas )
			return false;
		
		return true;
	}
	
	public Posicao Mover(Movimento movimento){
		switch (movimento){
		case Baixo:
			return new Posicao(this.linha+1, this.coluna);
		case Cima:
			return new Posicao(this.linha-1, this.coluna);	
		case Direta:
			return new Posicao(this.linha, this.coluna+1);
		}
		
		return new Posicao(this.linha-1, this.coluna);
		
	}
	
	public boolean Equals(Posicao value){
		if(this.coluna == value.coluna && this.linha == value.linha)
			return true;
		
		return false;
		
	}
}