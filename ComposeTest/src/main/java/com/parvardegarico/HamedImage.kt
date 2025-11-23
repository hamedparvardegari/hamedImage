package com.parvardegarico

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun HamedImage(modifier: Modifier,imageId: Int,contentDescription:String?=null){
    Image(modifier = modifier, painter = painterResource(imageId), contentDescription = contentDescription)
}