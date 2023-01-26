package com.example.quizle

import androidx.lifecycle.ViewModel
import com.example.quizle.data.QuizRepository
import com.example.quizle.data.model.Question

class QuizViewModel: ViewModel() {

    private val repository = QuizRepository()

    private val questions = repository.loadQuestions()

    private var _score = 0
    val score: Int
        get() = _score

    private var _currentQuestion = questions.random()
    val currentQuestion: Question
        get() = _currentQuestion

    fun checkAnswer(isActor : Boolean){
        if (isActor == currentQuestion.isActor){
            _score ++
            getNextQuestion()
        }


    }

    private fun getNextQuestion() {
        val nextQuestion = questions.random()

        if (nextQuestion == currentQuestion){
            getNextQuestion()
        }else {
            _currentQuestion = nextQuestion
        }

    }

    fun restartGame(){
        _score = 0
        getNextQuestion()

    }
}