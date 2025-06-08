package com.example.hellothegioi.ui.resources

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.hellothegioi.R

/**
 * Object chứa tất cả các hình ảnh được sử dụng trong ứng dụng
 */
object ImageResources {
    // Icons
    val icHome = R.drawable.ic_home
    val icProfile = R.drawable.ic_profile
    val icSearch = R.drawable.ic_search
    val icNotification = R.drawable.ic_notify
    val icAdd = R.drawable.ic_add
    val icBack = R.drawable.ic_back
    val icCamera = R.drawable.ic_camera
    val icComment = R.drawable.ic_comment
    val icDraft = R.drawable.ic_draft
    val icFilter = R.drawable.ic_filter
    val icHeart = R.drawable.ic_heart
    val icLink = R.drawable.ic_link
    val icMore = R.drawable.ic_more
    val icPicture = R.drawable.ic_picture
    val icQuestion = R.drawable.ic_question
    val icReport = R.drawable.ic_report
    val icSave = R.drawable.ic_save
    val icSend = R.drawable.ic_send
    val icShare = R.drawable.ic_share
    val icUserAvatar = R.drawable.ic_user_avatar

    // Backgrounds
    val profilePic = R.drawable.profile_pic
    val chest = R.drawable.chest
    val cmt = R.drawable.cmt
    val gear = R.drawable.gear
    val heart = R.drawable.heart
    val pic = R.drawable.pic

    // Test images
    val imageTest = R.drawable.image_test
}

/**
 * Composable function để load hình ảnh
 */
@Composable
fun loadImage(resourceId: Int) = painterResource(id = resourceId)

/**
 * Extension function để load hình ảnh từ ImageResources
 */
@Composable
fun ImageResources.loadImage(resourceId: Int) = painterResource(id = resourceId) 