package com.example.quizle.data

import com.example.quizle.data.model.Question

class QuizRepository {

    fun loadQuestions(): List<Question> {
        val questionList = listOf(
            Question("Leonardo DiCaprio", true),
            Question("Fabian Harloff", true),
            Question("Jason Statham", true),
            Question("Elyas M´Barek", true),
            Question("Jennifer Lawrence", true),
            Question("Emma Watson", true),
            Question("Tom Holland", true),
            Question("Gerard Butler", true),
            Question("Johnny Depp", true),
            Question("Tom Hardy", true),
            Question("Val Kilmer", true),
            Question("William Holden", true),
            Question("Burt Lancaster", true),
            Question("Naomi Ackie", true),
            Question("Fay Bainter", true),
            Question("Jean Arthur", true),
            Question("Anton Tschechow", false),
            Question("Inka Bach", false),
            Question("Achim Elfers", false),
            Question("Agatha Christie", false),
            Question("Hugo Greinz", false),
            Question("Andrea Gill", false),
            Question("Emma Adler", false),
            Question("Tacticus Aelianus", false),
            Question("William Harrison Ainsworth", false),
            Question("Marie Andree-Eysn", false),
            Question("Louise von Francois", false),
            Question("Théophile Gautier", false),
            Question("Alois Geistbeck", false),
            Question("Arvid Genetz", false),
            Question("Franz Harder", false),
            Question("Edward Ives", false)
        )

        return questionList.shuffled()

    }
}