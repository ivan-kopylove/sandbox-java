import com.vladsch.flexmark.html2md.converter.*;
import com.vladsch.flexmark.util.data.DataHolder;
import org.jsoup.nodes.Element;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class CustomHtmlNodeConverter implements HtmlNodeRenderer {
        public CustomHtmlNodeConverter(DataHolder options) {

        }

        @Override
        public Set<HtmlNodeRendererHandler<?>> getHtmlNodeRendererHandlers() {
            return new HashSet<>(Collections.singletonList(
                    new HtmlNodeRendererHandler<>("kbd", Element.class, this::processKbd)
            ));
        }

        private void processKbd(Element node, HtmlNodeConverterContext context, HtmlMarkdownWriter out) {
            out.append("<<");
            context.renderChildren(node, false, null);
            out.append(">>");
        }

        static class Factory implements HtmlNodeRendererFactory {
            @Override
            public HtmlNodeRenderer apply(DataHolder options) {
                return new CustomHtmlNodeConverter(options);
            }
        }
    }