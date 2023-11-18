package com.example.dc

import android.graphics.Paint.Style
import android.graphics.fonts.FontStyle
import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = Brush.linearGradient(listOf(Color.Black, Color.DarkGray))),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = stringResource(id = R.string.fatigue),
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
            )
        Text(text = stringResource(id = R.string.test),
            color = Color.White,
            fontSize = 50.sp,
            fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline,
            modifier = Modifier.padding(bottom = 100.dp)
        )
        Button(shape = CutCornerShape(topStart = 10.dp, bottomEnd = 20.dp ), elevation = ButtonDefaults.buttonElevation(
            pressedElevation = 20.dp,
            defaultElevation = 20.dp
        ) ,onClick = { /*TODO*/ } ,
            border = BorderStroke(5.dp, brush = Brush.horizontalGradient(
            listOf(Color.White,Color.Cyan)
        ))) {
            Text(text = "START", color = Color.White, fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()
}