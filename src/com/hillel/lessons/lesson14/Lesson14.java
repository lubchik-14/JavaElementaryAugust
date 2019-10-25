package com.hillel.lessons.lesson14;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.function.Consumer;

public class Lesson14 {
    public static void main(String[] args) {
//        System.out.println("1) Bytes " + measureElapsedTime(Lesson14::copyFileByte, args[0]) + "ms");
        System.out.println("2) Local Buffer " + measureElapsedTime(Lesson14::copyFileBuffer, args[0]) + "ms");
        System.out.println("3) Buffered Streams " + measureElapsedTime(Lesson14::copyFileBuffered, args[0]) + "ms");
        System.out.println("4) Local Buffer with Buffered Streams "
                + measureElapsedTime(Lesson14::copyFileByteBufferedBuffer, args[0]) + "ms");

    }

    /**
     * Copies a file from path. Uses File Streams without a local buffer.
     *
     * @param path path to a source file
     */
    public static void copyFileByte(String path) {
        try (InputStream in = new FileInputStream(path);
             OutputStream out = new FileOutputStream(
                     path.substring(0, path.lastIndexOf("."))
                             + "(byte-wise copy)"
                             + path.substring(path.lastIndexOf(".")))) {
            readWrite(in, out, Optional.empty());
        } catch (IOException e) {
            System.out.println("File is wrong");
            e.printStackTrace();
        }
    }

    /**
     * Copies a file from path. Uses Buffered Streams without a buffer.
     *
     * @param path path to a source file
     */
    public static void copyFileBuffered(String path) {
        try (InputStream in = new BufferedInputStream(new FileInputStream(path));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(
                     path.substring(0, path.lastIndexOf("."))
                             + "(buffered copy)"
                             + path.substring(path.lastIndexOf("."))))) {
            readWrite(in, out, Optional.empty());

        } catch (IOException e) {
            System.out.println("File is wrong");
            e.printStackTrace();
        }
    }

    /**
     * Copies a file from path. Uses File Streams and a local buffer.
     *
     * @param path path to a source file
     */
    public static void copyFileBuffer(String path) {
        try (InputStream in = new FileInputStream(path);
             OutputStream out = new FileOutputStream(
                     path.substring(0, path.lastIndexOf("."))
                             + "(buffer byte-wise copy)" + path.substring(path.lastIndexOf(".")))) {
            readWrite(in, out, Optional.of(new byte[4 * 1024]));
        } catch (IOException e) {
            System.out.println("File is wrong");
            e.printStackTrace();
        }
    }

    /**
     * Copies a file from path. Uses Buffered Streams and a buffer.
     *
     * @param path path to a source file
     */
    public static void copyFileByteBufferedBuffer(String path) {
        try (InputStream in = new BufferedInputStream(new FileInputStream(path));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(
                     path.substring(0, path.lastIndexOf("."))
                             + "(buffered buffer copy)"
                             + path.substring(path.lastIndexOf("."))))) {
            readWrite(in, out, Optional.of(new byte[4 * 1024]));
        } catch (IOException e) {
            System.out.println("File is wrong");
            e.printStackTrace();
        }
    }

    /**
     * Reads and immediately write data using different Streams. Can use optional buffer.
     *
     * @param in InputStream to read data
     * @param out OutputStream to write data
     * @param buffer optional byte array for using buffer
     * @throws IOException if an I/O error occurs
     */
    private static void readWrite(InputStream in, OutputStream out, Optional<byte[]> buffer) throws IOException {
        int readCount;
        while (in.available() > 0) {
            readCount = buffer.isPresent() ? in.read(buffer.get()) : in.read();
            if (readCount > -1) {
                if (buffer.isPresent()) {
                    out.write(buffer.get(), 0, readCount);
                } else {
                    out.write(readCount);
                }
            }
        }
    }

    /**
     * Measures elapsed time to run a given consumer.
     *
     * @param action Consumer
     * @param path String with path to a source file
     * @return time in milliseconds that needed to run a given action
     */
    public static long measureElapsedTime(Consumer<String> action, String path) {
        Instant start = Instant.now();
        action.accept(path);
        Instant finish = Instant.now();
        return Duration.between(start, finish).toMillis();
    }
}
