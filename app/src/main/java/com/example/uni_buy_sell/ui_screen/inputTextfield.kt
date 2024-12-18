package com.example.uni_buy_sell.ui_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uni_buy_sell.ui.theme.Pink80

@Composable
fun inputField(
    label: String,
    value: String,
    onValueChange: (String) -> Unit,
    imageVector: ImageVector
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 30.dp, end = 30.dp, top = 10.dp)
            .clip(shape = RoundedCornerShape(3.dp))


        ,
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },  // Uncomment and provide proper label
        singleLine = true,
        leadingIcon = {
            Icon(imageVector = imageVector, contentDescription = "person_icon")
        },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.Gray,
            unfocusedBorderColor = Color.Gray,
            cursorColor = Color.Transparent
        )
    )
}

@Composable
fun button(){

    Button(onClick = {

    },
        colors = ButtonDefaults.buttonColors(Color.Magenta),
        modifier = Modifier
            .padding(start = 30.dp, end = 30.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(corner = CornerSize(0.dp))),
        elevation = ButtonDefaults.buttonElevation(4.dp)
    ) {
        Text(text = "REGISTER",
            style = TextStyle(
                Color.Black,
                fontWeight = FontWeight.Bold
            )
        )

    }

}

@Preview
@Composable
fun TextFieldPreview() {
    inputField(
        label = "Name",
        value = "",
        onValueChange = {},
        imageVector = Icons.Default.Person
    )
}
@Preview
@Composable
fun buttonPreview(){
    button()
}