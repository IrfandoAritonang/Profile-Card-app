package com.example.profilecardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilecardapp.ui.theme.ProfileCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NameCardApp()
                }
            }
        }
    }
}

@Composable
fun NameCardApp() {
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.green)),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ){
            Column(
                modifier = Modifier
                    .padding(top = 200.dp),
                horizontalAlignment = Alignment.CenterHorizontally
                //verticalArrangement = Arrangement.Center
            ) {
                val image = painterResource(R.drawable.android_logo_baru)
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .height(160.dp)
                        .width(160.dp)
                )
                Text(
                    text = stringResource(R.string.irfando_aritonang),
                    modifier = Modifier
                        .padding(top = 12.dp),
                    fontSize = 36.sp
                )
                Text(
                    text = stringResource(R.string.title),
                    fontWeight = FontWeight.Bold,
                    //color = Color.Green
                    style = TextStyle(color = colorResource(R.color.green_dark)),
                    fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier
                    .padding(top = 240.dp)
                    .padding(start = 20.dp),
                horizontalAlignment = Alignment.Start
                //verticalArrangement = Arrangement.Center
            ) {
                Row (modifier = Modifier
                    .padding(bottom = 5.dp))
                {
                    Image(
                        painter = painterResource(R.drawable.whatsapp_100),
                        contentDescription = null,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(
                        text = stringResource(R.string.no_Hp),
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp),
                        fontSize = 16.sp,
                    )
                }
                Row (modifier = Modifier
                    .padding(bottom = 5.dp))
                {
                    Image(
                        painter = painterResource(R.drawable.instagram_100),
                        contentDescription = null,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(
                        text = stringResource(R.string.instagram),
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp),
                        fontSize = 16.sp,
                    )
                }
                Row (modifier = Modifier
                    .padding(bottom = 5.dp))
                {
                    Image(
                        painter = painterResource(R.drawable.email_100),
                        contentDescription = null,
                        modifier = Modifier
                            .height(30.dp)
                            .width(30.dp)
                    )
                    Text(
                        text = stringResource(R.string.email),
                        modifier = Modifier
                            .padding(top = 5.dp)
                            .padding(start = 10.dp),
                        fontSize = 16.sp,
                    )
                }
            }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileCardAppTheme {
        NameCardApp()
    }
}