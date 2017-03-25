package io.fotoapparat.hardware;

/**
 * A generic camera exception.
 */
public class CameraException extends RuntimeException {
    public CameraException(Exception e) {
        super(e);
    }
}
