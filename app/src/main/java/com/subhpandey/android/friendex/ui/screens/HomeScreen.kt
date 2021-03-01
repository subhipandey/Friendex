package com.subhpandey.android.friendex.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.subhpandey.android.friendex.data.model.getFriendList
import com.subhpandey.android.friendex.components.FriendListItem

@Composable
fun HomeScreen(
    onFriendClick: (Int) -> Unit
) {
    val friendList = getFriendList()

    Scaffold(
        topBar = {
            HomeTopBar()
        }
    ) {
        LazyColumn {
            items(friendList) { friend ->
                FriendListItem(friend = friend, onFriendClick = onFriendClick)
            }
        }
    }
}

@Composable
fun HomeTopBar() {
    TopAppBar {
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "FriendDex",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(16.dp)


            )
        }
    }
}

@Composable
fun DetailsTopBar(
    onNavigateBack: () -> Unit
) {
    TopAppBar(
        elevation = 0.dp
    ) {
        IconButton(onClick = onNavigateBack) {
            Icon(
                painter = painterResource(id = R.drawable.abc_ic_ab_back_material),
                contentDescription = null,
                modifier = Modifier.size(25.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 8.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,

            ) {
            Text(
                text = "Profile",
                style = MaterialTheme.typography.h6,
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(vertical = 10.dp, horizontal = 16.dp)
            )
        }

    }
}