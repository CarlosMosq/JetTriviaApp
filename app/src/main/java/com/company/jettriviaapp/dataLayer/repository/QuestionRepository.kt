package com.company.jettriviaapp.dataLayer.repository

import android.util.Log
import com.company.jettriviaapp.dataLayer.data.DataOrException
import com.company.jettriviaapp.dataLayer.model.QuestionItem
import com.company.jettriviaapp.dataLayer.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>,
            Boolean,
            Exception>()

    suspend fun getAllQuestions() : DataOrException<ArrayList<QuestionItem>,
            Boolean,
            Exception> {
        try {
            dataOrException.loading = true
            dataOrException.data = api.getAllQuestions()
            if(dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false
        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("DATALoadError", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }

}