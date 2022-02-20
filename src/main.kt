fun main(){
greeting ("judy")
division (22,5)
    add (4,7,9,10)
    interest("smiling")

}
fun greeting (name:String) {
    println("Hello $name")

}
fun division (a:Int,b:Int):Int{
    var modulus =a%b
  return modulus

    }
fun add (a:Int,b:Int,c:Int,d:Int):Int{
    var sum =a+b+c+d
    return sum
}
fun interest(interest:String){
     println(interest)
}