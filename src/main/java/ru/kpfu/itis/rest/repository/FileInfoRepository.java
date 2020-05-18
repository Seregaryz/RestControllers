package ru.kpfu.itis.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.rest.models.FileInfo;


public interface FileInfoRepository extends JpaRepository<FileInfo, Long> {
    FileInfo findOneByStorageFileName(String storageFileName);
}

