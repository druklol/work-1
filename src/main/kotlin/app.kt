fun main(){
    print("Введите первое число:")
    var a:Int = readLine()!!.toInt()
    print("Введите второе число:")
    var b:Int= readLine()!!.toInt()
    a+=b
    b=a-b
    a-=b
    println("$a $b")
}