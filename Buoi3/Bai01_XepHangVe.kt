// Phạm Đức Trường - 25810048
val tuoi : Int = 44
val loaiVe : (Int) -> String = {
    if (it in 1..20){
        "Ve tre em"
    } else if (it in 21..60){
        "Ve nguoi lon"
    } else if ( it in 61..100){
        "Ve cao tuoi"
    } else "Tuoi khong hop le"
}


println("Loai ve: ${loaiVe(tuoi)}")
