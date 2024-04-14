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
    // Box-95:1453-116. My bookings
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-95:1624-Frame 2361
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 112.dp)
                .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 32.dp),
        ) {
            // Image-95:1615-Group 43
            Image(
                painter = painterResource(id = R.drawable.image_951615),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(96.dp, 64.dp),
            )
            // Empty-95:1494-Line 15
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color(0xffe6e8e7))
                    .size(296.dp, 1.dp)
                    .border(1.dp, Color(0xffe6e8e7)),
            )
            // Column-95:1495-Frame 2356
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Column-95:1496-Frame 2352
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Row-111:1534-Frame 2229
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 14.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-111:1535-Frame 2209
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-111:1536-5.50
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
                            // Text-111:1537-DEL
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
                        // Image-111:1538-Group 45
                        Image(
                            painter = painterResource(id = R.drawable.image_1111538),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(156.dp, 36.dp),
                        )
                        // Column-111:1545-Frame 2210
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-111:1546-7.30
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
                            // Text-111:1547-CCU
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
                    // Row-95:1511-Frame 2351
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 110.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-95:1512-Indira Gandhi International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(81.dp),
                            text = "Indira Gandhi International Airport",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-95:1513-Subhash Chandra Bose International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(107.dp),
                            text = "Subhash Chandra Bose International Airport",
                            color = Color(0xff555555),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-95:1514-Frame 2355
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Box-95:1515-Group 48
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-95:1516-Rectangle 14
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-95:1517-Frame 2124
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-95:1518-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-95:1519-Date
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
                            // Row-95:1520-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-95:1521-Calender
                                Image(
                                    painter = painterResource(id = R.drawable.image_951521),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-95:1522-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-95:1523-15/07/2022
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
                    // Box-95:1524-Group 49
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-95:1525-Rectangle 590
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-95:1526-Frame 2228
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-95:1527-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-95:1528-Time
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
                            // Row-95:1529-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-95:1530-Clock
                                Image(
                                    painter = painterResource(id = R.drawable.image_951530),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-95:1531-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-95:1532-09.30
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
            }
            // Empty-95:1533-Line 17
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .background(Color(0xffe6e8e7))
                    .size(296.dp, 1.dp)
                    .border(1.dp, Color(0xffe6e8e7)),
            )
            // Row-95:1534-Frame 2354
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
            ) {
                // Column-95:1535-Frame 2341
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Text-95:1536-Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(49.dp),
                        text = "Flight",
                        color = Color(0xff555555),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-95:1537-IN 230
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(55.dp),
                        text = "IN 230",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Column-95:1538-Frame 2342
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Text-95:1539-Gate
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(29.dp),
                        text = "Gate",
                        color = Color(0xff555555),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-95:1540-22
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(29.dp),
                        text = "22",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Column-95:1541-Frame 2343
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Text-95:1542-Seat
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(29.dp),
                        text = "Seat",
                        color = Color(0xff555555),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-95:1543-2B
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(29.dp),
                        text = "2B",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Column-95:1544-Frame 2344
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                ) {
                    // Text-95:1545-Class
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(65.dp),
                        text = "Class",
                        color = Color(0xff555555),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                    // Text-95:1546-Economy
                    Text(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentHeight()
                            .width(73.dp),
                        text = "Economy",
                        color = Color(0xff191919),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Row-109:2006-Button Big
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
                // Text-I109:2006;109:1978-Confirm
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(120.dp),
                    text = "Modify",
                    color = Color(0xffffffff),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-107:3711-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3711;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10737111072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3711;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3711;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10737111072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3711;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3711;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "My Bookings",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3711;107:2604-Hamburger menu
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
            }
        }
        // Row-243:707-Bottom Nav Bar
        Row(
            horizontalArrangement = Arrangement.spacedBy(space = 22.dp, alignment = Alignment.Start),
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 0.dp, y = 732.dp)
                .background(Color(0xffec441e))
                .padding(horizontal = 16.dp, vertical = 14.dp),
        ) {
            // Column-I243:707;109:2315-Menu/Home
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:707;109:2315;109:2164-home
                Image(
                    painter = painterResource(id = R.drawable.image_I24370710923151092164),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:707;109:2315;109:2165-Home
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Home",
                    color = Color(0xfff9d2ca),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:707;109:2320-Menu/Booking
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:707;109:2320;109:2213-Bookings
                Image(
                    painter = painterResource(id = R.drawable.image_I24370710923201092213),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:707;109:2320;109:2214-Booking
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Booking",
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:707;109:2325-Menu/Offer
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:707;109:2325;109:2170-Offer 2
                Image(
                    painter = painterResource(id = R.drawable.image_I24370710923251092170),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:707;109:2325;109:2171-Offer
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Offer",
                    color = Color(0xfff9d2ca),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:707;109:2330-Menu/Inbox
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:707;109:2330;109:2173-Inbox
                Image(
                    painter = painterResource(id = R.drawable.image_I24370710923301092173),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:707;109:2330;109:2174-Inbox
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Inbox",
                    color = Color(0xfff9d2ca),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:707;109:2335-Menu/Profile
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:707;109:2335;113:3653-user
                Image(
                    painter = painterResource(id = R.drawable.image_I24370710923351133653),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:707;109:2335;109:2177-Profile
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Profile",
                    color = Color(0xfff9d2ca),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
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
