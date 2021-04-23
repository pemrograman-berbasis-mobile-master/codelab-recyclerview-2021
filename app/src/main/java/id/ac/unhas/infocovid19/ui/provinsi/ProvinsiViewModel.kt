package id.ac.unhas.infocovid19.ui.provinsi

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.ac.unhas.infocovid19.model.DataProvinsiItem
import id.ac.unhas.infocovid19.model.Provinsi

class ProvinsiViewModel(
    private val repository: ProvinsiRepository
) : ViewModel() {
    private var _provinsis = ArrayList<Provinsi>()
    val provinsis:ArrayList<Provinsi>
        get() = _provinsis

    fun getProvinsisFromRepo(): MutableLiveData<ArrayList<DataProvinsiItem>> {
        return repository.getProvinsiFromApi()
    }

    override fun onCleared() {
        super.onCleared()
        _provinsis.clear()
    }
}
