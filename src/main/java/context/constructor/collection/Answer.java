package context.constructor.collection;

public class Answer {
    private int id;
    private String name;
    private String by;

    public Answer() {}
    public Answer(int id, String name, String by) {
        this.id = id;
        this.name = name;
        this.by = by;
    }

    public String toString(){
        return id+" "+name+" "+by;
    }
}
