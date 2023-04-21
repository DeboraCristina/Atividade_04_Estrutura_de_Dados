package model;

public class Cliente
{
    String nome;
    int quantidadePecas;
    float valorPecas;

    public Cliente()
    {
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", quantidadePecas=" + quantidadePecas +
                ", valorPecas=" + valorPecas +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        this.quantidadePecas = quantidadePecas;
    }

    public float getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(float valorPecas) {
        this.valorPecas = valorPecas;
    }
}
