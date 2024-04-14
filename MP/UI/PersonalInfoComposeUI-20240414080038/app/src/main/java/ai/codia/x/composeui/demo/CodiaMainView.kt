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
    // Box-72:2283-113. Personal Info
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-109:2056-Personal Info
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 32.dp, y = 128.dp),
        ) {
            // Column-107:3763-Personal info
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Column-72:2309-Picture & Name
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterVertically),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Image-93:1212-Picture 
                    Image(
                        painter = painterResource(id = R.drawable.image_931212),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize(),
                    )
                    // Column-72:2313-Name
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .wrapContentHeight()
                            .width(200.dp),
                    ) {
                        // Text-72:2314-Hello Traveler
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .wrapContentSize(),
                            text = "Hello Traveler",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Column-72:2315-Info details
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Column-72:2316-Name
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2317-Frame 2254
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-72:2318-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-72:2319-Name
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Name",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-72:2320-Frame 2252
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Row-72:2321-Frame 2251
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Image-72:2322-Name
                                Image(
                                    painter = painterResource(id = R.drawable.image_722322),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp),
                                )
                                // Text-72:2323-Enter your name here
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(235.dp),
                                    text = "Enter your name here",
                                    color = Color(0xffa5a5a5),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Column-72:2324-Address
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2325-Frame 2254
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-72:2326-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-72:2327-Addesss
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Addesss",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-72:2328-Frame 2252
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Row-72:2329-Frame 2251
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Image-72:2330-map
                                Image(
                                    painter = painterResource(id = R.drawable.image_722330),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Text-72:2331-Enter your address
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(235.dp),
                                    text = "Enter your address",
                                    color = Color(0xffa5a5a5),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Column-72:2332-Passport
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2333-Frame 2254
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-72:2334-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-72:2335-Passport
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Passport",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-72:2336-Frame 2252
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Row-72:2337-Frame 2251
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Image-96:1106-Passport
                                Image(
                                    painter = painterResource(id = R.drawable.image_961106),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Text-72:2339-ED 25265 589
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(235.dp),
                                    text = "ED 25265 589",
                                    color = Color(0xffa5a5a5),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Column-72:2340-DOB
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2341-Frame 2254
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-72:2342-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-72:2343-DOB
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "DOB",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-72:2344-Frame 2252
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Row-72:2345-Frame 2251
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Image-72:2346-Dob
                                Image(
                                    painter = painterResource(id = R.drawable.image_722346),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Text-72:2347-12/05/1990
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(177.dp),
                                    text = "12/05/1990",
                                    color = Color(0xffa5a5a5),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            // Image-72:2348-Calender
                            Image(
                                painter = painterResource(id = R.drawable.image_722348),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp)
                                    .clipToBounds(),
                            )
                        }
                    }
                    // Column-72:2349-Country
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2350-Frame 2254
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-72:2351-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-72:2352-Country
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Country",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-72:2353-Frame 2252
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 16.dp, vertical = 14.dp),
                        ) {
                            // Row-72:2354-Frame 2251
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Image-72:2355-globe
                                Image(
                                    painter = painterResource(id = R.drawable.image_722355),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Text-72:2356-Country
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(177.dp),
                                    text = "Country",
                                    color = Color(0xffa5a5a5),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            // Image-72:2357-Down arrow
                            Image(
                                painter = painterResource(id = R.drawable.image_722357),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp)
                                    .clipToBounds(),
                            )
                        }
                    }
                }
            }
            // Row-109:1995-Button Big
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentHeight()
                    .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                    .width(296.dp)
                    .padding(horizontal = 104.dp, vertical = 16.dp),
            ) {
                // Text-I109:1995;107:3766-Confirm
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(120.dp),
                    text = "Confirm",
                    color = Color(0xffffffff),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Text-107:3762-Skip
            Text(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
                text = "Skip",
                color = Color(0xffec441e),
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                textAlign = TextAlign.Center,
                overflow = TextOverflow.Ellipsis,
            )
        }
        // Column-107:3639-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3639;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10736391072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3639;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3639;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10736391072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3639;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3639;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Personal Info",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3639;107:2604-Hamburger menu
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
            }
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
