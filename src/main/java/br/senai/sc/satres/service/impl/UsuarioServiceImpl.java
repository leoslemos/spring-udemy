package br.senai.sc.satres.service.impl;

import br.senai.sc.satres.exception.RegraNegocioExceprion;
import br.senai.sc.satres.model.entity.Usuario;
import br.senai.sc.satres.model.repository.UsuarioRepository;
import br.senai.sc.satres.service.UsuarioService;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioRepository repository;

    public UsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public Usuario autenticarUsuario(String email, String senha) {
        return null;
    }

    @Override
    public Usuario salvarUsurio(Usuario Usuario) {
        return null;
    }

    @Override
    public void validarEmailUsuario(String email) {
        boolean existe = repository.existsByEmail(email);
        if(existe){
            throw new RegraNegocioExceprion("Já existe um usuário cadastrado com este e-mail");
        }
    }
}
