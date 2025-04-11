package evf.javadoc.original;
//comentario de Jose Miguel Lebrero Nuñez
public class Artista {
    String nombreArtista;
    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }
//NUEVO COMENTRIO para apartado K
    public String getNombreArtista() {
        return nombreArtista;
	//Prueba fetch
	//Prueba fetch 2
    }
    
}


