package com.example.kotlindersleri.nesne_tabanli_programlama.paket1

class A {

    //Modifier
    var varsayilanDegisken = 1 // public ile aynıdır
    public var publicDegisken = 2 // her yerden erişilebilir demek
    private var privateDegisken = 3 // sadece tanımlandığı classtan erişilebilir
    internal  var internalDegisken = 4 // Modül yapısı ile
    protected  var protectedDegisken = 5 //Kalıtım - inheritence ile erişilebilir demek

}