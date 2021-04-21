package id.ac.unhas.infocovid19.model

//URL JSON : https://api.kawalcorona.com/indonesia/provinsi
class DataProvinsi : ArrayList<DataProvinsiItem>()

data class DataProvinsiItem(
    val attributes: Provinsi?
)

data class Provinsi(
    val FID: Int?,
    val Kasus_Meni: Int?,
    val Kasus_Posi: Int?,
    val Kasus_Semb: Int?,
    val Kode_Provi: Int?,
    val Provinsi: String?
)

/**
data class DataProvinsi(
    val data: List<Provinsi?>?
){
    override fun toString(): String {
        var stringOutput = ""
        data?.forEach{
            stringOutput += it.toString()
        }
        return stringOutput
    }
}

data class Provinsi(
    val provinsi: String?,
    val kasus: Int?,
    val dirawat: Int?,
    val sembuh: Int?,
    val meninggal: Int?
){
    override fun toString(): String {
        return "Provinsi ${this.provinsi}[kode: ${this.provinsi}, #positif: ${this.kasus}, #meninggal: ${this.meninggal}, #sembuh:${this.sembuh}]"
    }
}
 */