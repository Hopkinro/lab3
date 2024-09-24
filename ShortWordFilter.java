import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface Filter {
    boolean accept(String str);
}

class ShortWordFilter implements Filter {
    @Override
    public boolean accept(String str) {
        return str.length() < 5;
    }
}
