package compositePattern;

public class Body extends Parent {

    public Body() {
        super();
    }

    @Override
    public String refresh() {
        StringBuilder bodyRefresh = new StringBuilder();
        bodyRefresh.append("Body is refreshing ");
        for (Component node : children) {
            bodyRefresh.append(node.refresh());
        }
        return bodyRefresh.toString();
    }

}
