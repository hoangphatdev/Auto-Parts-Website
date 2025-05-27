package com.vku.autoparts_api.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    // khi user login, so sanh password user login voi ma bam trong db

//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository;
//
//    public AuthService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
//        this.passwordEncoder = passwordEncoder;
//        this.userRepository = userRepository;
//    }
//
//    public boolean authenticate(String username, String rawPassword) {
//        User user = userRepository.findByUsername(username);
//
//        if (user != null) {
//            // 1. Lấy mật khẩu đã mã hóa từ database
//            String storedEncodedPassword = user.getPassword();
//
//            // 2. So sánh mật khẩu người dùng nhập vào (rawPassword)
//            //    với mật khẩu đã mã hóa (storedEncodedPassword)
//            //    BCryptPasswordEncoder sẽ tự động thực hiện việc băm và so sánh
//            return passwordEncoder.matches(rawPassword, storedEncodedPassword);
//        }
//        return false;
//    }
}
