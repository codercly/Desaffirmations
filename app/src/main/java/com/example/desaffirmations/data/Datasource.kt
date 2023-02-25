package com.example.desaffirmations.data

import com.example.desaffirmations.R
import com.example.desaffirmations.model.Desaffirmation
import javax.crypto.spec.DESedeKeySpec
/*
* nesse pacote é criado uma classe que prepra os dados para o app*/
class Datasource {
    // a função loadDesaffirmation retorna uma lista de Desaffirmation
    fun loadDesaffirmation():List<Desaffirmation>{
        return listOf<Desaffirmation>(
            Desaffirmation(R.string.desaffirmation1, R.drawable.image1),
            Desaffirmation(R.string.desaffirmation2, R.drawable.image2),
            Desaffirmation(R.string.desaffirmation3, R.drawable.image3),
            Desaffirmation(R.string.desaffirmation4, R.drawable.image4),
            Desaffirmation(R.string.desaffirmation5, R.drawable.image5),
            Desaffirmation(R.string.desaffirmation6, R.drawable.image6),
            Desaffirmation(R.string.desaffirmation7, R.drawable.image7),
            Desaffirmation(R.string.desaffirmation8, R.drawable.image8),
            Desaffirmation(R.string.desaffirmation9, R.drawable.image9),
            Desaffirmation(R.string.desaffirmation10, R.drawable.image10)
        )
    }
}