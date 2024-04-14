package ai.codia.x.composeui.demo

import ai.codia.x.composeui.demo.ui.theme.CodiaDemoComposeUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by codia-figma
 */
@Composable
fun CodiaMainView() {
    // Box-801:2944-105. Forgot Password
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-801:2945-Input section
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 32.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .offset(x = 0.dp, y = 338.dp),
        ) {
            // Column-801:3839-Email
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Text-801:3840-Label
                Text(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(313.dp, 24.dp),
                    text = "Email Address",
                    color = Color(0xff191d23),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Row-801:3841-Input
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentWidth()
                        .height(48.dp)
                        .border(1.dp, Color(0xffd0d5dd), RoundedCornerShape(8.dp))
                        .padding(horizontal = 16.dp, vertical = 12.dp),
                ) {
                    // Text-I801:3841;801:3378-text
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(281.dp, 24.dp),
                        text = "hello@example.com",
                        color = Color(0xff928fa6),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Row-801:3843-Login/primary
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                    .size(312.dp, 48.dp)
                    .padding(horizontal = 12.dp, vertical = 16.dp),
            ) {
                // Text-I801:3843;801:3414-Label
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(160.dp),
                    text = "Password Reset",
                    color = Color(0xffffffff),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Image-801:2962-Back arrow
        Image(
            painter = painterResource(id = R.drawable.image1_8012962),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 63.dp)
                .padding(all = 8.dp),
        )
        // Text-801:2964-Create an account
        Text(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(x = 0.dp, y = 736.dp)
                .size(312.dp, 24.dp),
            text = "Create an account",
            color = Color(0xffec441e),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-801:3298-Android Status Bars
        Image(
            painter = painterResource(id = R.drawable.image2_8013298),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
        )
        // Column-801:3836-Header
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 170.dp),
        ) {
            // Text-I801:3836;801:3344-Login
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(313.dp),
                text = "Forgot Password?",
                color = Color(0xff191919),
                fontSize = 28.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-I801:3836;801:3345-Subtitle
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(313.dp),
                text = "Enter your email address to get the password reset link.",
                color = Color(0xff555555),
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodiaMainViewPreview() {
    CodiaDemoComposeUITheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            val scrollState = rememberScrollState()
            Column(modifier = Modifier.verticalScroll(scrollState)) {
                CodiaMainView()
            }
        }
    }
}
