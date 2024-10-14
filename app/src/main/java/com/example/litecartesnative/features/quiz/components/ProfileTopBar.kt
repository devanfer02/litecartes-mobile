package com.example.litecartesnative.features.quiz.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.litecartesnative.R
import com.example.litecartesnative.ui.theme.LitecartesColor
import com.example.litecartesnative.ui.theme.nunitosFontFamily

@Composable
fun ProfileTopBar() {
    Box(
        modifier = Modifier
            .background(LitecartesColor.Secondary)
            .padding(18.dp)
            .fillMaxWidth()
    ) {
        Row {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(18.dp))
                    .shadow(
                        elevation = 20.dp,
                        shape = RoundedCornerShape(18.dp),
                        clip = false
                    )
                    .background(LitecartesColor.Primary),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.template_profile),
                    contentDescription = "profile image",
                    modifier = Modifier
                        .height(80.dp)
                        .aspectRatio(1f)
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
            ) {
                Text(
                    text = "Maudy Ayunda",
                    fontFamily = nunitosFontFamily,
                    color = LitecartesColor.Surface,
                    fontWeight = FontWeight.Bold,
                    fontSize =18.sp
                )
                Text(
                    text = "SMAN 1 Kota Bogor",
                    fontFamily = nunitosFontFamily,
                    color = LitecartesColor.Surface,
                    fontWeight = FontWeight.SemiBold,
                )
            }
            Column {
                Row {
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                    ) {
                        Text(
                            text = "250",
                            fontFamily = nunitosFontFamily,
                            color = LitecartesColor.Secondary,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                    Box(
                        modifier = Modifier
                            .background(LitecartesColor.Surface)
                    ) {
                        Text(
                            text = "150",
                            fontFamily = nunitosFontFamily,
                            color = LitecartesColor.Secondary,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .background(LitecartesColor.Surface),

                ) {
                    Text(
                        text = "Voyager",
                        fontFamily = nunitosFontFamily,
                        color = LitecartesColor.Secondary,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewProfileTopBar() {
    ProfileTopBar()
}