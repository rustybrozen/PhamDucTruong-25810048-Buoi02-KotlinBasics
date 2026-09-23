// Phạm Đức Trường - 25810048
fun main(){
    val tb : Double = 7.5
    
    when (tb){
        in 9.0..10.0 -> println("Xuat sac")
        in 8.0..8.9 -> println("Gioi")
        in 7.0..7.9 -> println("Kha")
        in 5.0..6.9 -> println("trung binh")
        in 0.0..4.9 -> println("yeu")
        else -> println("Diem trung binh khong hop le")
    }
   

 
}

