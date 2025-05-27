package com.vku.autoparts_api.model;

import com.vku.autoparts_api.util.DateTimeUtil;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(
            name = "user_name",
            unique = true,
            nullable = false
    )
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    private String address;
    private String phone;

    @Column( name = "created_at")
    private String createdAt ;
//    = DateTimeUtil.getFormattedDateTime();
    @Column(name = "updated_at")
    private String updatedAt;

    @OneToMany(mappedBy = "user", orphanRemoval = true,  fetch = FetchType.LAZY)
    private List<Order> orderList = new ArrayList();
    @OneToMany(mappedBy = "user", orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Cart> cartList = new ArrayList();
}
