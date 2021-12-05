package boardPractice.board.common.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class CommonFileVO {

    public CommonFileVO() {
    }

    /** 파일 Seq */
    private long fileSeq = 0;

    /** 파일 순번 */
    private int fileSn = 0;

    /** 파일 상위 Seq */
    private long fileParentSeq = 0;

    /** 파일 경로 */
    private String filePath = "";

    /** 파일 신규 파일명 */
    private String newFileNm = "";

    /** 파일 원본 파일명 */
    private String originalFileNm = "";

    /** 파일 확장자 */
    private String fileExtr = "";

    /** 파일 사이즈 */
    private long fileSize = 0;

    /** 생성일시 */
    private Date createDt;

    /** 파일 기타 정보 */
    private String fileEtcInfo = "";

    /** 파일 타입 */
    private String fileType = "";

    /** 수정 */
    private List<String> fileEtcInfoList;

    private List<Integer> updateFileSeq;

    private List<Integer> updateFileSn;

    private List<String> updateFileEtcInfo;

    /** 삭제 파일 상위 Seq */
    private long deleteFileParentSeq = 0;

    /** 삭제 파일 Seq */
    private long deleteFileSeq = 0;

    /** 삭제 파일 순번 */
    private int deleteFileSn = 0;

    private List<CommonFileVO> listFile;

    private List<CommonFileVO> listUpdateFile;

    private List<CommonFileVO> listDeleteFile;
}