package PlanoEnsino;

public class PlanoDeEnsino {
	
		String materia;
		String conteudo_programatico;
		String criterio_avaliacao;
		String bibliografia;
	
		PlanoDeEnsino(){} //versão padrão do método construtor
		
		
		//abaixo, mét.Constr. inicializados com valores
		PlanoDeEnsino(String materia, String conteudo_programatico, String criterio_avaliacao, String bibliografia){
			this.materia = materia;
			this.conteudo_programatico = conteudo_programatico;
			this.criterio_avaliacao = criterio_avaliacao;
			this.bibliografia = bibliografia;
		}
		
		public void setMateria (String materia) {
			this.materia = materia;		}
		
		public void setConteudo_programatico (String conteudo_programatico) {
			this.conteudo_programatico = conteudo_programatico;		}
		
		public void setCriterio_avaliacao (String criterio_avaliacao) {
			this.criterio_avaliacao = criterio_avaliacao;		}

		public void setBibliografia (String bibliografia) {
			this.bibliografia = bibliografia;		}
		
		public String getMateria () {
			return materia; }
		
		public String getConteudo_programatico () {
			return conteudo_programatico; }
		
		public String getCriterio_avaliacao () {
			return criterio_avaliacao; }
		
		public String getBibliografia () {
			return bibliografia; }
}
