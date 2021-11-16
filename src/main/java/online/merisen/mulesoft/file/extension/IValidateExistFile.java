package online.merisen.mulesoft.file.extension;

import static org.mule.runtime.api.meta.model.display.PathModel.Location.EXTERNAL;
import static org.mule.runtime.api.meta.model.display.PathModel.Type.DIRECTORY;
import static org.mule.runtime.api.meta.model.display.PathModel.Type.FILE;

import org.mule.extension.file.common.api.FileSystem;
import org.mule.extension.file.common.api.exceptions.FileRenameErrorTypeProvider;

import org.mule.runtime.extension.api.annotation.error.Throws;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.display.Path;
import org.mule.runtime.extension.api.annotation.param.display.Summary;

public interface IValidateExistFile {
	/**
	 * Validate and check if file exist on {@code directoryPath}
	 *
	 * @param fileSystem a reference to the host {@link FileSystem}
	 * @param directoryPath directory's name
	 * @param fileName file name
	 */
	@Summary("Validate exist file")
	@Throws(FileRenameErrorTypeProvider.class)
	public boolean validateExistFile(@SuppressWarnings("rawtypes") 
			@Connection FileSystem fileSystem,
			@Path(type = DIRECTORY, location = EXTERNAL) String directoryPath, 
			@Path(type = FILE, location = EXTERNAL) String fileName);
}
