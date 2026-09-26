// Phạm Đức Trường - 25810048

fun ghiNhatKy1(hanhDong: String): Unit {
    println("nhat ky: $hanhDong")
}


fun ghiNhatKy2(hanhDong: String) {
    println("nhat ky: $hanhDong")
}


ghiNhatKy1("hello")
ghiNhatKy2("hiii")

// 2 hàm này tương đương nhau vì, hàm thứ nhất có Unit nên ngườu đọc sẽ hiểu rõ là hàm này sẽ trả về gì, còn hàm 2 là không khai báo rõ, nhưng dòng kết thúc hàm là 1 giá trị ko trả về, nên kotlin tự động biên dịch và nhân nó là Unit lun
