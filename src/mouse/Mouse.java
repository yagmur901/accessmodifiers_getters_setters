package mouse;

import cat.BigCat;

public class Mouse {
    public static void main(String[] args) {

        BigCat cat = new BigCat();

        System.out.println(cat.name); ///her yerden erişilir ama Mouse'un kendi değişkeni değil, cat üzerinden çağrılmalı.
        ///System.out.println(cat.hasFur); // error: java: hasFur has protected access in cat.BigCat
        //protected aynı paketteki sınıflara ve aynı paketteki alt sınıflara izin veriyor
        //mouse BigCati extend etmiyor o yuzden hasFur buraya geçemiyor
        System.out.println(cat.getHasFur());

        ///!!! PEKİ YA FARKLI PAKETTEN EXTENDS ETSEYDİ???
        //javada üst paket alt paket akrabalığı yok yani lynx senaryosuyla aynı olur.
        // yani cat.species ve mouse paketlerinin ikisi de cat paketine eşit derecede yabancıdır.

        ///System.out.println(cat.hasPaws); // error: java: hasPaws is not public in cat.BigCat; cannot be accessed from outside package
        //hasPaws defaulttur, onun şartı da => aynı pakette olmak(package-private).
        //mouse tamamen farklı bir paket o yuzden hasPaws a hiçbir şekilde erişemez, cat.hasPaws çalışmaz.
        System.out.println(cat.getHasPaws());



        ///System.out.println(cat.id); // error: java: id has private access in cat.BigCat
        // id private olduğundan => sadece BigCat sınıfının içi.
        //BigCat dışında hiçbir sınıftan inherit edilemez ve dışarıdan okunamaz. Bu yüzden derleme hatası.
        System.out.println(cat.getId());

        ///getterlarla output:
        //Kofte
        //true
        //true
        //12345


    }
}
