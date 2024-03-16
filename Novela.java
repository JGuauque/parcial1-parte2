class Novela extends libro {
    private String tipo;

    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor);
        this.tipo = tipo;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tipo de novela: " + tipo);
    }
}