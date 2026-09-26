// Phạm Đức Trường - 25810048
fun xuLyVanBan(chuoi : String, hanhDong : (String) -> String) : String {
    return hanhDong(chuoi)
}

fun tienTo(s :String) : String{
    return s
}

val soMot = xuLyVanBan("Truong", {it.uppercase()})
val soHai = xuLyVanBan("Truong", ::tienTo)
val soBa = xuLyVanBan("Truong"){
    "Xin chao, $it"
}

println("$soMot, $soHai, $soBa")
