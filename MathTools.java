import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MathTools {
    public static boolean generateRandomNumbers(String path, int length, int multiplyNum) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < length; i++) {
                Integer result = (int) (Math.random() * multiplyNum);
                bufferedWriter.write(result.toString());
                if (i != length - 1) bufferedWriter.write(",");
                if (i % 1000 == 0 || length - i < 1000)
                    bufferedWriter.flush();
            }
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
