package examples.enkel;

public class Variable {
    private int type;
    private int id;
    private String value;

    public Variable(int id, int type, String value) {
        this.type = type;
        this.id = id;
        this.value = value;
    }

    public int getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(String value) {
        this.value = value;
    }

}