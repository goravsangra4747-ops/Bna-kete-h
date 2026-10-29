
package com.gxrv.dynasty.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.gxrv.dynasty.ui.navigation.Screen
import com.gxrv.dynasty.ui.theme.*

private val BlueGlow = Color(0xFF168BFF)
private val DeepNavy = Color(0xFF070D1A)
private val PanelNavy = Color(0xFF101B30)
private val SoftBlue = Color(0xFF162A49)
private val CyanAccent = Color(0xFF40D9FF)
private val WhiteText = Color(0xFFF4F7FF)
private val MutedText = Color(0xFF9AAAC5)

@Composable
fun HomeScreen(navController: NavController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(DeepNavy),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = 18.dp,
            bottom = 24.dp
        ),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        item {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        "GXRV DYNASTY",
                        color = WhiteText,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Black,
                        letterSpacing = 1.sp
                    )
                    Text(
                        "THE ULTIMATE TRADING HUB",
                        color = CyanAccent,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 1.5.sp
                    )
                }

                Box(
                    modifier = Modifier
                        .size(46.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(SoftBlue)
                        .border(
                            1.dp,
                            BlueGlow.copy(alpha = 0.7f),
                            RoundedCornerShape(15.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Default.Bolt,
                        contentDescription = "GXRV",
                        tint = CyanAccent,
                        modifier = Modifier.size(28.dp)
                    )
                }
            }
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(
                        androidx.compose.ui.graphics.Brush.linearGradient(
                            colors = listOf(
                                Color(0xFF123F7A),
                                Color(0xFF102544),
                                Color(0xFF11182B)
                            )
                        )
                    )
                    .border(
                        1.dp,
                        BlueGlow.copy(alpha = 0.65f),
                        RoundedCornerShape(24.dp)
                    )
                    .padding(20.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .background(Color(0xFF174D46))
                            .padding(horizontal = 10.dp, vertical = 5.dp)
                    ) {
                        Text(
                            "BLOX FRUITS HUB",
                            color = Color(0xFF69F0C1),
                            fontSize = 10.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    "WELCOME TO",
                    color = MutedText,
                    fontSize = 12.sp,
                    letterSpacing = 2.sp
                )

                Text(
                    "GXRV DYNASTY",
                    color = WhiteText,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Black
                )

                Text(
                    "Trade smarter. Connect globally.",
                    color = CyanAccent,
                    fontSize = 13.sp,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Spacer(Modifier.height(20.dp))

                Button(
                    onClick = {
                        navController.navigate(Screen.FruitsValues.route)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = BlueGlow,
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(13.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Icon(
                        Icons.Default.Explore,
                        contentDescription = null
                    )
                    Spacer(Modifier.width(8.dp))
                    Text(
                        "EXPLORE FRUITS & VALUES",
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

        item {
            SectionHeading(
                title = "Trading Hub",
                subtitle = "Everything you need in one place"
            )
        }

        item {
            Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    FeatureTile(
                        "Fruits & Values",
                        "Browse fruit values",
                        Icons.Default.Favorite,
                        BlueGlow,
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.FruitsValues.route)
                    }

                    FeatureTile(
                        "Trade Calculator",
                        "Compare your trade",
                        Icons.Default.Calculate,
                        CyanAccent,
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.Calculator.route)
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    FeatureTile(
                        "Trade Listings",
                        "Explore offers",
                        Icons.Default.SwapHoriz,
                        Color(0xFFB69CFF),
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.Listings.route)
                    }

                    FeatureTile(
                        "Normal Stock",
                        "Check stock page",
                        Icons.Default.Storefront,
                        Color(0xFFFFC66D),
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.NormalStock.route)
                    }
                }

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    FeatureTile(
                        "Mirage Stock",
                        "Visit stock page",
                        Icons.Default.Star,
                        CyanAccent,
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.MirageStock.route)
                    }

                    FeatureTile(
                        "Gamepasses",
                        "Browse gamepasses",
                        Icons.Default.ShoppingCart,
                        Color(0xFFFFC66D),
                        Modifier.weight(1f)
                    ) {
                        navController.navigate(Screen.Gamepasses.route)
                    }
                }
            }
        }

        item {
            SectionHeading(
                title = "Community",
                subtitle = "Connect with other traders"
            )
        }

        item {
            FeatureTile(
                title = "Global Community Chat",
                subtitle = "Join the conversation",
                icon = Icons.Default.Forum,
                accent = CyanAccent,
                modifier = Modifier.fillMaxWidth()
            ) {
                navController.navigate(Screen.CommunityChat.route)
            }
        }

        item {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                FeatureTile(
                    "Scam Reports",
                    "Report suspicious trades",
                    Icons.Default.Security,
                    Color(0xFFFF747F),
                    Modifier.weight(1f)
                ) {
                    navController.navigate(Screen.ScamReports.route)
                }

                FeatureTile(
                    "Private Messages",
                    "Open your chats",
                    Icons.Default.Email,
                    Color(0xFFB69CFF),
                    Modifier.weight(1f)
                ) {
                    navController.navigate(Screen.PrivateChat.route)
                }
            }
        }

        item {
            SectionHeading(
                title = "Your Account",
                subtitle = "Profile and trading activity"
            )
        }

        item {
            Row(horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                FeatureTile(
                    "Trader Profile",
                    "View your profile",
                    Icons.Default.Person,
                    CyanAccent,
                    Modifier.weight(1f)
                ) {
                    navController.navigate(Screen.TraderProfile.route)
                }

                FeatureTile(
                    "Trade History",
                    "Review past trades",
                    Icons.Default.History,
                    BlueGlow,
                    Modifier.weight(1f)
                ) {
                    navController.navigate(Screen.TradeHistory.route)
                }
            }
        }

        item {
            FeatureTile(
                "Staff Admin Panel",
                "Authorized staff access",
                Icons.Default.Settings,
                Color(0xFFFFC66D),
                Modifier.fillMaxWidth()
            ) {
                navController.navigate(Screen.AdminPanel.route)
            }
        }

        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 4.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                HorizontalDivider(
                    color = SoftBlue,
                    thickness = 1.dp
                )
                Spacer(Modifier.height(14.dp))
                Text(
                    "GXRV DYNASTY",
                    color = CyanAccent,
                    fontWeight = FontWeight.Black,
                    letterSpacing = 2.sp,
                    fontSize = 12.sp
                )
                Text(
                    "TRADE  •  PLAY  •  GROW",
                    color = MutedText,
                    fontSize = 10.sp,
                    letterSpacing = 1.sp,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }
        }
    }
}

