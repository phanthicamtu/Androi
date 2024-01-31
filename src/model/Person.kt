package model

class Person constructor(
    var name:String,
    var age:Int,
    var address : String? = ""
    // String? : co the null
    // = null : la kieu deufauft
) {
    // var name: String = ""
    // var age: Int = 0
    // phuong thuc khoi tao (contruction) dung de rang buoc
    // cac tham so cho viet khoi tao

    // controctor chi them ko thay doi
   /* var height:Float = 0f
    constructor(name: String,address: String?,age: Int, height:Float)
            :this(name, age, address){
                this.height = height
            }*/


}