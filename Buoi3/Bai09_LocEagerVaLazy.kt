// Phạm Đức Trường - 25810048
val nhacCu = listOf("piano", "violet", "saxophone")
val loc  = nhacCu.filter{ it[0] == 'p'  }
val locSeq = nhacCu.asSequence().filter{it[0] == 'p' }.toList()
println("loc thuong: $loc")
println("loc Sequence: $locSeq")

// dung seq cho du lieu lon, vi no se xu ly theo thu tu de dam bao
// bo nho khong bi day
