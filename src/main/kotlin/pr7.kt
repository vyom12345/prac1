fun main(){
    println("Enter the number")
    var num1 = readLine()!!.toInt()
    println("Factorial of $num1 is:${factor(num1)}")
}

fun factor(x:Int):Int{
    if(x == 0 || x==1){
        return 1
    }
    else{
        return (x*factor(x-1))
    }
}