public class Libro {
	private String codigolibro;
	private String titulo;
	private boolean original,prestable;
	public Libro(String codigoLibro, String titulo2, boolean original2, boolean prestable2) {
		this.codigolibro=codigoLibro;
		this.titulo=titulo2;
		this.original=original2;
		this.prestable=prestable2;
	}
	String GetCodigoLibro() {
	    return codigolibro;
	}
	String GetTitulo() {
		return titulo;
	}
	boolean GetOriginal() {
		return original;
	}
	boolean GetPrestable() {
		return prestable;
	}	
}