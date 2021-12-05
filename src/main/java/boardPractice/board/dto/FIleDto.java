package boardPractice.board.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class FIleDto {

    private String uuid;
    private String fileName;
    private String contentType;
}
