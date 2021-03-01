package com.subhpandey.android.friendex.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.subhpandey.android.friendex.data.model.Friend


@Composable
fun FriendListItem(friend: Friend, onFriendClick: (Int) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .clickable { onFriendClick(friend.id) }
    ) {
        Box(
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
        ) {
            Image(
                painter = painterResource(id = friend.photo),
                contentDescription = "Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(CircleShape)
            )
        }
        Spacer(modifier = Modifier.size(16.dp))

        Column(
            modifier = Modifier.padding(4.dp)
        ) {
            Text(
                text = friend.name,
                style = MaterialTheme.typography.body1
            )
            Text(
                text = friend.occupation,
                style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Medium)
            )
            Spacer(modifier = Modifier.size(4.dp))
        }
    }
}


