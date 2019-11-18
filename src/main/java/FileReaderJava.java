import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.IOUtils;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderJava {
    public static void main(String[] args) throws IOException {
        File file = new File("src/test/resources/input.txt");
        FileInputStream input = new FileInputStream(file);
        MultipartFile multipartFile = new MockMultipartFile("file",
                file.getName(), "text/plain", IOUtils.toByteArray(input));

//        File file = new File("src/test/resources/validation.txt");
//        DiskFileItem fileItem = new DiskFileItem("file", "text/plain", false, file.getName(), (int) file.length() , file.getParentFile());
//        fileItem.getOutputStream();
//        MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
    }

}
