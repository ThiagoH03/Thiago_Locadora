public class Filme{
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;

    // Atribuir valores
    public void setCodigo(int codigo){
        this.codigo = codigo;        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    // Acessar valores
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }
    public boolean isDisponivel(){
        return disponivel;
    }


    public void mostrar(){
        System.out.println("Código:" + this.codigo);
        System.out.println("Nome:" + this.nome);
        System.out.println("Valor:" + this.valor);
        System.out.println("Disponível" + this.disponivel);
    }
}