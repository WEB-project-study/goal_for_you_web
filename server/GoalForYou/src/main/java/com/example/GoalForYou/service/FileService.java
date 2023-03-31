package com.example.GoalForYou.service;

import com.example.GoalForYou.domain.File;
import com.example.GoalForYou.dto.FileDto;
import com.example.GoalForYou.repository.FileRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.FileNotFoundException;
import java.util.Optional;


@Service
public class FileService {
    private FileRepository fileRepository;

    public FileService(FileRepository fileRepository) {

        this.fileRepository = fileRepository;
    }

    @Transactional
    public Long saveFile(FileDto fileDto) {

        return fileRepository.save(fileDto.toEntity()).getFileId();
    }

    @Transactional
    public FileDto getFile(Long id) throws FileNotFoundException {
        Optional<File> optionalFile = fileRepository.findById(id);
        if (!optionalFile.isPresent()) {
            // 파일을 찾을 수 없는 경우, 예외처리
            throw new FileNotFoundException("파일을 찾을 수 없습니다. id: " + id);
        }

        File file = optionalFile.get();

        FileDto fileDto = FileDto.builder()
                .id(id)
                .origFilename(file.getOrigFilename())
                .filename(file.getFilename())
                .filePath(file.getFilePath())
                .build();
        return fileDto;
    }
}
