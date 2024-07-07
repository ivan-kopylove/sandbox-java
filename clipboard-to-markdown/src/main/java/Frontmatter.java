import java.util.List;

public class Frontmatter {
    private String id;
    private String created;
    private List<String> aliases;
    private List<String> tags;
    private Integer strLength;

    public Frontmatter(String id, String created, List<String> aliases, List<String> tags, Integer strLength) {
        this.id = id;
        this.created = created;
        this.aliases = aliases;
        this.tags = tags;
        this.strLength = strLength;
    }

    public Integer getStrLength() {
        return strLength;
    }

    public String getId() {
        return id;
    }


    public String getCreated() {
        return created;
    }


    public List<String> getAliases() {
        return aliases;
    }


    public List<String> getTags() {
        return tags;
    }


}
