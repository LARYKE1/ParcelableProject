package com.example.myapplication;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;


public class MyParcelable implements Parcelable {
    private String senderName;
    private String subject;
    private int wishes;
    private String[] message;

    public MyParcelable(String senderName, String subject, int wishes, String[] message) {
        this.senderName = senderName;
        this.subject = subject;
        this.wishes = wishes;
        this.message = message;
    }

    protected MyParcelable(Parcel in) {
        senderName = in.readString();
        subject = in.readString();
        wishes = in.readInt();
        message = in.createStringArray();
    }

    public static final Creator<MyParcelable> CREATOR = new Creator<MyParcelable>() {
        @Override
        public MyParcelable createFromParcel(Parcel in) {
            return new MyParcelable(in);
        }

        @Override
        public MyParcelable[] newArray(int size) {
            return new MyParcelable[size];
        }
    };

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName() {
        this.senderName = senderName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getWishes() {
        return wishes;
    }

    public void setWishes(int wishes) {
        this.wishes = wishes;
    }

    public String[] getMessage() {
        return message;
    }

    public void setMessage(String[] message) {
        this.message = message;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(senderName);
        dest.writeString(subject);
        dest.writeInt(wishes);
        dest.writeStringArray(message);
    }
}