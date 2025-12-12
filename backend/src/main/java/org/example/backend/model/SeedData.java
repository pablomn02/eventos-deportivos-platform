package org.example.backend.model;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SeedData {

//    @Autowired private UserRepository userRepository;
//    @Autowired private PasswordEncoder passwordEncoder;
//
//    @PostConstruct
//    public void init() {
//        if (userRepository.count() == 0) {
//            User admin = User.builder()
//                    .nombreCompleto("Admin Principal")
//                    .username("admin")
//                    .email("admin@eventos.com")
//                    .password(passwordEncoder.encode("admin123"))
//                    .role(Role.ADMIN)
//                    .build();
//
//            User juez = User.builder()
//                    .nombreCompleto("Juez María")
//                    .username("juez1")
//                    .email("juez@eventos.com")
//                    .password(passwordEncoder.encode("juez123"))
//                    .role(Role.JUEZ)
//                    .build();
//
//            User usuario = User.builder()
//                    .nombreCompleto("Carlos Pérez")
//                    .username("carlos")
//                    .email("carlos@gmail.com")
//                    .password(passwordEncoder.encode("user123"))
//                    .role(Role.USER)
//                    .build();
//
//            userRepository.save(admin);
//            userRepository.save(juez);
//            userRepository.save(usuario);
//        }
//    }
}
