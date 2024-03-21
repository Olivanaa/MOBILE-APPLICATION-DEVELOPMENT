package com.caiosilva.aula28fev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.caiosilva.aula28fev.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet : BottomSheetDialogFragment() {
    private lateinit var biding: FragmentBottomSheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        biding = FragmentBottomSheetBinding.inflate(inflater)

        biding.buttonDispensar.setOnClickListener{
            dismiss()
        }

        this.isCancelable = false

        return biding.root
    }

    companion object {
         fun newInstance(fragmentManager: FragmentManager) {
             return BottomSheet().show(fragmentManager, null) // vai retornar uma instancia nova do bottomsheet
         }
    }

}