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
    // Box-72:2038-110. Search Result
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 874.dp)
            .clipToBounds(),
    ) {
        // Column-72:2062-Search Result
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 112.dp),
        ) {
            // Column-72:2063-Result 01
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize()
                    .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                    .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                    .padding(horizontal = 0.dp, vertical = 16.dp),
            ) {
                // Column-72:2064-Frame 2238
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2065-Frame 2234
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 112.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-72:2066-Frame 2233
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Image-72:2067-Group 43
                            Image(
                                painter = painterResource(id = R.drawable.image_722067),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(48.dp, 32.dp),
                            )
                            // Text-72:2076-IN 230
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(57.dp),
                                text = "IN 230",
                                color = Color(0xff191919),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Text-72:2077-01 hr 40min
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(73.dp),
                            text = "01 hr 40min",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2078-Frame 2237
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2079-Frame 2236
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2080-5.50
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(41.dp),
                                text = "5.50",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2081-DEL (Delhi)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(69.dp),
                                text = "DEL (Delhi) ",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Image-72:2082-Group 51
                        Image(
                            painter = painterResource(id = R.drawable.image_722082),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(140.dp, 36.dp),
                        )
                        // Column-72:2090-Frame 2235
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2091-7.30
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentHeight()
                                    .offset(x = 1.dp, y = 0.dp)
                                    .width(41.dp),
                                text = "7.30",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2092-CCU (Kolkata)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentSize()
                                    .offset(x = 1.dp, y = 0.dp),
                                text = "CCU (Kolkata)",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Empty-72:2093-Line 10
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(328.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
                // Row-72:2094-Frame 2243
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 103.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2095-Frame 2239
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Image-72:2096-chair
                        Image(
                            painter = painterResource(id = R.drawable.image_722096),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(16.dp, 16.dp)
                                .clipToBounds(),
                        )
                        // Text-72:2097-Business Class
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(86.dp),
                            text = "Business Class",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2098-Frame 2240
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2099-From
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(33.dp),
                            text = "From",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-72:2100-$230
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(49.dp),
                            text = "\$230",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-109:1986-Button Big
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight()
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .width(296.dp)
                        .padding(horizontal = 104.dp, vertical = 8.dp),
                ) {
                    // Text-I109:1986;109:1978-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(120.dp),
                        text = "Check",
                        color = Color(0xffffffff),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Empty-72:2103-Line 12
            Box(
                modifier = Modifier
                    .align(Alignment.Start)
                    .size(328.dp, 1.dp)
                    .border(1.dp, Color(0xffe6e8e7)),
            )
            // Column-72:2104-Result 02
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize()
                    .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                    .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                    .padding(horizontal = 0.dp, vertical = 16.dp),
            ) {
                // Column-72:2105-Frame 2238
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2106-Frame 2234
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 112.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-72:2107-Frame 2233
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Image-72:2108-Group 46
                            Image(
                                painter = painterResource(id = R.drawable.image_722108),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(48.dp, 32.dp),
                            )
                            // Text-72:2116-IN 230
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(57.dp),
                                text = "IN 230",
                                color = Color(0xff191919),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Text-72:2117-01 hr 40min
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(73.dp),
                            text = "01 hr 40min",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2118-Frame 2237
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2119-Frame 2236
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2120-4.30
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(41.dp),
                                text = "4.30",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2121-DEL (Delhi)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(69.dp),
                                text = "DEL (Delhi) ",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Image-72:2122-Group 51
                        Image(
                            painter = painterResource(id = R.drawable.image_722122),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(140.dp, 36.dp),
                        )
                        // Column-72:2130-Frame 2235
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2131-6.30
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentHeight()
                                    .offset(x = 1.dp, y = 0.dp)
                                    .width(41.dp),
                                text = "6.30",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2132-CCU (Kolkata)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentSize()
                                    .offset(x = 1.dp, y = 0.dp),
                                text = "CCU (Kolkata)",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Empty-72:2133-Line 10
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(328.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
                // Row-72:2134-Frame 2243
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 103.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2135-Frame 2239
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Image-72:2136-chair
                        Image(
                            painter = painterResource(id = R.drawable.image_722136),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(16.dp, 16.dp)
                                .clipToBounds(),
                        )
                        // Text-72:2137-Business Class
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(86.dp),
                            text = "Business Class",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2138-Frame 2240
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2139-From
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(33.dp),
                            text = "From",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-72:2140-$360
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(49.dp),
                            text = "\$360",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-109:1989-Button Big
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight()
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .width(296.dp)
                        .padding(horizontal = 104.dp, vertical = 8.dp),
                ) {
                    // Text-I109:1989;109:1978-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(120.dp),
                        text = "Check",
                        color = Color(0xffffffff),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Empty-72:2143-Line 14
            Box(
                modifier = Modifier
                    .align(Alignment.Start)
                    .size(328.dp, 1.dp)
                    .border(1.dp, Color(0xffe6e8e7)),
            )
            // Column-72:2144-Result 03
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize()
                    .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                    .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                    .padding(horizontal = 0.dp, vertical = 16.dp),
            ) {
                // Column-72:2145-Frame 2238
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2146-Frame 2234
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 112.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-72:2147-Frame 2233
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Image-72:2148-Group 47
                            Image(
                                painter = painterResource(id = R.drawable.image_722148),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(48.dp, 32.dp),
                            )
                            // Text-72:2157-IN 230
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(57.dp),
                                text = "IN 230",
                                color = Color(0xff191919),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Text-72:2158-01 hr 40min
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(73.dp),
                            text = "01 hr 40min",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2159-Frame 2237
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2160-Frame 2236
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2161-2.20
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(41.dp),
                                text = "2.20",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2162-DEL (Delhi)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(69.dp),
                                text = "DEL (Delhi) ",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Image-72:2163-Group 51
                        Image(
                            painter = painterResource(id = R.drawable.image_722163),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(140.dp, 36.dp),
                        )
                        // Column-72:2171-Frame 2235
                        Column(
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2172-3.30
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentHeight()
                                    .offset(x = 1.dp, y = 0.dp)
                                    .width(41.dp),
                                text = "3.30",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2173-DAC (Kolkata)
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentSize()
                                    .offset(x = 1.dp, y = 0.dp),
                                text = "DAC (Kolkata)",
                                color = Color(0xff555555),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Empty-72:2174-Line 10
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(328.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
                // Row-72:2175-Frame 2243
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 103.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2176-Frame 2239
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Image-72:2177-chair
                        Image(
                            painter = painterResource(id = R.drawable.image_722177),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .size(16.dp, 16.dp)
                                .clipToBounds(),
                        )
                        // Text-72:2178-Business Class
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(86.dp),
                            text = "Business Class",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Row-72:2179-Frame 2240
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2180-From
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(33.dp),
                            text = "From",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-72:2181-$550
                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentHeight()
                                .width(49.dp),
                            text = "\$550",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-109:1991-Button Big
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentHeight()
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .width(296.dp)
                        .padding(horizontal = 104.dp, vertical = 8.dp),
                ) {
                    // Text-I109:1991;109:1978-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(120.dp),
                        text = "Check",
                        color = Color(0xffffffff),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-107:3567-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3567;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10735671072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3567;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3567;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10735671072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3567;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3567;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Search Result",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3567;107:2604-Hamburger menu
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
