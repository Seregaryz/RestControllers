package ru.kpfu.itis.rest.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;
import ru.kpfu.itis.rest.models.user.User;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "info_model")
public class InfoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "infoModel")
    @Where(clause = "type = 'image/png'")
    private List<FileInfo> pngDocuments;

    @OneToMany(mappedBy = "infoModel")
    @Where(clause = "role = 'USER'")
    private List<User> usualUsers;

}
