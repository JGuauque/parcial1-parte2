class LibroDeTextoUNIAJC extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoUNIAJC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }
}