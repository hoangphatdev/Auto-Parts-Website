package com.vku.autoparts_api.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // ma hoa mat khau truoc khi luu password nguoi dung vao DB

//    private final PasswordEncoder passwordEncoder;
//    private final UserRepository userRepository; // Giả sử bạn có UserRepository
//
//    public UserService(PasswordEncoder passwordEncoder, UserRepository userRepository) {
//        this.passwordEncoder = passwordEncoder;
//        this.userRepository = userRepository;
//    }
//
//    public User registerNewUser(String username, String rawPassword) {
//        // 1. Mã hóa mật khẩu trước khi lưu
//        String encodedPassword = passwordEncoder.encode(rawPassword);
//
//        // 2. Tạo đối tượng người dùng và lưu vào database
//        User newUser = new User();
//        newUser.setUsername(username);
//        newUser.setPassword(encodedPassword); // Lưu mật khẩu đã mã hóa
//
//        return userRepository.save(newUser);
//    }
//
//    // Các phương thức khác...
}
