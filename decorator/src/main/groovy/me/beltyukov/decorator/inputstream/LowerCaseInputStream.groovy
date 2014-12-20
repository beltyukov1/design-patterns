package me.beltyukov.decorator.inputstream

/**
 * Created by Alex on 12/20/14.
 */
class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param inputStream the underlying input stream, or <code>null</code> if
     *          this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream inputStream) {
        super(inputStream)
    }

    @Override
    int read() throws IOException {
        def byteValue = super.read()
        byteValue == -1 ? byteValue : Character.toLowerCase(byteValue)
    }

    @Override
    int read(byte[] b, int off, int len) throws IOException {
        def result = super.read(b, off, len)
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char)b[i])
        }
        result
    }
}
