package heap.cea2a54035ab4036bb672c585ab3948d;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestTest
{

    @Test
    @DisplayName("Should %verb% when / if")
    void should_do_something_when_condition() throws IOException
    {
        // given

        // when
        TestTest test = new TestTest();
        String sourceFileName = "c:\\1\\temp\\src.wav";
        String finalized = "c:\\1\\temp\\src-finalized.wav";

        byte[] bytes = Files.readAllBytes(Paths.get(sourceFileName));
        byte[] finalizedBytes = WavFileLengthAdjuster.finalizeWavFile(bytes);
        Files.write(Paths.get(finalized), finalizedBytes);

        test.copyAudio(finalized, "c:\\1\\temp\\dest.wav", 1);

        // then
        MatcherAssert.assertThat("actual result", CoreMatchers.equalTo("expected result"));
    }

    public void copyAudio(String sourceFileName, String destinationFileName, long lastNSeconds)
    {
        AudioInputStream inputStream = null;
        AudioInputStream shortenedStream = null;

        try
        {
            File file = new File(sourceFileName);
            AudioFileFormat fileFormat = AudioSystem.getAudioFileFormat(file);
            AudioFormat format = fileFormat.getFormat();
            inputStream = AudioSystem.getAudioInputStream(file);

            long frames = inputStream.getFrameLength();
            double totalDuration = (frames + 0.0) / format.getFrameRate();  // seconds

            int bytesPerSecond = format.getFrameSize() * (int) format.getFrameRate();

            inputStream.skip((long) (totalDuration - lastNSeconds) * bytesPerSecond);

            long framesOfAudioToCopy = lastNSeconds * (int) format.getFrameRate();
            shortenedStream = new AudioInputStream(inputStream, format, framesOfAudioToCopy);
            File destinationFile = new File(destinationFileName);
            AudioSystem.write(shortenedStream, fileFormat.getType(), destinationFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (inputStream != null)
            {
                try
                {
                    inputStream.close();
                }
                catch (Exception e)
                {
                   e.printStackTrace();
                }
            }
            if (shortenedStream != null)
            {
                try
                {
                    shortenedStream.close();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}
