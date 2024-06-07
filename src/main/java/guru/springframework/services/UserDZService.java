package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class UserDZService {
    public String getUserInfo() {
        return "User DZ information from UserService";
    }
}