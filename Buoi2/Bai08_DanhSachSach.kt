// Phạm Đức Trường - 25810048

fun main(){
    val sach = mutableListOf("Anh", "Otp", "Happi", "Sad", "2000")
    println("Sach ban dau: $sach")
    sach.add("sach thu 6")
    sach.add("sach thu 7")
    sach.remove("Otp")
    sach.sort()
    println("Sach da thay doi: $sach")
}
