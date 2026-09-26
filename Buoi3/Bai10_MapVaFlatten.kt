// Phạm Đức Trường - 25810048
val soNguyen  = listOf(2,7,34,8,0,123,53,5,84,234)
val nhanSoNguyen = soNguyen.map{ it * 2}
println(nhanSoNguyen)
val soNguyenCon = listOf(listOf(2,4), listOf(8,123,8), listOf(1234,664))
val flattenSoNguyen = soNguyenCon.flatten()
println(flattenSoNguyen)
