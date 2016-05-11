package com.expye.compiler2016.TestKits;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by abcdabcd987 on 2016-04-18.
 */
public class TeeOutputStream extends OutputStream {
    private OutputStream[] streams;

    public TeeOutputStream(OutputStream... streams) {
        super();
        this.streams = streams;
    }

    @Override
    public void write(int b) throws IOException {
        for (OutputStream stream : streams) stream.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        for (OutputStream stream : streams) stream.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        for (OutputStream stream : streams) stream.write(b, off, len);
    }

    @Override
    public void flush() throws IOException {
        for (OutputStream stream : streams) stream.flush();
    }

    @Override
    public void close() throws IOException {
        super.close();
        // do not close streams
    }
}
