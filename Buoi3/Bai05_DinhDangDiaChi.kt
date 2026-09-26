// Phạm Đức Trường - 25810048
fun dinhDangDiaChi(
    soNha: String,
    phuongXa: String,
    thanhPho: String = "Ho Chi Minh",
    quocGia: String = "Viet Nam",
    ghiChu: String = "Khong"
): String {
    return "$soNha, $phuongXa, $thanhPho, $quocGia (Ghi chu: $ghiChu)"
}


val diaChi1 = dinhDangDiaChi(
        "123 Le Duan",
        "Phuong Ben Nghe",
        ghiChu = "Giao gio hanh chinh"
    )

println(diaChi1)

