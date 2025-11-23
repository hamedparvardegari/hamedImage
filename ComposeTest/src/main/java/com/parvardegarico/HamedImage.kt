package com.parvardegarico

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

@Composable
fun HamedImage(modifier: Modifier,painter: Painter,contentDescription:String?=null){
    Image(modifier = modifier, painter = painter, contentDescription = contentDescription)
}