package online.merisen.mulesoft.file.extension;

import java.io.File;

public class FileOperations implements IFileOperations {

	@Override
	public int fileCountInTheDir(File dir) {
		return dir.list().length;
	}
}
