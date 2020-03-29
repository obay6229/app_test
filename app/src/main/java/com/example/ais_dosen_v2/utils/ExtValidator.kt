package com.example.ais_dosen_v2.utils

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.example.ais_dosen_v2.utils.validation.validator
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.onTextChangeUsernameValidation(edtView: EditText) {
    edtView.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            this@onTextChangeUsernameValidation.checkUsernameValidation(edtView)
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }
    })
}

fun TextInputLayout.onTextChangePasswordValidation(edtView: EditText) {
    edtView.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(p0: Editable?) {
            this@onTextChangePasswordValidation.checkPasswordValidation(edtView)
        }

        override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }

        override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
        }
    })
}

fun TextInputLayout.checkPasswordValidation(edtView: EditText) {

    this.validator(edtView)
        .nonEmpty()
        .atleastOneNumber()
        .atleastOneUpperCase()
        .atleastOneLowerCase()
        .noSpecialCharacters()
        .minLength(8)
        .addErrorCallback {
            this.isPasswordVisibilityToggleEnabled = false
            this.error = it
        }
        .addSuccessCallback {
            this.isPasswordVisibilityToggleEnabled = true
            this.error = null
        }
        .check()
}

fun TextInputLayout.checkUsernameValidation(edtView: EditText) {

    this.validator(edtView)
        .nonEmpty()
        .minLength(13)
        .addErrorCallback {
            this.error = it
        }
        .addSuccessCallback {
            this.error = null
        }
        .check()
}