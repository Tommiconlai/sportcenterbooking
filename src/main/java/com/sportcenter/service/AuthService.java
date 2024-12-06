
package com.sportcenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sportcenter.dto.AuthRequest;
import com.sportcenter.dto.RegisterUserRequest;
import com.sportcenter.model.Ruolo;
import com.sportcenter.model.Utente;
import com.sportcenter.repository.RuoloRepository;
import com.sportcenter.repository.UtenteRepository;

@Service
public class AuthService {

    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RuoloRepository ruoloRepository;

    public void register(RegisterUserRequest register) {
        Utente nuovoUtente = new Utente();

        nuovoUtente.setEmail(register.getEmail());
        nuovoUtente.setUsername(register.getUsername());
        nuovoUtente.setId(register.getId());
        nuovoUtente.setPassword(passwordEncoder.encode(register.getPassword()));

        Ruolo ruolo = ruoloRepository.findByRuolo(register.getRuolo()).get();

        nuovoUtente.getRuolo().add(ruolo);

        utenteRepository.save(nuovoUtente);
    }

    

    public String login(AuthRequest authRequest) {
        // Validazione dell'utente e generazione del token JWT (da implementare)
        return "token_jwt";
    }
}
