package med.voll.api.model.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.model.endereco.DadosEndereco;

public record DadosAtualizarMedico(
        @NotNull
        Long id,

        String nome,

        String telefone,
        DadosEndereco endereco) {
}
