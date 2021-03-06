package bestwallpaper.hdgb.wallpapers.backgrounds.Model.PhotographerList;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class ProfileImage implements Serializable {

    @SerializedName("small")
    private String small;

    @SerializedName("large")
    private String large;

    @SerializedName("medium")
    private String medium;

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    @Override
    public String toString() {
        return
                "ProfileImage{" +
                        "small = '" + small + '\'' +
                        ",large = '" + large + '\'' +
                        ",medium = '" + medium + '\'' +
                        "}";
    }
}