package classesdedominio;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Material {
	private String url; //link para encontrar o material.
	private ArrayList<Topico> topicos; //topicos que o material aborda.
	private Arquivo arquivo; //Representação do arquivo do material.
	private Tipo tipo; //tipo do arquivo.
	private Origem origem;
}
