package br.com.luiz;

/*
 * @Author Luiz Henrique A Cardoso
 */

@Tabela
public class App {
    public static void main(String[] args) {
        Tabela tabela = App.class.getAnnotation(Tabela.class);
        System.out.println("Nome da anotacao: " + tabela.nome());
    }
}
