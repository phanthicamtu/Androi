import model.Person

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*
    1: khai bao bien
     Từ khoá khai báo : var,val
     var co the thay doi gia tri(mutable)
     var name:String = "Cam Tu"
      println(name)
     val ko dc gan gtri (immutable)
     val phone : String ="093234523"
     Basic type : Kieu du lieu co ban
     Reference type : Kieu du lieu vung nho
     var age : Int = 29
     var height : Float = 1.75f
     var weight : Double = 70.5
     boolean kieu dung sai la co true hoac false
     var isMale : Boolean = true

     3. Cau dieu kien
     Bieu thuc so sanh :
     lon hon : a > b
     nho hon : a < b
     lon hon bang : a >= b ( a>b || a == b)
     nho hon bang : a <= b  ( a<b || a == b) => 1 trong 2 dung => true
     4. Toan tu logic
     1. &&  thoa tat ca dieu kien moi tra ve true
     2. ||  tat ca dieu kien ve false se tra ve true
     3. !   phu dinh cua dieu kien ( la dieu kien nguoc lai cua no )
     val a = 5
    val b = 10
    if(a>b){
        print("a lon b")
    }else if(a<b){
        print("a nho hon b")
    }else{
        print(" a bang b ")
    }
       println("Tiep tuc")



}
 // vi du 1 :
    val height = 1.67f
    val weight = 80f
    println("Nhập chiều cao của bạn (m): $height ");
    println("Nhập cân nặng của bạn (kg): $weight ");
    val bmi = weight / (height * height)
    if (bmi < 18.5) {
        println("Tình trạng cân nặng: Gầy\n");
    } else if (bmi < 24.9) {
        println("Tình trạng cân nặng: Bình thường\n");
    } else if (bmi < 30) {
        println("Tình trạng cân nặng: Thừa cân\n");
    } else if(bmi < 35) {
        println("Tình trạng cân nặng: Béo phì\n");
    }
    // TOAN TU 3 NGOI QUAN TRONG KOTLIN

    val height = 1.67f
    val weight = 80f
    val bmi = weight / (height * height)
    val message = if(bmi<18.5){
        "Tình trạng cân nặng: Thap "
    }
    else if(bmi<= 24.9){
        "binh thuong"
    }
    else{
        "Khong xac dinh "
    }
    4.Cau dieu kien (When giong switch )
     when(month) {
        in 1..3 ->{
            println("Quy 1")
        }
        in 4..6->{
            println("Quy 2")
        }
        in 7..9 -> {
            println("Ket qua")
            println("Quy 2 ")
        }
        in 10..12 -> {
            println("ket qua ")
            println("Quy 3 ")
        }

        5.Vong lap for (duyet du lieu trong 1 khoang),for chi duyet tu cai nay sang cai kia
        value : bien dem
        // Unitl : la nho hon
    // downTo : la nghich dao
    for (value in 1..100) {
        // in ra so chan , chia het cho 2 , % chia lay du
        if (value % 2 == 0) {
          //  println(value)
        }
        // in ra so le , khong chia het cho 2
        if(value % 2 != 0){
          //  println(value)
        }
        // so chia 3 du 1
        if(value % 3 == 1){
            println(value)
        }

    //so nguyen to
    // chia het cho 2
    // chia 1 va chinh no
    // kiem tra co lon hon 1 ko
        var number = 408
    var isPrime = true
    if(number <  2){
        println("Khong phai so nguyen to ")
    }
    else{
        for (value in 2..number)
        if (number % value == 0){
            // uoc thu 3 xuat hien ( ko phai so nguyen to )
            isPrime = false
        }
        if(isPrime){
            println("LA so nguyen to")
        }
        else{
            println("Ko phai so nguyen to")
        }
    }
    }
        // while : ko bit cach chay nhu the nao,ban co the duyet dc v..v
   // kt dieu kien
    var index = 0
    while (index<= 10){
        val tmpIndex = index
        index++
        if(index == 2){
            continue
        }
        println(index)
        index += 1
    }

     //tang ++ trc, moi bo qua vong lap nay : continue
    for (index in 0..10) { // index la gia tri bat dau tu 0 den 10
        // gan de xuat gia tri ban dau
        if (index == 2) {
            continue
        }
        println(index)
    }
    // TOAN TU : = + - / *
    var a = 10
    // c1
    a = a + 1
    //c2
    a += 1
    //c3
    a++
    //c4
    ++a

    var a = 10
    var b = 5
    var result = a-- + b-- + --b + a++ - --b + b-- + a--
               //10 +  5 +     3 + 9 -     2 + 2   + 10 = 37
    // a-- = 9
    // b-- = 4
    // --b = 3
    // a++ = 10
    // --b = 2
    // b-- = 1
    // a-- = 9
    // 9 + 4 + 3+ 10 - 3
    println(result)

    // LAP TRINH HUONG DOI TUONG (OOP)
    CLASS LA TAP THE
    OBIECT DOI TUONG CU THE -> KHOI TAO TU CLASS
    Instance : the hien
    solid : quy tac cua OOP


     */
    // khoi tao object
    // tao vung nho de luu tru du lieu
    var teo: Person = Person("Nguyen Van Teo",3,"Quan 10")
    teo.address = null
    teo.name = " Nguyen Van Teo"



}







