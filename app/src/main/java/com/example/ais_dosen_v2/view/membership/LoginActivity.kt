package com.example.ais_dosen_v2.view.membership

import android.app.Dialog
import android.app.ProgressDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.ais_dosen_v2.BuildConfig
import com.example.ais_dosen_v2.R
import com.example.ais_dosen_v2.utils.*
import com.example.ais_dosen_v2.utils.base.pref.PrefManager
import com.example.ais_dosen_v2.utils.base.viewmodel.Result
import com.example.ais_dosen_v2.utils.key.UserPreferenceKey
import com.example.ais_dosen_v2.view.main.MainActivity
import com.example.ais_dosen_v2.viewmodel.MembershipViewModel
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.layout_login_help.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity : AppCompatActivity() {

    private val membershipViewModel: MembershipViewModel by viewModel()

    private val preferenceManager: PrefManager by inject()

    private var isRadioSelected = false
    private lateinit var dialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (BuildConfig.DEBUG) {
            edtUsername.setText("hakiem")
            edtPassword.setText("Contoh123")
        }

        membershipViewModel.login.observe(this, Observer {
            when (it) {
                is Result.Default -> {
                }
                is Result.Empty -> {
                }
                is Result.Failure -> {
                    toast(it.message.toString())

                    dialog.dismiss()
                }
                is Result.Success -> {
                    dialog.dismiss()

                    startActivity<MainActivity>()

                    preferenceManager.saveString(UserPreferenceKey.TOKEN, it.data.token)
                }
            }
        })

//        tvForgetPassword.setOnClickListener {
//            startActivity<ResetPassActivity>()
//        }

        radioLogin.setOnClickListener {
            isRadioSelected = !isRadioSelected
            radioLogin.isChecked = isRadioSelected
        }

        tilUsername.onTextChangeUsernameValidation(edtUsername)
        tilPassword.onTextChangePasswordValidation(edtPassword)

        btnLogin.setOnClickListener {
            tilUsername.checkUsernameValidation(edtUsername)
            tilPassword.checkPasswordValidation(edtPassword)
            when {
                tilUsername.error != null -> edtUsername.requestFocus()
                tilPassword.error != null -> edtPassword.requestFocus()
                else -> {
                    dialog = ProgressDialog.show(
                        this,
                        emptyString(),
                        getString(R.string.message_please_wait),
                        true
                    )
                    membershipViewModel.getLogin(
                        edtUsername.text.toString(),
                        1235.toString()
                    )
                }
            }
        }

        val dialog = Dialog(this)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(R.layout.layout_login_help)
        dialog.setCancelable(false)

        btnHelp.setOnClickListener {
            dialog.show()
            dialog.btnOkHelp.setOnClickListener {
                dialog.dismiss()
            }
        }
    }


}
