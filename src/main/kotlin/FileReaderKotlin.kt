import org.apache.commons.fileupload.disk.DiskFileItem
import org.apache.commons.io.IOUtils
import org.springframework.mock.web.MockMultipartFile
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.multipart.commons.CommonsMultipartFile

import java.io.File
import java.io.FileInputStream
import java.io.IOException

object FileReaderKotlin {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val file = File("src/test/resources/input.txt")
        val input = FileInputStream(file)
        val multipartFile = MockMultipartFile(
            "file",
            file.name, "text/plain", IOUtils.toByteArray(input)
        )

        //        File file = new File("src/test/resources/validation.txt");
        //        DiskFileItem fileItem = new DiskFileItem("file", "text/plain", false, file.getName(), (int) file.length() , file.getParentFile());
        //        fileItem.getOutputStream();
        //        MultipartFile multipartFile = new CommonsMultipartFile(fileItem);
    }

}
