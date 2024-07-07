import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.Parser;
import com.vladsch.flexmark.util.data.MutableDataSet;
import org.junit.jupiter.api.Test;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MarkdownConverterTest {

    @Test
    public void basic_example() throws Exception
    {
        MutableDataSet options = new MutableDataSet()
                .set(Parser.EXTENSIONS, Collections.singletonList(HtmlConverterTextExtension.create()));

        String html = "<ul>\n" +
                "  <li>\n" +
                "    <p>Add: live templates starting with <code>.</code> <kbd>Kbd</kbd> <a href='http://example.com'>link</a></p>\n" +
                "    <table>\n" +
                "      <thead>\n" +
                "        <tr><th> Element       </th><th> Abbreviation    </th><th> Expansion                                               </th></tr>\n" +
                "      </thead>\n" +
                "      <tbody>\n" +
                "        <tr><td> Abbreviation  </td><td> <code>.abbreviation</code> </td><td> <code>*[]:</code>                                                 </td></tr>\n" +
                "        <tr><td> Code fence    </td><td> <code>.codefence</code>    </td><td> ``` ... ```                                       </td></tr>\n" +
                "        <tr><td> Explicit link </td><td> <code>.link</code>         </td><td> <code>[]()</code>                                                  </td></tr>\n" +
                "      </tbody>\n" +
                "    </table>\n" +
                "  </li>\n" +
                "</ul>";
        String markdown = FlexmarkHtmlConverter.builder(options).build().convert(html);

        System.out.println("HTML:");
        System.out.println(html);

        System.out.println("\nMarkdown:");
        System.out.println(markdown);

    }
}