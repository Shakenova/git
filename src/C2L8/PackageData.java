package C2L8;

import java.io.Serializable;

public class PackageData implements Serializable {
    private String name;
    private String message;

    public PackageData(String name, String message) {
        this.name = name;
        this.message = message;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String toString(){
        return name+": "+message;
    }
}