@Composable
private fun SectionHeading(
    title: String,
    subtitle: String
) {
    Column {
        Text(
            title,
            color = WhiteText,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            subtitle,
            color = MutedText,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 3.dp)
        )
    }
}

@Composable
private fun FeatureTile(
    title: String,
    subtitle: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    accent: Color,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(18.dp))
            .background(PanelNavy)
            .border(
                1.dp,
                accent.copy(alpha = 0.35f),
                RoundedCornerShape(18.dp)
            )
            .clickable(onClick = onClick)
            .padding(14.dp)
    ) {
        Box(
            modifier = Modifier
                .size(42.dp)
                .clip(RoundedCornerShape(13.dp))
                .background(accent.copy(alpha = 0.13f)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = title,
                tint = accent,
                modifier = Modifier.size(23.dp)
            )
        }

        Spacer(Modifier.height(13.dp))

        Text(
            title,
            color = WhiteText,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            subtitle,
            color = MutedText,
            fontSize = 11.sp,
            lineHeight = 15.sp,
            modifier = Modifier.padding(top = 5.dp)
        )

        Spacer(Modifier.height(4.dp))

        Text(
            "OPEN  →",
            color = accent,
            fontSize = 10.sp,
            fontWeight = FontWeight.ExtraBold,
            letterSpacing = 1.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}
