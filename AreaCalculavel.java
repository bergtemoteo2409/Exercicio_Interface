
public Interface AreaCalculavel {
	double calculaArea( );
	}
	public class Quadrado implements AreaCalculavel {
		private int lado;
	public Quadrado (int lado) {
		this.lado = lado;
	}

	public double calculaArea( ) {
		return this.lado * this.lado;
}
}
	public class Retangulo implements AreaCalculavel {

	private int largura;
	private int altura;

	public Retangulo(int largura, int altura) {
	this.largura = largura;
	this.altura;

}
		public doublecalculaArea( ) {
			return
				this.largura * this.altura;

		
		
		}
	}