package com.example.quizle.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.quizle.QuizViewModel
import com.example.quizle.databinding.FragmentQuizBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class QuizFragment : Fragment() {

    private lateinit var binding: FragmentQuizBinding

    private val viewModel:QuizViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Todo Code

        upDateUi()


        binding.actorButton.setOnClickListener{
            viewModel.checkAnswer(true)
            upDateUi()
        }
        binding.writerButton.setOnClickListener {
            viewModel.checkAnswer(false)
            upDateUi()
        }
    }

    private fun upDateUi (){
        binding.scoreText.text = viewModel.score.toString()
        binding.questionText.text = viewModel.currentQuestion.name

        if(viewModel.score == 10 ){
            showEndDialog()
        }


    }
    private fun showEndDialog(){
        MaterialAlertDialogBuilder(requireContext())
            .setTitle("Sehr gut gemacht")
            .setMessage("Dein Wissen ist hervorragend ausgebildet")
            .setCancelable(false)
            .setNegativeButton("verlassen"){_,_ ->
                activity?.finish()
            }
            .setPositiveButton("Nochmal"){_,_ ->
                viewModel.restartGame()
                upDateUi()
            }
            .show()


    }
}