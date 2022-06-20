package app.plantdiary.individualassignment304832.dao

/**
 *
 * Interface for Country to be implemented
 *
 * @ICountryDao interface for Country
 */

import androidx.lifecycle.LiveData
import app.plantdiary.individualassignment304832.dto.Country
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ICountryDAO {
    @GET("/core/country-list/r/data.json")



    fun getAllCountries() : Call<ArrayList<Country>>

}
