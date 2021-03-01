package com.subhpandey.android.friendex.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.subhpandey.android.friendex.data.model.getFriendId
import com.subhpandey.android.friendex.ui.theme.blue
import com.subhpandey.android.friendex.ui.theme.pink
import com.subhpandey.android.friendex.ui.theme.red
import com.subhpandey.android.friendex.components.DetailsItem

@Composable
fun DetailsScreen(friendId: Int, onNavigationBack: () -> Unit) {
    val friend = getFriendId(id = friendId)

    Scaffold(
        topBar = { DetailsTopBar(onNavigateBack = onNavigationBack) }
    ) {
        LazyColumn {
            item {
                Image(
                    painter = painterResource(id = friend.photo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .aspectRatio(1.2f)
                        .height(220.dp)
                        .clip(RoundedCornerShape(16.dp))

                )
                Spacer(modifier = Modifier.size(8.dp))



            }

            item { FriendName(friend.name, friend.occupation) }

            item { DetailsRow(friend.sex, friend.age, friend.relationship, friend.color) }

            item { FriendDescription(friend.name, friend.description) }



        }

    }


}



@Composable
fun FriendName(name: String, occupation: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Column {
            Text(text = name, style = MaterialTheme.typography.h6)
            Text(text = occupation, style = MaterialTheme.typography.subtitle1)
        }
        Spacer(modifier = Modifier.weight(1f))

    }

}

@Composable
fun DetailsRow(sex: String, age: Int, relationship: String, color: String) {
    LazyRow {
        item { DetailsItem(title = "Sex", subtitle = sex, color = blue.copy(0.3f)) }
        item { DetailsItem(title = "Age", subtitle = "$age years", color = pink.copy(0.3f)) }
        item {
            DetailsItem(
                title = "Relationship",
                subtitle = relationship,
                color = red.copy(0.3f)
            )
        }

    }
}

@Composable
fun FriendDescription(name: String, description: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "About $name", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = description)


    }
}

