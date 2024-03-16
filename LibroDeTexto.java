class LibroDeTexto extends libro {
    private String curso;

    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor);
        this.curso = curso;
    }

   
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso asociado: " + curso);
    }
}