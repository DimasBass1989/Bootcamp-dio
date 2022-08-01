package dominio;

public class Curso {
	
	private String titulo;
	private String descricao;
	private Integer cargahoraria;
	
	
	public Curso() {
		
	}
	
	
	public Curso(String titulo, String descricao, Integer cargahoraria) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.cargahoraria = cargahoraria;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", descricao=" + descricao + ", cargahoraria=" + cargahoraria + "]";
	}

	
}