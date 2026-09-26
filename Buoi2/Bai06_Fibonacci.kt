// Phạm Đức Trường - 25810048
fun main(){
    var A : Int = 0
    var B : Int = 1
    var C : Int
    
    println("Vi tri 0: $A")
    println("Vi tri 1: $B")
    
    for (i in 2 until 100){
       
        C = A + B
        if (C >= 100) {break}
       println("Vi tri $i: $C")
        A = B
        B = C
        
    }

}

