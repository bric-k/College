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
    // Box-801:2850-102. Email login
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-801:2861-Input
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 236.dp),
        ) {
            // Row-801:2862-Header
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-801:3813-Email
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(46.dp, 36.dp),
                ) {
                    // Text-I801:3813;801:3348-Email
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .offset(x = 0.5.dp, y = 0.dp),
                        text = "Email",
                        color = Color(0xffec441e),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Empty-I801:3813;801:3349-Rectangle 1
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                            .size(24.dp, 2.dp),
                    )
                }
                // Column-801:3816-Email
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(129.dp, 36.dp),
                ) {
                    // Text-I801:3816;801:3356-Phone Number
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .offset(x = 0.5.dp, y = 0.dp),
                        text = "Phone Number",
                        color = Color(0xff555555),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Column-801:2865-Input section
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-801:2866-Login
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Column-801:2867-Input
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-801:2868-Email
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Text-801:2869-Label
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
                            // Row-801:3592-Input
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
                                // Text-I801:3592;801:3378-text
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
                        // Column-801:2871-Password
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Row-801:2872-Header
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Text-801:2873-Label
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(147.dp, 24.dp),
                                    text = "Password",
                                    color = Color(0xff191d23),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                // Text-801:2874-Right text
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(163.dp),
                                    text = "Forgot Password?",
                                    color = Color(0xffec441e),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Right,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            // Row-801:3594-Input
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
                                // Text-I801:3594;801:3366-text
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
                                // Image-I801:3594;801:3367-Icon/eye
                                Image(
                                    painter = painterResource(id = R.drawable.image_I80135948013367),
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
                    // Column-801:2876-Button
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-801:2877-Remind me
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Image-I801:2877;18:2201-Tick
                            Image(
                                painter = painterResource(id = R.drawable.image_I8012877182201),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp),
                            )
                            // Text-I801:2877;18:2202-Keep me signed in
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(229.dp),
                                text = "Keep me signed in",
                                color = Color(0xff191d23),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Row-801:3600-Login/primary
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                                .size(312.dp, 48.dp)
                                .padding(horizontal = 12.dp, vertical = 16.dp),
                        ) {
                            // Text-I801:3600;801:3414-Label
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(160.dp),
                                text = "Login",
                                color = Color(0xffffffff),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Column-801:2879-Devider
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Empty-801:2880-Line 10
                    Box(
                        modifier = Modifier
                            .offset(x = -107.dp, y = 18.dp)
                            .size(342.dp, 1.dp)
                            .border(0.5.dp, Color(0xff4b5768)),
                    )
                    // Row-801:2881-Sign in with
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .background(Color(0xffffffff))
                            .padding(all = 8.dp),
                    ) {
                        // Text-801:2882-or sign in with
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(112.dp),
                            text = "or sign in with",
                            color = Color(0xff999da3),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-801:3602-Login/secondary
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .background(Color(0xffe4e6ea), RoundedCornerShape(8.dp))
                        .size(312.dp, 48.dp)
                        .padding(horizontal = 54.dp, vertical = 12.dp),
                ) {
                    // Image-I801:3602;801:3408-Google
                    Image(
                        painter = painterResource(id = R.drawable.image_I80136028013408),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(24.dp, 24.dp)
                            .clipToBounds(),
                    )
                    // Text-I801:3602;801:3409-Continue with Google
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
        }
        // Text-801:2884-Create an account
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
        // Image-801:3253-Android Status Bars
        Image(
            painter = painterResource(id = R.drawable.image_8013253),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = -0.05.dp, y = 0.dp)
                .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
        )
        // Column-801:3622-Header
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 110.dp),
        ) {
            // Text-I801:3622;801:3344-Login
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(313.dp),
                text = "Login",
                color = Color(0xff191919),
                fontSize = 28.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Left,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-I801:3622;801:3345-Subtitle
            Text(
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(313.dp),
                text = "Welcome back to the app",
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
