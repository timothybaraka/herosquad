public class Squad {

    private int size;
    private String name;
    private String cause;

    public Squad(int size, String name, String cause ){
        this.size = size;
        this.name = name;
        this.cause = cause;
    }

    public int getSize(){
        return size;
    }
    public String getName(){
        return name;
    }
    public String getCause(){
        return cause;
    }
}
