package com.bytedance.android.lesson.restapi.solution.bean;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:17
 */
public class FeedResponse {
    /**
     * feeds : [{"student_id":"3120186666","user_name":"⼩小⻘青","image_url":"http://10.108.10.39:8080/minidouyin/storage/image?path=32336667/aha/ 1548055081311/IMG_20180820_201006.png","video_url":"http://10.108.10.39:8080/minidouyin/storage/video?path=32336667/aha/ 1548055081312/b063fc96c6fd7a570180b6acccd7569d.mp4"}]
     * success : true
     */
// TODO-C2 (2) Implement your FeedResponse Bean here according to the response json
    @SerializedName("success") private boolean success;
    @SerializedName("feeds") private List<FeedsBean> feeds;
    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean isSuccess() {
        return success;
    }



    public void setFeeds(List<FeedsBean> feeds) {
        this.feeds = feeds;
    }
    public List<FeedsBean> getFeeds() {
        return feeds;
    }


    @NonNull
    @Override
    public String toString() {
        return "{feeds="+feeds+
                ",success"+success+"}";
    }

    public static class FeedsBean {
        /**
         * student_id : 3120186666
         * user_name : ⼩小⻘青
         * image_url : http://10.108.10.39:8080/minidouyin/storage/image?path=32336667/aha/ 1548055081311/IMG_20180820_201006.png
         * video_url : http://10.108.10.39:8080/minidouyin/storage/video?path=32336667/aha/ 1548055081312/b063fc96c6fd7a570180b6acccd7569d.mp4
         */


         private String student_id;
         private String user_name;
         private String image_url;
         private String video_url;

        public String getStudent_id() {
            return student_id;
        }

        public void setStudent_id(String student_id) {
            this.student_id = student_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getImage_url() {
            return image_url;
        }

        public void setImage_url(String image_url) {
            this.image_url = image_url;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

    }

    }




