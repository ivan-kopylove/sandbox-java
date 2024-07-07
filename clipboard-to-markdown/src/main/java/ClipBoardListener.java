import com.fasterxml.jackson.core.JsonProcessingException;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.UUID.randomUUID;

public class ClipBoardListener extends Thread implements ClipboardOwner {
    private final Clipboard sysClip = Toolkit.getDefaultToolkit().getSystemClipboard();
    private String DASH = "---";
    ;

    @Override
    public void run() {
        Transferable trans = sysClip.getContents(this);
        takeOwnership(trans);
    }

    @Override
    public void lostOwnership(Clipboard c, Transferable t) {

        try {
            ClipBoardListener.sleep(250);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        Transferable contents = sysClip.getContents(this);
        try {
            processClipboard(contents, c);
        } catch (Exception ex) {
            Logger.getLogger(ClipBoardListener.class.getName()).log(Level.SEVERE, null, ex);
        }
        takeOwnership(contents);
    }

    void takeOwnership(Transferable t) {
        sysClip.setContents(t, this);
    }

    public void processClipboard(Transferable t, Clipboard c) {
        Transferable trans = t;

        try {
            if (trans != null && trans.isDataFlavorSupported(DataFlavor.allHtmlFlavor)) {


                String text = (String) trans.getTransferData(DataFlavor.allHtmlFlavor);
                MutableDataSet options = new MutableDataSet()
                        .set(Parser.EXTENSIONS, Collections.singletonList(HtmlConverterTextExtension.create()));

                String markdown = FlexmarkHtmlConverter.builder(options).build().convert(text);

                Result path = buildPath();
                String frontmatter = buildFrontMatter(path.uuid(), text);


                String deleteFileButton = buildDeleteButton();

                String markdownBody = frontmatter + "---\n\n" + deleteFileButton + "\n" + DASH + "\n\n" + markdown;

                Files.writeString(path.path(), markdownBody);
                System.out.println("saved text to " + path.path() + " of length: " + markdownBody.length());
            } else if (trans != null && trans.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                String text = (String) trans.getTransferData(DataFlavor.stringFlavor);

                Result path = buildPath();
                String frontmatter = buildFrontMatter(path.uuid(), text);
                String deleteFileButton = buildDeleteButton();
                String markdownBody = frontmatter + "---\n\n" + deleteFileButton + "\n" + DASH + "\n\n```\n" + text + "\n```";

                Files.writeString(path.path(), markdownBody);
                System.out.println("saved text to " + path.path() + " of length: " + markdownBody.length());
            }
        } catch (Exception e) {
        }
    }

    private static @NotNull String buildDeleteButton() {
        String deleteFileButton = """
                ```button
                name Delete current file
                type command
                action Delete current file
                ```
                """;
        return deleteFileButton;
    }

    private static @NotNull Result buildPath() throws IOException {
        UUID uuid = randomUUID();
        Path directory = Path.of(Runner.PARSED_COMMAND_LINE.getOptionValue("c") + "\\" + uuid);
        Files.createDirectories(directory);

        Path path = Path.of(directory.toAbsolutePath().toString(), uuid + ".md");
        Result result = new Result(uuid, path);
        return result;
    }

    private record Result(UUID uuid, Path path) {
    }

    private static String buildFrontMatter(UUID uuid, String text) throws JsonProcessingException {
        Frontmatter frontmatter = new Frontmatter(uuid.toString(), Instant.now().toString(), List.of(), Arrays.stream(Runner.PARSED_COMMAND_LINE.getOptionValues("t")).toList(), text.length());
        return Runner.YAML_MAPPER.writeValueAsString(frontmatter);

    }
}
