package com.company.jettriviaapp.dataLayer.network

import com.company.jettriviaapp.dataLayer.model.Question
import com.company.jettriviaapp.util.Constants
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET(Constants.TARGET_API_URL)
    suspend fun getAllQuestions(): Question
}