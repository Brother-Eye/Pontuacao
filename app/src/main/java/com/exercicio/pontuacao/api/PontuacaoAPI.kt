package com.exercicio.pontuacao.api

import com.exercicio.pontuacao.model.Pontuacao
import  retrofit2.Call
import retrofit2.http.Body
import  retrofit2.http.GET
import retrofit2.http.POST

interface PontuacaoAPI{

    @GET("/jokenpokemon/pontuacao")
    fun buscarPontos(): Call<List<Pontuacao>>

    @POST ("/jokenpokemon/pontuacao")
    fun enviarPontuacao(@Body pontuacao:Pontuacao): Call<Void>
}