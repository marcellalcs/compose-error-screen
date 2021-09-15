package com.ifood.errordefault.ui.composables

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.ifood.errordefault.ui.theme.*

@Composable
fun ErrorScreen(
    imageResourceId: Int,
    title: String,
    subtitle: String,
    buttonLabel: String,
    buttonAction: () -> Unit
) {
    Column(
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(SpacingLevel5)
    ) {
        Column(
            Modifier
                .fillMaxWidth()
                .weight(3f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            CenterIllustration(imageResourceId)

        }
        Column(
            Modifier
                .fillMaxWidth()
                .weight(2f),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CenterTitle(content = title)
            CenterSubtitle(content = subtitle)
        }
        Column(
            Modifier
                .fillMaxWidth()
                .weight(1f),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ActionButton(buttonLabel, buttonAction)
        }
    }
}

@Composable
fun ActionButton(label: String, action: () -> Unit) {
    Button(
        onClick = action,
        Modifier
            .fillMaxWidth()
    ) {
        Text(label)
    }
}

@Composable
fun CenterSubtitle(content: String) {
    Text(
        text = content,
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier.padding(top = SpacingLevel5))
}

@Composable
fun CenterTitle(content: String){
    Text(
        text = content,
        style = MaterialTheme.typography.h2,
        modifier = Modifier.padding(top = SpacingLevel5)
    )
}

@Composable
fun CenterIllustration(@DrawableRes resourceId: Int) {
    val image = painterResource(id = resourceId)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.sizeIn(maxHeight = SizeDefault)
    )

}