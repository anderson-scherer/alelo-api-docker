package br.com.alelo.repository;

import javax.persistence.*;

@Entity
@Table(name = "TTAXASADICIONAIS")
public class TaxaAdicionalEntity {

    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "PRODUTO")
    private String produto;

    @Column(name = "TAXA_JUROS_DIA")
    private Double taxaJurosDia;

    @Column(name = "TAXA_SEGURO")
    private Double taxaSeguro;

    @Column(name = "TAXA_IMPOSTO")
    private Double taxaImposto;

    public TaxaAdicionalEntity() {
    }

    public TaxaAdicionalEntity(Long id, String produto, Double taxaJurosDia, Double taxaSeguro, Double taxaImposto) {
        this.id = id;
        this.produto = produto;
        this.taxaJurosDia = taxaJurosDia;
        this.taxaSeguro = taxaSeguro;
        this.taxaImposto = taxaImposto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Double getTaxaJurosDia() {
        return taxaJurosDia;
    }

    public void setTaxaJurosDia(Double taxaJurosDia) {
        this.taxaJurosDia = taxaJurosDia;
    }

    public Double getTaxaSeguro() {
        return taxaSeguro;
    }

    public void setTaxaSeguro(Double taxaSeguro) {
        this.taxaSeguro = taxaSeguro;
    }

    public Double getTaxaImposto() {
        return taxaImposto;
    }

    public void setTaxaImposto(Double taxaImposto) {
        this.taxaImposto = taxaImposto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxaAdicionalEntity that = (TaxaAdicionalEntity) o;

        return produto.equals(that.produto);
    }

    @Override
    public String toString(){
        return this.id + " - " +this.produto + " - " +this.taxaJurosDia + " - " +this.taxaSeguro + " - " +this.taxaImposto;
    }

    @Override
    public int hashCode() {
        return produto.hashCode();
    }
}