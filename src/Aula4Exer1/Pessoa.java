public class Pessoa {
    private String nome,endereco,telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndreco() {
        return endereco;
    }

    public void setEndreco(String endreco) {
        this.endereco = endreco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public Pessoa() {
        nome = "";
        endereco = "";
        telefone = "";
    }
    public Pessoa(String n){
        nome = n;
        endereco = "";
        telefone = "";
    }

    public Pessoa(String nome, String endreco, String telefone) {
        this.nome = nome;
        this.endereco = endreco;
        this.telefone = telefone;
    }


}
