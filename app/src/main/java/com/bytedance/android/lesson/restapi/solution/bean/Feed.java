package com.bytedance.android.lesson.restapi.solution.bean;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {
    /**
     * student_id : 3120186666
     * user_name : ⼩小⻘青
     * image_url : http://10.108.10.39:8080/minidouyin/storage/image?path=32336667/aha/ 1548055081311/IMG_20180820_201006.png
     * video_url : http://10.108.10.39:8080/minidouyin/storage/video?path=32336667/aha/ 1548055081312/b063fc96c6fd7a570180b6acccd7569d.mp4
     */
    // TODO-C2 (1) Implement your Feed Bean here according to the response json

    @SerializedName("student_id") private String student_id;
    @SerializedName("user_name") private String user_name;
    @SerializedName("image_url") private String image_url;
    @SerializedName("video_url") private String video_url;

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
    @NonNull
    @Override
    public String toString() {
        return "[student_id="+student_id+
                ",user_name="+user_name+
                ",image_url+"+image_url+
                ",video_url"+video_url+"]";
    }



}
