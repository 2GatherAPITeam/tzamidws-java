package il.ac.shenkar.tzamidws.controllers;

import il.ac.shenkar.tzamidws.daos.FileDao;

import javax.xml.ws.Response;
import java.io.File;

public class FileController {

	private FileDao fileDao;

	public FileController() {
		this.fileDao = FileDao.getInstance();
	}

	public Response getFileByFileName(String fileName){
		return fileDao.getFileByFileName(fileName);
	}

	public void uploadFile(File file){
		fileDao.uploadFile(file);
	}

	public void deleteFile(String fileName){
		fileDao.deleteFile(fileName);
	}
	
}
