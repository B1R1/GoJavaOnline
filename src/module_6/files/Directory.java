package module_6.files;

import java.util.List;

public class Directory {
    private List<File> list;

//    try (List<File> list)
//    catch (NegativeArraySizeException e) {
//
//    }

    public List<File> getList() {
        return list;
    }

    public void setList(List<File> list) {
        this.list = list;
    }
}
