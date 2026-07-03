package cat;

public class BigCat {

    public String name = "Kofte";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id = 12345;


    ///getters
    public int getId() {
        return id;
    }

    public boolean getHasFur() {
        return hasFur;
    }

    public boolean getHasPaws() {
        return hasPaws;
    }

    public String getName() {
        return name;
    }

    ///setters
    public void setId(int newId) {
        if (newId>0) {
            id = newId;
        } else {
            System.out.println("id pozitif olmali");
        }
    }

    public void setName(String newName) {
        name = newName;
        //newName yerine name deseydim:
        //this.name = name; olacaktı
    }

    public void setHasFur(boolean fur) {
        hasFur = fur;
    }

    public void setHasPaws(boolean paws) {
        hasPaws = paws;
    }

}
