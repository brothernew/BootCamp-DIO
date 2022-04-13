package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteudo> conteuodoInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteuodoConcluido = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteuodoInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscrito().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteuodoInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteuodoConcluido.add(conteudo.get());
            this.conteuodoInscrito.remove(conteudo.get());
        }else{
            System.err.println("Você não está inscrito em um BootCamp");
        }
    }

    public double calcularTotalXp(){
        return this.conteuodoConcluido
                .stream()
                .mapToDouble(Conteudo::calculaXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteuodoInscrito() {
        return conteuodoInscrito;
    }

    public void setConteuodoInscrito(Set<Conteudo> conteuodoInscrito) {
        this.conteuodoInscrito = conteuodoInscrito;
    }

    public Set<Conteudo> getConteuodoConcluido() {
        return conteuodoConcluido;
    }

    public void setConteuodoConcluido(Set<Conteudo> conteuodoConcluido) {
        this.conteuodoConcluido = conteuodoConcluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteuodoInscrito, dev.conteuodoInscrito) && Objects.equals(conteuodoConcluido, dev.conteuodoConcluido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteuodoInscrito, conteuodoConcluido);
    }
}
