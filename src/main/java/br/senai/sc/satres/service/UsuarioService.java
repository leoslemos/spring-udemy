package br.senai.sc.satres.service;

import br.senai.sc.satres.model.entity.Usuario;

public interface UsuarioService {

    Usuario autenticarUsuario(String email, String senha);

    Usuario salvarUsurio(Usuario Usuario);

    void validarEmailUsuario(String email);
}
