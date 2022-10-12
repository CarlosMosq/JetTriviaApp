package com.company.jettriviaapp.domainLayer.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.company.jettriviaapp.domainLayer.component.Questions


@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()) {
    Questions(viewModel)

}