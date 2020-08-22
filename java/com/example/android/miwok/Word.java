package com.example.android.miwok;

public class Word {
    private String mdefaultTranslation;
    private String mMiwokTranslation;
    private int mImgSourceID = NO_IMAGE_PROVIDED;
    private int mAudioSourceID;

    private static final int NO_IMAGE_PROVIDED = -1;

    @Override
    public String toString() {
        return "Word{" +
                "mdefaultTranslation='" + mdefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImgSourceID=" + mImgSourceID +
                ", mAudioSourceID=" + mAudioSourceID +
                '}';
    }

    /**
     * Create Word Object
     * @param defaultTrans
     * @param Miwok
     */
    public Word(String defaultTrans,String Miwok,int audioID){
        mdefaultTranslation = defaultTrans;
        mMiwokTranslation = Miwok;
        mAudioSourceID = audioID;
    }
    /**
     * Create Word Object
     * @param defaultTrans
     * @param Miwok
     * @param imageID
     */
    public Word(String defaultTrans,String Miwok,int imageID, int audioID){
        mdefaultTranslation = defaultTrans;
        mMiwokTranslation = Miwok;
        mImgSourceID=imageID;
        mAudioSourceID = audioID;
    }

    public int getImgSourceID(){
        return mImgSourceID;
    }

    public String getDefaultTrans(){
        return mdefaultTranslation;
    }
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    //Check if there is an image inside
    public boolean hasImage(){
        return mImgSourceID != NO_IMAGE_PROVIDED;
    }

    public int getmAudioSourceID() {
        return mAudioSourceID;
    }
}
