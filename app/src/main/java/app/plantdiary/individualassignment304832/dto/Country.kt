package app.plantdiary.individualassignment304832.dto
/**
 * Data transfer object class for country object
 */

import com.google.gson.annotations.SerializedName

data class Country (@SerializedName("Code") var code: String, @SerializedName("Name") var name: String){
    override fun toString(): String = name + " " + code
}

