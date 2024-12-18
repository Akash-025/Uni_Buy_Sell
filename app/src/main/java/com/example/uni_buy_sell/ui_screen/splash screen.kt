package com.example.uni_buy_sell.ui_screen

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.uni_buy_sell.R
import com.example.uni_buy_sell.ui.theme.Pink80
import com.example.uni_buy_sell.ui.theme.Purple40

@Composable
fun showImage(){

    var username = remember {
        mutableStateOf("")
    }
    var password = remember {
        mutableStateOf("")
    }
    var email = remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Purple40)){

        Column(modifier = Modifier.fillMaxSize()) {

            Image(painter = painterResource(id = R.drawable.logo_project),
                contentDescription = "logo",
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .size(280.dp)
                ,
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            )

            Card(modifier = Modifier.padding(start = 10.dp,end = 10.dp,
                bottom = 180.dp).clip(shape = RoundedCornerShape(corner = CornerSize(20.dp))),
                elevation = CardDefaults.cardElevation(10.dp)
            ) {


                Surface(modifier = Modifier.fillMaxSize()) {


                    Column(modifier = Modifier.fillMaxSize()) {

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "WelCome",
                            style = TextStyle(
                                color = Pink80,
                                fontWeight = FontWeight.ExtraBold,
                                fontStyle = FontStyle.Italic,
                                fontSize = 32.sp,
                                textAlign = TextAlign.Center,
                            ),
                            modifier = Modifier.fillMaxWidth()
                        )

                        inputField(
                            label = "Username", value = "",
                            onValueChange = { username.value = it },
                            imageVector = Icons.Default.Person,
                        )
                        //Spacer(modifier = Modifier.width(40.dp))
                        inputField(label = "Email", value = "",
                            onValueChange = { email.value = it },
                            imageVector = Icons.Default.Email)
                        //Spacer(modifier = Modifier.width(40.dp))
                        inputField(
                            label = "Password", value = "",
                            onValueChange = { password.value = it },
                            imageVector = Icons.Default.Lock
                        )

                        Spacer(modifier = Modifier.height(20.dp))

                        button()



                    }


                }



            }






        }


    }

}

@Preview
@Composable
fun showImagePreview(){
    showImage()
}