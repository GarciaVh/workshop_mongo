package org.garcia.workshopsitemongo.config;

import org.garcia.workshopsitemongo.domain.User;
import org.garcia.workshopsitemongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.netty.udp.UdpServer;

@Component
public class Instantiation implements CommandLineRunner {

    private UserRepository userRepository;

    @Autowired
    public Instantiation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User maria = new User(null, "maria", "maria@gmail.com");
        User alex = new User(null, "alex", "alex@gmail.com");
        User bob = new User(null, "bob", "bob@gmail.com");

    }
}
