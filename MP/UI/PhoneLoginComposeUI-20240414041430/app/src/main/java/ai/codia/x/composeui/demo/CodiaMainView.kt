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
    // Box-801:3625-103. Phone Login
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-801:3626-Input
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 236.dp),
        ) {
            // Row-801:3822-Header
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-801:3823-Email
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(46.dp, 36.dp),
                ) {
                    // Text-I801:3823;801:3351-Email
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .offset(x = 0.5.dp, y = 0.dp),
                        text = "Email",
                        color = Color(0xff555555),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Column-801:3824-Email
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(129.dp, 36.dp),
                ) {
                    // Text-I801:3824;801:3353-Phone Number
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .offset(x = 0.5.dp, y = 0.dp),
                        text = "Phone Number",
                        color = Color(0xffec441e),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Empty-I801:3824;801:3354-Rectangle 1
                    Box(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                            .size(24.dp, 2.dp),
                    )
                }
            }
            // Column-801:3630-Input section
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-801:3631-Login
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Column-801:3632-Input
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-801:3633-Email
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Text-801:3634-Label
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
                            // Row-801:3635-Input
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .border(1.dp, Color(0xffd0d5dd), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 16.dp, vertical = 12.dp),
                            ) {
                                // Row-I801:3635;801:3382-Country digit with separator
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                ) {
                                    // Row-I801:3635;801:3383-Country digit
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                    ) {
                                        // Image-I801:3635;801:3384-Icon/flag
                                        Image(
                                            painter = painterResource(id = R.drawable.image_I80136358013384),
                                            contentDescription = null,
                                            contentScale = ContentScale.Fit,
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .size(24.dp, 24.dp)
                                                .clipToBounds(),
                                        )
                                        // Row-I801:3635;801:3385-Down arrow
                                        Row(
                                            horizontalArrangement = Arrangement.Start,
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                        ) {
                                            // Text-I801:3635;801:3386-text
                                            Text(
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .wrapContentSize(),
                                                text = "+1",
                                                color = Color(0xff4b5768),
                                                fontSize = 16.sp,
                                                fontWeight = FontWeight.Normal,
                                                textAlign = TextAlign.Left,
                                                overflow = TextOverflow.Ellipsis,
                                            )
                                            // Image-I801:3635;801:3387-Icon/downarrow2
                                            Image(
                                                painter = painterResource(id = R.drawable.image_I80136358013387),
                                                contentDescription = null,
                                                contentScale = ContentScale.Fit,
                                                modifier = Modifier
                                                    .align(Alignment.CenterVertically)
                                                    .size(24.dp, 24.dp)
                                                    .clipToBounds(),
                                            )
                                        }
                                    }
                                    // Image-I801:3635;801:3388-Icon/separator
                                    Image(
                                        painter = painterResource(id = R.drawable.image_I80136358013388),
                                        contentDescription = null,
                                        contentScale = ContentScale.Fit,
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .size(12.dp, 24.dp)
                                            .clipToBounds(),
                                    )
                                }
                                // Text-I801:3635;801:3389-text
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .size(183.dp, 24.dp),
                                    text = "Phone number",
                                    color = Color(0xff999da3),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Column-801:3636-Password
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Row-801:3637-Header
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Text-801:3638-Label
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
                                // Text-801:3639-Right text
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
                            // Row-801:3640-Input
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
                                // Text-I801:3640;801:3366-text
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
                                // Image-I801:3640;801:3367-Icon/eye
                                Image(
                                    painter = painterResource(id = R.drawable.image_I80136408013367),
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
                    // Column-801:3641-Button
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-801:3642-Remind me
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Image-I801:3642;18:2201-Tick
                            Image(
                                painter = painterResource(id = R.drawable.image_I8013642182201),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp),
                            )
                            // Text-I801:3642;18:2202-Keep me signed in
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
                        // Row-801:3643-Login/primary
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                                .size(312.dp, 48.dp)
                                .padding(horizontal = 12.dp, vertical = 16.dp),
                        ) {
                            // Text-I801:3643;801:3414-Label
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
                // Column-801:3644-Devider
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Empty-801:3645-Line 10
                    Box(
                        modifier = Modifier
                            .offset(x = -107.dp, y = 18.dp)
                            .size(342.dp, 1.dp)
                            .border(0.5.dp, Color(0xff4b5768)),
                    )
                    // Row-801:3646-Sign in with
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize()
                            .background(Color(0xffffffff))
                            .padding(all = 8.dp),
                    ) {
                        // Text-801:3647-or sign in with
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
                // Row-801:3648-Login/secondary
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .background(Color(0xffe4e6ea), RoundedCornerShape(8.dp))
                        .size(312.dp, 48.dp)
                        .padding(horizontal = 54.dp, vertical = 12.dp),
                ) {
                    // Image-I801:3648;801:3408-Google
                    Image(
                        painter = painterResource(id = R.drawable.image_I80136488013408),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(24.dp, 24.dp)
                            .clipToBounds(),
                    )
                    // Text-I801:3648;801:3409-Continue with Google
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
        // Text-801:3649-Create an account
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
        // Image-801:3650-Android Status Bars
        Image(
            painter = painterResource(id = R.drawable.image_8013650),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = -0.05.dp, y = 0.dp)
                .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
        )
        // Column-801:3652-Header
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 110.dp),
        ) {
            // Text-I801:3652;801:3344-Login
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
            // Text-I801:3652;801:3345-Subtitle
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
