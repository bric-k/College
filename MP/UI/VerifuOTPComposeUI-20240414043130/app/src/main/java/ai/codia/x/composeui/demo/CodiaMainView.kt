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
    // Box-801:2920-104. Verify  OTP
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xffffffff))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-801:2930-OTP Verify
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 72.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 170.dp),
        ) {
            // Column-801:3831-Header
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Text-I801:3831;801:3344-Login
                Text(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .width(313.dp),
                    text = "OTP Verification",
                    color = Color(0xff191919),
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Text-I801:3831;801:3345-Subtitle
                Text(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .width(313.dp),
                    text = "Enter the verification code we just sent on your phone number.",
                    color = Color(0xff555555),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-801:2932-OTP Input
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 64.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-801:2933-Frame 39946
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-801:2934-OTP Number
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .border(2.dp, Color(0xffec441e), RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    ) {
                        // Column-I801:2934;18:883-Number
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(32.dp)
                                .padding(all = 8.dp),
                        ) {
                            // Text-I801:2934;18:839-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize(),
                                text = "5",
                                color = Color(0xff4b5768),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Row-801:2935-OTP Number
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffd0d5dd), RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    ) {
                        // Column-I801:2935;18:896-Number
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(32.dp)
                                .padding(all = 8.dp),
                        ) {
                            // Text-I801:2935;18:897-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize(),
                                text = "0",
                                color = Color(0xffe4e6ea),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Row-801:2936-OTP Number
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffd0d5dd), RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    ) {
                        // Column-I801:2936;18:896-Number
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(32.dp)
                                .padding(all = 8.dp),
                        ) {
                            // Text-I801:2936;18:897-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize(),
                                text = "0",
                                color = Color(0xffe4e6ea),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Row-801:2937-OTP Number
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffd0d5dd), RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 12.dp),
                    ) {
                        // Column-I801:2937;18:896-Number
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(32.dp)
                                .padding(all = 8.dp),
                        ) {
                            // Text-I801:2937;18:897-text
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize(),
                                text = "0",
                                color = Color(0xffe4e6ea),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Row-801:3834-Login/primary
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .size(312.dp, 48.dp)
                        .padding(horizontal = 12.dp, vertical = 16.dp),
                ) {
                    // Text-I801:3834;801:3414-Label
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(160.dp),
                        text = "Verify",
                        color = Color(0xffffffff),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-801:2939-Resend
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .offset(x = 0.dp, y = 568.dp),
        ) {
            // Text-801:2940-Resend OTP in 23s
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
                text = "Resend OTP in 23s",
                color = Color(0xff191d23),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
            // Text-801:2941-Resend OTP
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
                text = "Resend OTP",
                color = Color(0xff999da3),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Image-801:2942-Back arrow
        Image(
            painter = painterResource(id = R.drawable.image1_8012942),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 24.dp, y = 63.dp)
                .padding(all = 8.dp),
        )
        // Image-801:3283-Android Status Bars
        Image(
            painter = painterResource(id = R.drawable.image2_8013283),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopCenter)
                .wrapContentSize()
                .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
        )
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
