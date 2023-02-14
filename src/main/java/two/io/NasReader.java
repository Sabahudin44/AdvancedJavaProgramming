package two.io;

import java.io.Closeable;

public class NasReader implements Closeable {
    @Override
    public void close()  {
        System.out.println("Neko pozvao funkciju close...");

    }
}
