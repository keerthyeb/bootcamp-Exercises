package compositePattern;

public class Content extends Parent {

    public Content() {
        super();
    }

    @Override
    public String refresh() {
        StringBuilder ContentRefresh = new StringBuilder();
        ContentRefresh.append("Content is refreshing ");
        for (Component node : children) {
            ContentRefresh.append(node.refresh());
        }
        return ContentRefresh.toString();
    }
}
