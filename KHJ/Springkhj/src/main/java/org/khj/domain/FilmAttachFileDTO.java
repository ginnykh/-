package org.khj.domain;

public class FilmAttachFileDTO {
	
	private String fileName;
	private String uploadPath;
	private String uuid;
	private boolean image;
	private int bno;
	

	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getUploadPath() {
		return uploadPath;
	}


	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public boolean isImage() {
		return image;
	}


	public void setImage(boolean image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "AttachFileDTO [fileName=" + fileName + ", uploadPath=" + uploadPath + ", uuid=" + uuid + ", image="
				+ image + ", bno=" + bno + "]";
	}
	
}