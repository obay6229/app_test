package com.example.ais_dosen_v2.utils.validation

import android.widget.EditText
import com.google.android.material.textfield.TextInputLayout
import com.wajahatkarim3.easyvalidation.core.Validator

fun TextInputLayout.validator(editText : EditText?) : Validator
{
    return Validator(editText?.text.toString())
}

fun TextInputLayout.nonEmpty() : Boolean
{
    return validator(editText).nonEmpty().check()
}

fun TextInputLayout.nonEmpty(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).nonEmpty()
        .addErrorCallback {
            callback.invoke(it)
        }
        .check()
}

fun TextInputLayout.minLength(minLength: Int) : Boolean
{
    return validator(editText)
        .minLength(minLength)
        .check()
}

fun TextInputLayout.minLength(minLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).minLength(minLength)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.maxLength(maxLength: Int) : Boolean
{
    return validator(editText).maxLength(maxLength).check()
}

fun TextInputLayout.maxLength(maxLength: Int, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).maxLength(maxLength)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validEmail() : Boolean
{
    return validator(editText).validEmail().check()
}

fun TextInputLayout.validEmail(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).validEmail()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validNumber() : Boolean
{
    return validator(editText).validNumber().check()
}

fun TextInputLayout.validNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).validNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThan(number: Number) : Boolean
{
    return validator(editText).greaterThan(number).check()
}

fun TextInputLayout.greaterThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).greaterThan(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.greaterThanOrEqual(number: Number) : Boolean
{
    return validator(editText).greaterThanOrEqual(number).check()
}

fun TextInputLayout.greaterThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).greaterThanOrEqual(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThan(number: Number) : Boolean
{
    return validator(editText).lessThan(number).check()
}

fun TextInputLayout.lessThan(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).lessThan(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.lessThanOrEqual(number: Number) : Boolean
{
    return validator(editText).lessThanOrEqual(number).check()
}

fun TextInputLayout.lessThanOrEqual(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).lessThanOrEqual(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.numberEqualTo(number: Number) : Boolean
{
    return validator(editText).numberEqualTo(number).check()
}

fun TextInputLayout.numberEqualTo(number: Number, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).numberEqualTo(number)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allUperCase() : Boolean
{
    return validator(editText).allUpperCase().check()
}

fun TextInputLayout.allUperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).allUpperCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.allLowerCase() : Boolean
{
    return validator(editText).allLowerCase().check()
}

fun TextInputLayout.allLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).allLowerCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atleastOneUpperCase() : Boolean
{
    return validator(editText).atleastOneUpperCase().check()
}

fun TextInputLayout.atleastOneUpperCase(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).atleastOneUpperCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atleastOneLowerCase() : Boolean
{
    return validator(editText).atleastOneLowerCase().check()
}

fun TextInputLayout.atleastOneLowerCase(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).atleastOneLowerCase()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atleastOneNumber() : Boolean
{
    return validator(editText).atleastOneNumber().check()
}

fun TextInputLayout.atleastOneNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).atleastOneNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNumber() : Boolean
{
    return validator(editText).startWithNumber().check()
}

fun TextInputLayout.startWithNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).startWithNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startWithNonNumber() : Boolean
{
    return validator(editText).startWithNonNumber().check()
}

fun TextInputLayout.startWithNonNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).startWithNonNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noNumbers() : Boolean
{
    return validator(editText).noNumbers().check()
}

fun TextInputLayout.noNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).noNumbers()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.onlyNumbers() : Boolean
{
    return validator(editText).onlyNumbers().check()
}

fun TextInputLayout.onlyNumbers(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).onlyNumbers()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.noSpecialCharacters() : Boolean
{
    return validator(editText).noSpecialCharacters().check()
}

fun TextInputLayout.noSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).noSpecialCharacters()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.atleastOneSpecialCharacters() : Boolean
{
    return validator(editText).atleastOneSpecialCharacters().check()
}

fun TextInputLayout.atleastOneSpecialCharacters(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).atleastOneSpecialCharacters()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textEqualTo(target: String) : Boolean
{
    return validator(editText).textEqualTo(target).check()
}

fun TextInputLayout.textEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).textEqualTo(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.textNotEqualTo(target: String) : Boolean
{
    return validator(editText).textNotEqualTo(target).check()
}

fun TextInputLayout.textNotEqualTo(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).textNotEqualTo(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.startsWith(target: String) : Boolean
{
    return validator(editText).startsWith(target).check()
}

fun TextInputLayout.startsWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).startsWith(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.endssWith(target: String) : Boolean
{
    return validator(editText).endsWith(target).check()
}

fun TextInputLayout.endssWith(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).endsWith(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.contains(target: String) : Boolean
{
    return validator(editText).contains(target).check()
}

fun TextInputLayout.contains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).contains(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.notContains(target: String) : Boolean
{
    return validator(editText).notContains(target).check()
}

fun TextInputLayout.notContains(target: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).notContains(target)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumber() : Boolean
{
    return validator(editText).creditCardNumber().check()
}

fun TextInputLayout.creditCardNumber(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).creditCardNumber()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithSpaces() : Boolean
{
    return validator(editText).creditCardNumberWithSpaces().check()
}

fun TextInputLayout.creditCardNumberWithSpaces(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).creditCardNumberWithSpaces()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.creditCardNumberWithDashes() : Boolean
{
    return validator(editText).creditCardNumberWithDashes().check()
}

fun TextInputLayout.creditCardNumberWithDashes(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).creditCardNumberWithDashes()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.validUrl() : Boolean
{
    return validator(editText).validUrl().check()
}

fun TextInputLayout.validUrl(callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).validUrl()
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}

fun TextInputLayout.regex(pattern: String) : Boolean
{
    return validator(editText).regex(pattern).check()
}

fun TextInputLayout.regex(pattern: String, callback: (message: String) -> Unit) : Boolean
{
    return validator(editText).regex(pattern)
        .addErrorCallback {
            callback.invoke(it)
        }.check()
}