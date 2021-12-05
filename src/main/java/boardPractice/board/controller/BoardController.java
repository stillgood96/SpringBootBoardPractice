package boardPractice.board.controller;

import boardPractice.board.common.vo.CommonFileVO;
import boardPractice.board.dto.FIleDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class BoardController {

    // 파일업로드 예제
    @GetMapping("/fileUpload")
    public String fileUpload(){
        return "fileUpload";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile[] uploadFile, Model model)  throws IllegalStateException , IOException{

        List<FIleDto> list = new ArrayList<>();
        for(MultipartFile file : uploadFile){
            System.out.println("파일명은 " + file);
            // UUID를 이용해 unique한 파일 이름을 만들어 준다.
            FIleDto dto = new FIleDto(UUID.randomUUID().toString(), file.getOriginalFilename(), file.getContentType());
            list.add(dto);

            File newFIleName = new File(dto.getUuid() + "_" + dto.getFileName());
            file.transferTo(newFIleName);
        }

        model.addAttribute("files", list );

        return "fileUpload";
    }

    @PostMapping("/fileUpload")
    public String fileUploadPost(MultipartHttpServletRequest multiRequest, CommonFileVO vo , Model model) throws IllegalStateException, IOException {

        List<FIleDto> list = new ArrayList<>();
        List<MultipartFile> fileList = multiRequest.getFiles("uploadFile");
        for(MultipartFile file : fileList) {
            if(!file.isEmpty()) {
                System.out.println("파일명: " + file.getName());
                FIleDto dto = new FIleDto(UUID.randomUUID().toString(), file.getOriginalFilename(), file.getContentType());

                list.add(dto);

                File newFileName = new File(dto.getUuid() + "_" + dto.getFileName());
                file.transferTo(newFileName);
            }
        }

        model.addAttribute("files", list);
        return "fileDownload";
    }


}
