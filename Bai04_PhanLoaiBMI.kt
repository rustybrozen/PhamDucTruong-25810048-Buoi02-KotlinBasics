// Phạm Đức Trường - 25810048

fun main(){
    val canNang : Double = 66.5
    val chieuCao : Double = 1.75
    val chiSoCoThe : Double = canNang / (chieuCao * chieuCao)

    
    if (chiSoCoThe > 25){
        println("Beo phi, $chiSoCoThe")
    } else if (chiSoCoThe >23){
        println("Thua can, $chiSoCoThe")
    } else if (chiSoCoThe >21){
        println("binh thuong, $chiSoCoThe")
    }else{
        println("gay, $chiSoCoThe")
    }
   

 
}
