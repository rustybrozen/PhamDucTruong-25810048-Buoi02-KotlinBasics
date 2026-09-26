// Phạm Đức Trường - 25810048
fun datBan(ten : String, sl : Int, loaiBan : String = "Ban thuong"){
    println("ten khach hang: $ten, so luong khach: $sl, loai ban: $loaiBan")
}
datBan("Truong", 200)
datBan("Hoa", 100, "ban vip")
datBan(loaiBan = "Ban cu", ten ="Phong", sl =50)
