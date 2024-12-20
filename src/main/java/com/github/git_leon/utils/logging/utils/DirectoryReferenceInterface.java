package com.github.git_leon.utils.logging.utils;

import java.io.File;

public interface DirectoryReferenceInterface {
    String getDirectoryPath();

    default File getDirectoryFile() {
        return new File(getDirectoryPath());
    }

    default File getFileFromDirectory(String fileName) {
        File file = new File(getDirectoryFile()
                .getAbsolutePath()
                .concat(fileName));
        file.getParentFile().mkdirs();
        return file;
    }
}
