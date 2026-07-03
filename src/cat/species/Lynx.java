package cat.species;

import cat.BigCat;

public class Lynx extends BigCat {
    public static void main(String[] args) {

        BigCat cat = new BigCat();
        System.out.println(cat.name); //
        System.out.println(cat.getName()); // bu da çalışır

        ///System.out.println(cat.hasPaws); // java: hasPaws is not public in cat.BigCat; cannot be accessed from outside package
        // Lynx, BigCatin subclassı olsa dahi ve subpackageda olsa bile sonuç olarak farklı pakette olduğu için erişilmiyor
        //default access, subclass olsa bile inheritance'a izin vermez. sonuç olarak farklı paket deyip erişim vermez.
        System.out.println(cat.getHasPaws());

        ///System.out.println(cat.id); // java: id has private access in cat.BigCat
        //id private olduğu için sadece BigCat'e özel, BigCatten idyi inherit edemez alt sınıf da olsa alt package da olsa.
        System.out.println(cat.getId()); ///dogrusu bu

        ///System.out.println(cat.hasFur); // java: hasFur has protected access in cat.BigCat
        //protected ın icat edilme sebebi budur -> farklı pakette olsa dahi eğer extends ile bağlı ise bu değişken inherit edilir.
        // inheritancedan dolayı hasFur değişkeni protected olduğu için Lynx sınıfına miras olarak geçer.
        ///TUZAK!
        // miras olarak geçtiği için Bigcat cat = new BigCat(); cat.hasFur; diyerek erişemeyiz
        //çünkü nesne BigCat türünde olduğu için java pakete takılır ve izin vermez
        // yani Lynxin malı olduğu için onun cinsinden nesne oluşturup hasFur u çağırmamız gerekir.
        System.out.println(cat.getHasFur());

        ///hasFur için doğru kullanım şu şekilde: (sadece protected değişkenler için)
        Lynx myLynx = new Lynx();
        System.out.println(myLynx.hasFur);

        ///output:
        //Kofte
        // true

        ///private (id): Sadece BigCat içinde yaşar, asla miras kalmaz, başka sınıfta nesneyle de çağrılamaz.
        ///default (hasPaws): Farklı paketteki alt sınıfa miras kalmaz, nesneyle de çağrılamaz.
        ///protected (hasFur): Farklı paketteki alt sınıfa miras kalır, bu yüzden sadece o alt sınıfın kendi nesnesi üzerinden (myLynx) erişilebilir.
    }
}
