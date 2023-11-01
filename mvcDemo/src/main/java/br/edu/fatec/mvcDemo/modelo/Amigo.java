package br.edu.fatec.mvcDemo.modelo;

public class Amigo {
        private String nome;
        private String apelido;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getApelido() {
            return apelido;
        }

        public void setApelido(String apelido) {
            this.apelido = apelido;
        }

        public Amigo(String nome, String apelido) {
            this.nome = nome;
            this.apelido = apelido;
        }
}

