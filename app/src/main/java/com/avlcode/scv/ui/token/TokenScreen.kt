package com.avlcode.scv.ui.token

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.PaddingValues
import com.avlcode.scv.ui.theme.BackgroundColor
import com.avlcode.scv.ui.theme.CardColor
import com.avlcode.scv.ui.theme.ButtonColor
import com.avlcode.scv.ui.theme.WhiteColor

@Composable
fun TokenScreen(modifier: Modifier = Modifier) {

    var token by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = CardColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(32.dp)
        ) {

            Text(
                text = "Digite sua",
                color = Color.LightGray,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "chave de acesso",
                color = ButtonColor,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(32.dp))

            OutlinedTextField(
                value = token,
                onValueChange = { token = it },
                placeholder = {
                    Text(
                        text = "Cole seu token aqui",
                        color = Color.Gray,
                        fontSize = 18.sp
                    )
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedContainerColor = WhiteColor,
                    unfocusedContainerColor = WhiteColor,
                    focusedTextColor = Color.Black,
                    unfocusedTextColor = Color.Black,
                    focusedBorderColor = Color.Gray,
                    unfocusedBorderColor = Color.Gray
                )
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = {
                    // futuramente
                },
                enabled = token.isNotBlank(),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(20.dp),
                contentPadding = PaddingValues(
                    horizontal = 30.dp,
                    vertical = 12.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = ButtonColor,
                    contentColor = WhiteColor,
                    disabledContainerColor = ButtonColor.copy(alpha = 0.5f),
                    disabledContentColor = WhiteColor
                )
            ) {
                Text(
                    text = "Entrar",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}