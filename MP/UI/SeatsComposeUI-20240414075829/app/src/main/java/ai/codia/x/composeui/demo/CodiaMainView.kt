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
    // Box-72:2358-112. Seats
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Image-109:2055-BG Illustration
        Image(
            painter = painterResource(id = R.drawable.image_1092055),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 0.dp, y = 150.dp)
                .size(360.dp, 650.dp),
        )
        // Column-72:2397-Seats
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 40.dp, y = 332.dp),
        ) {
            // Row-72:2398-Frame 2295
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2399-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2400-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2401-1A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2402-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2403-1B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1B",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2404-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2405-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2406-1C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2407-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2408-1D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2409-Frame 2296
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2410-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2411-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2412-2A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "2A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2413-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffec441e), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2414-2B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "2B",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2415-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2416-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffd9d9d9), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2417-2C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "2C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2418-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2419-2D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "2D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2420-Frame 2297
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2421-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2422-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2423-3A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "3A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2424-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2425-3B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "3B",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2426-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2427-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffd9d9d9), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2428-3C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "3C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2429-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffd9d9d9), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2430-3D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "3D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2431-Frame 2298
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2432-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2433-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2434-4A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "4A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2435-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2436-4B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "4B",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2437-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2438-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2439-4C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "4C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2440-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2441-4D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "4D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2442-Frame 2299
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2443-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2444-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xff7c716f), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2445-5A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "5A",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2446-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xff7c716f), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2447-1B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1B",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2448-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2449-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xff7c716f), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2450-5C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "5C",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2451-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xff7c716f), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2452-5D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "5D",
                            color = Color(0xffffffff),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2453-Frame 2300
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2454-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2455-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffd9d9d9), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2456-6A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "6A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2457-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0xffd9d9d9), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2458-6B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "6B",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2459-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2460-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2461-6C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "6C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2462-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2463-6D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "6D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
            // Row-72:2464-Frame 2301
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 96.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-72:2465-Frame 2271
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2466-Frame 2265
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2467-1A
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1A",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2468-Frame 2266
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2469-1B
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1B",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-72:2470-Frame 2272
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Column-72:2471-Frame 2268
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2472-1C
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1C",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                    // Column-72:2473-Frame 2270
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize()
                            .background(Color(0x0c3b77dc), RoundedCornerShape(4.dp))
                            .padding(all = 8.dp),
                    ) {
                        // Text-72:2474-1D
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentHeight()
                                .width(24.dp),
                            text = "1D",
                            color = Color(0xff555555),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
        // Row-109:1993-Button Big
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentHeight()
                .offset(x = 32.dp, y = 724.dp)
                .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                .width(296.dp)
                .padding(horizontal = 104.dp, vertical = 16.dp),
        ) {
            // Text-I109:1993;107:3766-Confirm
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
        // Row-72:2383-Selection type
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 104.dp),
        ) {
            // Row-72:2384-Frame 2291
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Empty-72:2385-Rectangle 591
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color(0xffec441e), RoundedCornerShape(16.dp))
                        .size(12.dp, 12.dp),
                )
                // Text-72:2386-Selected
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(61.dp),
                    text = "Selected",
                    color = Color(0xff555555),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Row-72:2387-Frame 2292
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Empty-72:2388-Rectangle 591
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color(0xff7c716f), RoundedCornerShape(16.dp))
                        .size(12.dp, 12.dp),
                )
                // Text-72:2389-Emergency exit
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(103.dp),
                    text = "Emergency exit",
                    color = Color(0xff555555),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Row-72:2390-Frame 2293
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Empty-72:2391-Rectangle 591
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(Color(0xffd9d9d9), RoundedCornerShape(16.dp))
                        .size(12.dp, 12.dp),
                )
                // Text-72:2392-Reserved
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(64.dp),
                    text = "Reserved",
                    color = Color(0xff555555),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-107:3615-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3615;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10736151072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3615;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3615;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10736151072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3615;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3615;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Choose Seat",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3615;107:2604-Hamburger menu
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
