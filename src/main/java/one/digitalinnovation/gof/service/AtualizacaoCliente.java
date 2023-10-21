package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AtualizacaoCliente {
    private String campo;
    private Object valorAntigo;

    private Object valorNovo;

    // Getters, setters e construtores


    public AtualizacaoCliente(String campo, Object valorAntigo, Object valorNovo) {
        this.campo = campo;
        this.valorAntigo = valorAntigo;
        this.valorNovo = valorNovo;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public Object getValorAntigo() {
        return valorAntigo;
    }

    public void setValorAntigo(Object valorAntigo) {
        this.valorAntigo = valorAntigo;
    }

    public Object getValorNovo() {
        return valorNovo;
    }

    public void setValorNovo(Object valorNovo) {
        this.valorNovo = valorNovo;
    }

}
