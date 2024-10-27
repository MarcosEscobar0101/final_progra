package com.umgcarrito.carrito_basico.service;

import com.umgcarrito.carrito_basico.model.Usuario;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUsuarioService usuarioService;

    @Autowired
    private BCryptPasswordEncoder bCrypt;

    @Autowired
    private HttpSession session;

    private Logger log = LoggerFactory.getLogger(UserDetailServiceImpl.class);

    @Override
    @Lazy
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("Este es el username: {}", username);
        Optional<Usuario> optionalUser = usuarioService.findByEmail(username);

        if (optionalUser.isPresent()) {
            log.info("Esto es el id del usuario: {}", optionalUser.get().getId());
            session.setAttribute("idusuario", optionalUser.get().getId());
            Usuario usuario = optionalUser.get();

            return User.builder()
                    .username(usuario.getNombre())
                    .password(usuario.getPassword())
                    .roles(usuario.getTipo())
                    .build();
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}