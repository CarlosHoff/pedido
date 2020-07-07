package br.com.hoffmann.pedido.domain.enums;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public enum FormaPagamento {

    CREDITO(1, "Credito"),
    DEBITO(2, "Debito");

    private static final Map<Integer, FormaPagamento> FORMA_PAGAMENTO = new HashMap<>(values().length);

    static {
        FORMA_PAGAMENTO.putAll(stream(values()).collect(toMap(FormaPagamento::code, identity())));
    }

    private final Integer code;
    private final String description;

    FormaPagamento(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer code() {
        return this.code;
    }

    public Long getCode() {
        return code.longValue();
    }

    public String description() {
        return this.description;
    }

    public static FormaPagamento of(Long enumCode) {

        if (enumCode.equals(CREDITO.getCode())) {
            return CREDITO;
        } else if (enumCode.equals(DEBITO.getCode())) {
            return DEBITO;
        } else
            return null;
    }
}
