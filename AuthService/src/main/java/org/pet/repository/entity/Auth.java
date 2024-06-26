package org.pet.repository.entity;

import org.pet.utility.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_auth")
public class Auth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true,length = 64, nullable = false)
    String username;
    @Column(nullable = false,length = 128)
    String password;
    Long createAt;
    Long updateAt;
    @Enumerated(EnumType.STRING)
    State state;
}
