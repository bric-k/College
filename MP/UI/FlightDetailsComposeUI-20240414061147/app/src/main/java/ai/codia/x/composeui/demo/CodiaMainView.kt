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
    // Box-72:2200-111. Flight Details
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-109:2053-Flight Details
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 23.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 112.dp),
        ) {
            // Column-72:2229-Frame 2264
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 21.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize()
                    .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                    .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                    .padding(start = 0.dp, top = 16.dp, end = 0.dp, bottom = 24.dp),
            ) {
                // Image-72:2230-Frame 2263
                Image(
                    painter = painterResource(id = R.drawable.image_722230),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                )
                // Column-72:2241-Frame 2231
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Row-72:2242-Frame 2229
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 14.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2243-Frame 2209
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2244-5.50
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(57.dp),
                                text = "5.50",
                                color = Color(0xff191919),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2245-DEL
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                                text = "DEL",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Image-72:2246-Group 45
                        Image(
                            painter = painterResource(id = R.drawable.image_722246),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(156.dp, 36.dp),
                        )
                        // Column-72:2253-Frame 2210
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2254-7.30
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentHeight()
                                    .offset(x = 1.dp, y = 0.dp)
                                    .width(57.dp),
                                text = "7.30",
                                color = Color(0xff191919),
                                fontSize = 24.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2255-CCU
                            Text(
                                modifier = Modifier
                                    .align(Alignment.End)
                                    .wrapContentSize()
                                    .offset(x = 1.dp, y = 0.dp),
                                text = "CCU",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Right,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Row-72:2256-Frame 2230
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 94.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2257-Indira Gandhi International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(98.dp),
                            text = "Indira Gandhi International Airport",
                            color = Color(0xff666666),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-72:2258-Subhash Chandra Bose International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(106.dp),
                            text = "Subhash Chandra Bose International Airport",
                            color = Color(0xff666666),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Empty-72:2259-Line 12
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(328.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
                // Row-72:2260-Frame 2232
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Box-72:2261-Group 48
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-72:2262-Rectangle 14
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-72:2263-Frame 2124
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-72:2264-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-72:2265-Date
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Date",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            // Row-72:2266-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-72:2267-Calender
                                Image(
                                    painter = painterResource(id = R.drawable.image_722267),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-72:2268-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-72:2269-15/07/2022
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .wrapContentHeight()
                                            .width(79.dp),
                                        text = "15/07/2022",
                                        color = Color(0xff191919),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                    }
                    // Box-72:2270-Group 49
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-72:2271-Rectangle 590
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-72:2272-Frame 2228
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-72:2273-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-72:2274-Time
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Time",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                            // Row-72:2275-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-72:2276-Clock
                                Image(
                                    painter = painterResource(id = R.drawable.image_722276),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-72:2277-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-72:2278-09.30
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .wrapContentHeight()
                                            .width(79.dp),
                                        text = "09.30",
                                        color = Color(0xff191919),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                    }
                }
                // Empty-72:2279-Line 13
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(328.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
                // Row-72:2280-Frame 2225
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize()
                        .offset(x = -0.0004999999999881766.dp, y = 0.dp),
                ) {
                    // Text-72:2281-Price
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(57.179.dp),
                        text = "Price",
                        color = Color(0xff191919),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2282-$230
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(86.405.dp, 34.dp),
                        text = "\$230",
                        color = Color(0xff191919),
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Row-98:1141-Button
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-98:1132-Button Small
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentHeight()
                        .width(156.dp)
                        .border(1.dp, Color(0xffec441e), RoundedCornerShape(8.dp))
                        .padding(horizontal = 104.dp, vertical = 16.dp),
                ) {
                    // Text-I98:1132;96:1131-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(88.25.dp),
                        text = "Cancel",
                        color = Color(0xffec441e),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Row-98:1136-Button Small
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentHeight()
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .width(156.dp)
                        .padding(horizontal = 104.dp, vertical = 16.dp),
                ) {
                    // Text-I98:1136;96:1127-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(88.25.dp),
                        text = "Confirm",
                        color = Color(0xffffffff),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-107:3591-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3591;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10735911072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3591;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3591;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10735911072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3591;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3591;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Flight details",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3591;107:2604-Hamburger menu
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
