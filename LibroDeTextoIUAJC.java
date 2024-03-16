class LibroDeTextoIUAJC extends LibroDeTexto {
    private String facultad;

    public LibroDeTextoIUAJC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad: " + facultad);
    }
}