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
    // Box-801:2437-107. Signup
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-801:2438-Input section
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 180.dp),
        ) {
            // Column-801:2439-Login
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Column-801:2440-Input
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-801:3894-Email
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-801:3895-Label
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(313.dp, 24.dp),
                            text = "Name",
                            color = Color(0xff191d23),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Row-801:3896-Input
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
                            // Text-I801:3896;801:3378-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .size(281.dp, 24.dp),
                                text = "John Doe",
                                color = Color(0xff999999),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-801:3890-Email
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-801:3891-Label
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
                        // Row-801:3892-Input
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
                            // Text-I801:3892;801:3378-text
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
                    // Column-801:3898-Email
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-801:3899-Label
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(313.dp, 24.dp),
                            text = "Password",
                            color = Color(0xff191d23),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Row-801:3900-Input
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
                            // Text-I801:3900;801:3366-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .size(233.dp, 24.dp),
                                text = "●●●●●●●●●●●●●●",
                                color = Color(0xff999da3),
                                fontSize = 4.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Image-I801:3900;801:3367-Icon/eye
                            Image(
                                painter = painterResource(id = R.drawable.image_I80139008013367),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .size(24.dp, 24.dp)
                                    .clipToBounds(),
                            )
                        }
                    }
                }
                // Column-801:2451-Button
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Text-801:2452-By continuing, you agree to our terms of service.
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(313.dp),
                        text = "By continuing, you agree to our terms of service.",
                        color = Color(0xff4b5768),
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Row-801:3906-Login/primary
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                            .size(312.dp, 48.dp)
                            .padding(horizontal = 12.dp, vertical = 16.dp),
                    ) {
                        // Text-I801:3906;801:3414-Label
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(160.dp),
                            text = "Sign up",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Column-801:2454-Devider
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Empty-801:2455-Line 10
                Box(
                    modifier = Modifier
                        .offset(x = -139.dp, y = 18.dp)
                        .size(342.dp, 1.dp)
                        .border(0.5.dp, Color(0xff4b5768)),
                )
                // Row-801:2456-Sign in with
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize()
                        .background(Color(0xffffffff))
                        .padding(all = 8.dp),
                ) {
                    // Text-801:2457-or
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(48.dp),
                        text = "or",
                        color = Color(0xff999da3),
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Row-801:3908-Login/secondary
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color(0xffe4e6ea), RoundedCornerShape(8.dp))
                    .size(312.dp, 48.dp)
                    .padding(horizontal = 54.dp, vertical = 12.dp),
            ) {
                // Image-I801:3908;801:3408-Google
                Image(
                    painter = painterResource(id = R.drawable.image_I80139088013408),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I801:3908;801:3409-Continue with Google
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize(),
                    text = "Continue with Google",
                    color = Color(0xff4b5768),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Text-801:2469-Already have an account? Sign in here
        Text(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 24.dp, y = 736.dp)
                .size(312.dp, 24.dp),
            text = "Already have an account? Sign in here",
            color = Color(0xffec441e),
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
        )
        // Image-801:3328-Android Status Bars
        Image(
            painter = painterResource(id = R.drawable.image_8013328),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
        )
        // Column-801:3937-Header
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .offset(x = 0.dp, y = 92.dp),
        ) {
            // Text-I801:3937;801:3344-Login
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(313.dp),
                text = "Create an Account",
                color = Color(0xff191919),
                fontSize = 28.sp,
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