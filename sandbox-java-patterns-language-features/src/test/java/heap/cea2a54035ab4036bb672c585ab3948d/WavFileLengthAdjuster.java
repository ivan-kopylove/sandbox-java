package heap.cea2a54035ab4036bb672c585ab3948d;

public class WavFileLengthAdjuster {

    /**
     * Used to read unfinished recording.
     */
    public static byte[] finalizeWavFile(byte[] bytes) {
        int length = bytes.length;

        // Bytes 4-7: Size of the entire file minus 8
        int fileSize = length - 8;
        byte[] fileSizeBytes = intToLittleEndianBytes(fileSize);
        System.arraycopy(fileSizeBytes, 0, bytes, 4, 4);

        // Bytes 40-43: Size of the data chunk only
        int dataSize = length - 44;
        byte[] dataSizeBytes = intToLittleEndianBytes(dataSize);
        System.arraycopy(dataSizeBytes, 0, bytes, 40, 4);

        return bytes;
    }

    private static byte[] intToLittleEndianBytes(int value) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) (value & 0xff);
        bytes[1] = (byte) ((value >> 8) & 0xff);
        bytes[2] = (byte) ((value >> 16) & 0xff);
        bytes[3] = (byte) ((value >> 24) & 0xff);
        return bytes;
    }
}

