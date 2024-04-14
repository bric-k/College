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
    // Box-72:2576-109. Date Section
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-109:2051-Date selection
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 0.dp, y = 104.dp),
        ) {
            // Row-109:2047-Departure & Return
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Column-109:2020-Departure
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-109:2021-Frame 2364
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .padding(horizontal = 8.dp, vertical = 0.dp),
                    ) {
                        // Row-109:2022-Frame 2253
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                        ) {
                            // Text-109:2023-Departure
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize(),
                                text = "Departure",
                                color = Color(0xff555555),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-109:2024-Frame 2363
                    Column(
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                            .padding(start = 8.dp, top = 10.dp, end = 24.dp, bottom = 10.dp),
                    ) {
                        // Row-109:2025-Details
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(124.dp)
                                .padding(start = 8.dp, top = 0.dp, end = 6.dp, bottom = 0.dp),
                        ) {
                            // Image-109:2026-Calender
                            Image(
                                painter = painterResource(id = R.drawable.image_1092026),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp)
                                    .clipToBounds(),
                            )
                            // Row-109:2027-Frame 2117
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentHeight()
                                    .width(78.dp),
                            ) {
                                // Text-109:2028-15/07/2022
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
                // Column-109:2029-Return
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-109:2030-Frame 2364
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .padding(horizontal = 8.dp, vertical = 0.dp),
                    ) {
                        // Row-109:2031-Frame 2253
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .background(Color(0xfff9fbfa), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                        ) {
                            // Text-109:2032-Return
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize(),
                                text = "Return",
                                color = Color(0xff555555),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-109:2033-Frame 2363
                    Column(
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                            .padding(start = 8.dp, top = 10.dp, end = 24.dp, bottom = 10.dp),
                    ) {
                        // Row-109:2034-Details
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(124.dp)
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-109:2035-Frame 2117
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Text-109:2036-+ Add Return Date
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentHeight()
                                        .width(109.dp),
                                    text = "+ Add Return Date",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                }
            }
            // Column-109:2050-Month & Date
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Row-72:2616-Day
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 18.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize()
                        .background(Color(0x7fe6e8e7))
                        .padding(horizontal = 16.dp, vertical = 8.dp),
                ) {
                    // Text-72:2617-Sun
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(30.dp),
                        text = "Sun",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2618-Mon
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(34.dp),
                        text = "Mon",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2619-Tue
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(32.dp),
                        text = "Tue",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2620-Wed
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(35.dp),
                        text = "Wed",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2621-Thu
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(34.dp),
                        text = "Thu",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2622-Fri
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(28.dp),
                        text = "Fri",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-72:2623-Sat
                    Text(
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentHeight()
                            .width(27.dp),
                        text = "Sat",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Column-109:2048-Months
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 32.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                ) {
                    // Column-72:2624-Month
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-72:2625-Frame 35
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2626-July
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                                text = "July",
                                color = Color(0xff555555),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2627-2022
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                                text = "2022",
                                color = Color(0xff555555),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Column-72:2628-Frame 2199
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Row-72:2629-Frame 2194
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2630-Frame 2193
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2631-29
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "29",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2632-Frame 2184
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2633-30
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "30",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2634-Frame 2183
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2635-01
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "01",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2636-Frame 2174
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2637-02
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "02",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2638-Frame 2173
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2639-03
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "03",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2640-Frame 2164
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2641-04
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "04",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2642-Frame 2163
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2643-05
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "05",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2644-Frame 2195
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2645-Frame 2192
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2646-06
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "06",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2647-Frame 2185
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2648-07
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "07",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2649-Frame 2182
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2650-08
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "08",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2651-Frame 2175
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2652-09
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "09",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2653-Frame 2172
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2654-10
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "10",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2655-Frame 2165
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2656-11
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "11",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2657-Frame 2162
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2658-12
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "12",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2659-Frame 2196
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2660-Frame 2191
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2661-13
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "13",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2662-Frame 2186
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2663-14
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "14",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2664-Frame 2181
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0xffec441e), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2665-15
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "15",
                                        color = Color(0xffecf3fc),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2666-Frame 2176
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2667-16
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "16",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2668-Frame 2171
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2669-17
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "17",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2670-Frame 2166
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2671-18
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "18",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2672-Frame 2161
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2673-19
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "19",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2674-Frame 2197
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2675-Frame 2190
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2676-20
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "20",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2677-Frame 2187
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2678-21
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "21",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2679-Frame 2180
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2680-22
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "22",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2681-Frame 2177
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2682-22
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "22",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2683-Frame 2170
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2684-23
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "23",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2685-Frame 2167
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2686-24
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "24",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2687-Frame 2160
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2688-25
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "25",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2689-Frame 2198
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2690-Frame 2189
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2691-26
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "26",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2692-Frame 2188
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2693-27
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "27",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2694-Frame 2179
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2695-28
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "28",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2696-Frame 2178
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2697-29
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "29",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2698-Frame 2169
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2699-30
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "30",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2700-Frame 2168
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2701-31
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "31",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2702-Frame 2159
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2703-01
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "01",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                    }
                    // Column-72:2704-Month
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Row-72:2705-Frame 35
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Text-72:2706-August
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                                text = "August",
                                color = Color(0xff555555),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-72:2707-2022
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                                text = "2022",
                                color = Color(0xff555555),
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                        // Column-72:2708-Frame 2199
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Row-72:2709-Frame 2194
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2710-Frame 2193
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2711-26
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "26",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2712-Frame 2184
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2713-27
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "27",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2714-Frame 2183
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2715-28
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "28",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2716-Frame 2174
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2717-29
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "29",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2718-Frame 2173
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2719-30
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "30",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2720-Frame 2164
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2721-31
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "31",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2722-Frame 2163
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2723-01
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "01",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2724-Frame 2195
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2725-Frame 2192
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2726-02
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "02",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2727-Frame 2185
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2728-03
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "03",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2729-Frame 2182
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2730-04
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "04",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2731-Frame 2175
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2732-05
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "05",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2733-Frame 2172
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2734-06
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "06",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2735-Frame 2165
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2736-07
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "07",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2737-Frame 2162
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2738-08
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "08",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2739-Frame 2196
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Column-72:2740-Frame 2191
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2741-09
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "09",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2742-Frame 2186
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2743-10
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "10",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2744-Frame 2181
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2745-11
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "11",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2746-Frame 2176
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2747-12
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "12",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2748-Frame 2171
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2749-13
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "13",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2750-Frame 2166
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2751-14
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "14",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2752-Frame 2161
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2753-15
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "15",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2754-Frame 2197
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2755-Frame 2190
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2756-16
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "16",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2757-Frame 2187
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2758-17
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "17",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2759-Frame 2180
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2760-18
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "18",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2761-Frame 2177
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2762-19
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "19",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2763-Frame 2170
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2764-20
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "20",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2765-Frame 2167
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2766-21
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "21",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2767-Frame 2160
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2768-22
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "22",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2769-Frame 2198
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2770-Frame 2189
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2771-23
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "23",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2772-Frame 2188
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2773-24
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "24",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2774-Frame 2179
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2775-25
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "25",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2776-Frame 2178
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2777-26
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "26",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2778-Frame 2169
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2779-27
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "27",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2780-Frame 2168
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2781-28
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "28",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2782-Frame 2159
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2783-29
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "29",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                            // Row-72:2784-Frame 2198
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                            ) {
                                // Row-72:2785-Frame 2189
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2786-30
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "30",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2787-Frame 2188
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2788-31
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "31",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2789-Frame 2179
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2790-01
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "01",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2791-Frame 2178
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2792-02
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "02",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Row-72:2793-Frame 2169
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2794-03
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "03",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2795-Frame 2168
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2796-04
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "04",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                                // Column-72:2797-Frame 2159
                                Column(
                                    verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .background(Color(0x7fecf3fc), RoundedCornerShape(2.dp))
                                        .padding(horizontal = 4.dp, vertical = 2.dp),
                                ) {
                                    // Text-72:2798-05
                                    Text(
                                        modifier = Modifier
                                            .wrapContentHeight()
                                            .width(20.dp),
                                        text = "05",
                                        color = Color(0xff555555),
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Center,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
        // Column-109:1985-Button
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 0.dp, y = 712.dp)
                .background(Color(0xffffffff))
                .padding(horizontal = 32.dp, vertical = 16.dp),
        ) {
            // Row-109:1982-Button Big
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
                // Text-I109:1982;107:3766-Confirm
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(120.dp),
                    text = "Select",
                    color = Color(0xffffffff),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-107:3363-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3363;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10733631072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3363;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3363;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10733631072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3363;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3363;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Departure Date",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3363;107:2604-Hamburger menu
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
