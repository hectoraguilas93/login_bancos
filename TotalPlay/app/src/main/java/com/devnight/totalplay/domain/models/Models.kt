package com.devnight.totalplay.domain.models

import com.google.gson.annotations.SerializedName

class Models {


    data class ClientModel(
        @SerializedName("user")
        var usuario: String = "",
        @SerializedName("password")
        var password: String = ""
    )


    data class ResponseClient(
        @SerializedName("session")
        var session: String = ""
    )



    data class ResponseReferencias(
        @SerializedName("status")
        var status: Int,
        @SerializedName("arrayReferences")
        var referencias: List<ModelReferencias>
    )

   data class ModelReferencias(
    @SerializedName("aliasbank")
    var aliasbank: String,
    @SerializedName("bank")
    var bank: String,
    @SerializedName("images")
    var images: List<Image>,
    @SerializedName("reference")
    var reference: String
)

data class Image(
    @SerializedName("url3X3")
    var url3X3: String,
    @SerializedName("url4X4")
    var url4X4: String,
    @SerializedName("url5X5")
    var url5X5: String,
    @SerializedName("url6X6")
    var url6X6: String,
    @SerializedName("url7X7")
    var url7X7: String
)
}