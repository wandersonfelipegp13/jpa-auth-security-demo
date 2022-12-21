package dev.wande.jpaauthsecurity.service;

import dev.wande.jpaauthsecurity.model.User;
import dev.wande.jpaauthsecurity.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    public Optional<User> findByUsername(String username)  {
        return this.userRepository.findByUsername(username);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

}
