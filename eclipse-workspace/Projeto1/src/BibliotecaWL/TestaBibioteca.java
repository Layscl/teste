package BibliotecaWL;

public class TestaBibioteca {

	public static void main(String[] args) {
	
     Livro livro1 = new Livro();
     Autor autor1 = new Autor();
     autor1.setNome("Carla Júlia");
	 livro1.setTitulo( "A casa");
	 livro1.setId(1);
	 livro1.setAutor(autor1);
	 livro1.setEstoque(10);
	 livro1.setSinopse("jddjd");
 
	 System.out.println("titulo "  + livro1.getTitulo());
	 System.out.println("Id " + livro1.getId()); 
	 System.out.println("Autor " + livro1.getAutor());
	 System.out.println("Estoque " + livro1.getEstoque());
	 System.out.println("Sinopse " + livro1.getSinopse());

	}

}
