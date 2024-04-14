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
    // Box-72:2477-114. Payment
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-72:2501-Flight details
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 0.dp, y = 88.dp)
                .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 0.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                .background(Color(0xffeeefee))
                .padding(start = 32.dp, top = 24.dp, end = 32.dp, bottom = 16.dp),
        ) {
            // Row-72:2502-Frame 2333
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 142.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Image-72:2503-Frame 2328
                Image(
                    painter = painterResource(id = R.drawable.image_722503),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(48.dp, 24.dp),
                )
                // Row-72:2511-Frame 2332
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Image-72:2512-Calender
                    Image(
                        painter = painterResource(id = R.drawable.image_722512),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(20.dp, 20.dp)
                            .clipToBounds(),
                    )
                    // Row-72:2513-Frame 2117
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2514-15/07/2022
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(79.dp),
                            text = "15/07/2022",
                            color = Color(0xff191919),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Empty-72:2515-Line 13
            Box(
                modifier = Modifier
                    .align(Alignment.Start)
                    .size(296.dp, 1.dp)
                    .border(1.dp, Color(0xff84b5f7)),
            )
            // Row-111:1480-Frame 2229
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 14.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-111:1481-Frame 2209
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize(),
                ) {
                    // Text-111:1482-5.50
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
                    // Text-111:1483-DEL
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
                // Image-111:1484-Group 45
                Image(
                    painter = painterResource(id = R.drawable.image_1111484),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(156.dp, 36.dp),
                )
                // Column-111:1491-Frame 2210
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize(),
                ) {
                    // Text-111:1492-7.30
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
                    // Text-111:1493-CCU
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
            // Empty-72:2530-Line 14
            Box(
                modifier = Modifier
                    .align(Alignment.Start)
                    .size(296.dp, 1.dp)
                    .border(1.dp, Color(0xff84b5f7)),
            )
            // Row-72:2531-Frame 2331
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 198.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Text-72:2532-Total
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(35.dp),
                    text = "Total",
                    color = Color(0xff191919),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Text-72:2533-$230
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .size(65.dp, 28.dp),
                    text = "\$230",
                    color = Color(0xffec441e),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Right,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-72:2534-Payment input
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 40.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 303.dp)
                .advancedShadow(color = Color(0x11333333), alpha = 0.07000000029802322f, cornersRadius = 16.dp, shadowBlurRadius = 20.dp, offsetX = 0.dp, offsetY = 3.dp)
                .padding(all = 16.dp),
        ) {
            // Column-72:2535-Card details
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 32.dp, alignment = Alignment.CenterVertically),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-72:2536-Frame 2323
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-72:2537-Frame 2317
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2538-Card number
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                            text = "Card number",
                            color = Color(0xff191919),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Column-72:2539-Frame 2312
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 6.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Column-72:2540-Frame 2311
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(horizontal = 4.dp, vertical = 0.dp),
                            ) {
                                // Row-72:2541-Frame 2310
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-72:2542-5300 0000 0000 0000
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "5300 0000 0000 0000",
                                        color = Color(0xffa5a5a5),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Empty-72:2543-Line 15
                            Box(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(296.dp, 1.dp)
                                    .border(0.75.dp, Color(0xffe6e8e7)),
                            )
                        }
                    }
                    // Column-72:2544-Frame 2318
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-72:2545-Card holder name
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                            text = "Card holder name",
                            color = Color(0xff191919),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Column-72:2546-Frame 2312
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 6.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Column-72:2547-Frame 2311
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(horizontal = 4.dp, vertical = 0.dp),
                            ) {
                                // Row-72:2548-Frame 2310
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize(),
                                ) {
                                    // Text-72:2549-John Doe
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.CenterVertically)
                                            .wrapContentSize(),
                                        text = "John Doe",
                                        color = Color(0xffa5a5a5),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Empty-72:2550-Line 15
                            Box(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .size(296.dp, 1.dp)
                                    .border(0.75.dp, Color(0xffe6e8e7)),
                            )
                        }
                    }
                    // Row-72:2551-Frame 2322
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 32.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-72:2552-Frame 2319
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2553-CVV
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                                text = "CVV",
                                color = Color(0xff191919),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Column-72:2554-Frame 2312
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 6.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2555-Frame 2311
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize()
                                        .padding(horizontal = 4.dp, vertical = 0.dp),
                                ) {
                                    // Row-72:2556-Frame 2310
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.Start)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-72:2557-000
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "000",
                                            color = Color(0xffa5a5a5),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                }
                                // Empty-72:2558-Line 15
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .size(132.dp, 1.dp)
                                        .border(0.75.dp, Color(0xffe6e8e7)),
                                )
                            }
                        }
                        // Column-72:2559-Frame 2320
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2560-Expiry date
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                                text = "Expiry date",
                                color = Color(0xff191919),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Column-72:2561-Frame 2312
                            Column(
                                verticalArrangement = Arrangement.spacedBy(space = 6.dp, alignment = Alignment.Top),
                                horizontalAlignment = Alignment.Start,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2562-Frame 2311
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .wrapContentSize()
                                        .padding(horizontal = 4.dp, vertical = 0.dp),
                                ) {
                                    // Row-72:2563-Frame 2310
                                    Row(
                                        horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .align(Alignment.Start)
                                            .wrapContentSize(),
                                    ) {
                                        // Text-72:2564-05/24
                                        Text(
                                            modifier = Modifier
                                                .align(Alignment.CenterVertically)
                                                .wrapContentSize(),
                                            text = "05/24",
                                            color = Color(0xffa5a5a5),
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Normal,
                                            textAlign = TextAlign.Left,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                    }
                                }
                                // Empty-72:2565-Line 15
                                Box(
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .size(132.dp, 1.dp)
                                        .border(0.75.dp, Color(0xffe6e8e7)),
                                )
                            }
                        }
                    }
                }
                // Image-72:2566-Payment options
                Image(
                    painter = painterResource(id = R.drawable.image_722566),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                )
            }
            // Column-72:2571-Button
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-109:1999-Button Big
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                        .width(296.dp)
                        .padding(horizontal = 104.dp, vertical = 16.dp),
                ) {
                    // Text-I109:1999;107:3766-Confirm
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
                // Row-109:2001-Button Big
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentHeight()
                        .width(296.dp)
                        .border(1.dp, Color(0xffec441e), RoundedCornerShape(8.dp))
                        .padding(horizontal = 104.dp, vertical = 16.dp),
                ) {
                    // Text-I109:2001;109:1974-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(120.dp),
                        text = "Cancel",
                        color = Color(0xffec441e),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
        }
        // Column-107:3663-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3663;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10736631072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3663;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3663;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10736631072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3663;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3663;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Payment",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3663;107:2604-Hamburger menu
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
