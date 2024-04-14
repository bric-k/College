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
    // Box-107:3962-108. Home
    Box(
        contentAlignment = Alignment.TopStart,
        modifier = Modifier
            .background(Color(0xfff9fbfa))
            .size(360.dp, 800.dp)
            .clipToBounds(),
    ) {
        // Column-109:1509-Flight selection
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 152.dp)
                .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 16.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                .background(Color(0xffffffff), RoundedCornerShape(16.dp))
                .padding(start = 16.dp, top = 8.dp, end = 16.dp, bottom = 24.dp),
        ) {
            // Column-108:1506-Frame 2373
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Column-107:4396-From
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-107:4349-Frame 2364
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .padding(horizontal = 8.dp, vertical = 0.dp),
                    ) {
                        // Row-107:4350-Frame 2253
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                        ) {
                            // Text-107:4351-From
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize(),
                                text = "From",
                                color = Color(0xff555555),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-107:4352-Frame 2363
                    Column(
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                            .padding(start = 8.dp, top = 10.dp, end = 8.dp, bottom = 12.dp),
                    ) {
                        // Row-107:4353-Details
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Image-107:4354-AirplaneTakeoff
                            Image(
                                painter = painterResource(id = R.drawable.image_1074354),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp),
                            )
                            // Row-107:4355-Frame 2117
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Text-107:4356-Delhi
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Delhi",
                                    color = Color(0xff191919),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                // Row-107:4357-Frame 2116
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .padding(start = 0.dp, top = 4.dp, end = 0.dp, bottom = 0.dp),
                                ) {
                                    // Text-107:4358-DEL
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .wrapContentSize(),
                                        text = "DEL",
                                        color = Color(0xff555555),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Row-107:4359-Frame 2119
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(start = 40.dp, top = 0.dp, end = 32.dp, bottom = 0.dp),
                        ) {
                            // Text-107:4360-Indira Gandhi International Airport
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentHeight()
                                    .width(209.dp),
                                text = "Indira Gandhi International Airport",
                                color = Color(0xff999999),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Column-107:4397-To
                Column(
                    verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                    horizontalAlignment = Alignment.Start,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-107:4398-Frame 2364
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .padding(horizontal = 8.dp, vertical = 0.dp),
                    ) {
                        // Row-107:4399-Frame 2253
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                        ) {
                            // Text-107:4400-To
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize(),
                                text = "To",
                                color = Color(0xff555555),
                                fontSize = 12.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-107:4401-Frame 2363
                    Column(
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Start)
                            .wrapContentSize()
                            .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                            .padding(start = 8.dp, top = 10.dp, end = 8.dp, bottom = 12.dp),
                    ) {
                        // Row-107:4402-Details
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Image-107:4403-AirplaneLanding
                            Image(
                                painter = painterResource(id = R.drawable.image_1074403),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .size(20.dp, 20.dp),
                            )
                            // Row-107:4404-Frame 2117
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                    .wrapContentSize(),
                            ) {
                                // Text-107:4405-Kolkata
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Kolkata",
                                    color = Color(0xff191919),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                                // Row-107:4406-Frame 2116
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize()
                                        .padding(start = 0.dp, top = 4.dp, end = 0.dp, bottom = 0.dp),
                                ) {
                                    // Text-107:4407-CCU
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .wrapContentSize(),
                                        text = "CCU",
                                        color = Color(0xff555555),
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.Normal,
                                        textAlign = TextAlign.Left,
                                        overflow = TextOverflow.Ellipsis,
                                    )
                                }
                            }
                        }
                        // Row-107:4408-Frame 2119
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(start = 40.dp, top = 0.dp, end = 32.dp, bottom = 0.dp),
                        ) {
                            // Text-107:4409-Subhash Chandra International Airport
                            Text(
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentHeight()
                                    .width(209.dp),
                                text = "Subhash Chandra International Airport",
                                color = Color(0xff999999),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Left,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                }
                // Row-108:1494-Departure & Return
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-107:4455-Departure
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize(),
                    ) {
                        // Column-107:4456-Frame 2364
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-107:4457-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-107:4458-Departure
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
                        // Column-107:4459-Frame 2363
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                        ) {
                            // Row-107:4460-Details
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(124.dp)
                                    .padding(start = 8.dp, top = 0.dp, end = 6.dp, bottom = 0.dp),
                            ) {
                                // Image-107:4461-Calender
                                Image(
                                    painter = painterResource(id = R.drawable.image_1074461),
                                    contentDescription = null,
                                    contentScale = ContentScale.Fit,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .size(20.dp, 20.dp)
                                        .clipToBounds(),
                                )
                                // Row-107:4462-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentHeight()
                                        .width(78.dp),
                                ) {
                                    // Text-107:4463-15/07/2022
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
                    // Column-107:4471-Return
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize(),
                    ) {
                        // Column-107:4472-Frame 2364
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-107:4473-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-107:4474-Return
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
                        // Column-107:4475-Frame 2363
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                        ) {
                            // Row-107:4476-Details
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentHeight()
                                    .width(124.dp)
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Row-107:4478-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-107:4479-+ Add Return Date
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
                // Row-108:1493-Traveller & Class
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .wrapContentSize(),
                ) {
                    // Column-108:1492-Traveller
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize(),
                    ) {
                        // Column-108:1462-Frame 2364
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-108:1463-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-108:1464-Traveller
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Traveller",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Row-108:1491-Frame 2369
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                            verticalAlignment = Alignment.Top,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                        ) {
                            // Row-108:1489-Frame 2367
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Top)
                                    .wrapContentSize()
                                    .padding(start = 8.dp, top = 0.dp, end = 4.dp, bottom = 0.dp),
                            ) {
                                // Text-108:1468-1 Adult
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentHeight()
                                        .width(113.dp),
                                    text = "1 Adult",
                                    color = Color(0xff191919),
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                    }
                    // Column-107:4492-Class
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = -12.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.Top)
                            .wrapContentSize(),
                    ) {
                        // Column-107:4493-Frame 2364
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .padding(horizontal = 8.dp, vertical = 0.dp),
                        ) {
                            // Row-107:4494-Frame 2253
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.Top,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                                    .padding(horizontal = 8.dp, vertical = 4.dp),
                            ) {
                                // Text-107:4495-Class
                                Text(
                                    modifier = Modifier
                                        .align(Alignment.Top)
                                        .wrapContentSize(),
                                    text = "Class",
                                    color = Color(0xff555555),
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Left,
                                    overflow = TextOverflow.Ellipsis,
                                )
                            }
                        }
                        // Column-107:4496-Frame 2363
                        Column(
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize()
                                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(8.dp))
                                .padding(horizontal = 8.dp, vertical = 10.dp),
                        ) {
                            // Row-107:4497-Details
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Start),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .wrapContentSize()
                                    .padding(horizontal = 8.dp, vertical = 0.dp),
                            ) {
                                // Row-107:4498-Frame 2117
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                                    verticalAlignment = Alignment.Top,
                                    modifier = Modifier
                                        .align(Alignment.CenterVertically)
                                        .wrapContentSize(),
                                ) {
                                    // Text-107:4499-Economy
                                    Text(
                                        modifier = Modifier
                                            .align(Alignment.Top)
                                            .wrapContentHeight()
                                            .width(109.dp),
                                        text = "Economy",
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
            // Row-109:1979-Button Big
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .background(Color(0xffec441e), RoundedCornerShape(8.dp))
                    .width(296.dp)
                    .padding(horizontal = 104.dp, vertical = 12.dp),
            ) {
                // Text-I109:1979;109:1976-Confirm
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentHeight()
                        .width(120.dp),
                    text = "Search",
                    color = Color(0xffffffff),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Image-107:4044-Arrow
        Image(
            painter = painterResource(id = R.drawable.image_1074044),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 268.dp, y = 220.dp)
                .border(1.dp, Color(0xffe6e8e7), RoundedCornerShape(40.dp))
                .padding(all = 8.dp),
        )
        // Row-107:3984-Way selection
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 32.dp, y = 104.dp)
                .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 32.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                .background(Color(0xffffffff), RoundedCornerShape(32.dp))
                .padding(all = 2.dp),
        ) {
            // Row-107:3985-Frame 2111
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize()
                    .background(Color(0xffec441e), RoundedCornerShape(32.dp))
                    .padding(horizontal = 16.dp, vertical = 2.dp),
            ) {
                // Text-107:3986-One way
                Text(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentHeight()
                        .width(64.dp),
                    text = "One way",
                    color = Color(0xffffffff),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Row-107:3987-Frame 2112
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 2.dp),
            ) {
                // Text-107:3988-Round
                Text(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentHeight()
                        .width(64.dp),
                    text = "Round",
                    color = Color(0xff999999),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Row-107:3989-Frame 2113
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 2.dp),
            ) {
                // Text-107:3990-Multicity
                Text(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentHeight()
                        .width(64.dp),
                    text = "Multicity",
                    color = Color(0xff999999),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
        // Column-107:4276-Top bar
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .background(Color(0xfff9fbfa))
                .clipToBounds(),
        ) {
            // Image-I107:4276;107:2578-Android Status Bars
            Image(
                painter = painterResource(id = R.drawable.image_I10742761072578),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(start = 0.dp, top = 8.dp, end = 0.dp, bottom = 0.dp),
            )
            // Row-I107:4276;107:2593-Content
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
            ) {
                // Empty-I107:4276;107:2594-Left arrow
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
                // Row-I107:4276;107:2600-Header
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(horizontal = 36.dp, vertical = 0.dp),
                ) {
                    // Text-I107:4276;107:2601-Book Flight
                    Text(
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentHeight()
                            .width(192.dp),
                        text = "Book Flight",
                        color = Color(0xff191919),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center,
                        overflow = TextOverflow.Ellipsis,
                    )
                }
                // Image-I107:4276;107:2604-Hamburger menu
                Image(
                    painter = painterResource(id = R.drawable.image_I10742761072604),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .padding(all = 4.dp),
                )
            }
        }
        // Empty-227:3042-Line 12
        Box(
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(x = 16.dp, y = 548.dp)
                .size(328.dp, 1.dp)
                .border(1.dp, Color(0xffe6e8e7)),
        )
        // Column-237:835-Offer
        Column(
            verticalArrangement = Arrangement.spacedBy(space = 12.dp, alignment = Alignment.Top),
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
                .offset(x = 16.dp, y = 564.dp),
        ) {
            // Row-237:831-Header
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 206.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.Top,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentSize(),
            ) {
                // Text-237:832-Hot offer
                Text(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                    text = "Hot offer",
                    color = Color(0xff191919),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Left,
                    overflow = TextOverflow.Ellipsis,
                )
                // Text-237:833-See all
                Text(
                    modifier = Modifier
                        .align(Alignment.Top)
                        .wrapContentSize(),
                    text = "See all",
                    color = Color(0xffec441e),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Right,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Row-237:830-Frame 2396
            Row(
                horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .align(Alignment.Start)
                    .wrapContentHeight()
                    .width(344.dp),
            ) {
                // Row-237:806-Frame 2391
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 8.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                        .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                        .padding(start = 0.dp, top = 0.dp, end = 16.dp, bottom = 0.dp),
                ) {
                    // Column-237:807-Frame 2390
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .background(Color(0xfff2ebe1))
                            .padding(horizontal = 12.dp, vertical = 22.dp),
                    ) {
                        // Column-237:808-Frame 2389
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Image-237:809-Frame 2378
                            Image(
                                painter = painterResource(id = R.drawable.image_237809),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize()
                                    .padding(horizontal = 13.5.dp, vertical = 4.dp),
                            )
                            // Text-237:811-15%OFF
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(72.dp, 22.dp),
                                text = "15%OFF",
                                color = Color(0xff333333),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-237:812-Frame 2388
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-237:813-15% discount with mastercard
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(137.dp, 40.dp),
                            text = "15% discount with mastercard",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-237:814-Lorem ipsum dolor sit am etet adip
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(137.dp, 32.dp),
                            text = "Lorem ipsum dolor sit am etet adip",
                            color = Color(0xff999999),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
                // Row-237:815-Frame 2393
                Row(
                    horizontalArrangement = Arrangement.spacedBy(space = 16.dp, alignment = Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .wrapContentSize()
                        .advancedShadow(color = Color(0x0c591b1b), alpha = 0.05000000074505806f, cornersRadius = 8.dp, shadowBlurRadius = 10.dp, offsetX = 0.dp, offsetY = 5.dp)
                        .background(Color(0xffffffff), RoundedCornerShape(8.dp))
                        .padding(start = 0.dp, top = 0.dp, end = 16.dp, bottom = 0.dp),
                ) {
                    // Column-237:816-Frame 2390
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize()
                            .background(Color(0xffe6e1f2))
                            .padding(horizontal = 12.dp, vertical = 22.dp),
                    ) {
                        // Column-237:817-Frame 2389
                        Column(
                            verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .wrapContentSize(),
                        ) {
                            // Image-237:818-Frame 2378
                            Image(
                                painter = painterResource(id = R.drawable.image_237818),
                                contentDescription = null,
                                contentScale = ContentScale.Fit,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .wrapContentSize()
                                    .padding(horizontal = 13.5.dp, vertical = 3.dp),
                            )
                            // Text-237:822-23%OFF
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .size(72.dp, 22.dp),
                                text = "23%OFF",
                                color = Color(0xff333333),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Normal,
                                textAlign = TextAlign.Center,
                                overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                    // Column-237:823-Frame 2388
                    Column(
                        verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .wrapContentSize(),
                    ) {
                        // Text-237:824-23% discount in visa credit card
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(137.dp, 40.dp),
                            text = "23% discount in visa credit card",
                            color = Color(0xff191919),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                        // Text-237:825-Lorem ipsum dolor sit am etet adip
                        Text(
                            modifier = Modifier
                                .align(Alignment.Start)
                                .size(137.dp, 32.dp),
                            text = "Lorem ipsum dolor sit am etet adip",
                            color = Color(0xff999999),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Left,
                            overflow = TextOverflow.Ellipsis,
                        )
                    }
                }
            }
        }
        // Row-243:666-Bottom Nav Bar
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
            // Column-I243:666;109:2315-Menu/Home
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:666;109:2315;109:2207-home
                Image(
                    painter = painterResource(id = R.drawable.image_I24366610923151092207),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:666;109:2315;109:2208-Home
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Home",
                    color = Color(0xffffffff),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:666;109:2320-Menu/Booking
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:666;109:2320;109:2167-Bookings
                Image(
                    painter = painterResource(id = R.drawable.image_I24366610923201092167),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:666;109:2320;109:2168-Booking
                Text(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(48.dp, 12.dp),
                    text = "Booking",
                    color = Color(0xfff9d2ca),
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            // Column-I243:666;109:2325-Menu/Offer
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:666;109:2325;109:2170-Offer 2
                Image(
                    painter = painterResource(id = R.drawable.image_I24366610923251092170),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:666;109:2325;109:2171-Offer
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
            // Column-I243:666;109:2330-Menu/Inbox
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:666;109:2330;109:2173-Inbox
                Image(
                    painter = painterResource(id = R.drawable.image_I24366610923301092173),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:666;109:2330;109:2174-Inbox
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
            // Column-I243:666;109:2335-Menu/Profile
            Column(
                verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .align(Alignment.Top)
                    .wrapContentSize(),
            ) {
                // Image-I243:666;109:2335;113:3653-user
                Image(
                    painter = painterResource(id = R.drawable.image_I24366610923351133653),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .size(24.dp, 24.dp)
                        .clipToBounds(),
                )
                // Text-I243:666;109:2335;109:2177-Profile
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
