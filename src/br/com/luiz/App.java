package br.com.luiz;

@Tabela
public class App {
    public static void main(String[] args) {
        Tabela tabela = App.class.getAnnotation(Tabela.class);
        System.out.println("Nome da anotacao: " + tabela.nome());
    }
}
