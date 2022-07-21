package br.com;

import lombok.*;

/**
 *
 * @author vinivilasboas
 */

@NoArgsConstructor @AllArgsConstructor
@ToString

public class Cliente {

    @Getter @Setter private String nome;
    private String cpf, rg;

    public String getCpf() {
        return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }

    public String getRg() {
        return (rg.substring(0, 2) + "." + rg.substring(2, 5) + "." +
                rg.substring(5, 8) + "-" + rg.substring(8));
    }
}
