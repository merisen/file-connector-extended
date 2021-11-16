package online.merisen.mulesoft.file.extension;

import org.mule.extension.file.common.api.FileSystem;

public class ValidateExistFile implements IValidateExistFile {
	@Override
	public boolean validateExistFile(FileSystem fileSystem, String directoryPath, String fileName) {
		return true;
	}
}
