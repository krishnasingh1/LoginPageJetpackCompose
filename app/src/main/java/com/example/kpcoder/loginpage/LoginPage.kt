package com.example.kpcoder.loginpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun LoginPage() {
    // now we will create the two variables foe email and password
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    // we can also an background to the app using colours using gradients

    // first we will create a column for the layout
    Column(modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .background(
            // here in the list you can add hex of various colors
            brush = Brush.linearGradient(listOf(Color(0xfFB7BA2)))
        ), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        // now we will create a textfield for the email and password
        // we will also create text label

        // we will use Textfield instead of basic one
        Text(text = "Emaail", modifier = androidx.compose.ui.Modifier.padding(start = 25.dp))
        BasicTextField(
            value = email,
            onValueChange = { email = it},
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(15.dp),
            singleLine = true
        )
        Text(text = "Password", modifier = androidx.compose.ui.Modifier.padding(start = 25.dp))
        BasicTextField(
            value = password,
            onValueChange = { password = it},
            modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(15.dp)
        )
        Spacer(modifier = androidx.compose.ui.Modifier.height(10.dp))
        Button(onClick = {
                // add your action for button click
        }) {
            Text(text = "Login")
        }

    }
}