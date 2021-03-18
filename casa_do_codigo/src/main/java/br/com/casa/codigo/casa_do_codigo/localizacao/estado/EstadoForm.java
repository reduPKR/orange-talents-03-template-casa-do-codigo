package br.com.casa.codigo.casa_do_codigo.localizacao.estado;

import br.com.casa.codigo.casa_do_codigo.exceptions.ErroNoCadastroException;
import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisModel;
import br.com.casa.codigo.casa_do_codigo.localizacao.pais.PaisRepository;
import br.com.casa.codigo.casa_do_codigo.validador.unique.UniqueValue;
import net.bytebuddy.implementation.bytecode.Throw;

import javax.validation.constraints.NotNull;
import java.util.Optional;

public class EstadoForm {
    @NotNull
    @UniqueValue(domainClass = EstadoModel.class, fieldName = "nome")
    private String nome;
    @NotNull
    private PaisModel pais;

    public EstadoForm() {
    }

    public String getNome() {
        return nome;
    }

    public PaisModel getPais() {
        return pais;
    }

    public Boolean validar(EstadoRepository estadoRepository, PaisRepository paisRepository) {
        Optional<PaisModel> optionalPais = paisRepository.findById(pais.getId());
        if(optionalPais.isEmpty())
            throw new ErroNoCadastroException("País "+pais.getNome()+" não cadastro", "País não encontrado");

        Optional<EstadoModel> optionalEstado = estadoRepository.findEstadoPais(this.nome, this.pais.getId());
        if(optionalEstado.isEmpty())
            throw new ErroNoCadastroException("Estado "+this.nome+" já está cadastrado neste pais", "Estado já cadastrado");

        return true;
    }

    public EstadoModel converter() {
        return new EstadoModel(this.nome, this.pais);
    }
}
