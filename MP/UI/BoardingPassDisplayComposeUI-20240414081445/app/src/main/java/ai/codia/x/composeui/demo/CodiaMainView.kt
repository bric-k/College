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
    // Box-95:1086-115. Boarding Pass
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-231:673-Frame 2377
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 32.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 32.dp, y = 120.dp),
        ) {
            // Column-231:670-Frame 2375
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-95:1281-Frame 2353
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 57.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Row-95:1248-Frame 2350
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Image-95:1112-Group 53
                        Image(
                            painter = painterResource(id = R.drawable.image_951112),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(48.dp, 48.dp),
                        )
                        // Column-95:1117-Frame 2336
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-95:1118-Mr. John Doe
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(113.dp),
                                text = "Mr. John Doe",
                                color = Color(0xff191919),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                            // Text-95:1119-Passenger
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize(),
                                text = "Passenger",
                                color = Color(0xff888888),
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Image-95:1120-Group 43
                    Image(
                        painter = painterResource(id = R.drawable.image_951120),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(63.dp, 42.dp),
                    )
                }
                // Empty-95:1129-Line 15
                Box(
                    modifier = Modifier
                        .align(Alignment.Start)
                        .size(296.dp, 1.dp)
                        .border(1.dp, Color(0xffe6e8e7)),
                )
            }
            // Column-95:1286-Frame 2356
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-95:1280-Frame 2352
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Row-111:1517-Frame 2229
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 14.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-111:1518-Frame 2209
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-111:1519-5.50
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
                            // Text-111:1520-DEL
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
                        // Image-111:1521-Group 45
                        Image(
                            painter = painterResource(id = R.drawable.image_1111521),
                            contentDescription = null,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .size(156.dp, 36.dp),
                        )
                        // Column-111:1528-Frame 2210
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically),
                            horizontalAlignment = Alignment.End,
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .wrapContentSize(),
                        ) {
                            // Text-111:1529-7.30
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
                            // Text-111:1530-CCU
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
                    // Row-95:1279-Frame 2351
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 110.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Text-95:1146-Indira Gandhi International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(81.dp),
                            text = "Indira Gandhi International Airport",
                            color = Color(0xff666666),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-95:1147-Subhash Chandra Bose International Airport
                        Text(
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentHeight()
                                .width(107.dp),
                            text = "Subhash Chandra Bose International Airport",
                            color = Color(0xff666666),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Right,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-95:1285-Frame 2355
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Box-95:1149-Group 48
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-95:1150-Rectangle 14
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-95:1151-Frame 2124
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-95:1152-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-95:1153-Date
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
                            // Row-95:1154-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-95:1155-Calender
                                Image(
                                    painter = painterResource(id = R.drawable.image_951155),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-95:1156-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-95:1157-15/07/2022
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
                    // Box-95:1158-Group 49
                    Box(
                        contentAlignment = Alignment.TopStart,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .size(140.dp, 54.dp),
                    ) {
                        // Empty-95:1159-Rectangle 590
                        Box(
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .offset(x = 0.dp, y = 8.dp)
                                .size(140.dp, 46.dp)
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp)),
                        )
                        // Column-95:1160-Frame 2228
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.TopStart)
                                .wrapContentSize()
                                .offset(x = 8.dp, y = 0.dp),
                        ) {
                            // Row-95:1161-Frame 2115
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xfff9fbfa), RoundedCornerShape(32.dp))
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Text-95:1162-Time
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
                            // Row-95:1163-Frame 2118
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 10.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 4.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Image-95:1164-Clock
                                Image(
                                    painter = painterResource(id = R.drawable.image_951164),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-95:1165-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-95:1166-09.30
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
            // Column-231:672-Frame 2376
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 20.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-231:669-Frame 2374
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Empty-95:1167-Line 17
                    Box(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .size(296.dp, 1.dp)
                            .border(1.dp, Color(0xffe6e8e7)),
                    )
                    // Row-95:1282-Frame 2354
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(space = 38.dp, alignment = Alignment.Start),
                        verticalAlignment = Alignment.Top,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize(),
                    ) {
                        // Column-95:1169-Frame 2341
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-95:1170-Flight
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
                            // Text-95:1171-IN 230
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
                        // Column-95:1172-Frame 2342
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-95:1173-Gate
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
                            // Text-95:1174-22
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
                        // Column-95:1175-Frame 2343
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-95:1176-Seat
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
                            // Text-95:1177-2B
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
                        // Column-95:1178-Frame 2344
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Top)
                                .wrapContentSize(),
                        ) {
                            // Text-95:1179-Class
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
                            // Text-95:1180-Economy
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
                    // Empty-95:1108-Line 16
                    Box(
                        modifier = Modifier
                            .align(Alignment.Start)
                            .size(296.dp, 1.dp)
                            .border(1.dp, Color(0xffe6e8e7)),
                    )
                }
                // Column-95:1287-Frame 2357
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = 6.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Image-95:1283-Group 55
                    Image(
                        painter = painterResource(id = R.drawable.image_951283),
                        contentDescription = null,
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .size(296.dp, 42.5.dp),
                    )
                    // Text-95:1181-IND222B589659
                    Text(
                        modifier = Modifier
                            .wrapContentSize()
                            .offset(x = 0.dp, y = 48.5.dp),
                        text = "IND222B589659",
                        color = Color(0xff191919),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Left,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
            }
            // Column-95:1289-Button
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 24.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Row-109:2004-Button Big
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
                    // Text-I109:2004;107:3766-Confirm
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(120.dp),
                        text = "Download",
                        color = Color(0xffffffff),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Text-95:1231-Book another flight
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .wrapContentSize(),
                    text = "Book another flight",
                    color = Color(0xffec441e),
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-107:3687-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:3687;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10736871072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:3687;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Image-I107:3687;107:2594-Left arrow
                Image(
                    painter = painterResource(id = R.drawable.image_I10736871072594),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:3687;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:3687;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Boarding Pass",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Empty-I107:3687;107:2604-Hamburger menu
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
