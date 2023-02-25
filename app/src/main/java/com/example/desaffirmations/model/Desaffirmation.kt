package com.example.desaffirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
/*
* nesse pacote é criado uma instancia da classe de objeto de Desaffirmation
* que representa uma "Desaffirmation" que representa uma desaffirmação e uma imagem e contém o ID do recurso da string
* com a desafirmação e o ID de recurso da imagem da Desafirmação
*/
data class Desaffirmation (@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId : Int)
//adicionando <data> antes da classe transforma a classe em uma classe de dados