package com.example.musicaly;

public class Library {
    /*
     *Song name
     */
    private String mSongName;

    /*
     * Artist Name
     */
    private String mArtistName;
    /*
     * Play Button Id
     */
    private int mImageResourceId;

    public Library(String songName, String artistName, int ImageResourceId){
        mSongName = songName;
        mArtistName = artistName;
        mImageResourceId = ImageResourceId;
    }
    /*
     * get the name of song.
     */
    public String getmSongName(){
        return mSongName;
    }

    /*
     * get the name of artist.
     */
    public String getmArtistName(){
        return mArtistName;
    }

    /*
     * get the id of play button
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
