package br.senai.sc.satres.model.repository;

import br.senai.sc.satres.SatresApplication;
import br.senai.sc.satres.model.entity.Usuario;
import br.senai.sc.satres.service.UsuarioService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest(classes = )
@ExtendWith(SpringExtension.class)
public class UsuarioRepositoryTest {

    @Autowired
    UsuarioRepository repository;

    @Test
    public void validaExistenciaEmailUsuario(){
        //Cenario
        Usuario usuario = Usuario.builder().login("leoslemos").senha("leoslemos").email("leoslemos@gmail.com").build();
        repository.save(usuario);

        //Ação
        boolean retorno = repository.existsByEmail("leoslemos@gmail.com");

        //Verificação
        Assertions.assertThat(retorno).isTrue();
    }

}
