package com.estoque.validacoes;

public class Validacoes {

    private Validacoes(){

    }
    
    public static Boolean marcaValida(String marca){
        return !(marca == null || marca.trim().isEmpty() || marca.matches(".*\\d+.*"));
    }

    // Manda erro dependendo de qual caso for
    public static String mensagemErroMarca(String marca){
        if (marca == null || marca.trim().isEmpty()){
            return "Erro: A marca não pode ser clandestina!";
        } else if (marca.matches(".*\\d+.*")){
            return "Erro: Nunca vi marca com número..";
        }
        return "";
    }


    // Checa se o estoque tá num número bão
    public static Boolean estoqueValido(int estoque){
        return estoque >= 0 && estoque <= 1000;
    }


    // Dá um erro dependendo se o estoque for negativo ou muito alto
    public static String mensagemErroEstoque(int estoque){
        if (estoque < 0){
            return "Erro: Não tem estoque negativo.";
        } else if (estoque > 1000){
            return "Erro: Estoque muito alto";
        }
        return "";
    }


}
