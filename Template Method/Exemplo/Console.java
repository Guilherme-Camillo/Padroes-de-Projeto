
public abstract class Console {

	abstract void inicializar();
	abstract void iniciarJogo();
	abstract void finalizar();
	
		//Template Method
	public void play() {
		
		inicializar(); //Abre o jogo
		iniciarJogo(); //Inicia a partida
		finalizar();   //Finaliza o jogo
	}
}

