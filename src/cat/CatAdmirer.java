package cat;

public class CatAdmirer {
    public static void main(String[] args) {

        BigCat cat = new BigCat();
        System.out.println(cat.name); // public
        System.out.println(cat.hasFur); // protected
        System.out.println(cat.hasPaws); // default
        //System.out.println(cat.id); //private !!!! build failed: (java: id has private access in cat.BigCat)

        /// cat.id kısmını yorum satırı yapınca gelen output:
        //Kofte
        //true
        //true

    }
}
