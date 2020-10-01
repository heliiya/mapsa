package ir.mapsa.ipg.model;

public class Merchant {
    private String id;
    private String name;

    public Merchant(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
