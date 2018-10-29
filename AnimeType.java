package anime;

public class AnimeType {
    private String type;

    public AnimeType(String type){
        this.setTypeName(type);
    }

    public AnimeType(){

    }

    public String getTypeName() {
        return type;
    }

    public void setTypeName(String type) {
        this.type = type;
    }

}

