package br.edu.ifrn.pds.projeto.ui;

import br.edu.ifrn.pds.Filme;
import java.util.List;

public class Aplicacao {
    
    public static void main(String[] args) {
        
        //Filme filme = new Filme(1, "Barbie", 114, 2023, 7.1);
        Filme filme = new Filme();
        filme.setId(1);
        filme.setTitulo("Barbie");
        filme.setDuracao(114);
        filme.setAno(2023);
        filme.setAvaliacao(7.1);
        inserirFilme(filme);
        
        // Filme filme2 = new Filme(2, "Oppenheimer", 180, 2023, 8);
        Filme filme2 = new Filme();
        filme2.setId(2);
        filme2.setTitulo("Oppenheimer");
        filme2.setDuracao(180);
        filme2.setAno(2023);
        filme2.setAvaliacao(8);
        inserirFilme(filme);
        
        List<Filme> filmes = buscarTodos();

        for (Filme filme1 : filmes) {
            System.out.println("Título: " + filme1.getTitulo());
        }
        
    }

    private static boolean inserirFilme(br.edu.ifrn.pds.Filme filme) {
        br.edu.ifrn.pds.FilmeWS_Service service = new br.edu.ifrn.pds.FilmeWS_Service();
        br.edu.ifrn.pds.FilmeWS port = service.getFilmeWSPort();
        return port.inserirFilme(filme);
    }

    private static java.util.List<br.edu.ifrn.pds.Filme> buscarTodos() {
        br.edu.ifrn.pds.FilmeWS_Service service = new br.edu.ifrn.pds.FilmeWS_Service();
        br.edu.ifrn.pds.FilmeWS port = service.getFilmeWSPort();
        return port.buscarTodos();
    }
    
}
