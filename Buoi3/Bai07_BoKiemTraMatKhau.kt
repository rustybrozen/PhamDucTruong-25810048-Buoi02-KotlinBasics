// Phạm Đức Trường - 25810048
val kiemTraDoDai: (String) -> Boolean = { it.length >= 8 }

val pass1 = "12345"
val pass2 = "pass1234"
val pass3 = "matKhauSieuDai2026"

println("1 ('$pass1'): " + kiemTraDoDai(pass1))
println("2 ('$pass2'): " + kiemTraDoDai(pass2))
println("3 ('$pass3'): " + kiemTraDoDai(pass3))

