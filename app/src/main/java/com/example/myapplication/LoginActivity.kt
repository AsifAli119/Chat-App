package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnNoAct: TextView
    private lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialize the firebase
        mAuth = FirebaseAuth.getInstance()

        setContentView(R.layout.activity_login)
        edtEmail = findViewById(R.id.edtEmail)
        edtPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.loginBtn)
        btnNoAct = findViewById(R.id.createAct)
        supportActionBar?.hide();
        btnNoAct.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener{
            val email = edtEmail.text.toString()
            val password = edtPassword.text.toString()
            login(email,password)
        }
    }
    private fun login(email:String, password:String){
       //logic for login the user
        mAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    finish()
                    startActivity(intent)

                } else {
                    // If sign in fails, display a message to the user.
                 Toast.makeText(
                     this@LoginActivity,
                 "User does not exist",
                     Toast.LENGTH_SHORT
                 ).show()
                }
            }
    }
    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth.currentUser
        if (currentUser != null) {
            reload()
        }
    }

    private fun reload() {
        val intent = Intent(this@LoginActivity, MainActivity::class.java )
        finish()
        startActivity(intent)
    }
}