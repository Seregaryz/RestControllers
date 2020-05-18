package ru.kpfu.itis.rest.models;

import lombok.*;
import org.springframework.data.annotation.Transient;
import ru.kpfu.itis.rest.util.FileStorageUtil;

import javax.persistence.*;
import java.io.File;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder()
public class FileInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Transient
    private String fileName;

    @Transient
    private File sourceFile;

    private String storageFileName;

    private String originalFileName;

    private Long size;

    private String type;

    private String url;

    @PostLoad
    public void loadFile() {
        FileStorageUtil fileStorageUtil = new FileStorageUtil();
        sourceFile = new File(fileStorageUtil.getStoragePath() + storageFileName);
        fileName = sourceFile.getName().substring(0, sourceFile.getName().lastIndexOf("."));
    }

    @ManyToOne
    @JoinColumn(name = "model_id")
    private InfoModel infoModel;

}

