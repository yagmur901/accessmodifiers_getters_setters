package lion;
import cat.BigCat;
public class test extends BigCat {
    public static void main(String[] args) {

        BigCat cat = new BigCat();
        //System.out.println(cat.name);
        System.out.println(cat.getName());
        ///public olduğu için oluyor.
        //System.out.println(cat.hasFur); //java: hasFur has protected access in cat.BigCat
        System.out.println(cat.getHasFur());
        /// protected aynı paketten ya da farklı paketteyken ancak miras yoluyla kendi nesnesi üzerinden erişebilir.
        /// yani BigCat objecti olan cat üzerinden cat.hasFur erişilemiyor. Farklı paket gibi algılar
        //System.out.println(cat.hasPaws); //java: hasPaws is not public in cat.BigCat; cannot be accessed from outside package
        System.out.println(cat.getHasPaws());
        /// default oldu. => package private. bu nedenle farklı paket olunca erişemiyor.
        //System.out.println(cat.id); //java: id has private access in cat.BigCat
        ///zaten private'ta sadece BigCat.java'ya özel
        System.out.println(cat.getId());

        //test mytest = new test();
        //System.out.println(mytest.name);
        //System.out.println(mytest.hasFur); /// derlenir çünkü yukarıda açıkladım.
        //System.out.println(mytest.hasPaws); //java: hasPaws is not public in cat.BigCat; cannot be accessed from outside package
        //System.out.println(mytest.id); //java: id has private access in cat.BigCat

        // hasPaws ve id yukarıdaki aynı sebepelrden ötürü erişilemez.


        /// farklı bir pakette extends ile alt sınıf kullanınca, üst sınıfın nesnesiyle (cat) sadece public olanları,
        /// kendi sınıfının nesnesiyle (mytest) hem public hem protected olanları okuyabiliriz.
        /// default ve private her koşulda elenir.

        ///Lynx ile aynı muhabbet, lynx alt pakette gibi gözükse de öyle subpackage ilişkisi yok direkt farklı paket olaraktan.
        /// getter setter lynxte denedim. aynısı oldugundan buraya da yazmaya gerekyok.

    }
}
