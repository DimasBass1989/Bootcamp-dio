package dominio;

public class Curso extends Conteudo {
	
	private Integer cargahoraria ;

	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO * cargahoraria;
	}
	
	
	public Curso() {
		
	}
	
	
	
	
	public Curso( Integer cargahoraria) {
		
		this.cargahoraria = cargahoraria;
	}
	
	public Integer getCargahoraria() {
		return cargahoraria;
	}
	public void setCargahoraria(Integer cargahoraria) {
		this.cargahoraria = cargahoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargahoraria=" + cargahoraria + "]";
	}



	
}
