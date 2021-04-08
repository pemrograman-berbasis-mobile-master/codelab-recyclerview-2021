package id.ac.unhas.infocovid19.model

class DataProvinsi : ArrayList<Provinsi>()

data class Provinsi(
    val dirawat: Int?,
    val kasus: Int?,
    val meninggal: Int?,
    val provinsi: String?,
    val sembuh: Int?
)
