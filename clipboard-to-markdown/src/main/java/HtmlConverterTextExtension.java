import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.data.MutableDataHolder;
import org.jetbrains.annotations.NotNull;

class HtmlConverterTextExtension implements FlexmarkHtmlConverter.HtmlConverterExtension {
        public static HtmlConverterTextExtension create() {
            return new HtmlConverterTextExtension();
        }

        @Override
        public void rendererOptions(@NotNull MutableDataHolder options) {

        }

        @Override
        public void extend(FlexmarkHtmlConverter.@NotNull Builder builder) {
            builder.linkResolverFactory(new CustomLinkResolver.Factory());
            builder.htmlNodeRendererFactory(new CustomHtmlNodeConverter.Factory());
        }
    }