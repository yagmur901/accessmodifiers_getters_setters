import cat.BigCat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BigCat cat = new BigCat();

        System.out.println(cat.name);
        System.out.println(cat.getName());
        cat.setName("Tika");
        System.out.println(cat.getName());

        //System.out.println(cat.id); //java: id has private access in cat.BigCat
        System.out.println(cat.getId());
        cat.setId(1232);
        System.out.println(cat.getId());
        cat.setId(-2);

        //System.out.println(cat.hasFur); //java: hasFur has protected access in cat.BigCat
        System.out.println(cat.getHasFur());
        cat.setHasFur(false);
        System.out.println(cat.getHasFur());

        System.out.println(cat.name);
        System.out.println(cat.getHasPaws());
        cat.setHasPaws(false);
        System.out.println(cat.getHasPaws());

        /// output:
        //Kofte
        //Kofte
        //Tika
        //12345
        //1232
        //id pozitif olmali
        //true
        //false
        //Tika
        //true
        //false

    }
}