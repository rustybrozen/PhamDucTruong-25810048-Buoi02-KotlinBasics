// Phạm Đức Trường - 25810048

fun main(){
    val sach = arrayOf(9.2,8.5,4.5,6.7,5.5,8.9,4.5,6.2,4.5,5.6)
    var min : Double = sach[0]
    var max : Double = sach[0]
    var tong : Double = 0.0
    
    for (s in sach){
        tong += s
        if (max < s){
            max = s
        }
        if (min > s){
            min =s 
        }
    }
    
    println("Cao nhat: $max")
    println("Thap nhat: $min")
    println("TB: ${tong / sach.size}")
}
