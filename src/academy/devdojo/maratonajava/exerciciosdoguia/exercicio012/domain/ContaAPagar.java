package academy.devdojo.maratonajava.exerciciosdoguia.exercicio012.domain;

public class ContaAPagar {
    private Produto[] produto;
    private FormaDePagamento formaDePagamento;
    private int parcelas;

    public ContaAPagar(Produto[] produto, FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
        this.produto = produto;
    }

    public ContaAPagar(Produto[] produto, FormaDePagamento formaDePagamento, int parcelas) {
        this.produto = produto;
        this.formaDePagamento = formaDePagamento;
        this.parcelas = parcelas;
    }

    public String totalAPagar(Produto[] produtos) {
        double total = 0;
        for(Produto array: produtos) {
            total += array.precoBruto();
        }
        if(formaDePagamento.equals(FormaDePagamento.CREDITO)) {
            total *= 0.90;
        } else if(formaDePagamento.equals(FormaDePagamento.DINHEIRO)) {
            total *= 0.85;
        } else if(formaDePagamento.equals(FormaDePagamento.PARCELADODOIS)) {
            total = total / 2;
            return "parcelado em 2 vezes de R$ " + total;
        } else if(formaDePagamento.equals(FormaDePagamento.PARCELADOMAIS)) {
            total = (total * 1.10) / parcelas;
            return "parcelado em " + parcelas + " de R$ " + String.format("%.2f%n", total);
        }
        return "Total a pagar: R$ " + total;
    }


    public Produto[] getProduto() {
        return produto;
    }

    public void setProduto(Produto[] produto) {
        this.produto = produto;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
