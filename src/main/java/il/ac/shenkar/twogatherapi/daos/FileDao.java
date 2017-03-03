package il.ac.shenkar.twogatherapi.daos;

import javax.xml.ws.Response;
import java.io.File;

public class FileDao {

	private static FileDao fileDao = new FileDao();

	public static FileDao getInstance() {
		return fileDao;
	}

	private FileDao() {
	}

	public Response getFileByFileName(String fileName) {
		return null;
	}

	public void uploadFile(File file) {
	}

	public void deleteFile(String fileName) {

	}
}
