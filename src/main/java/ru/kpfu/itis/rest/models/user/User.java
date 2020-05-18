package ru.kpfu.itis.rest.models.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.rest.models.user.Role;
import ru.kpfu.itis.rest.models.user.Sex;
import ru.kpfu.itis.rest.models.user.State;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String hashPassword;
    private String nickname;
    private String surname;
    private String name;
    private String number;
    private String photoPath;
    private LocalDateTime createdAt;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private Sex sex;

    @Enumerated(value = EnumType.STRING)
    private State state;

    private String confirmCode;
}
